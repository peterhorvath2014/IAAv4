package com.iaa.service;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.iaa.domain.model.IaaEntryEntity;
import com.iaa.domain.repository.IaaAlbumLocationRepository;
import com.iaa.domain.repository.IaaEntryBibliographicDataRepository;
import com.iaa.domain.repository.IaaEntryEntityRepository;
import com.iaa.rest.model.request.EntitiesGetRequest;
import com.iaa.rest.model.response.Location;
import com.iaa.service.model.AlbumRaw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by djpet on 2015. 12. 25..
 */
@Service
public class EntityService {
    @Autowired
    private IaaEntryEntityRepository iaaEntryEntityRepository;
    @Autowired
    IaaEntryBibliographicDataRepository bibliographicDataRepository;
    @Autowired
    IaaAlbumLocationRepository albumLocationRepository;

    private List<IaaEntryEntity> getEntryEntities(EntitiesGetRequest request) {
        return iaaEntryEntityRepository.findAll();
    }

    public List<Location> getLocations(EntitiesGetRequest request) {
        List<IaaEntryEntity> entryEntities = getEntryEntities(request);
        Stream<AlbumRaw> albumRawStream = getBibliographicDataStream(entryEntities);
        Multiset<AlbumRaw> albums = HashMultiset.create();
        albums.addAll(albumRawStream.collect(Collectors.toList()));

        Map<AlbumRaw, Integer> countLocationIds = new HashMap<>();
        albums.stream().distinct().forEach(album -> {
            countLocationIds.put(album, albums.count(album));
        });

        return albums.stream().map(albumRaw -> albumRaw.getLocationId()).distinct().map(albumLocationRepository::findById).filter(Objects::nonNull).map(albumLocationEntity -> {
            return new Location(albumLocationEntity.getId(), albumLocationEntity.getName(), Long.valueOf(countLocationIds.entrySet().stream().filter(album -> album.getKey().getLocationId() == albumLocationEntity.getId()).count()).intValue());
        }).collect(Collectors.toList());
    }

    private Stream<AlbumRaw> getBibliographicDataStream(List<IaaEntryEntity> entryEntities) {
        return entryEntities.stream().map(entryEntity -> bibliographicDataRepository.findByEntryCommonId(entryEntity.getEntryCommonId())).map(AlbumRaw::new);
    }
}
