package com.Web.samplepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;;

@Controller
public class Indexcontrol {

	 @GetMapping("/")
	    public String getIndex() {
	        return "index";
	    }

}
