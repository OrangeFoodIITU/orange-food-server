package kz.orange.tm.core.controller;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/general")
public class GeneralController {
    @Autowired
    IGeneralService service;

    @GetMapping("/avgprice/list")
    List<AvgPrice> getAllAvgPrice(){
        return  service.getAllAvgPrice();
    }

    @GetMapping("/avgprice/{id}")
    AvgPrice getById(@PathVariable(value = "id") Integer id){
        return service.getAvgPriceById(id);
    }
}
