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

    List<CuisineType> getAllCuisineType();
    CuisineType getCuisineTypeById(Integer id);


    List<Reservation> getAllReservation();
    Reservation getReservationById(Integer id);

    List<ReserveStatus> getAllReserveStatus();
    ReserveStatus getReserveStatusById(Integer id);
}
