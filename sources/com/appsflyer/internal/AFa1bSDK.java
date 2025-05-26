package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFa1bSDK implements Runnable {
    private final String AFAdRevenueData;
    private final AFd1nSDK areAllFieldsValid;
    private final String component1;
    private final String component2;
    private final Map<String, String> component3;
    private final WeakReference<Context> getCurrencyIso4217Code;
    final String getMediationNetwork;
    final String getMonetizationNetwork;
    final String getRevenue;

    public AFa1bSDK(Context context, String str, AFd1nSDK aFd1nSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getCurrencyIso4217Code = new WeakReference<>(context);
        this.AFAdRevenueData = str;
        this.component1 = str2;
        this.getRevenue = str4;
        this.getMonetizationNetwork = str5;
        this.getMediationNetwork = str6;
        this.component3 = map;
        this.component2 = str3;
        this.areAllFieldsValid = aFd1nSDK;
    }

    public static void getCurrencyIso4217Code(boolean z13, String str, String str2, String str3, String str4) {
        if (AFb1tSDK.AFAdRevenueData != null) {
            StringBuilder w13 = a.a.w("Validate callback parameters: ", str, " ", str2, " ");
            w13.append(str3);
            AFLogger.afDebugLog(w13.toString());
            if (z13) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1tSDK.AFAdRevenueData.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1tSDK.AFAdRevenueData;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFg1xSDK getMonetizationNetwork(Context context, @NonNull AFh1aSDK aFh1aSDK) {
        AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code(context);
        AFd1gSDK AFAdRevenueData = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData();
        aFh1aSDK.getCurrencyIso4217Code(AFAdRevenueData.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0));
        AFg1xSDK aFg1xSDK = new AFg1xSDK(aFh1aSDK, AFAdRevenueData);
        AFf1uSDK copy = AFAdRevenueData.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFg1xSDK));
        return aFg1xSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.AFAdRevenueData;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getCurrencyIso4217Code.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.component1);
            hashMap.put("sig-data", this.getRevenue);
            hashMap.put("signature", this.component2);
            HashMap hashMap2 = new HashMap(hashMap);
            Map<String, String> map = this.component3;
            String currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().component2().getCurrencyIso4217Code("referrer", "");
            AFi1vSDK aFi1vSDK = new AFi1vSDK();
            aFi1vSDK.component3 = currencyIso4217Code;
            AFb1tSDK currencyIso4217Code2 = AFb1tSDK.getCurrencyIso4217Code();
            Map<String, ?> map2 = (Map) AFb1tSDK.getMonetizationNetwork(new Object[]{currencyIso4217Code2, aFi1vSDK}, 1508221324, -1508221312, System.identityHashCode(currencyIso4217Code2));
            map2.put("price", this.getMonetizationNetwork);
            map2.put("currency", this.getMediationNetwork);
            map2.put("receipt_data", hashMap2);
            if (map != null) {
                map2.put("extra_prms", map);
            }
            map2.putAll(currencyIso4217Code2.AFAdRevenueData().AFKeystoreWrapper().getMonetizationNetwork());
            aFi1vSDK.getMonetizationNetwork(map2);
            aFi1vSDK.getRevenue(new AFj1bSDK(this.areAllFieldsValid).AFAdRevenueData(aFi1vSDK));
            getMonetizationNetwork(context, aFi1vSDK);
            hashMap.put("dev_key", this.AFAdRevenueData);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1kSDK aFh1kSDK = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().getMonetizationNetwork().getMonetizationNetwork.component1;
            AFb1uSDK aFb1uSDK = aFh1kSDK != null ? new AFb1uSDK(aFh1kSDK.getRevenue, aFh1kSDK.component3) : null;
            String str2 = aFb1uSDK != null ? aFb1uSDK.getMonetizationNetwork : null;
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFi1uSDK aFi1uSDK = (AFi1uSDK) new AFi1uSDK().getMonetizationNetwork(hashMap);
            aFi1uSDK.getRevenue(new AFj1bSDK(this.areAllFieldsValid).AFAdRevenueData(aFi1uSDK));
            final AFg1xSDK monetizationNetwork = getMonetizationNetwork(context, aFi1uSDK);
            aFi1uSDK.getMonetizationNetwork = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1bSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i13, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i13 == 50 && (responseNetwork = ((AFf1hSDK) monetizationNetwork).component1) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                    AFa1bSDK.getCurrencyIso4217Code(false, aFa1bSDK.getRevenue, aFa1bSDK.getMonetizationNetwork, aFa1bSDK.getMediationNetwork, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1hSDK) monetizationNetwork).component1.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean optBoolean = jSONObject.optBoolean("result");
                        AFa1bSDK aFa1bSDK = AFa1bSDK.this;
                        AFa1bSDK.getCurrencyIso4217Code(optBoolean, aFa1bSDK.getRevenue, aFa1bSDK.getMonetizationNetwork, aFa1bSDK.getMediationNetwork, jSONObject.toString());
                    } catch (Exception e13) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e13)), e13);
                        AFa1bSDK aFa1bSDK2 = AFa1bSDK.this;
                        AFa1bSDK.getCurrencyIso4217Code(false, aFa1bSDK2.getRevenue, aFa1bSDK2.getMonetizationNetwork, aFa1bSDK2.getMediationNetwork, e13.getMessage());
                    }
                }
            };
        } catch (Throwable th3) {
            if (AFb1tSDK.AFAdRevenueData != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th3);
                getCurrencyIso4217Code(false, this.getRevenue, this.getMonetizationNetwork, this.getMediationNetwork, th3.getMessage());
            }
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }
}
