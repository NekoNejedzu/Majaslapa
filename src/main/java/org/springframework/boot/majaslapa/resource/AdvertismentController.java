/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.boot.majaslapa.resource;
import demain.response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author User
 */
@Controller
public class AdvertismentController {
    @GetMapping(value="/")
    @ResponseBody
    public String testEndpoint(){
        return "Hello";
    }
    @GetMapping(value="/hey")
    @ResponseBody
    public response nextTestEndpoint(){
        return new response("Hey ya");
    }
    
}
