// A sample comment
package com.piggybank.src.app.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class InterestRuleController {
 
    @RequestMapping(value="/hello-page")
    public ModelAndView goToHelloPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("hello"); //name of the jsp-file in the "page" folder
         
        String str = "MVC Spring is here!";
        view.addObject("message", str); //adding of str object as "message" parameter
         
        return view;
    }
     
}
