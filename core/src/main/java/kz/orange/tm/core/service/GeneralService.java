package kz.orange.tm.core.service;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.model.CardType;
import kz.orange.tm.core.model.CuisineType;
import kz.orange.tm.core.model.Reservation;
import kz.orange.tm.core.model.ReserveStatus;

import kz.orange.tm.core.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService implements IGeneralService{

    @Autowired
    AvgPriceJpaRepo avgPriceJpaRepo;
    @Autowired
    CardTypeRepo cardTypeRepo;
    @Autowired
    CuisineTypeRepo cuisineTypeRepo;
    @Autowired
    ReservationRepo reservationRepo;
    @Autowired
    ReserveStatusRepo reserveStatusRepo;

    @Override
    public List<AvgPrice> getAllAvgPrice() {
        return avgPriceJpaRepo.findAll();
    }

    @Override
    public AvgPrice getAvgPriceById(Integer id) {
        return avgPriceJpaRepo.findOne(id);
    }

    @Override
    public List<CardType> getAllCardType(){
        return cardTypeRepo.findAll();
    }
    @Override
    public CardType getCardTypeById(Integer id) {
        return cardTypeRepo.findOne(id);
    }


    @Override
    public List<CuisineType> getAllCuisineType(){
        return cuisineTypeRepo.findAll();
    }
    @Override
    public CuisineType getCuisineTypeById(Integer id) {
        return cuisineTypeRepo.findOne(id);
    }


    @Override
    public List<Reservation> getAllReservation(){
        return reservationRepo.findAll();
    }
    @Override
    public Reservation getReservationById(Integer id) {
        return reservationRepo.findOne(id);
    }

    @Override
    public List<ReserveStatus> getAllReserveStatus(){
        return reserveStatusRepo.findAll();
    }

    @Override
    public ReserveStatus getReserveStatusById(Integer id) {
        return reserveStatusRepo.findOne(id);
    }

}