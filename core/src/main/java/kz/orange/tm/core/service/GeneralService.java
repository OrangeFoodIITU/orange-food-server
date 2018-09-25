package kz.orange.tm.core.service;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.model.CardType;
import kz.orange.tm.core.repository.AvgPriceJpaRepo;
import kz.orange.tm.core.repository.CardTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.smartcardio.Card;
import java.util.List;

@Service
public class GeneralService implements IGeneralService{

    @Autowired
    AvgPriceJpaRepo avgPriceJpaRepo;
    @Autowired
    CardTypeRepo cardTypeRepo;

    @Override
    public List<AvgPrice> getAllAvgPrice() {
        return avgPriceJpaRepo.findAll();
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
    public AvgPrice getAvgPriceById(Integer id) {
        return avgPriceJpaRepo.findOne(id);
    }
}