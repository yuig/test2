package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1pSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static AppsFlyerProperties instance;
    public boolean getCurrencyIso4217Code;
    public String getMonetizationNetwork;
    private final Map<String, Object> getMediationNetwork = new HashMap();
    private boolean getRevenue = false;

    /* loaded from: classes3.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int getMediationNetwork;

        EmailsCryptType(int i13) {
            this.getMediationNetwork = i13;
        }

        public final int getValue() {
            return this.getMediationNetwork;
        }
    }

    public static AppsFlyerProperties getInstance() {
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        return instance;
    }

    private boolean getMediationNetwork() {
        return this.getRevenue;
    }

    public boolean getBoolean(String str, boolean z13) {
        String string = getString(str);
        return string == null ? z13 : Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i13) {
        String string = getString(str);
        return string == null ? i13 : Integer.parseInt(string);
    }

    public int getLogLevel() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
    }

    public long getLong(String str, long j13) {
        String string = getString(str);
        return string == null ? j13 : Long.parseLong(string);
    }

    public String getReferrer(AFd1pSDK aFd1pSDK) {
        String str = this.getMonetizationNetwork;
        return str != null ? str : getString("AF_REFERRER") != null ? getString("AF_REFERRER") : aFd1pSDK.getCurrencyIso4217Code("referrer", null);
    }

    public final boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    public synchronized String getString(String str) {
        return (String) this.getMediationNetwork.get(str);
    }

    public boolean isEnableLog() {
        return getLogLevel() > AFLogger.LogLevel.NONE.getLevel();
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(AFd1pSDK aFd1pSDK) {
        try {
            if (getMediationNetwork()) {
                return;
            }
            String currencyIso4217Code = aFd1pSDK.getCurrencyIso4217Code("savedProperties", null);
            if (currencyIso4217Code != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(currencyIso4217Code);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (this.getMediationNetwork.get(next) == null) {
                            this.getMediationNetwork.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                    for (int i13 = 0; i13 < 5; i13++) {
                        this.getMediationNetwork.remove(strArr[i13]);
                    }
                    saveProperties(aFd1pSDK);
                    this.getRevenue = true;
                } catch (JSONException e13) {
                    AFLogger.afErrorLog("Failed loading properties", e13);
                }
                StringBuilder sb3 = new StringBuilder("Done loading properties: ");
                sb3.append(this.getRevenue);
                AFLogger.afDebugLog(sb3.toString());
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void remove(String str) {
        this.getMediationNetwork.remove(str);
    }

    public synchronized void saveProperties(AFd1pSDK aFd1pSDK) {
        this.getMediationNetwork.remove("AppsFlyerKey");
        aFd1pSDK.getMonetizationNetwork("savedProperties", new JSONObject(this.getMediationNetwork).toString());
    }

    public synchronized void set(String str, String str2) {
        this.getMediationNetwork.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.getMediationNetwork.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.getMediationNetwork.put(USER_EMAILS, str);
    }

    public synchronized void set(String str, String[] strArr) {
        this.getMediationNetwork.put(str, strArr);
    }

    public synchronized void set(String str, int i13) {
        this.getMediationNetwork.put(str, Integer.toString(i13));
    }

    public synchronized void set(String str, long j13) {
        this.getMediationNetwork.put(str, Long.toString(j13));
    }

    public synchronized void set(String str, boolean z13) {
        this.getMediationNetwork.put(str, Boolean.toString(z13));
    }
}
