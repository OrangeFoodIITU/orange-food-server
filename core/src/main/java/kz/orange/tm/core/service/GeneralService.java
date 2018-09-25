package kz.orange.tm.core.service;

import kz.orange.tm.core.model.*;

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
    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    RestaurantContactRepo restaurantContactRepo;
    @Autowired
    RestaurantRoomRepo restaurantRoomRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    UserBankInfoRepo userBankInfoRepo;
    @Autowired
    WorkingDaysTypeRepo workingDaysTypeRepo;

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


    @Override
    public List<Restaurant> getAllRestaurant() { return restaurantRepo.findAll();}
    @Override
    public Restaurant getRestaurantById(Integer id){return restaurantRepo.findOne(id);}


    @Override
    public List<RestaurantContact> getAllRestaurantContact() { return restaurantContactRepo.findAll();}
    @Override
    public RestaurantContact getRestaurantContactById(Integer id){return restaurantContactRepo.findOne(id);}

    @Override
    public List<RestaurantRoom> getAllRestaurantRoom() { return restaurantRoomRepo.findAll();}
    @Override
    public RestaurantRoom getRestaurantRoomById(Integer id){return restaurantRoomRepo.findOne(id);}

    @Override
    public List<User> getAllUser() { return userRepo.findAll();}
    @Override
    public User getUserById(Integer id){return userRepo.findOne(id);}

    @Override
    public List<UserBankInfo> getAllUserBankInfo() { return userBankInfoRepo.findAll();}
    @Override
    public UserBankInfo getUserBankInfoById(Integer id){return userBankInfoRepo.findOne(id);}

    @Override
    public List<WorkingDaysType> getAllWorkingDaysType() { return workingDaysTypeRepo.findAll();}
    @Override
    public WorkingDaysType getWorkingDaysTypeById(Integer id){return workingDaysTypeRepo.findOne(id);}

}