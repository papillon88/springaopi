package com.chw.deb;

import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/31/2017.
 */
@Component(value = "lens")
public class Lens {
    public void zoom(int factor){
        System.out.println("Zooming lens: " + factor);
    }
}
