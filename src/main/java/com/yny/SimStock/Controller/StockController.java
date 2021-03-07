package com.yny.SimStock.Controller;

import com.yny.SimStock.Model.Stock.Basic;
import com.yny.SimStock.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class StockController {

    private final StockService service;

    @Autowired
    public StockController(StockService service){
        this.service = service;
    }

    @GetMapping("main")
    public String main(Model model)
    {
        model.addAttribute("data","조영하");
        return "main";
    }

    @GetMapping("item")
    @ResponseBody
    public List<Basic> Basic(@RequestParam("name") String name)
    {
        return service.findByName(name);
    }
}