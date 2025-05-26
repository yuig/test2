package com.appsflyer.share;

import a.a;
import android.content.Context;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFd1gSDK;
import com.appsflyer.internal.AFf1mSDK;
import com.appsflyer.internal.AFf1uSDK;
import com.appsflyer.internal.AFf1uSDK.AnonymousClass3;
import com.appsflyer.internal.AFk1wSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import t3.s1;

/* loaded from: classes3.dex */
public class LinkGenerator {
    private final String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String equals;
    String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    private String getRevenue;
    private final Map<String, String> hashCode = new HashMap();
    private String toString;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFAdRevenueData = str;
    }

    private Map<String, String> getMediationNetwork() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.AFAdRevenueData);
        String str = this.areAllFieldsValid;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.getRevenue;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.component4;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.getMonetizationNetwork;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.component2;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.component3;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.toString != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.toString);
            String str7 = this.component1;
            if (str7 != null) {
                this.component1 = str7.replaceFirst("^[/]", "");
                sb3.append(this.toString.endsWith("/") ? "" : "/");
                sb3.append(this.component1);
            }
            hashMap.put("af_dp", sb3.toString());
        }
        for (Map.Entry<String, String> entry : this.hashCode.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1bSDK.getRevenue(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.hashCode.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.hashCode.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb3 = new StringBuilder();
        String str = this.getMediationNetwork;
        if (str == null || !str.startsWith("http")) {
            sb3.append(String.format(AFk1wSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName()));
        } else {
            sb3.append(this.getMediationNetwork);
        }
        if (this.getCurrencyIso4217Code != null) {
            sb3.append('/');
            sb3.append(this.getCurrencyIso4217Code);
        }
        Map<String, String> mediationNetwork = getMediationNetwork();
        StringBuilder sb4 = new StringBuilder();
        for (Map.Entry<String, String> entry : mediationNetwork.entrySet()) {
            if (sb4.length() == 0) {
                sb4.append('?');
            } else {
                sb4.append('&');
            }
            sb4.append(entry.getKey());
            sb4.append('=');
            sb4.append(entry.getValue());
        }
        sb3.append(sb4.toString());
        return sb3.toString();
    }

    public String getBrandDomain() {
        return this.equals;
    }

    public String getCampaign() {
        return this.getMonetizationNetwork;
    }

    public String getChannel() {
        return this.getRevenue;
    }

    public String getMediaSource() {
        return this.AFAdRevenueData;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.hashCode);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.toString = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.getMediationNetwork = s1.c("https://", a.D(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFb1tSDK.getCurrencyIso4217Code().getHostName()), "/", str3);
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.getMediationNetwork = s1.c("https://", str2, "/", str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.equals = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.getMonetizationNetwork = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.getRevenue = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.component1 = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.component4 = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.component3 = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.component2 = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.areAllFieldsValid = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.equals;
        Map<String, String> mediationNetwork = getMediationNetwork();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1tSDK.getCurrencyIso4217Code().getCurrencyIso4217Code(context);
        AFd1gSDK AFAdRevenueData = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData();
        AFf1mSDK aFf1mSDK = new AFf1mSDK(AFAdRevenueData, UUID.randomUUID(), string, mediationNetwork, str, responseListener, this);
        AFf1uSDK copy = AFAdRevenueData.copy();
        copy.getCurrencyIso4217Code.execute(copy.new AnonymousClass3(aFf1mSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.2
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
