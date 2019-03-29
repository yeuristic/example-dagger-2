package com.yeuristic.abase.di;


import com.yeuristic.abase.ABookingDetail;
import com.yeuristic.abase.AListener;
import com.yeuristic.abase.AStatefulProvider;
import com.yeuristic.base.ApplicationScope;

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
