package com.v5zhu.springmvc.base.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuxl@paxsz.com on 2016/7/6.
 */
@Controller
@RequestMapping("/sync/")
public class DemoController {

    @RequestMapping(value = "store",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity syncStore(){
        return new ResponseEntity("success", HttpStatus.OK);
    }
}
