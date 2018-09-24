package kz.orange.tm.core.service;

import kz.orange.tm.core.model.AvgPrice;
import kz.orange.tm.core.repository.AvgPriceJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService implements IGeneralService{

    @Autowired
    AvgPriceJpaRepo avgPriceJpaRepo;

    @Override
    public List<AvgPrice> getAllAvgPrice() {
        return avgPriceJpaRepo.findAll();
    }

    @Override
    public AvgPrice getAvgPriceById(Integer id) {
        return avgPriceJpaRepo.findOne(id);
    }
}
