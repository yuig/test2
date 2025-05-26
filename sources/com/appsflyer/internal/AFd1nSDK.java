package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class AFd1nSDK {
    private static String getMediationNetwork = "334";
    private final Executor component1;
    public final AFd1pSDK getCurrencyIso4217Code;
    public final AFd1lSDK getMonetizationNetwork;
    public final AFd1oSDK getRevenue;
    private Bundle component2 = null;
    public String AFAdRevenueData = "";

    public AFd1nSDK(AFd1oSDK aFd1oSDK, AFd1pSDK aFd1pSDK, AFd1lSDK aFd1lSDK, Executor executor) {
        this.getRevenue = aFd1oSDK;
        this.getCurrencyIso4217Code = aFd1pSDK;
        this.getMonetizationNetwork = aFd1lSDK;
        this.component1 = executor;
    }

    @NonNull
    public static String AFAdRevenueData() {
        return "6.16.0";
    }

    public static String component2() {
        StringBuilder sb3 = new StringBuilder("version: 6.16.0 (build ");
        sb3.append(getMediationNetwork);
        sb3.append(")");
        return sb3.toString();
    }

    public static String getMediationNetwork() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public static String getMonetizationNetwork() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @NonNull
    public static String getRevenue() {
        return UUID.randomUUID().toString();
    }

    public final String component1() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = getRevenue("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final boolean component4() {
        return !this.getMonetizationNetwork.getRevenue();
    }

    public final boolean getCurrencyIso4217Code(String str, boolean z13) {
        String revenue = getRevenue(str);
        return revenue != null ? Boolean.parseBoolean(revenue) : z13;
    }

    public static boolean getMonetizationNetwork(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.PUBLIC_API, "Could not check if app is pre installed", e13);
        }
        return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }

    public final String getRevenue(String str) {
        Object obj;
        try {
            if (this.component2 == null) {
                this.component2 = ((PackageItemInfo) this.getRevenue.getMonetizationNetwork.getPackageManager().getApplicationInfo(this.getRevenue.getMonetizationNetwork.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)).metaData;
            }
            Bundle bundle = this.component2;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th3) {
            StringBuilder sb3 = new StringBuilder("Could not load manifest metadata!");
            sb3.append(th3.getMessage());
            AFLogger.afErrorLog(sb3.toString(), th3);
            return null;
        }
    }

    public final String getCurrencyIso4217Code(Context context) {
        try {
            return new AFb1kSDK(context, this.component1).getMonetizationNetwork();
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th3, true, false, false);
            return null;
        }
    }

    public final String getCurrencyIso4217Code() {
        AFh1kSDK aFh1kSDK = this.getMonetizationNetwork.component1;
        AFb1uSDK aFb1uSDK = aFh1kSDK != null ? new AFb1uSDK(aFh1kSDK.getRevenue, aFh1kSDK.component3) : null;
        if (aFb1uSDK != null) {
            return aFb1uSDK.getMonetizationNetwork;
        }
        return null;
    }

    @SuppressLint({"DiscouragedApi"})
    public final String getMonetizationNetwork(String str) {
        try {
            int identifier = this.getRevenue.getMonetizationNetwork.getResources().getIdentifier(str, "string", this.getRevenue.getMonetizationNetwork.getPackageName());
            if (identifier != 0) {
                return this.getRevenue.getMonetizationNetwork.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e13) {
            StringBuilder sb3 = new StringBuilder("Could not load string resource!");
            sb3.append(e13.getMessage());
            AFLogger.afErrorLog(sb3.toString(), e13);
            return null;
        }
    }
}
