package com.iqmsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
public class ChartController {

    @RequestMapping(value = "/chart", method=RequestMethod.GET)
    public String chart(Model model) {
        
       
        Integer northeastSales = 19000;
        Integer westSales = 20000;
        Integer midwestSales = 6000;
        Integer southSales = 10000;
        Integer northSales = 20000;
        Integer northwestSales = 10000;
        
        model.addAttribute("northeastSales", northeastSales);
        model.addAttribute("southSales", southSales);
        model.addAttribute("midwestSales", midwestSales);
        model.addAttribute("westSales", westSales);
        model.addAttribute("northcentralSales", northSales);
        model.addAttribute("northwestSales", northwestSales);
        
        //now add sales by lure type
        List<Integer> inshoreSales = Arrays.asList(2000, 3000, 4000, 5000, 6000);
        List<Integer> nearshoreSales = Arrays.asList(3000, 4000, 5000, 6000, 7000);
        List<Integer> offshoreSales = Arrays.asList(7900, 6000, 6900, 7000, 8000);
        
        model.addAttribute("inshoreSales", inshoreSales);
        model.addAttribute("nearshoreSales", nearshoreSales);
        model.addAttribute("offshoreSales", offshoreSales);
        
        return "chart";
    }
    
    
   
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:chart";
    }
}
