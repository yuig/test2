package com.appsflyer.internal;

import a.cb;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFf1cSDK extends AFe1aSDK<Map<String, Object>> {
    private static final int component4 = (int) TimeUnit.SECONDS.toMillis(2);
    private final Uri areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFc1kSDK component2;
    private Map<String, Object> component3;
    private final List<String> copy;

    public AFf1cSDK(AFc1kSDK aFc1kSDK, @NonNull AFc1qSDK aFc1qSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFf1rSDK.RESOLVE_ESP, new AFf1rSDK[]{AFf1rSDK.RC_CDN}, "ResolveEsp");
        this.component2 = aFc1kSDK;
        this.component1 = aFc1qSDK;
        this.areAllFieldsValid = uri;
        this.copy = list;
    }

    private boolean getMediationNetwork(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder o13 = cb.o("Validate if link ", str, " belongs to ESP domains: ");
        o13.append(this.copy);
        AFLogger.afRDLog(o13.toString());
        try {
            return this.copy.contains(new URL(str).getHost());
        } catch (MalformedURLException e13) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e13);
            return false;
        }
    }

    private static Map<String, Object> v_(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb3 = new StringBuilder("ESP deeplink resolving is started: ");
            sb3.append(uri.toString());
            AFLogger.afDebugLog(sb3.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i13 = component4;
            httpURLConnection.setReadTimeout(i13);
            httpURLConnection.setConnectTimeout(i13);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.16.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th3) {
            hashMap.put("error", th3.getLocalizedMessage());
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
        return hashMap;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    @NonNull
    public final AFf1wSDK getCurrencyIso4217Code() {
        Integer num = null;
        if (!getMediationNetwork(this.areAllFieldsValid.toString())) {
            this.component2.r_(this.component1, this.areAllFieldsValid, null);
            return AFf1wSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.areAllFieldsValid.toString();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        String str = null;
        while (i13 < 5) {
            Map<String, Object> v_ = v_(Uri.parse(obj));
            String str2 = (String) v_.get("res");
            Integer num2 = (Integer) v_.get("status");
            String str3 = (String) v_.get("error");
            if (str2 == null || !getMediationNetwork(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i13 < 4) {
                arrayList.add(str2);
            }
            i13++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : "");
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.component1) {
            this.component1.getMediationNetwork("af_deeplink_r", hashMap);
            this.component1.getMediationNetwork("af_deeplink", this.areAllFieldsValid.toString());
        }
        this.component2.r_(this.component1, obj != null ? Uri.parse(obj) : this.areAllFieldsValid, this.areAllFieldsValid);
        this.component3 = hashMap;
        return AFf1wSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final long getMonetizationNetwork() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1aSDK
    public final boolean getRevenue() {
        return false;
    }
}
