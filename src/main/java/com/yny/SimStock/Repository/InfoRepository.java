package com.yny.SimStock.Repository;

import com.yny.SimStock.Model.Stock.Basic;

import java.util.List;
import java.util.Optional;

public interface InfoRepository {
    //옵셔널은 널일때 감싸서 반환해줌
    List<Basic> basic(String name);
}
