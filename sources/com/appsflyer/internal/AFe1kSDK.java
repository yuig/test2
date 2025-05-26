package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFe1kSDK {

    @NonNull
    final Map<String, String> AFAdRevenueData;
    private final byte[] areAllFieldsValid;
    public int component1;
    private final boolean component2;
    private final boolean component3;
    private boolean component4;
    public boolean getCurrencyIso4217Code;
    public boolean getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;

    @NonNull
    final String getRevenue;

    public AFe1kSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z13) {
        this(str, bArr, str2, map, z13, (byte) 0);
    }

    public final boolean AFAdRevenueData() {
        return this.getMediationNetwork;
    }

    public final boolean areAllFieldsValid() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component2;
    }

    public final boolean getMediationNetwork() {
        return this.component3;
    }

    public final byte[] getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }

    public final boolean getRevenue() {
        return this.component4;
    }

    private AFe1kSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z13, byte b13) {
        this.component4 = true;
        this.getMediationNetwork = false;
        this.getCurrencyIso4217Code = true;
        this.component1 = -1;
        this.getMonetizationNetwork = str;
        this.areAllFieldsValid = bArr;
        this.getRevenue = str2;
        this.AFAdRevenueData = map;
        this.component3 = z13;
        this.component2 = true;
    }

    public AFe1kSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
