package com.chw.deb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by papillon on 5/27/2017.
 */
public class Main {

    public static void main(String[] args){

        ApplicationContext context = new FileSystemXmlApplicationContext("bean-config.xml");
        Object obj = context.getBean("camera");
        System.out.println(obj.getClass().getName());
        System.out.println(obj instanceof Camera);
        Camera cam = (Camera)obj;

        Lens lens = (Lens)context.getBean("lens");
        try {
            cam.snap();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        cam.snap(1000);
        cam.autofocus(1000.00);
        cam.snap("another photo");
        lens.zoom(4);
    }
}
