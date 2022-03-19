package com.example.securitydemo.service;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        System.out.println("可用性状态改变：" + event.getState());
        switch (event.getState()) {
        case ACCEPTING_TRAFFIC:
            // create file /tmp/healthy
            break;
        case REFUSING_TRAFFIC:
            // remove file /tmp/healthy

            break;
        }
    }


    @EventListener
    public void readiness(AvailabilityChangeEvent<LivenessState> event) {
        System.out.println("生命周期状态改变：" + event.getState());
    }

}