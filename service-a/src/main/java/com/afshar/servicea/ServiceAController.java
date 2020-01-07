package com.afshar.servicea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    public static Logger logger = LoggerFactory.getLogger(ServiceAController.class);

    @RequestMapping(method = RequestMethod.GET, value ="api/status-a")
    public String getStatus() {

//        logger.debug("Debug");
//        logger.trace("Trace");
//        logger.info("info");
//        logger.error("error");
//        logger.warn("warn");
        return "Service A Status Called";
    }

}
