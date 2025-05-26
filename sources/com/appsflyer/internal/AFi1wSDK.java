package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1wSDK {
    public final long AFAdRevenueData;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final int getRevenue;

    public AFi1wSDK(String str, int i13, int i14, long j13) {
        this.getMediationNetwork = str;
        this.getRevenue = i13;
        this.getMonetizationNetwork = i14;
        this.AFAdRevenueData = j13;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFi1wSDK.class == obj.getClass()) {
            AFi1wSDK aFi1wSDK = (AFi1wSDK) obj;
            if (this.getRevenue == aFi1wSDK.getRevenue && this.getMonetizationNetwork == aFi1wSDK.getMonetizationNetwork && this.AFAdRevenueData == aFi1wSDK.AFAdRevenueData && (str = this.getMediationNetwork) != null && str.equals(aFi1wSDK.getMediationNetwork)) {
                return true;
            }
        }
        return false;
    }

    public final String getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getMediationNetwork);
            jSONObject.put("min", this.getRevenue);
            jSONObject.put("expire", this.getMonetizationNetwork);
            jSONObject.put("ttl", this.AFAdRevenueData);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getRevenue) * 31) + this.getMonetizationNetwork) * 31) + ((int) this.AFAdRevenueData);
    }
}
