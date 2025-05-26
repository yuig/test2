package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFh1xSDK extends AFf1hSDK<Map<String, Object>> {
    private static final List<String> component2 = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private String AFKeystoreWrapper;
    private final AFd1pSDK copy;
    private Map<String, Object> copydefault;
    private final AFh1jSDK equals;
    private final AFe1sSDK hashCode;
    private final AFd1nSDK toString;

    public AFh1xSDK(@NonNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.GCDSDK, new AFf1rSDK[]{AFf1rSDK.RC_CDN}, aFd1gSDK, "GCD-FETCH");
        this.hashCode = aFd1gSDK.AFAdRevenueData();
        this.copy = aFd1gSDK.component2();
        this.equals = aFd1gSDK.component4();
        this.toString = aFd1gSDK.getMonetizationNetwork();
        this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
        this.getMediationNetwork.add(AFf1rSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AFe1rSDK<Map<String, Object>> getCurrencyIso4217Code(@NonNull String str) {
        String str2;
        String currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code(this.copy, this.toString.component1());
        if (currencyIso4217Code != null && !currencyIso4217Code.trim().isEmpty()) {
            if (!component2.contains(currencyIso4217Code.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(currencyIso4217Code);
                AFe1rSDK<Map<String, Object>> AFAdRevenueData = this.hashCode.AFAdRevenueData(str2, str);
                StringBuilder sb3 = new StringBuilder("[GCD-B01] URL: ");
                sb3.append(AFAdRevenueData.getCurrencyIso4217Code.getMonetizationNetwork);
                AFLogger.afInfoLog(sb3.toString());
                return AFAdRevenueData;
            }
            AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + currencyIso4217Code + ". Using without channel postfix.");
        }
        str2 = "";
        AFe1rSDK<Map<String, Object>> AFAdRevenueData2 = this.hashCode.AFAdRevenueData(str2, str);
        StringBuilder sb32 = new StringBuilder("[GCD-B01] URL: ");
        sb32.append(AFAdRevenueData2.getCurrencyIso4217Code.getMonetizationNetwork);
        AFLogger.afInfoLog(sb32.toString());
        return AFAdRevenueData2;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        Map<String, Object> map = this.copydefault;
        String str = this.AFKeystoreWrapper;
        if (map != null) {
            AFh1vSDK.getCurrencyIso4217Code(map);
        } else if (str == null || str.isEmpty()) {
            AFh1vSDK.getMonetizationNetwork("Unknown error");
        } else {
            AFh1vSDK.getMonetizationNetwork(str);
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[Catch: all -> 0x0069, Exception -> 0x006c, AFf1vSDK -> 0x006f, TryCatch #3 {AFf1vSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[Catch: all -> 0x0069, Exception -> 0x006c, AFf1vSDK -> 0x006f, TryCatch #3 {AFf1vSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[Catch: all -> 0x0069, Exception -> 0x006c, AFf1vSDK -> 0x006f, TryCatch #3 {AFf1vSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #2 }] */
    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFf1wSDK getCurrencyIso4217Code() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFh1xSDK.getCurrencyIso4217Code():com.appsflyer.internal.AFf1wSDK");
    }
}
