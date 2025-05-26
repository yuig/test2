package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFf1qSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.AFh1sSDK;
import com.appsflyer.internal.AFk1sSDK;
import com.appsflyer.internal.AFk1wSDK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class CrossPromotionHelper {
    private static String getCurrencyIso4217Code = "https://%simpression.%s";

    private static void getRevenue(@NonNull String str, @NonNull Context context, AFk1sSDK aFk1sSDK) {
        AFb1tSDK currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code();
        currencyIso4217Code.getCurrencyIso4217Code(context);
        AFd1gSDK AFAdRevenueData = currencyIso4217Code.AFAdRevenueData();
        AFf1qSDK aFf1qSDK = new AFf1qSDK(AFAdRevenueData, str, aFk1sSDK);
        AFf1uSDK copy = AFAdRevenueData.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1qSDK));
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void setUrl(Map<String, String> map) {
        char c13;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            String key = entry.getKey();
            int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && key.equals("impression")) {
                    c13 = 1;
                }
                c13 = 65535;
            } else {
                if (key.equals("app")) {
                    c13 = 0;
                }
                c13 = 65535;
            }
            if (c13 == 0) {
                AFk1wSDK.getCurrencyIso4217Code = value;
            } else if (c13 == 1) {
                getCurrencyIso4217Code = value;
            }
        }
    }

    public static void logAndOpenStore(@NonNull Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator revenue = getRevenue(context, str, str2, map, String.format(AFk1wSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1sSDK.CROSS_PROMOTION, "CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1sSDK.CROSS_PROMOTION, "SDK is stopped, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        getRevenue(revenue.generateLink(), context, new AFk1sSDK(context));
    }

    public static void logCrossPromoteImpression(@NonNull Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.INSTANCE.i(AFh1sSDK.CROSS_PROMOTION, "CustomerUserId not set, Promote Impression is disabled", true);
        } else if (AppsFlyerLib.getInstance().isStopped()) {
            AFLogger.INSTANCE.i(AFh1sSDK.CROSS_PROMOTION, "SDK is stopped, Promote Impression is disabled", true);
        } else {
            getRevenue(getRevenue(context, str, str2, map, String.format(getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName())).generateLink(), context, null);
        }
    }

    @NonNull
    private static LinkGenerator getRevenue(@NonNull Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.getMediationNetwork = str3;
        linkGenerator.getCurrencyIso4217Code = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        return linkGenerator;
    }
}
