package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface AFd1gSDK {
    @NonNull
    AFe1sSDK AFAdRevenueData();

    @NonNull
    AFj1lSDK AFInAppEventParameterName();

    @NonNull
    AFd1oSDK AFInAppEventType();

    @NonNull
    AFg1qSDK AFKeystoreWrapper();

    @NonNull
    AFi1gSDK AFLogger();

    @NonNull
    AFc1gSDK afDebugLog();

    @NonNull
    AFd1dSDK afErrorLog();

    @NonNull
    AFh1qSDK afInfoLog();

    @NonNull
    AFd1ySDK afVerboseLog();

    @NonNull
    PurchaseHandler areAllFieldsValid();

    @NonNull
    AFg1gSDK component1();

    @NonNull
    AFd1pSDK component2();

    @NonNull
    AFg1vSDK component3();

    @NonNull
    AFh1jSDK component4();

    @NonNull
    AFf1uSDK copy();

    @NonNull
    AFb1gSDK copydefault();

    @NonNull
    AFi1jSDK d();

    @NonNull
    AFi1lSDK e();

    @NonNull
    AFj1iSDK equals();

    @NonNull
    AFg1oSDK force();

    @NonNull
    AFf1xSDK getCurrencyIso4217Code();

    @NonNull
    ExecutorService getMediationNetwork();

    @NonNull
    AFd1nSDK getMonetizationNetwork();

    @NonNull
    ScheduledExecutorService getRevenue();

    @NonNull
    AFd1lSDK i();

    @NonNull
    AFc1kSDK registerClient();

    @NonNull
    AFc1fSDK unregisterClient();

    AFi1eSDK v();

    @NonNull
    AFb1rSDK valueOf();

    @NonNull
    AFe1eSDK values();

    @NonNull
    AFd1wSDK w();
}
