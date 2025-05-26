package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1mSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AFg1ySDK extends AFg1xSDK {

    @NonNull
    private final AppsFlyerProperties AFInAppEventParameterName;

    @NonNull
    private final AFg1vSDK AFKeystoreWrapper;
    public Map<String, Object> copydefault;

    @NonNull
    private final AFj1lSDK equals;

    @NonNull
    private final AFd1pSDK hashCode;

    @NonNull
    private final AFh1jSDK valueOf;

    @NonNull
    private final AFc1gSDK values;

    /* renamed from: com.appsflyer.internal.AFg1ySDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1mSDK.AFa1zSDK.values().length];
            getMediationNetwork = iArr;
            try {
                iArr[AFj1mSDK.AFa1zSDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMediationNetwork[AFj1mSDK.AFa1zSDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFg1ySDK(@NonNull AFa1rSDK aFa1rSDK, @NonNull AFd1gSDK aFd1gSDK) {
        super(aFa1rSDK, aFd1gSDK);
        this.equals = aFd1gSDK.AFInAppEventParameterName();
        this.hashCode = aFd1gSDK.component2();
        this.valueOf = aFd1gSDK.component4();
        this.AFKeystoreWrapper = aFd1gSDK.component3();
        this.AFInAppEventParameterName = AppsFlyerProperties.getInstance();
        this.values = aFd1gSDK.afDebugLog();
        this.getMediationNetwork.add(AFf1rSDK.RESOLVE_ESP);
        this.getMediationNetwork.add(AFf1rSDK.DLSDK);
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public void getCurrencyIso4217Code(AFa1rSDK aFa1rSDK) {
        super.getCurrencyIso4217Code(aFa1rSDK);
        int i13 = aFa1rSDK.component2;
        getMonetizationNetwork(i13);
        Map map = (Map) aFa1rSDK.getCurrencyIso4217Code().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1rSDK.getCurrencyIso4217Code().put("meta", map);
        }
        if (!aFa1rSDK.getCurrencyIso4217Code().containsKey("af_deeplink")) {
            aFa1rSDK.getMonetizationNetwork(this.values.getMediationNetwork());
        }
        AFi1sSDK monetizationNetwork = this.AFKeystoreWrapper.getMonetizationNetwork();
        if (monetizationNetwork != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", monetizationNetwork.getMonetizationNetwork);
            String str = monetizationNetwork.getCurrencyIso4217Code;
            if (str != null) {
                hashMap.put("c_ver", str);
            }
            long j13 = monetizationNetwork.getRevenue;
            if (j13 > 0) {
                hashMap.put("latency", Long.valueOf(j13));
            }
            long j14 = monetizationNetwork.getMediationNetwork;
            if (j14 > 0) {
                hashMap.put("delay", Long.valueOf(j14));
            }
            int i14 = monetizationNetwork.AFAdRevenueData;
            if (i14 > 0) {
                hashMap.put("res_code", Integer.valueOf(i14));
            }
            if (monetizationNetwork.areAllFieldsValid != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(monetizationNetwork.areAllFieldsValid.getClass().getSimpleName());
                sb3.append(": ");
                sb3.append(monetizationNetwork.areAllFieldsValid.getMessage());
                hashMap.put("error", sb3.toString());
            }
            AFi1pSDK aFi1pSDK = monetizationNetwork.component3;
            if (aFi1pSDK != null) {
                hashMap.put("sig", aFi1pSDK.toString());
            }
            String str2 = monetizationNetwork.component1;
            if (str2 != null) {
                hashMap.put("cdn_cache_status", str2);
            }
            map.put("rc", hashMap);
        }
        this.toString.getRevenue(aFa1rSDK.getCurrencyIso4217Code());
        if (i13 == 1) {
            if (this.AFInAppEventParameterName.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1rSDK.getCurrencyIso4217Code().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.valueOf.getRevenue);
            this.valueOf.getCurrencyIso4217Code.getCurrencyIso4217Code("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.valueOf.getMonetizationNetwork);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i13 == 2) {
            HashMap hashMap4 = new HashMap(this.valueOf.getMonetizationNetwork);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.valueOf.getCurrencyIso4217Code.getCurrencyIso4217Code("first_launch");
        }
        if (map.isEmpty()) {
            aFa1rSDK.getCurrencyIso4217Code().remove("meta");
        }
        if (i13 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1mSDK aFj1mSDK : this.equals.AFAdRevenueData()) {
                boolean z13 = aFj1mSDK instanceof AFj1vSDK;
                int i15 = AnonymousClass3.getMediationNetwork[aFj1mSDK.component1.ordinal()];
                if (i15 == 1) {
                    if (z13) {
                        aFa1rSDK.AFAdRevenueData("rfr", ((AFj1vSDK) aFj1mSDK).getRevenue);
                        this.hashCode.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1mSDK.getCurrencyIso4217Code);
                } else if (i15 == 2 && i13 == 2 && !z13) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFj1mSDK.getMediationNetwork);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFj1mSDK.areAllFieldsValid);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1rSDK.AFAdRevenueData("referrers", arrayList);
            }
            Object obj = this.copydefault;
            if (obj != null) {
                aFa1rSDK.AFAdRevenueData("fb_ddl", obj);
            }
        }
        this.toString.getMediationNetwork(aFa1rSDK);
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        super.getMediationNetwork();
        AFh1jSDK aFh1jSDK = this.valueOf;
        int i13 = ((AFg1xSDK) this).component2.component2;
        long currentTimeMillis = System.currentTimeMillis();
        if (i13 == 1) {
            long j13 = aFh1jSDK.areAllFieldsValid;
            if (j13 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1jSDK.getMonetizationNetwork.put("net", Long.valueOf(currentTimeMillis - j13));
            aFh1jSDK.getCurrencyIso4217Code.getMonetizationNetwork("first_launch", new JSONObject(aFh1jSDK.getMonetizationNetwork).toString());
        }
    }

    public void getMonetizationNetwork(int i13) {
        this.valueOf.getMediationNetwork(i13);
    }
}
