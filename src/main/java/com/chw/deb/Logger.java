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

    @Pointcut("execution(void com.chw.deb.Camera.snap(..))")
    public void cameraSnap(){}

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("about to take photo....");
    }

    @After("cameraSnap()")
    public void afterTakingPhoto(){
        System.out.println("photo taken....");
    }

    @Pointcut("execution(String com.chw.deb.Camera.snap(String))")
    //@Pointcut("execution(* com.chw.deb.Camera.snap(String))")
    public void cameraSnapName(){}

    @Before("cameraSnapName()")
    public void aboutToTakePhotoName(){
        System.out.println("about to take photo with name....");
    }

    @After("cameraSnapName()")
    public void afterTakingPhotoName(){
        System.out.println("photo taken with name....");
    }
}
