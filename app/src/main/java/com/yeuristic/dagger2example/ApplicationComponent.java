package com.yeuristic.dagger2example;

import com.yeuristic.abase.di.ABaseModule;
import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.di.AModule;
import com.yeuristic.liba.di.APublicModule;
import com.yeuristic.liba.di.ASubComponent;
import com.yeuristic.libb.BSubComponent;

import dagger.Component;

@ApplicationScope
@Component(modules = {
        AModule.class,
        APublicModule.class,
        ABaseModule.class
})
public interface ApplicationComponent {
    void inject(DaggerApplication daggerApplication);
    ASubComponent getASubComponent();
    BSubComponent getBSubComponent();
}
