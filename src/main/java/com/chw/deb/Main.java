package com.chw.deb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by papillon on 5/27/2017.
 */
public class Main {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
        Camera cam = (Camera)context.getBean("camera");
        cam.snap();
    }
}
