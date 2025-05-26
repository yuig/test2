package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;

/* loaded from: classes3.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: JSONException -> 0x002b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x002b, blocks: (B:2:0x0000, B:13:0x003e, B:15:0x0042, B:17:0x0021, B:20:0x002e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getCurrencyIso4217Code(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r0.<init>()     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "status"
            java.lang.String r2 = "failure"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "data"
            r0.put(r1, r8)     // Catch: org.json.JSONException -> L2b
            int r8 = r7.hashCode()     // Catch: org.json.JSONException -> L2b
            r1 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r2 = 1
            if (r8 == r1) goto L2e
            r1 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r8 == r1) goto L21
            goto L38
        L21:
            java.lang.String r8 = "onInstallConversionFailure"
            boolean r7 = r7.equals(r8)     // Catch: org.json.JSONException -> L2b
            if (r7 == 0) goto L38
            r7 = 0
            goto L39
        L2b:
            r7 = move-exception
            r3 = r7
            goto L46
        L2e:
            java.lang.String r8 = "onAttributionFailure"
            boolean r7 = r7.equals(r8)     // Catch: org.json.JSONException -> L2b
            if (r7 == 0) goto L38
            r7 = r2
            goto L39
        L38:
            r7 = -1
        L39:
            if (r7 == 0) goto L42
            if (r7 == r2) goto L3e
            goto L41
        L3e:
            r6.onAttributionFailureNative(r0)     // Catch: org.json.JSONException -> L2b
        L41:
            return
        L42:
            r6.onInstallConversionFailureNative(r0)     // Catch: org.json.JSONException -> L2b
            return
        L46:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r1 = com.appsflyer.internal.AFh1sSDK.OTHER
            r4 = 0
            r5 = 0
            java.lang.String r2 = "2dx error"
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.getCurrencyIso4217Code(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        getCurrencyIso4217Code("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        getCurrencyIso4217Code("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
