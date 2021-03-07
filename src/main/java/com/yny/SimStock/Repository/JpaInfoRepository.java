package com.yny.SimStock.Repository;

import com.yny.SimStock.Model.Stock.Basic;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class JpaInfoRepository implements InfoRepository{
    private final EntityManager em;
    public JpaInfoRepository(EntityManager em){
        this.em = em;
    }

    @Override
    public List<Basic> basic(String name){

        List<Basic> basic = em.createQuery("select m from Basic m where m.Name like :name",Basic.class)
                .setParameter("name",name)
                .getResultList();
        //List<Basic> bs = em.createQuery("select m from tbl_Stock_Master m",Basic.class).getResultList();

        return basic;
    }
}