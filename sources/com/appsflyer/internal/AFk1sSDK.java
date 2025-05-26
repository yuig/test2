package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class AFk1sSDK {
    public final WeakReference<Context> AFAdRevenueData;
    public String getCurrencyIso4217Code;

    public AFk1sSDK(@NonNull Context context) {
        this.AFAdRevenueData = new WeakReference<>(context);
    }
}
