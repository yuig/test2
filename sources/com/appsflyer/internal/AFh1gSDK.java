package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFh1gSDK extends AFa1rSDK {

    @NonNull
    public final AFAdRevenueData copydefault;
    public final Map<String, Object> equals;

    public AFh1gSDK(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.copydefault = aFAdRevenueData;
        this.equals = map;
    }

    @Override // com.appsflyer.internal.AFa1rSDK
    public final AFf1rSDK getRevenue() {
        return AFf1rSDK.ADREVENUE;
    }
}
