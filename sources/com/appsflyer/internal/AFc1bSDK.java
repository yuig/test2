package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFc1bSDK {
    public final Map<String, Object> getRevenue = new HashMap();
    public Map<String, Object> getMonetizationNetwork = new HashMap();

    public final void getMonetizationNetwork(Map<String, Object> map) {
        if (!this.getRevenue.isEmpty()) {
            map.put("partner_data", this.getRevenue);
        }
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFb1tSDK.getCurrencyIso4217Code(map).put("partner_data", this.getMonetizationNetwork);
        this.getMonetizationNetwork = new HashMap();
    }
}
