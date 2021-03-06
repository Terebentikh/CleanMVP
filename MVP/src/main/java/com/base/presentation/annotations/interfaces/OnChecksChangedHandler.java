package com.base.presentation.annotations.interfaces;

import com.base.abstraction.commands.executors.Executor;
import com.base.presentation.listeners.OnCheckedChangedParams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * an annotation that indicates the {@link Executor} class that will handle onCheckedChanged events
 *
 * Created by Ahmed Adel on 1/5/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface OnChecksChangedHandler {

    Class<? extends Executor<OnCheckedChangedParams>>[] value();

}
