package com.piggymetrics.intexsoftservice;

import com.piggymetrics.intexsoftservice.bean.IntexsoftInfo;
import com.piggymetrics.intexsoftservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntexsoftController {

    @Autowired
    private Configuration configuration;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public IntexsoftInfo getFullName(){
        return new IntexsoftInfo(configuration.getName(), configuration.getSurname());
    }
}
