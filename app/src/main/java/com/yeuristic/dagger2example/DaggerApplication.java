package com.yeuristic.dagger2example;

import android.app.Application;

import com.yeuristic.liba.di.ADIManager;
import com.yeuristic.liba.AListener;
import com.yeuristic.libb.BDIManager;

import javax.inject.Inject;

public class DaggerApplication extends Application {

    @Inject
    AListener mAListener;
    private ApplicationComponent mApplicationComponent;

    public static DaggerApplication getDaggerApplication(Application application) {
        return (DaggerApplication) application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder().build();
        mApplicationComponent.inject(this);
        ADIManager.setaSubComponent(mApplicationComponent.getASubComponent());
        BDIManager.setbSubComponent(mApplicationComponent.getBSubComponent());
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
