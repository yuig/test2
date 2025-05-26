package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFk1zSDK implements AFk1ySDK {
    @Override // com.appsflyer.internal.AFk1ySDK
    @NotNull
    public final String getMonetizationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
