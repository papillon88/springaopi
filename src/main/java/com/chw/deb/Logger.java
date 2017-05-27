package com.chw.deb;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/27/2017.
 */
@Component
@Aspect
public class Logger {

    @Pointcut("execution(void com.chw.deb.Camera.snap())")
    public void cameraSnap(){}

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("about to take photo....");
    }

    @After("cameraSnap()")
    public void afterTakingPhoto(){
        System.out.println("photo taken....");
    }
}
