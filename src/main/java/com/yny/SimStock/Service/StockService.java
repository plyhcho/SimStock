package com.yny.SimStock.Service;
import com.yny.SimStock.Model.Stock.Basic;
import com.yny.SimStock.Repository.InfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    private InfoRepository repository;

    public StockService(InfoRepository repository)
    {
        this.repository = repository;
    }

    public List<Basic> findByName(String name){
        return repository.basic(name);
    }
}
