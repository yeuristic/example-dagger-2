package com.yeuristic.dagger2example;

import android.app.Application;

import com.yeuristic.abase.AListener;
import com.yeuristic.base.ComponentFactory;
import com.yeuristic.base.Components;
import com.yeuristic.libaapi.APublicComponent;
import com.yeuristic.libaapi.APublicDIManager;
import com.yeuristic.libb.BDIManager;

import java.lang.reflect.InvocationTargetException;

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

        //ComponentFactories
        try {
            Components.MAP.put(APublicComponent.class.getSimpleName(), (ComponentFactory) Class.forName("com.yeuristic.liba.di.AComponentFactory").getConstructor().newInstance());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        mApplicationComponent = DaggerApplicationComponent.builder().aPublicComponent(APublicDIManager.getPublicComponent()).build();
        mApplicationComponent.inject(this);
        BDIManager.setbSubComponent(mApplicationComponent.getBSubComponent());
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
