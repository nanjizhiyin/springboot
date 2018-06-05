package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 2018/6/1.
 */

@Controller
@RequestMapping(value = "user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @RequestMapping(value="login")
    @ResponseBody
    public String login() {
        log.debug("sb-debug日志");
        log.warn("sb-warn日志");
        log.error("sb-error日志");
        log.info("sb-info消息");
        log.info("sb-info消息2");
        log.info("sb-info消息3");
        log.info("sb-info消息4");
        log.info("sb-info消息5");
        log.info("sb-info消息6");
        log.info("sb-info消息7");
        return "你可以使用了";
    }
}
