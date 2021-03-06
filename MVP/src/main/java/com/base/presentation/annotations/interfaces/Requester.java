package com.base.presentation.annotations.interfaces;

import android.support.annotation.NonNull;

import com.base.usecases.requesters.base.EntityRequester;
import com.base.usecases.requesters.server.base.ServerRequester;
import com.base.usecases.api.IntegrationHandler;
import com.base.usecases.requesters.base.EntityGateway;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * declare this on a {@link com.base.presentation.repos.base.Repository RepositoriesGroup} class to make
 * it initialize a {@link EntityGateway}
 * <p>
 * Created by Ahmed Adel on 12/23/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Requester {

    Class<? extends EntityRequester> value();

    @NonNull
    Class<? extends EntityGateway> gateway() default EntityGateway.class;


}
