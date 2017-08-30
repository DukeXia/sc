package com.wangxin.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wangxin.api.model.simple.News;
import com.wangxin.web.remote.simple.NewsRemoteClient;

@RestController
public class HystrixSimpleController {

    private static final Logger log = LoggerFactory.getLogger(HystrixSimpleController.class);

    @Autowired
    private NewsRemoteClient newsRemoteClient;

    @RequestMapping(value = "/wx", method = RequestMethod.GET)
    public News getNews() {
        log.debug("# wx");
        return newsRemoteClient.getNews();
    }


}
