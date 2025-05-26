package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class AFg1zSDK extends AFg1xSDK {

    @NotNull
    private final AFh1gSDK hashCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFg1zSDK(@NotNull AFh1gSDK aFh1gSDK, @NotNull AFd1gSDK aFd1gSDK) {
        super(aFh1gSDK, aFd1gSDK);
        Intrinsics.checkNotNullParameter(aFh1gSDK, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.hashCode = aFh1gSDK;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        super.getCurrencyIso4217Code(aFa1rSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.hashCode.copydefault;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.hashCode.equals;
        if (map != null && !map.isEmpty()) {
            List j13 = f0.j(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, AdRevenueScheme.COUNTRY, AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (j13.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        currencyIso4217Code.put("ad_network", linkedHashMap3);
    }
}
