package com.iaa.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.iaa.rest.model.EntitiesGetRequest;
import com.iaa.rest.model.EntitiesGetResponse;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/api/entities")
public class EntitiesRestController {

  @RequestMapping(method = RequestMethod.GET)
  public EntitiesGetResponse getEntities(@ModelAttribute EntitiesGetRequest request) throws JsonProcessingException {
    return new EntitiesGetResponse(request);
  }

}