package com.yeuristic.dagger2example;

import com.yeuristic.abase.di.ABaseModule;
import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.di.APublicModule;
import com.yeuristic.libb.BSubComponent;

import dagger.Component;

@ApplicationScope
@Component(modules = {
        APublicModule.class,
        ABaseModule.class
})
public interface ApplicationComponent {
    void inject(DaggerApplication daggerApplication);
    BSubComponent getBSubComponent();
}
