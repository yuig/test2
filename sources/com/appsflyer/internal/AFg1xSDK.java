package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFg1xSDK extends AFf1hSDK<String> {
    private static final AFf1rSDK[] values = {AFf1rSDK.DLSDK, AFf1rSDK.ONELINK, AFf1rSDK.REGISTER};
    private final AFg1oSDK AFInAppEventParameterName;
    private final AFd1oSDK AFInAppEventType;
    public final AFa1rSDK component2;
    protected final AFd1pSDK copy;
    private final AFg1vSDK copydefault;
    private final AFe1eSDK equals;

    @NonNull
    private final AFd1nSDK hashCode;
    protected final AFg1gSDK toString;

    public AFg1xSDK(@NonNull AFa1rSDK aFa1rSDK, @NonNull AFd1gSDK aFd1gSDK) {
        this(aFa1rSDK, aFd1gSDK, null);
    }

    @NonNull
    public static Map<String, Object> component4(AFa1rSDK aFa1rSDK) {
        Map<String, Object> map = (Map) aFa1rSDK.getCurrencyIso4217Code().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1rSDK.getCurrencyIso4217Code().put("meta", hashMap);
        return hashMap;
    }

    public void AFAdRevenueData(AFa1rSDK aFa1rSDK) {
        this.toString.getMonetizationNetwork(aFa1rSDK);
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component2.getMonetizationNetwork;
    }

    public void component1(AFa1rSDK aFa1rSDK) {
        this.toString.getCurrencyIso4217Code(aFa1rSDK);
    }

    @Override // com.appsflyer.internal.AFf1hSDK
    public boolean copy() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8 A[Catch: all -> 0x00df, Exception -> 0x00e2, NullPointerException -> 0x00e6, TRY_ENTER, TryCatch #9 {NullPointerException -> 0x00e6, Exception -> 0x00e2, all -> 0x00df, blocks: (B:40:0x00d8, B:41:0x00e9, B:42:0x00ee), top: B:38:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9 A[Catch: all -> 0x00df, Exception -> 0x00e2, NullPointerException -> 0x00e6, TryCatch #9 {NullPointerException -> 0x00e6, Exception -> 0x00e2, all -> 0x00df, blocks: (B:40:0x00d8, B:41:0x00e9, B:42:0x00ee), top: B:38:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[Catch: all -> 0x00ef, TryCatch #6 {all -> 0x00ef, blocks: (B:33:0x0083, B:36:0x00cc, B:53:0x0097), top: B:32:0x0083 }] */
    @Override // com.appsflyer.internal.AFf1hSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFe1rSDK<java.lang.String> getCurrencyIso4217Code(@androidx.annotation.NonNull java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1xSDK.getCurrencyIso4217Code(java.lang.String):com.appsflyer.internal.AFe1rSDK");
    }

    public void getMediationNetwork(AFa1rSDK aFa1rSDK) {
        this.toString.getRevenue(aFa1rSDK);
    }

    public void getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
        this.toString.AFAdRevenueData(aFa1rSDK);
    }

    public void getRevenue(AFa1rSDK aFa1rSDK) {
        this.toString.getMonetizationNetwork(aFa1rSDK.getCurrencyIso4217Code());
    }

    public AFg1xSDK(@NonNull AFa1rSDK aFa1rSDK, @NonNull AFd1gSDK aFd1gSDK, String str) {
        super(aFa1rSDK.getRevenue(), new AFf1rSDK[]{AFf1rSDK.RC_CDN, AFf1rSDK.FETCH_ADVERTISING_ID}, aFd1gSDK, str);
        this.component2 = aFa1rSDK;
        this.equals = aFd1gSDK.values();
        this.copy = aFd1gSDK.component2();
        this.copydefault = aFd1gSDK.component3();
        this.AFInAppEventType = aFd1gSDK.AFInAppEventType();
        this.hashCode = aFd1gSDK.getMonetizationNetwork();
        this.toString = aFd1gSDK.component1();
        this.AFInAppEventParameterName = aFd1gSDK.force();
        for (AFf1rSDK aFf1rSDK : values) {
            if (this.getRevenue == aFf1rSDK) {
                return;
            }
        }
        int i13 = this.component2.component2;
        AFf1rSDK aFf1rSDK2 = this.getRevenue;
        if (i13 > 0) {
            this.getMediationNetwork.add(AFf1rSDK.CONVERSION);
        } else {
            AFf1rSDK aFf1rSDK3 = AFf1rSDK.CONVERSION;
            if (aFf1rSDK2 != aFf1rSDK3) {
                this.getMonetizationNetwork.add(aFf1rSDK3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0049, B:8:0x0051, B:10:0x0057, B:11:0x0060, B:13:0x006a, B:17:0x0076, B:20:0x007e, B:21:0x0089, B:23:0x008f, B:25:0x00a7, B:26:0x00ac, B:28:0x00c1, B:29:0x00c8, B:31:0x00cc, B:34:0x00d3, B:35:0x00da, B:36:0x00aa, B:37:0x00dd, B:39:0x00e7, B:40:0x00f2, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0049, B:8:0x0051, B:10:0x0057, B:11:0x0060, B:13:0x006a, B:17:0x0076, B:20:0x007e, B:21:0x0089, B:23:0x008f, B:25:0x00a7, B:26:0x00ac, B:28:0x00c1, B:29:0x00c8, B:31:0x00cc, B:34:0x00d3, B:35:0x00da, B:36:0x00aa, B:37:0x00dd, B:39:0x00e7, B:40:0x00f2, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getCurrencyIso4217Code(com.appsflyer.internal.AFa1rSDK r9) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1xSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFa1rSDK):void");
    }
}
