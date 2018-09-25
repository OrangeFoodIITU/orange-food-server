package kz.orange.tm.core.service;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.model.CardType;
//import kz.orange.tm.core.model.CardType;
//import kz.orange.tm.core.model.CuisineType;

import java.util.List;

public interface IGeneralService {
    List<AvgPrice> getAllAvgPrice();
    AvgPrice getAvgPriceById(Integer id);

    List<CardType> getAllCardType();
    CardType getCardTypeById(Integer id);
}
