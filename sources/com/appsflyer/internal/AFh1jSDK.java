package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1jSDK {
    public final Map<String, Object> AFAdRevenueData;
    public long areAllFieldsValid;
    public final long[] component1;
    public final long[] component2;
    public long component3;
    public final long[] component4;
    public long equals;
    public final AFd1pSDK getCurrencyIso4217Code;
    public long getMediationNetwork;
    public final Map<String, Object> getMonetizationNetwork;
    public final Map<String, Object> getRevenue;
    public long hashCode;

    public AFh1jSDK(AFd1pSDK aFd1pSDK) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.getMonetizationNetwork = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.getRevenue = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        this.AFAdRevenueData = concurrentHashMap3;
        this.getMediationNetwork = 0L;
        this.component3 = 0L;
        this.component2 = new long[2];
        this.component4 = new long[2];
        this.component1 = new long[2];
        this.areAllFieldsValid = 0L;
        this.equals = 0L;
        this.getCurrencyIso4217Code = aFd1pSDK;
        concurrentHashMap.putAll(AFAdRevenueData("first_launch"));
        concurrentHashMap2.putAll(AFAdRevenueData("ddl"));
        concurrentHashMap3.putAll(AFAdRevenueData("gcd"));
        this.hashCode = aFd1pSDK.getMediationNetwork("prev_session_dur", 0L);
    }

    public final void AFAdRevenueData(DeepLinkResult deepLinkResult, long j13) {
        this.getRevenue.put("status", deepLinkResult.getStatus().toString());
        this.getRevenue.put("timeout_value", Long.valueOf(j13));
        this.getCurrencyIso4217Code.getMonetizationNetwork("ddl", new JSONObject(this.getRevenue).toString());
    }

    public final void getCurrencyIso4217Code(AFh1nSDK aFh1nSDK) {
        if (getRevenue()) {
            this.getMonetizationNetwork.put("start_with", aFh1nSDK.toString());
            this.getCurrencyIso4217Code.getMonetizationNetwork("first_launch", new JSONObject(this.getMonetizationNetwork).toString());
        }
    }

    public final void getMediationNetwork(int i13) {
        long currentTimeMillis = System.currentTimeMillis();
        this.areAllFieldsValid = currentTimeMillis;
        if (i13 == 1) {
            long j13 = this.component3;
            if (j13 == 0) {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
                return;
            }
            this.getMonetizationNetwork.put("from_fg", Long.valueOf(currentTimeMillis - j13));
            this.getCurrencyIso4217Code.getMonetizationNetwork("first_launch", new JSONObject(this.getMonetizationNetwork).toString());
        }
    }

    public final void getMonetizationNetwork() {
        this.component3 = System.currentTimeMillis();
        if (getRevenue()) {
            long j13 = this.getMediationNetwork;
            if (j13 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.getMonetizationNetwork.put("init_to_fg", Long.valueOf(this.component3 - j13));
            this.getCurrencyIso4217Code.getMonetizationNetwork("first_launch", new JSONObject(this.getMonetizationNetwork).toString());
        }
    }

    public final boolean getRevenue() {
        return this.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) == 0;
    }

    public final void AFAdRevenueData(int i13) {
        long currentTimeMillis = System.currentTimeMillis();
        long j13 = this.equals;
        if (j13 != 0) {
            this.AFAdRevenueData.put("net", Long.valueOf(currentTimeMillis - j13));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFAdRevenueData.put("retries", Integer.valueOf(i13));
        this.getCurrencyIso4217Code.getMonetizationNetwork("gcd", new JSONObject(this.AFAdRevenueData).toString());
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        Map<String, Object> emptyMap = Collections.emptyMap();
        String currencyIso4217Code = this.getCurrencyIso4217Code.getCurrencyIso4217Code(str, null);
        if (currencyIso4217Code == null) {
            return emptyMap;
        }
        try {
            return AFa1qSDK.getCurrencyIso4217Code(new JSONObject(currencyIso4217Code));
        } catch (Exception e13) {
            AFLogger.afErrorLog("Error while parsing cached json data", e13, true);
            return emptyMap;
        }
    }
}
