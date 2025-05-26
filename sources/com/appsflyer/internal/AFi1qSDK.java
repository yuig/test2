package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1qSDK {

    @NonNull
    public final AFi1ySDK AFAdRevenueData;

    @NonNull
    public final String getCurrencyIso4217Code;
    public final AFi1xSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    public AFi1qSDK(@NonNull String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getCurrencyIso4217Code = string;
            this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
            this.getRevenue = str;
            this.AFAdRevenueData = string.startsWith("default") ? AFi1ySDK.DEFAULT : AFi1ySDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.getMediationNetwork = optJSONObject != null ? new AFi1xSDK(optJSONObject) : null;
        } catch (JSONException e13) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e13);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1qSDK.class != obj.getClass()) {
            return false;
        }
        AFi1qSDK aFi1qSDK = (AFi1qSDK) obj;
        if (this.getMonetizationNetwork == aFi1qSDK.getMonetizationNetwork && this.getCurrencyIso4217Code.equals(aFi1qSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFi1qSDK.getRevenue);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.getRevenue.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return aFi1xSDK != null ? (hashCode * 31) + aFi1xSDK.hashCode() : hashCode;
    }
}
