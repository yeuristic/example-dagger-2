package com.yeuristic.dagger2example;

import android.app.Application;

import com.yeuristic.abase.AListener;
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
        BDIManager.setbSubComponent(mApplicationComponent.getBSubComponent());
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
