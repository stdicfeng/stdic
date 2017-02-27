package com.stdic.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Carlis.Wang
 * @since 2.0
 */
@RequestMapping("/")
@Controller
public class StdicFrontCoreController {

    private static final Logger log = LoggerFactory.getLogger(StdicFrontCoreController.class);


    @RequestMapping("/index")
    public void index(HttpServletRequest req, HttpServletResponse resp) {
        
    }

}
