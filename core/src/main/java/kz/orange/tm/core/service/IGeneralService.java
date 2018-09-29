package kz.orange.tm.core.service;

import kz.orange.tm.core.model.*;
//import kz.orange.tm.core.model.CardType;
//import kz.orange.tm.core.model.CuisineType;

import java.util.List;

public interface IGeneralService {
    List<AvgPrice> getAllAvgPrice();
    AvgPrice getAvgPriceById(Integer id);

    List<CardType> getAllCardType();
    CardType getCardTypeById(Integer id);

    List<Cuisine> getAllCuisineType();
    Cuisine getCuisineTypeById(Integer id);


    List<Reservation> getAllReservation();
    Reservation getReservationById(Integer id);

    List<ReserveStatus> getAllReserveStatus();
    ReserveStatus getReserveStatusById(Integer id);


    List<Restaurant> getAllRestaurant();
    Restaurant getRestaurantById(Integer id);

    List<RestaurantContact> getAllRestaurantContact();
    RestaurantContact getRestaurantContactById(Integer id);

    List<RestaurantRoom> getAllRestaurantRoom();
    RestaurantRoom getRestaurantRoomById(Integer id);

    List<User> getAllUser();
    User getUserById(Integer id);

    List<UserBankInfo> getAllUserBankInfo();
    UserBankInfo getUserBankInfoById(Integer id);

    List<WorkingDaysType> getAllWorkingDaysType();
    WorkingDaysType getWorkingDaysTypeById(Integer id);

    List<WorkingTime> getAllWorkingTime();
    WorkingTime getWorkingTimeById(Integer id);
}
