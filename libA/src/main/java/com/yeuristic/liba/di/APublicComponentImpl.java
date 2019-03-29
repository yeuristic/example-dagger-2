package com.yeuristic.liba.di;

import com.yeuristic.base.ApplicationScope;
import com.yeuristic.libaapi.APublicComponent;

import dagger.Component;

@ApplicationScope
@Component(modules = {APublicModule.class})
public interface APublicComponentImpl extends APublicComponent {
}
