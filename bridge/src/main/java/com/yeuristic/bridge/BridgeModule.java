package com.yeuristic.bridge;

import com.yeuristic.base.BridgeScope;
import com.yeuristic.base.ComponentFactory;
import com.yeuristic.base.PublicComponentKey;
import com.yeuristic.liba.di.AComponentFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class BridgeModule {
    @BridgeScope
    @Binds
    @IntoMap
    @StringKey(PublicComponentKey.A_COMPONENT)
    abstract ComponentFactory getAFactory(AComponentFactory aComponentFactory);
}
