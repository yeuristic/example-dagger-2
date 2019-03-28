package com.yeuristic.liba.di;

import com.yeuristic.liba.AMain;

import dagger.Subcomponent;

@Subcomponent
public interface ASubComponent {
    void inject(AMain aMain);
}
