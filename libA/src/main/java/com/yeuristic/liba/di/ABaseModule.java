package com.yeuristic.liba.di;

import com.yeuristic.base.ApplicationScope;
import com.yeuristic.liba.ABookingDetail;
import com.yeuristic.liba.AListener;
import com.yeuristic.liba.AStatefulProvider;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ABaseModule {

    @ApplicationScope
    @Provides
    static ABookingDetail getBookingDetail() {
        return new ABookingDetail();
    }

    @ApplicationScope
    @Provides
    static AListener getListener() {
        return new AListener();
    }

    @ApplicationScope
    @Provides
    static AStatefulProvider getStatefulProvider() {
        return new AStatefulProvider();
    }
}
