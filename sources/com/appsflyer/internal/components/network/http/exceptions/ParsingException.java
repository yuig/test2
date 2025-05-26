package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1jSDK;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1jSDK<String> getMonetizationNetwork;

    public ParsingException(String str, Throwable th3, @NonNull AFe1jSDK<String> aFe1jSDK) {
        super(str, th3);
        this.getMonetizationNetwork = aFe1jSDK;
    }

    @NonNull
    public AFe1jSDK<String> getRawResponse() {
        return this.getMonetizationNetwork;
    }
}
