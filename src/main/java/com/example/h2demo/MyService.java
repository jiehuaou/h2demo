package com.example.h2demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MyService {
    static Logger logger = LoggerFactory.getLogger(MyService.class);
    @Autowired
    MyRepostory rep ;
    @Transactional(Transactional.TxType.REQUIRED)
    public boolean update(Emp emp) {
        logger.info("try - save emp");
        rep.save(emp);
        logger.info("done - save emp");
        return true;
    }
}
