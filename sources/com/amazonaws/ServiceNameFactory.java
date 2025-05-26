package com.amazonaws;

import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;

/* loaded from: classes3.dex */
enum ServiceNameFactory {
    ;

    public static String getServiceName(String str) {
        HttpClientConfig httpClientConfig = (HttpClientConfig) InternalConfig.Factory.f28623a.f28621e.get(str);
        if (httpClientConfig == null) {
            return null;
        }
        return httpClientConfig.f28616a;
    }
}
