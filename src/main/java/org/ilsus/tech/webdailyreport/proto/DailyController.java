package org.ilsus.tech.webdailyreport.proto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kishibashi
 */
@Controller
public class DailyController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
}
