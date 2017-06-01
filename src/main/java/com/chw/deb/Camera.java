package com.chw.deb;

import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/27/2017.
 */
@Component
public class Camera {
    public void snap(){
        System.out.println("SNAP!");
    }
    public void snap(int exposure){
        System.out.println("SNAP with exposure "+exposure);
    }
}
