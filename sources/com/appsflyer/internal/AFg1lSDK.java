package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1lSDK implements AFg1oSDK {

    @NotNull
    private final AFg1kSDK AFAdRevenueData;

    @NotNull
    private final AppsFlyerProperties getMonetizationNetwork;

    @NotNull
    private final AFd1lSDK getRevenue;

    public AFg1lSDK(@NotNull AFg1kSDK aFg1kSDK, @NotNull AFd1lSDK aFd1lSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1kSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFAdRevenueData = aFg1kSDK;
        this.getRevenue = aFd1lSDK;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1oSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map, @NotNull AFf1rSDK aFf1rSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        AFg1iSDK monetizationNetwork = this.AFAdRevenueData.getMonetizationNetwork();
        AppsFlyerConsent appsFlyerConsent = this.getRevenue.component4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", hasConsentForDataUsage);
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", hasConsentForAdsPersonalization);
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (monetizationNetwork != null) {
            boolean z13 = appsFlyerConsent != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(monetizationNetwork.getMonetizationNetwork));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(monetizationNetwork.getCurrencyIso4217Code));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(monetizationNetwork.getRevenue));
            if (z13) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", "");
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(monetizationNetwork.AFAdRevenueData));
                linkedHashMap3.put("tcstring", monetizationNetwork.getMediationNetwork);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1rSDK != AFf1rSDK.CONVERSION || this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) == null) {
            return;
        }
        Map<String, Object> currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code(map);
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        currencyIso4217Code.put("api", y0.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
    }
}
