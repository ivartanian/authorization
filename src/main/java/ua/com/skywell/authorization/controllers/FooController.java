package ua.com.skywell.authorization.controllers;

import org.springframework.http.HttpStatus;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.com.skywell.authorization.dto.FooDto;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

/**
 * Created by viv on 02.09.2016.
 */
@RestController
public class FooController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    public FooDto findById(@PathVariable long id) {
        return new FooDto(id, randomAlphabetic(4));
    }

    @PreAuthorize("#oauth2.hasScope('write')")
    @RequestMapping(method = RequestMethod.POST, value = "/foos")
    public FooDto create(@RequestBody final FooDto foo) {
        foo.setId(Long.parseLong(randomNumeric(2)));
        return foo;
    }
}