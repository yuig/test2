package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1mSDK;
import java.io.IOException;

/* loaded from: classes.dex */
public class HttpException extends IOException {
    private final AFe1mSDK getMonetizationNetwork;

    public HttpException(@NonNull Throwable th3, @NonNull AFe1mSDK aFe1mSDK) {
        super(th3.getMessage(), th3);
        this.getMonetizationNetwork = aFe1mSDK;
    }

    @NonNull
    public AFe1mSDK getMetrics() {
        return this.getMonetizationNetwork;
    }
}
