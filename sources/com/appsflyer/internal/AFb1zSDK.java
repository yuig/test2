package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFb1zSDK implements AFa1aSDK {

    @NotNull
    private Map<String, String> getCurrencyIso4217Code = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1aSDK
    @NotNull
    public final Map<String, String> getRevenue(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getCurrencyIso4217Code.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i13 = resources.getConfiguration().screenLayout & 15;
            this.getCurrencyIso4217Code.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.getCurrencyIso4217Code.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.getCurrencyIso4217Code.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.getCurrencyIso4217Code.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.getCurrencyIso4217Code.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.getCurrencyIso4217Code.put("size", String.valueOf(i13));
        }
        return this.getCurrencyIso4217Code;
    }
}
