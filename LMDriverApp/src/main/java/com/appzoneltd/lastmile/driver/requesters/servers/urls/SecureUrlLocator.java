package com.appzoneltd.lastmile.driver.requesters.servers.urls;

import com.appzoneltd.lastmile.driver.R;
import com.base.usecases.requesters.server.urls.ResourcesUrlLocator;


/**
 * a {@link ResourcesUrlLocator} that generates secure {@code https} URLs
 * <p>
 * Created by Ahmed Adel on 10/19/2016.
 */

public class SecureUrlLocator extends ResourcesUrlLocator {

    public SecureUrlLocator() {
        super(R.string.serverProductionUrlHttps, R.string.serverTestUrlHttps);
    }
}
