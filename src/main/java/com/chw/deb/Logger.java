package com.chw.deb;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/27/2017.
 */
@Component
@Aspect
public class Logger {

    @Pointcut("execution(* com.chw.deb.*.zoom(..))")
    public void lensSnap(){}

    @Before("lensSnap()")
    public void aboutToTakePhotoLens(){
        System.out.println("about to take photo LENS....");
    }

    @After("lensSnap()")
    public void afterTakingPhotoLens(){
        System.out.println("photo taken LENS....");
    }

    @Pointcut("execution(void com.chw.deb.Camera.snap())")
    public void cameraSnap(){}

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("about to take photo....");
    }



    @AfterReturning("cameraSnap()")
    public void afterTakingPhotoReturning(){
        System.out.println("photo taken....returning");
    }



    @After("cameraSnap()")
    public void afterTakingPhoto(){
        System.out.println("photo taken....");
    }

    @Pointcut("execution(String com.chw.deb.Camera.snap(String))")
    //examples of wildcard expressions
    //@Pointcut("execution(* com.chw.deb.Camera.snap(String))")
    //@Pointcut("execution(* com.chw.deb.Camera.*(...))")
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
