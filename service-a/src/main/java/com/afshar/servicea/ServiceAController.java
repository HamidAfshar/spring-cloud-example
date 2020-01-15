package com.afshar.servicea;

import co.elastic.apm.api.CaptureSpan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServiceAController {

    public static Logger logger = LoggerFactory.getLogger(ServiceAController.class);

    @Value("${prop}")
    private String value;

    @RequestMapping(method = RequestMethod.GET, value = "api/status-a")
    @CaptureSpan
    public String getStatus() {

        logger.info(value);
//        logger.debug("Debug");
//        logger.trace("Trace");
//        logger.info("info");
//        logger.error("error");
//        logger.warn("warn");
        return "Service A Status Called";
    }

}
