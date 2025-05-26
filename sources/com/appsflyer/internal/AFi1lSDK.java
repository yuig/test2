package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1lSDK {
    public AFi1mSDK AFAdRevenueData;

    @NotNull
    public final Context getMonetizationNetwork;

    public AFi1lSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getMonetizationNetwork = context;
    }
}
