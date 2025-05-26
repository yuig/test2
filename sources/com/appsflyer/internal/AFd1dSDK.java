package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface AFd1dSDK {

    public interface AFa1zSDK {
        void onConfigurationChanged(boolean z13);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(@NonNull Throwable th3, @NonNull String str);

    void getMonetizationNetwork(AFa1zSDK aFa1zSDK);
}
