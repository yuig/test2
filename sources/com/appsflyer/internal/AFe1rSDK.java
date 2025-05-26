package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class AFe1rSDK<ResponseBody> {
    private final ExecutorService AFAdRevenueData;
    public final AFe1kSDK getCurrencyIso4217Code;
    private final AFe1cSDK<ResponseBody> getMediationNetwork;
    private final AFe1oSDK getMonetizationNetwork;
    private final AtomicBoolean getRevenue = new AtomicBoolean(false);

    public AFe1rSDK(AFe1kSDK aFe1kSDK, ExecutorService executorService, AFe1oSDK aFe1oSDK, AFe1cSDK<ResponseBody> aFe1cSDK) {
        this.getCurrencyIso4217Code = aFe1kSDK;
        this.AFAdRevenueData = executorService;
        this.getMonetizationNetwork = aFe1oSDK;
        this.getMediationNetwork = aFe1cSDK;
    }

    public final AFe1jSDK<ResponseBody> AFAdRevenueData() {
        if (this.getRevenue.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFe1jSDK<String> AFAdRevenueData = this.getMonetizationNetwork.AFAdRevenueData(this.getCurrencyIso4217Code);
        try {
            return new AFe1jSDK<>(this.getMediationNetwork.getRevenue(AFAdRevenueData.getBody()), AFAdRevenueData.AFAdRevenueData, AFAdRevenueData.getCurrencyIso4217Code, AFAdRevenueData.getMonetizationNetwork, AFAdRevenueData.getMediationNetwork);
        } catch (JSONException e13) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e13);
            throw new ParsingException(e13.getMessage(), e13, AFAdRevenueData);
        }
    }
}
