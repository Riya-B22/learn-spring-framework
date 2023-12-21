package com.in28minutes.spring.learnspringframework.enterprise.example.business;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{
    @Autowired
    private DataService dataService;
    public long calculateSum(){
        List<Integer> data = dataService.getData();
       return  data.stream().reduce(Integer::sum).get(); //Functional Programming to get the sum of value in a list
    }
}
