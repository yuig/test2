package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1jSDK implements AFg1kSDK {

    @NotNull
    private final AppsFlyerProperties AFAdRevenueData;

    @NotNull
    private final Context getRevenue;

    public AFg1jSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getRevenue = context;
        this.AFAdRevenueData = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1kSDK
    public final AFg1iSDK getMonetizationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.AFAdRevenueData.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getRevenue);
            int i13 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i14 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i15 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i16 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i13 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1iSDK(i15, i13, i14, i16, str);
        } catch (Exception e13) {
            AFh1rSDK.e$default(AFLogger.INSTANCE, AFh1sSDK.DMA, "TCF data collection exception", e13, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, null);
            return null;
        }
    }
}
