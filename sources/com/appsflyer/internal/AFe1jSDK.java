package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1jSDK<Body> implements ResponseNetwork<Body> {
    final int AFAdRevenueData;
    final boolean getCurrencyIso4217Code;

    @NonNull
    public final AFe1mSDK getMediationNetwork;

    @NonNull
    final Map<String, List<String>> getMonetizationNetwork;

    @NonNull
    private final Body getRevenue;

    public AFe1jSDK(@NonNull Body body, int i13, boolean z13, Map<String, List<String>> map, @NonNull AFe1mSDK aFe1mSDK) {
        this.getRevenue = body;
        this.AFAdRevenueData = i13;
        this.getCurrencyIso4217Code = z13;
        this.getMonetizationNetwork = new HashMap(map);
        this.getMediationNetwork = aFe1mSDK;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1jSDK aFe1jSDK = (AFe1jSDK) obj;
        if (this.AFAdRevenueData == aFe1jSDK.AFAdRevenueData && this.getCurrencyIso4217Code == aFe1jSDK.getCurrencyIso4217Code && this.getRevenue.equals(aFe1jSDK.getRevenue) && this.getMonetizationNetwork.equals(aFe1jSDK.getMonetizationNetwork)) {
            return this.getMediationNetwork.equals(aFe1jSDK.getMediationNetwork);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getRevenue;
    }

    public final String getCurrencyIso4217Code(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb3 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb3.append(", ");
            sb3.append(it.next());
        }
        return sb3.toString();
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getMonetizationNetwork.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getMonetizationNetwork.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.AFAdRevenueData;
    }

    public int hashCode() {
        return this.getMediationNetwork.hashCode() + ((this.getMonetizationNetwork.hashCode() + (((((this.getRevenue.hashCode() * 31) + this.AFAdRevenueData) * 31) + (this.getCurrencyIso4217Code ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getCurrencyIso4217Code;
    }
}
