package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFf1eSDK;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1kSDK {
    public Intent AFAdRevenueData;
    public final AFd1gSDK areAllFieldsValid;
    public long component1;
    public String[] component3;
    public Map<String, String> getCurrencyIso4217Code;
    public String getMediationNetwork;
    public DeepLinkListener getMonetizationNetwork;

    @NonNull
    public List<List<String>> getRevenue = new ArrayList();

    @NonNull
    public final List<String> component4 = new ArrayList();

    public AFc1kSDK(@NonNull AFd1gSDK aFd1gSDK) {
        this.areAllFieldsValid = aFd1gSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean p_(android.content.Intent r10, com.appsflyer.internal.AFc1qSDK r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1kSDK.p_(android.content.Intent, com.appsflyer.internal.AFc1qSDK):boolean");
    }

    private Uri q_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e13) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e13);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(DeepLinkResult deepLinkResult) {
        if (this.getMonetizationNetwork == null) {
            AFLogger.INSTANCE.d(AFh1sSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1sSDK aFh1sSDK = AFh1sSDK.DDL;
        StringBuilder sb3 = new StringBuilder("Calling onDeepLinking with:\n");
        sb3.append(deepLinkResult.toString());
        aFLogger.d(aFh1sSDK, sb3.toString());
        try {
            this.getMonetizationNetwork.onDeepLinking(deepLinkResult);
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
        }
    }

    public final void getMediationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getMonetizationNetwork != null) {
            try {
                try {
                    DeepLink revenue = DeepLink.getRevenue(map);
                    revenue.getMediationNetwork.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(revenue, null);
                } catch (JSONException e13) {
                    AFLogger.INSTANCE.e(AFh1sSDK.DDL, "Error occurred", e13, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFAdRevenueData(deepLinkResult);
                return;
            } catch (Throwable th3) {
                AFAdRevenueData(new DeepLinkResult(null, null));
                throw th3;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb3 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb3.append(map.toString());
                AFLogger.afDebugLog(sb3.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getLocalizedMessage(), th4);
            }
        }
    }

    public final void getRevenue(String str, DeepLinkResult.Error error) {
        if (this.getMonetizationNetwork == null) {
            getMediationNetwork(str);
        } else {
            AFLogger.INSTANCE.d(AFh1sSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            AFAdRevenueData(new DeepLinkResult(null, error));
        }
    }

    public final void n_(AFc1qSDK aFc1qSDK, Intent intent, Context context) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) this.areAllFieldsValid;
        if (context != null) {
            aFd1iSDK.getRevenue.getMonetizationNetwork = context.getApplicationContext();
        }
        if (!p_(intent, aFc1qSDK) && this.getMonetizationNetwork != null && this.areAllFieldsValid.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) == 0 && !this.areAllFieldsValid.component2().getMediationNetwork("ddl_sent", false)) {
            AFc1pSDK aFc1pSDK = new AFc1pSDK();
            AFf1uSDK copy = this.areAllFieldsValid.copy();
            copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(new AFf1gSDK(aFc1pSDK, this.areAllFieldsValid)));
        }
        this.areAllFieldsValid.component2().getRevenue("ddl_sent", true);
    }

    public final void o_(AFc1qSDK aFc1qSDK, Uri uri) {
        AFf1cSDK aFf1cSDK = new AFf1cSDK(this, aFc1qSDK, uri, this.component4);
        AFf1uSDK copy = this.areAllFieldsValid.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1cSDK));
        this.AFAdRevenueData = null;
    }

    public final void r_(AFc1qSDK aFc1qSDK, Uri uri, Uri uri2) {
        if (!aFc1qSDK.getMediationNetwork("af_deeplink")) {
            String obj = uri.toString();
            if (obj == null) {
                obj = null;
            } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
                int indexOf = obj.indexOf(63);
                String substring = indexOf == -1 ? "" : obj.substring(indexOf);
                if (substring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (substring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(substring.split("&")));
                    } else {
                        arrayList.add(substring);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb3.length() != 0) {
                                sb3.append("&");
                            } else if (!str.startsWith("?")) {
                                sb3.append("?");
                            }
                            sb3.append(str);
                        }
                    }
                    obj = obj.replace(substring, sb3.toString());
                }
            }
            String str2 = this.getMediationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && obj.contains(str2)) {
                Uri.Builder buildUpon = Uri.parse(obj).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                obj = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFc1qSDK.getCurrencyIso4217Code.put("appended_query_params", encodedQuery);
                AFc1gSDK aFc1gSDK = aFc1qSDK.getMediationNetwork;
                if (aFc1gSDK != null) {
                    aFc1gSDK.getRevenue(aFc1qSDK.getCurrencyIso4217Code);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFc1qSDK.getCurrencyIso4217Code.put("af_deeplink", obj);
            AFc1gSDK aFc1gSDK2 = aFc1qSDK.getMediationNetwork;
            if (aFc1gSDK2 != null) {
                aFc1gSDK2.getRevenue(aFc1qSDK.getCurrencyIso4217Code);
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFb1qSDK.d_(this.areAllFieldsValid.AFInAppEventType().getMonetizationNetwork, hashMap, uri);
        AFf1eSDK aFf1eSDK = new AFf1eSDK(this.areAllFieldsValid, UUID.randomUUID(), uri);
        if (aFf1eSDK.copydefault()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFc1qSDK.getCurrencyIso4217Code.put("isBrandedDomain", bool);
            AFc1gSDK aFc1gSDK3 = aFc1qSDK.getMediationNetwork;
            if (aFc1gSDK3 != null) {
                aFc1gSDK3.getRevenue(aFc1qSDK.getCurrencyIso4217Code);
            }
        }
        if (!aFf1eSDK.equals()) {
            this.areAllFieldsValid.registerClient().getMediationNetwork(hashMap);
            return;
        }
        aFf1eSDK.component2 = new AFf1eSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFc1kSDK.5
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1ySDK
            public final void getCurrencyIso4217Code(String str3) {
                AFc1kSDK.this.getRevenue(str3, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1ySDK
            public final void getMonetizationNetwork(Map<String, String> map) {
                for (String str3 : map.keySet()) {
                    hashMap.put(str3, map.get(str3));
                }
                AFc1kSDK.this.getMediationNetwork(hashMap);
            }
        };
        AFf1uSDK copy = this.areAllFieldsValid.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1eSDK));
    }

    private static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th3) {
                AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
            }
        }
    }
}
