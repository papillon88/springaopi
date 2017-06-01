package com.chw.deb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by papillon on 5/27/2017.
 */
public class Main {

    public static void main(String[] args){

        ApplicationContext context = new FileSystemXmlApplicationContext("bean-config.xml");
        Camera cam = (Camera)context.getBean("camera");
        cam.snap();
        cam.snap(1000);
    }
}
