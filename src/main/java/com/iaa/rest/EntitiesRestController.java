package com.iaa.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iaa.rest.model.request.EntitiesGetRequest;
import com.iaa.rest.model.response.EntitiesGetResponse;
import com.iaa.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/entities")
public class EntitiesRestController {
    @Autowired
    private EntityService service;

    @RequestMapping(method = RequestMethod.GET)
    public EntitiesGetResponse getEntities(@ModelAttribute EntitiesGetRequest request) throws JsonProcessingException {
        return new EntitiesGetResponse(request, service.getLocations(request));
    }

}