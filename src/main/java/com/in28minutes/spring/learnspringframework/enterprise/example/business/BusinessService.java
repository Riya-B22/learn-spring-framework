package com.in28minutes.spring.learnspringframework.enterprise.example.business;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{
    @Autowired
    private DataService dataService;// dependency is injected using reflection; example of Field dependency injection

    //setter based injection:
//    private DataService dataService;
//    @Autowired
//    public void setDataService(DataService dataService) {
//        System.out.println("Setter injection");
//        this.dataService = dataService;
//    }
    // way 2 of constructor based injection:
//    private DataService dataService;
//
//    @Autowired
//    public BusinessService(DataService dataService) {
//        super();
//        System.out.println("Constructor Injection");
//        this.dataService = dataService;
//    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
       return  data.stream().reduce(Integer::sum).get(); //Functional Programming to get the sum of value in a list
    }
}
