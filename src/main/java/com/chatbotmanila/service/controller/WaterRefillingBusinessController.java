package com.chatbotmanila.service.controller;

import com.chatbotmanila.service.dto.WaterRefillingBusinessJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by IDT-Maynelson-PC on 1/4/2017.
 */
@RestController
@RequestMapping(value = "/order")
public class WaterRefillingBusinessController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WaterRefillingBusinessController.class);

    @Autowired

    @RequestMapping(value = "/water", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Object orderWater(@Valid @RequestBody WaterRefillingBusinessJson form) {

        LOGGER.info("Save and process documents of merchant with applicationId: {}" , form.getFacebookClientId());


        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
