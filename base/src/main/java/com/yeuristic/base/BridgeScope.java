package com.yeuristic.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by kc on 10/25/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface BridgeScope {
}
