package com.iaa.domain.repository;

import com.iaa.domain.model.IaaAlbumLocationEntity;
import org.springframework.data.repository.Repository;


/**
 * Created by djpet on 2015. 12. 25..
 */
public interface IaaAlbumLocationRepository extends Repository<IaaAlbumLocationEntity, Long> {
    IaaAlbumLocationEntity findById(int locationId);
}

