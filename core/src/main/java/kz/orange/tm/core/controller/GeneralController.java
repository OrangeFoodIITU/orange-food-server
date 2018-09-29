package kz.orange.tm.core.controller;

import kz.orange.tm.core.model.*;
import kz.orange.tm.core.model.Cuisine;

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
    public List<Cuisine> getAllCuisineType(){
        return service.getAllCuisineType();
    }
    @GetMapping("/cuisineype/{id}")
    public Cuisine getCuisineTypeById(@PathVariable(value = "id") Integer id){
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


    @GetMapping("/restaurant")
    public List<Restaurant> getAllRestaurant(){ return service.getAllRestaurant(); }
    @GetMapping("/restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable(value = "id") Integer id){
        return service.getRestaurantById(id);
    }


    @GetMapping("/restaurantcontact")
    public List<RestaurantContact> getAllRestaurantContact(){ return service.getAllRestaurantContact(); }
    @GetMapping("/restaurantcontact/{id}")
    public RestaurantContact getRestaurantContactById(@PathVariable(value = "id") Integer id){
        return service.getRestaurantContactById(id);
    }

    @GetMapping("/restaurantroom")
    public List<RestaurantRoom> getAllRestaurantRoom(){ return service.getAllRestaurantRoom(); }
    @GetMapping("/restaurantroom/{id}")
    public RestaurantRoom getRestaurantRoomById(@PathVariable(value = "id") Integer id){
        return service.getRestaurantRoomById(id);
    }

    @GetMapping("/user")
    public List<User> getAllUser(){ return service.getAllUser(); }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/userbankinfo")
    public List<UserBankInfo> getAllUserBankInfo(){ return service.getAllUserBankInfo(); }
    @GetMapping("/userbankinfo/{id}")
    public UserBankInfo getUserBankInfoById(@PathVariable(value = "id") Integer id){
        return service.getUserBankInfoById(id);
    }

    @GetMapping("/workingdaystype")
    public List<WorkingDaysType> getAllWorkingDaysType(){ return service.getAllWorkingDaysType(); }
    @GetMapping("/workingdaystype/{id}")
    public WorkingDaysType getWorkingDaysTypeById(@PathVariable(value = "id") Integer id){
        return service.getWorkingDaysTypeById(id);
    }

    @GetMapping("/workingtime")
    public List<WorkingTime> getAllWorkingTime(){ return service.getAllWorkingTime(); }
    @GetMapping("/workingtime/{id}")
    public WorkingTime getWorkingTimeById(@PathVariable(value = "id") Integer id){
        return service.getWorkingTimeById(id);
    }
}

