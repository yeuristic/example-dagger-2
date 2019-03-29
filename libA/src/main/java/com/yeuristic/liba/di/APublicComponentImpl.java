package com.yeuristic.liba.di;

import com.yeuristic.base.ScreenPublicScope;
import com.yeuristic.libaapi.APublicComponent;

import dagger.Component;

@ScreenPublicScope
@Component(modules = {APublicModule.class})
public interface APublicComponentImpl extends APublicComponent {
}
