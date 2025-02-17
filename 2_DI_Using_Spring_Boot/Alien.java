package org.kartikmankar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // It is used to tell the spring to create object of this class
public class Alien {

    @Autowired
    Laptop laptop;


    public void code(){
        laptop.compile();  // if we trie to access the laptop it shows error so that we
        // Use autowired
//        System.out.println("Alien Is Running");
    }
}
