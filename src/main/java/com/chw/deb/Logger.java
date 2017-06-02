package com.chw.deb;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/27/2017.
 */
@Component
@Aspect
public class Logger implements PhotoSnapper{


    @Pointcut("within(com.chw.deb.Camera)")
    public void cameraSnap(){}

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("about to take photo....");
    }






    /*@Pointcut("execution(void com.chw.deb.Camera.snap())")
    public void cameraSnap(){}

    @Before("cameraSnap()")
    public void aboutToTakePhoto(){
        System.out.println("about to take photo....");
    }

    @AfterThrowing("cameraSnap()")
    public void afterTakingPhotoThrowing(){
        System.out.println("photo taken....throwing");
    }

    @AfterReturning("cameraSnap()")
    public void afterTakingPhotoReturning(){
        System.out.println("photo taken....returning");
    }

    @Around("cameraSnap()")
    public void afterTakingPhotoAround(ProceedingJoinPoint p){
        System.out.println("photo taken....around.....before");

        try {
            p.proceed();
        } catch (Throwable throwable) {
            System.out.println("photo taken....around.....before...exception occured "+throwable.getMessage());
        }

        System.out.println("photo taken....around.....before");
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

    @Pointcut("execution(* com.chw.deb.*.zoom(..))")
    public void lensSnap(){}

    @Before("lensSnap()")
    public void aboutToTakePhotoLens(){
        System.out.println("about to take photo LENS....");
    }

    @After("lensSnap()")
    public void afterTakingPhotoLens(){
        System.out.println("photo taken LENS....");
    }*/
}