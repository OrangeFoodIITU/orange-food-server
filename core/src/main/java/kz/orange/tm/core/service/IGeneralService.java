package kz.orange.tm.core.service;

import kz.orange.tm.core.model.AvgPrice;

import java.util.List;

public interface IGeneralService {
    List<AvgPrice> getAllAvgPrice();
    AvgPrice getAvgPriceById(Integer id);
}
