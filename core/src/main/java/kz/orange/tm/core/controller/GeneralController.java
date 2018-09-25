package kz.orange.tm.core.controller;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.model.CardType;
import kz.orange.tm.core.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/general")
public class GeneralController  {
    @Autowired
    private IGeneralService service;

    @GetMapping("/avgprice")
    public List<AvgPrice> getAllAvgPrice(){
        return  service.getAllAvgPrice();
    }

    @GetMapping("/avgprice/{id}")
    AvgPrice getById(@PathVariable(value = "id") Integer id){
        return service.getAvgPriceById(id);
    }

    @GetMapping("/cardtype")
    public List<CardType> getAllCardType(){
        return service.getAllCardType();
    }
    @GetMapping("/cardtype/{id}")
    public CardType getCardTypeById(@PathVariable(value = "id") Integer id){
        return service.getCardTypeById(id);
    }
}

