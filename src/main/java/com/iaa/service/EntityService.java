package com.iaa.service;

import com.iaa.domain.model.IaaEntryEntity;
import com.iaa.domain.repository.IaaAlbumLocationRepository;
import com.iaa.domain.repository.IaaEntryBibliographicDataRepository;
import com.iaa.domain.repository.IaaEntryEntityRepository;
import com.iaa.rest.model.request.EntitiesGetRequest;
import com.iaa.rest.model.response.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
        return entryEntities.stream().map(entryEntity -> {
            return bibliographicDataRepository.findByEntryCommonId(entryEntity.getEntryCommonId()).getLocationId();
        }).distinct().map(albumLocationRepository::findById).filter(Objects::nonNull).map(albumLocationEntity -> {
            return new Location(albumLocationEntity.getId(), albumLocationEntity.getName(), 1); //TODO caluclate number of albums
        }).collect(Collectors.toList());
    }
}
