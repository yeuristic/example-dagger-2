package com.yeuristic.dagger2example;

import com.yeuristic.abase.di.ABaseModule;
import com.yeuristic.base.ApplicationScope;
import com.yeuristic.libaapi.APublicComponent;
import com.yeuristic.libb.BSubComponent;

import dagger.Component;

@ApplicationScope
@Component(modules = {
        ABaseModule.class
}, dependencies = {
        APublicComponent.class
})
public interface ApplicationComponent {
    void inject(DaggerApplication daggerApplication);
    BSubComponent getBSubComponent();
}
