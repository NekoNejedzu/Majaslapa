/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.boot.majaslapa.resource;


import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/status")
public class AvailabilityController {
     public static boolean available;
      @GetMapping
      @ResponseBody
        public void getStatus(HttpServletResponse httpServletResponse){
            httpServletResponse.setStatus(available ? HttpServletResponse.SC_OK : HttpServletResponse.SC_SERVICE_UNAVAILABLE);      
        }
        @PostMapping("/{value}")
        @ResponseBody
         public void setStatus(@PathVariable("value") boolean value){ 
             available = value;
         }

}