package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFj1mSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFf1gSDK extends AFf1hSDK<AFc1oSDK> {

    @NotNull
    private final CountDownLatch AFInAppEventParameterName;

    @NotNull
    private final List<AFj1mSDK> AFInAppEventType;
    private int AFKeystoreWrapper;

    @NotNull
    private final AFc1pSDK component2;

    @NotNull
    private final AFd1nSDK copy;

    @NotNull
    private final AFc1kSDK copydefault;

    @NotNull
    private final AFh1jSDK equals;

    @NotNull
    private final AFd1lSDK hashCode;

    @NotNull
    private final AFj1lSDK toString;
    private int valueOf;
    private int values;

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getMediationNetwork;
        public static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AFf1wSDK.values().length];
            try {
                iArr[AFf1wSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFf1wSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getMonetizationNetwork = iArr;
            int[] iArr2 = new int[AFj1mSDK.AFa1zSDK.values().length];
            try {
                iArr2[AFj1mSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AFj1mSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            getMediationNetwork = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1gSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFd1gSDK aFd1gSDK) {
        super(AFf1rSDK.DLSDK, new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1gSDK, "");
        this.component2 = aFc1pSDK;
        this.AFInAppEventParameterName = new CountDownLatch(1);
        this.AFInAppEventType = new ArrayList();
        AFd1nSDK monetizationNetwork = aFd1gSDK.getMonetizationNetwork();
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        this.copy = monetizationNetwork;
        AFd1lSDK i13 = aFd1gSDK.i();
        Intrinsics.checkNotNullExpressionValue(i13, "");
        this.hashCode = i13;
        AFc1kSDK registerClient = aFd1gSDK.registerClient();
        Intrinsics.checkNotNullExpressionValue(registerClient, "");
        this.copydefault = registerClient;
        AFh1jSDK component4 = aFd1gSDK.component4();
        Intrinsics.checkNotNullExpressionValue(component4, "");
        this.equals = component4;
        AFj1lSDK AFInAppEventParameterName = aFd1gSDK.AFInAppEventParameterName();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
        this.toString = AFInAppEventParameterName;
        AFj1mSDK[] AFAdRevenueData = AFInAppEventParameterName.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(AFAdRevenueData, "");
        ArrayList<AFj1mSDK> arrayList = new ArrayList();
        for (AFj1mSDK aFj1mSDK : AFAdRevenueData) {
            if (aFj1mSDK != null && aFj1mSDK.component1 != AFj1mSDK.AFa1zSDK.NOT_STARTED) {
                arrayList.add(aFj1mSDK);
            }
        }
        this.values = arrayList.size();
        for (final AFj1mSDK aFj1mSDK2 : arrayList) {
            AFj1mSDK.AFa1zSDK aFa1zSDK = aFj1mSDK2.component1;
            int i14 = aFa1zSDK == null ? -1 : AFa1zSDK.getMediationNetwork[aFa1zSDK.ordinal()];
            if (i14 == 1) {
                AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, aFj1mSDK2.getCurrencyIso4217Code.get("source") + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNullExpressionValue(aFj1mSDK2, "");
                getCurrencyIso4217Code(aFj1mSDK2);
            } else if (i14 == 2) {
                aFj1mSDK2.addObserver(new Observer() { // from class: com.appsflyer.internal.m
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        AFf1gSDK.getRevenue(AFj1mSDK.this, this, observable, obj);
                    }
                });
            }
        }
    }

    private final boolean equals() {
        Object obj = this.component2.getCurrencyIso4217Code().get("referrers");
        List list = obj instanceof List ? (List) obj : null;
        return (list != null ? list.size() : 0) < this.values && !this.component2.getCurrencyIso4217Code().containsKey("referrers");
    }

    private static boolean getMediationNetwork(AFj1mSDK aFj1mSDK) {
        Object obj = aFj1mSDK.getCurrencyIso4217Code.get("click_ts");
        Long l13 = obj instanceof Long ? (Long) obj : null;
        if (l13 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l13.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    @NotNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        AFf1wSDK aFf1wSDK = AFf1wSDK.FAILURE;
        try {
            AFf1wSDK currencyIso4217Code = super.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            try {
                AFh1jSDK aFh1jSDK = this.equals;
                int i13 = this.AFKeystoreWrapper;
                if (i13 <= 0 || i13 > 2) {
                    AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i13))));
                } else {
                    int i14 = i13 - 1;
                    aFh1jSDK.component4[i14] = System.currentTimeMillis();
                    long j13 = aFh1jSDK.component2[i14];
                    if (j13 != 0) {
                        long[] jArr = aFh1jSDK.component1;
                        jArr[i14] = aFh1jSDK.component4[i14] - j13;
                        aFh1jSDK.getRevenue.put("net", jArr);
                        aFh1jSDK.getCurrencyIso4217Code.getMonetizationNetwork("ddl", new JSONObject(aFh1jSDK.getRevenue).toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder("Metrics: ddlStart[");
                        sb3.append(i14);
                        sb3.append("] ts is missing");
                        AFLogger.afInfoLog(sb3.toString());
                    }
                }
                int i15 = AFa1zSDK.getMonetizationNetwork[currencyIso4217Code.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        return currencyIso4217Code;
                    }
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1sSDK aFh1sSDK = AFh1sSDK.DDL;
                    ResponseNetwork responseNetwork = ((AFf1hSDK) this).component1;
                    AFh1rSDK.d$default(aFLogger, aFh1sSDK, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                    DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                    this.equals.AFAdRevenueData(deepLinkResult, this.copydefault.component1);
                    this.copydefault.AFAdRevenueData(deepLinkResult);
                    return currencyIso4217Code;
                }
                ResponseNetwork responseNetwork2 = ((AFf1hSDK) this).component1;
                Intrinsics.f(responseNetwork2);
                Object body = responseNetwork2.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "");
                AFc1oSDK aFc1oSDK = (AFc1oSDK) body;
                DeepLink deepLink = aFc1oSDK.getRevenue;
                if (deepLink != null) {
                    DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                    this.equals.AFAdRevenueData(deepLinkResult2, this.copydefault.component1);
                    this.copydefault.AFAdRevenueData(deepLinkResult2);
                    return currencyIso4217Code;
                }
                if (this.AFKeystoreWrapper > 1 || !aFc1oSDK.getGetCurrencyIso4217Code() || !equals()) {
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.equals.AFAdRevenueData(deepLinkResult3, this.copydefault.component1);
                    this.copydefault.AFAdRevenueData(deepLinkResult3);
                    return currencyIso4217Code;
                }
                AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, "Waiting for referrers...", false, 4, null);
                this.AFInAppEventParameterName.await();
                AFh1jSDK aFh1jSDK2 = this.equals;
                long currentTimeMillis = System.currentTimeMillis();
                long j14 = aFh1jSDK2.component4[0];
                if (j14 != 0) {
                    aFh1jSDK2.getRevenue.put("rfr_wait", Long.valueOf(currentTimeMillis - j14));
                    aFh1jSDK2.getCurrencyIso4217Code.getMonetizationNetwork("ddl", new JSONObject(aFh1jSDK2.getRevenue).toString());
                } else {
                    AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                }
                if (this.valueOf != this.values) {
                    return getCurrencyIso4217Code();
                }
                DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
                this.equals.AFAdRevenueData(deepLinkResult4, this.copydefault.component1);
                this.copydefault.AFAdRevenueData(deepLinkResult4);
                return AFf1wSDK.SUCCESS;
            } catch (Exception e13) {
                e = e13;
                aFf1wSDK = currencyIso4217Code;
                Throwable cause = e.getCause();
                if (!(cause instanceof InterruptedException) && !(cause instanceof InterruptedIOException)) {
                    if (cause instanceof IOException) {
                        AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                        DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                        this.equals.AFAdRevenueData(deepLinkResult5, this.copydefault.component1);
                        this.copydefault.AFAdRevenueData(deepLinkResult5);
                    } else {
                        AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, "Unexpected Exception: " + e, false, 4, null);
                        DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                        this.equals.AFAdRevenueData(deepLinkResult6, this.copydefault.component1);
                        this.copydefault.AFAdRevenueData(deepLinkResult6);
                    }
                    return aFf1wSDK;
                }
                AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", new TimeoutException());
                AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, "Timeout, didn't manage to find deferred deeplink after " + this.AFKeystoreWrapper + " attempt(s) within " + this.copydefault.component1 + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.equals.AFAdRevenueData(deepLinkResult7, this.copydefault.component1);
                this.copydefault.AFAdRevenueData(deepLinkResult7);
                return AFf1wSDK.TIMEOUT;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return this.copydefault.component1;
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFj1mSDK aFj1mSDK, AFf1gSDK aFf1gSDK, Observable observable, Object obj) {
        Intrinsics.checkNotNullParameter(aFf1gSDK, "");
        AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, aFj1mSDK.getCurrencyIso4217Code.get("source") + " referrer collected via observer", false, 4, null);
        Intrinsics.g(observable, "");
        aFf1gSDK.getCurrencyIso4217Code((AFj1mSDK) observable);
    }

    private static Map<String, String> getRevenue(AFb1uSDK aFb1uSDK) {
        String str;
        if (aFb1uSDK == null || (str = aFb1uSDK.getMonetizationNetwork) == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        Boolean bool = aFb1uSDK.getCurrencyIso4217Code;
        if (bool == null || !bool.booleanValue()) {
            return z0.g(new Pair("type", "unhashed"), new Pair("value", str));
        }
        return null;
    }

    private final void getCurrencyIso4217Code(AFj1mSDK aFj1mSDK) {
        if (getMediationNetwork(aFj1mSDK)) {
            this.AFInAppEventType.add(aFj1mSDK);
            this.AFInAppEventParameterName.countDown();
            AFh1rSDK.d$default(AFLogger.INSTANCE, AFh1sSDK.DDL, "Added non-organic ".concat(aFj1mSDK.getClass().getSimpleName()), false, 4, null);
        } else {
            int i13 = this.valueOf + 1;
            this.valueOf = i13;
            if (i13 == this.values) {
                this.AFInAppEventParameterName.countDown();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1hSDK
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFe1rSDK<com.appsflyer.internal.AFc1oSDK> getCurrencyIso4217Code(@org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1gSDK.getCurrencyIso4217Code(java.lang.String):com.appsflyer.internal.AFe1rSDK");
    }
}
