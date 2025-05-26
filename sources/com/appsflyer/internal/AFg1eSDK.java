package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public final class AFg1eSDK {
    public static String getMediationNetwork;
    public final AFd1pSDK AFAdRevenueData;

    static {
        StringBuilder sb3 = new StringBuilder("https://%sregister.%s/api/v");
        sb3.append(AFb1tSDK.getRevenue);
        getMediationNetwork = sb3.toString();
    }

    public AFg1eSDK(@NonNull Context context) {
        this.AFAdRevenueData = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData(context);
    }

    public static boolean AFAdRevenueData(@NonNull AFd1pSDK aFd1pSDK) {
        return aFd1pSDK.getMediationNetwork("sentRegisterRequestToAF", false);
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th3);
        }
        return AFb1qSDK.c_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
    }

    public static void getRevenue(String str) {
        AFd1gSDK AFAdRevenueData = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData();
        AFf1aSDK aFf1aSDK = new AFf1aSDK(str, AFAdRevenueData);
        AFf1uSDK copy = AFAdRevenueData.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1aSDK));
    }

    public final AFg1hSDK getMonetizationNetwork() {
        String string;
        String string2;
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken", null);
        long mediationNetwork = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_received_time", 0L);
        boolean mediationNetwork2 = this.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued", false);
        this.AFAdRevenueData.getRevenue("afUninstallToken_queued", false);
        if (currencyIso4217Code == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            currencyIso4217Code = string2.split(",")[r0.length - 1];
        }
        if (mediationNetwork == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    mediationNetwork = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (currencyIso4217Code != null) {
            return new AFg1hSDK(currencyIso4217Code, mediationNetwork, mediationNetwork2);
        }
        return null;
    }
}
