package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AFa1rSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public String component1;
    public int component2;
    public String component3;
    public String component4;
    private byte[] copy;
    protected final Map<String, Object> getCurrencyIso4217Code;
    public String getMediationNetwork;
    public AppsFlyerRequestListener getMonetizationNetwork;
    public String getRevenue;
    private final boolean hashCode;

    public AFa1rSDK() {
        this(null, null, null);
    }

    public final AFa1rSDK AFAdRevenueData(String str, Object obj) {
        synchronized (this.getCurrencyIso4217Code) {
            this.getCurrencyIso4217Code.put(str, obj);
        }
        return this;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component2() {
        return false;
    }

    public boolean component3() {
        return true;
    }

    public boolean component4() {
        return true;
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    public final boolean getMediationNetwork() {
        return this.component4 == null && this.getMediationNetwork == null;
    }

    public final AFa1rSDK getMonetizationNetwork(Map<String, ?> map) {
        synchronized (map) {
            this.getCurrencyIso4217Code.putAll(map);
        }
        return this;
    }

    public AFa1rSDK getRevenue(String str) {
        this.component1 = str;
        return this;
    }

    public abstract AFf1rSDK getRevenue();

    public AFa1rSDK(String str, String str2, Boolean bool) {
        this.getCurrencyIso4217Code = new HashMap();
        this.component4 = str;
        this.component1 = str2;
        this.hashCode = bool != null ? bool.booleanValue() : true;
    }

    public final AFa1rSDK getCurrencyIso4217Code(int i13) {
        this.component2 = i13;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                if (this.getCurrencyIso4217Code.containsKey("counter")) {
                    this.getCurrencyIso4217Code.put("counter", Integer.toString(i13));
                }
                if (this.getCurrencyIso4217Code.containsKey("launch_counter")) {
                    this.getCurrencyIso4217Code.put("launch_counter", Integer.toString(i13));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return this;
    }

    public final AFa1rSDK AFAdRevenueData(byte[] bArr) {
        this.copy = bArr;
        return this;
    }

    public final boolean getMonetizationNetwork() {
        return this.hashCode;
    }

    public final byte[] AFAdRevenueData() {
        return this.copy;
    }

    @NonNull
    public static String AFAdRevenueData(String str) {
        String component1 = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().getMonetizationNetwork().component1();
        return component1 != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, component1).build().toString() : str;
    }

    public static boolean AFAdRevenueData(double d2) {
        if (d2 < 0.0d || d2 >= 1.0d) {
            return false;
        }
        if (d2 == 0.0d) {
            return true;
        }
        int i13 = (int) (1.0d / d2);
        if (i13 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i13)) + 1.0d)) != i13;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
