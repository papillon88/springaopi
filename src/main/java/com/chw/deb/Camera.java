package com.chw.deb;

import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/27/2017.
 */
@Component
public class Camera implements PhotoSnapper{
    public void snap() throws Exception {
        System.out.println("SNAP!");
        throw new Exception("bye bye");
    }
    public void snap(int exposure){
        System.out.println("SNAP with exposure "+ exposure);
    }
    public String snap(String name){
        System.out.println("SNAP with name "+ name);
        return name;
    }

    public double autofocus(double value){
        System.out.println("Autofocus with value "+ value);
        return value;
    }
}
