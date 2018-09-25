package kz.orange.tm.core.controller;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.model.CardType;
import kz.orange.tm.core.model.CuisineType;
import kz.orange.tm.core.model.Reservation;
import kz.orange.tm.core.model.ReserveStatus;

import kz.orange.tm.core.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/cuisinetype")
    public List<CuisineType> getAllCuisineType(){
        return service.getAllCuisineType();
    }
    @GetMapping("/cuisineype/{id}")
    public CuisineType getCuisineTypeById(@PathVariable(value = "id") Integer id){
        return service.getCuisineTypeById(id);
    }


    @GetMapping("/reservation")
    public List<Reservation> getAllReservation(){
        return service.getAllReservation();
    }
    @GetMapping("/reservation/{id}")
    public Reservation getReservationById(@PathVariable(value = "id") Integer id){
        return service.getReservationById(id);
    }

    @GetMapping("/reservestatus")
    public List<ReserveStatus> getAllReservestatus(){
        return service.getAllReserveStatus();
    }
    @GetMapping("/reservestatus/{id}")
    public ReserveStatus getReserveStatusById(@PathVariable(value = "id") Integer id){
        return service.getReserveStatusById(id);
    }
}

