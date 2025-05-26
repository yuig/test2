package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1rSDK;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1fSDK implements AFg1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventType = 1;
    private static int values;

    @NotNull
    private final AFj1iSDK AFAdRevenueData;

    @NotNull
    private final xk2.k AFInAppEventParameterName;

    @NotNull
    private final AFd1pSDK areAllFieldsValid;

    @NotNull
    private final AFd1nSDK component1;

    @NotNull
    private final AFh1jSDK component2;

    @NotNull
    private final AFa1aSDK component3;

    @NotNull
    private final AFi1lSDK component4;

    @NotNull
    private final xk2.k copy;

    @NotNull
    private final AFd1lSDK copydefault;

    @NotNull
    private final AFg1mSDK equals;

    @NotNull
    private final AFd1rSDK getCurrencyIso4217Code;

    @NotNull
    private final Context getMediationNetwork;

    @NotNull
    private final String getMonetizationNetwork;

    @NotNull
    private final AFi1gSDK getRevenue;

    @NotNull
    private final AFd1oSDK hashCode;

    @NotNull
    private final AFg1qSDK toString;
    private static char[] valueOf = {31531, 43528, 55655, 2234, 16265, 28381, 39972, 49932, 62019, 8610, 20637, 34797, 46396, 58373, 2880, 28953, 40997, 54082, 657, 13743};
    private static long AFKeystoreWrapper = 6525868506775396439L;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getMonetizationNetwork", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1fSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass2 getRevenue = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "getCurrencyIso4217Code", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFg1fSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends s implements Function0<SimpleDateFormat> {
        public static final AnonymousClass5 getRevenue = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    public AFg1fSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1gSDK aFi1gSDK, @NotNull AFd1rSDK aFd1rSDK, @NotNull AFj1iSDK aFj1iSDK, @NotNull AFa1aSDK aFa1aSDK, @NotNull AFh1jSDK aFh1jSDK, @NotNull AFd1pSDK aFd1pSDK, @NotNull AFd1nSDK aFd1nSDK, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFd1oSDK aFd1oSDK, @NotNull AFg1mSDK aFg1mSDK, @NotNull AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1gSDK, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(aFj1iSDK, "");
        Intrinsics.checkNotNullParameter(aFa1aSDK, "");
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        Intrinsics.checkNotNullParameter(aFg1mSDK, "");
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = context;
        this.getRevenue = aFi1gSDK;
        this.getCurrencyIso4217Code = aFd1rSDK;
        this.AFAdRevenueData = aFj1iSDK;
        this.component3 = aFa1aSDK;
        this.component2 = aFh1jSDK;
        this.areAllFieldsValid = aFd1pSDK;
        this.component1 = aFd1nSDK;
        this.component4 = aFi1lSDK;
        this.toString = aFg1qSDK;
        this.hashCode = aFd1oSDK;
        this.equals = aFg1mSDK;
        this.copydefault = aFd1lSDK;
        this.copy = xk2.m.b(AnonymousClass2.getRevenue);
        this.AFInAppEventParameterName = xk2.m.b(AnonymousClass5.getRevenue);
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        Boolean bool;
        int i16 = ((~(i14 | i15)) * 420) + (i14 * 421) + (i13 * (-419));
        int i17 = ~i13;
        switch ((((~(i17 | (~i14))) | (~(i14 | (~i15)))) * 420) + ((i14 | i17) * (-420)) + i16) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getMediationNetwork(objArr);
            case 4:
                return getMonetizationNetwork(objArr);
            case 5:
                return component2(objArr);
            case 6:
                Map map = (Map) objArr[0];
                String str = (String) objArr[1];
                values = (AFInAppEventType + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                Intrinsics.checkNotNullParameter(map, "");
                if (str != null) {
                    map.put("phone", str);
                    AFInAppEventType = (values + 47) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
                values = (AFInAppEventType + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            case 7:
                return component3(objArr);
            case 8:
                AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
                int i18 = AFInAppEventType + 75;
                values = i18 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i18 % 2 == 0 ? !aFg1fSDK.AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) : !aFg1fSDK.AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                    int i19 = values + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
                    AFInAppEventType = i19 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i19 % 2 != 0 ? !aFg1fSDK.AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !aFg1fSDK.AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                        AFb1tSDK.getCurrencyIso4217Code();
                        if (AFb1tSDK.getRevenue(aFg1fSDK.getMediationNetwork)) {
                            bool = Boolean.FALSE;
                            return bool;
                        }
                    }
                }
                AFInAppEventType = (values + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                bool = Boolean.TRUE;
                return bool;
            case 9:
                AFa1rSDK aFa1rSDK = (AFa1rSDK) objArr[1];
                values = (AFInAppEventType + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                Intrinsics.checkNotNullParameter(aFa1rSDK, "");
                Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                currencyIso4217Code.put("open_referrer", aFa1rSDK.getRevenue);
                String str2 = aFa1rSDK.areAllFieldsValid;
                if (str2 == null || z.j(str2)) {
                    return null;
                }
                currencyIso4217Code.put("af_web_referrer", aFa1rSDK.areAllFieldsValid);
                AFInAppEventType = (values + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                return component1(objArr);
            case 12:
                return component4(objArr);
            default:
                return getRevenue(objArr);
        }
    }

    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.equals.getRevenue());
        int i13 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 35 / 0;
        }
    }

    @SuppressLint({"HardwareIds"})
    private final String AFInAppEventType() {
        values = (AFInAppEventType + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String currencyIso4217Code = this.areAllFieldsValid.getCurrencyIso4217Code("androidIdCached", null);
        try {
            String string = Settings.Secure.getString(this.getMediationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                int i13 = AFInAppEventType + 15;
                int i14 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                values = i14;
                if (i13 % 2 != 0) {
                    int i15 = 79 / 0;
                }
                AFInAppEventType = (i14 + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return string;
            }
        } catch (Exception e13) {
            AFLogger.afErrorLog(e13.getMessage(), e13);
        }
        if (currencyIso4217Code == null) {
            return null;
        }
        int i16 = values + 7;
        AFInAppEventType = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i16 % 2 == 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + currencyIso4217Code);
            throw null;
        }
        AFLogger.afDebugLog("use cached AndroidId: " + currencyIso4217Code);
        int i17 = values + 99;
        AFInAppEventType = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i17 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object AFAdRevenueData = AFc1tSDK.AFAdRevenueData();
        String monetizationNetwork = AFc1tSDK.getMonetizationNetwork();
        if (AFAdRevenueData == null || monetizationNetwork == null) {
            return;
        }
        values = (AFInAppEventType + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (Integer.parseInt(monetizationNetwork) > 0) {
            int i13 = values + 35;
            AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                map.put("reinstallCounter", monetizationNetwork);
                map.put("originalAppsflyerId", AFAdRevenueData);
            } else {
                map.put("reinstallCounter", monetizationNetwork);
                map.put("originalAppsflyerId", AFAdRevenueData);
                int i14 = 4 / 0;
            }
        }
    }

    private static void AFLogger(@NotNull Map<String, Object> map) {
        int i13 = values + 81;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
        } catch (Exception e13) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e13);
        }
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("lang", Locale.getDefault().getDisplayLanguage());
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e14) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e14);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            AFInAppEventType = (values + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } catch (Exception e15) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e15);
        }
    }

    private static void a(int i13, int i14, char c13, Object[] objArr) {
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i13];
        aFk1hSDK.getMediationNetwork = 0;
        while (true) {
            int i15 = aFk1hSDK.getMediationNetwork;
            if (i15 >= i13) {
                break;
            }
            int i16 = $11;
            jArr[i15] = (((char) (valueOf[i14 + i15] ^ (-2156929640463306373L))) ^ (i15 * ((-2156929640463306373L) ^ AFKeystoreWrapper))) ^ c13;
            aFk1hSDK.getMediationNetwork = i15 + 1;
            $10 = (i16 + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        char[] cArr = new char[i13];
        aFk1hSDK.getMediationNetwork = 0;
        $10 = ($11 + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        while (true) {
            int i17 = aFk1hSDK.getMediationNetwork;
            if (i17 >= i13) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = $10 + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
            $11 = i18 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr[i17];
            } else {
                cArr[i17] = (char) jArr[i17];
                i17++;
            }
            aFk1hSDK.getMediationNetwork = i17;
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        int i13 = values + 17;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFd1tSDK aFd1tSDK = this.copydefault.component2;
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFd1tSDK aFd1tSDK2 = this.copydefault.component2;
        if (aFd1tSDK2 != null) {
            values = (AFInAppEventType + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            map.put("app_set_id", z0.g(new Pair("scope", Integer.valueOf(aFd1tSDK2.AFAdRevenueData)), new Pair("id", aFd1tSDK2.getMonetizationNetwork)));
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        Map map = (Map) objArr[1];
        try {
            long j13 = aFg1fSDK.getMediationNetwork.getPackageManager().getPackageInfo(aFg1fSDK.getMediationNetwork.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j13)));
            int i13 = AFInAppEventType + 55;
            values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                int i14 = 11 / 0;
            }
            return null;
        } catch (Exception e13) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e13);
            return null;
        }
    }

    private final void component1(Map<String, Object> map) {
        AFd1rSDK.AFa1vSDK revenue = this.getCurrencyIso4217Code.getRevenue(this.getMediationNetwork);
        float f13 = revenue.getCurrencyIso4217Code;
        String str = revenue.getRevenue;
        map.put("btl", String.valueOf(f13));
        if (str != null) {
            int i13 = AFInAppEventType + 9;
            values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                map.put("btch", str);
                throw null;
            }
            map.put("btch", str);
        }
        int i14 = AFInAppEventType + 85;
        values = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    private void component2(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1jSDK aFh1jSDK = this.component2;
        HashMap hashMap = new HashMap(aFh1jSDK.AFAdRevenueData);
        aFh1jSDK.AFAdRevenueData.clear();
        this.component2.getCurrencyIso4217Code.getCurrencyIso4217Code("gcd");
        Intrinsics.checkNotNullExpressionValue(hashMap, "");
        if (hashMap.isEmpty()) {
            values = (AFInAppEventType + 81) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return;
        }
        int i13 = AFInAppEventType + 39;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Map<String, Object> currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code(map);
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            currencyIso4217Code.put("gcd", hashMap);
        } else {
            Map<String, Object> currencyIso4217Code2 = AFb1tSDK.getCurrencyIso4217Code(map);
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
            currencyIso4217Code2.put("gcd", hashMap);
            throw null;
        }
    }

    private static long component3() {
        int i13 = AFInAppEventType + 39;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private void component4(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFAdRevenueData().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFAdRevenueData().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
            AFInAppEventType = (values + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if (string2 != null) {
            AFInAppEventType = (values + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            map.put("onelink_ver", string2);
        }
    }

    private boolean copy() {
        values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        boolean parseBoolean = Boolean.parseBoolean(this.areAllFieldsValid.getCurrencyIso4217Code("sentSuccessfully", null));
        values = (AFInAppEventType + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return parseBoolean;
    }

    private boolean copydefault() {
        int i13 = AFInAppEventType + 7;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0 ? this.component1.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) > 1 : this.component1.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 1) > 0) {
            return false;
        }
        AFInAppEventType = (values + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return true;
    }

    private void d(@NotNull Map<String, Object> map) {
        AFAdRevenueData(new Object[]{this, map}, 1547381749, -1547381742, System.identityHashCode(this));
    }

    private void e(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean currencyIso4217Code = AFg1eSDK.getCurrencyIso4217Code(this.getMediationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + currencyIso4217Code);
        if (!currencyIso4217Code) {
            int i13 = values + 55;
            AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1eSDK.AFAdRevenueData(this.areAllFieldsValid)));
        int i14 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
        values = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    private final void equals(Map<String, Object> map) {
        UiModeManager uiModeManager = (UiModeManager) this.getMediationNetwork.getSystemService(UiModeManager.class);
        values = (AFInAppEventType + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        map.put("tv", Boolean.TRUE);
    }

    private static List<AFf1rSDK> getCurrencyIso4217Code() {
        List<AFf1rSDK> j13;
        int i13 = values + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            AFf1rSDK[] aFf1rSDKArr = new AFf1rSDK[16];
            aFf1rSDKArr[0] = AFf1rSDK.CONVERSION;
            aFf1rSDKArr[1] = AFf1rSDK.LAUNCH;
            aFf1rSDKArr[2] = AFf1rSDK.INAPP;
            aFf1rSDKArr[4] = AFf1rSDK.MANUAL_PURCHASE_VALIDATION;
            aFf1rSDKArr[2] = AFf1rSDK.ARS_VALIDATE;
            aFf1rSDKArr[2] = AFf1rSDK.PURCHASE_VALIDATE;
            j13 = f0.j(aFf1rSDKArr);
        } else {
            j13 = f0.j(AFf1rSDK.CONVERSION, AFf1rSDK.LAUNCH, AFf1rSDK.INAPP, AFf1rSDK.MANUAL_PURCHASE_VALIDATION, AFf1rSDK.ARS_VALIDATE, AFf1rSDK.PURCHASE_VALIDATE);
        }
        int i14 = AFInAppEventType + 35;
        values = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            int i15 = 74 / 0;
        }
        return j13;
    }

    private final SimpleDateFormat getMediationNetwork() {
        int i13 = AFInAppEventType + 23;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return (SimpleDateFormat) this.AFInAppEventParameterName.getValue();
        }
        throw null;
    }

    private void hashCode(@NotNull Map<String, Object> map) {
        long j13;
        Intrinsics.checkNotNullParameter(map, "");
        long mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        this.areAllFieldsValid.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        if (mediationNetwork > 0) {
            AFInAppEventType = (values + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            j13 = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - mediationNetwork);
        } else {
            j13 = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j13));
        int i13 = values + 7;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        int i13 = values + 93;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFg1qSDK aFg1qSDK = this.toString;
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFg1qSDK aFg1qSDK2 = this.toString;
        String str = (String) AFg1qSDK.AFAdRevenueData(new Object[]{aFg1qSDK2}, 1235496603, -1235496602, System.identityHashCode(aFg1qSDK2));
        if (str == null || str.length() == 0) {
            AFInAppEventType = (values + 87) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return;
        }
        int i14 = values + 87;
        AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            map.put("appsflyerKey", str);
        } else {
            map.put("appsflyerKey", str);
            throw null;
        }
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 41) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(AFd1nSDK.getMonetizationNetwork(this.getMediationNetwork)));
        values = (AFInAppEventType + 93) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private void toString(@NotNull Map<String, Object> map) {
        AFAdRevenueData(new Object[]{this, map}, 1017725607, -1017725606, System.identityHashCode(this));
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 81) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            String mediationNetwork = AFb1iSDK.getMediationNetwork(this.hashCode, this.areAllFieldsValid);
            if (mediationNetwork != null) {
                int i13 = AFInAppEventType + 45;
                values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    map.put("uid", mediationNetwork);
                } else {
                    map.put("uid", mediationNetwork);
                    throw null;
                }
            }
        } catch (Throwable th3) {
            StringBuilder sb3 = new StringBuilder("ERROR: could not get uid ");
            sb3.append(th3.getMessage());
            String obj = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "");
            AFLogger.afErrorLog(obj, th3);
        }
    }

    private void v(@NotNull Map<String, Object> map) {
        int i13 = values + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i14 = 34 / 0;
            if (!this.areAllFieldsValid.getMediationNetwork("is_stop_tracking_used")) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (!this.areAllFieldsValid.getMediationNetwork("is_stop_tracking_used")) {
                return;
            }
        }
        map.put("istu", String.valueOf(this.areAllFieldsValid.getMediationNetwork("is_stop_tracking_used", false)));
        values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r0.length() == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void valueOf(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.appsflyer.AppsFlyerProperties r0 = r6.AFAdRevenueData()
            java.lang.String r1 = "sdkExtension"
            java.lang.String r0 = r0.getString(r1)
            r2 = 1
            if (r0 == 0) goto L2f
            int r3 = com.appsflyer.internal.AFg1fSDK.values
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r4
            int r3 = r3 % 2
            r4 = 0
            if (r3 != 0) goto L29
            int r3 = r0.length()
            r5 = 80
            int r5 = r5 / r4
            if (r3 != 0) goto L30
            goto L2f
        L29:
            int r3 = r0.length()
            if (r3 != 0) goto L30
        L2f:
            r4 = r2
        L30:
            r3 = r4 ^ 1
            if (r3 == r2) goto L35
            goto L38
        L35:
            r7.put(r1, r0)
        L38:
            int r7 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r7 = r7 + 3
            int r7 = r7 % 128
            com.appsflyer.internal.AFg1fSDK.values = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.valueOf(java.util.Map):void");
    }

    private void values(@NotNull Map<String, Object> map) {
        AFAdRevenueData(new Object[]{this, map}, -250056648, 250056660, System.identityHashCode(this));
    }

    private void w(@NotNull Map<String, Object> map) {
        AFInAppEventType = (values + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            return;
        }
        AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String str = null;
        try {
            this.getMediationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            str = this.component1.getCurrencyIso4217Code(this.getMediationNetwork);
        } catch (PackageManager.NameNotFoundException e13) {
            AFLogger.INSTANCE.e(AFh1sSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. com.facebook.katana not found", e13, false, false, true, false);
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.ATTRIBUTION, "Exception while collecting facebook's attribution ID. ", th3, false, false, true, false);
        }
        if (str != null) {
            map.put("fb", str);
            AFInAppEventType = (values + 93) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    private static PackageInfo w_(PackageManager packageManager, String str) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo2, "");
            values = (AFInAppEventType + 57) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return packageInfo2;
        }
        AFInAppEventType = (values + 95) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(str, of);
        Intrinsics.checkNotNullExpressionValue(packageInfo, "");
        return packageInfo;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getMonetizationNetwork(@NotNull AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        AFAdRevenueData(new Object[]{this, currencyIso4217Code}, -1877637159, 1877637169, System.identityHashCode(this));
        Map<String, Object> currencyIso4217Code2 = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
        getMediationNetwork(currencyIso4217Code2);
        Map<String, Object> currencyIso4217Code3 = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code3, "");
        AFAdRevenueData(new Object[]{this, currencyIso4217Code3}, -250056648, 250056660, System.identityHashCode(this));
        Map<String, Object> currencyIso4217Code4 = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code4, "");
        registerClient(currencyIso4217Code4);
        Map<String, Object> currencyIso4217Code5 = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code5, "");
        w(currencyIso4217Code5);
        if (getCurrencyIso4217Code().contains(aFa1rSDK.getRevenue())) {
            AFInAppEventType = (values + 51) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Map<String, Object> currencyIso4217Code6 = aFa1rSDK.getCurrencyIso4217Code();
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code6, "");
            afInfoLog(currencyIso4217Code6);
            AFInAppEventType = (values + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getRevenue(@NotNull AFa1rSDK aFa1rSDK) {
        AFInAppEventType = (values + 87) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getMonetizationNetwork(currencyIso4217Code, aFa1rSDK.getMediationNetwork());
        component3(currencyIso4217Code);
        AFLogger(currencyIso4217Code);
        AFAdRevenueData(currencyIso4217Code);
        AFAdRevenueData(new Object[]{this, currencyIso4217Code, this.copydefault.getMediationNetwork}, -653263176, 653263187, System.identityHashCode(this));
        AFAdRevenueData(new Object[]{this, currencyIso4217Code}, 1547381749, -1547381742, System.identityHashCode(this));
        currencyIso4217Code.put("cell", z0.g(new Pair("mcc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getMediationNetwork.getResources().getConfiguration().mnc))));
        currencyIso4217Code.put("sig", (String) AFAdRevenueData(new Object[]{this}, -1722178192, 1722178196, System.identityHashCode(this)));
        currencyIso4217Code.put("last_boot_time", Long.valueOf(component3()));
        currencyIso4217Code.put("disk", areAllFieldsValid());
        int i13 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static void component3(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(5 - Color.blue(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, (char) TextUtils.getOffsetBefore("", 0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        values = (AFInAppEventType + 57) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private final void copy(Map<String, Object> map) {
        if (!AFAdRevenueData().isOtherSdkStringDisabled()) {
            values = (AFInAppEventType + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            map.put("batteryLevel", String.valueOf(this.getCurrencyIso4217Code.getRevenue(this.getMediationNetwork).getCurrencyIso4217Code));
            values = (AFInAppEventType + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r1.versionCode > r10.areAllFieldsValid.AFAdRevenueData("versionCode", 0)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void getMediationNetwork(java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.getMediationNetwork(java.util.Map):void");
    }

    private String equals() {
        return (String) AFAdRevenueData(new Object[]{this}, 1962577071, -1962577066, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        boolean z13 = false;
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i13 = values + 33;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            String component1 = aFg1fSDK.component1.component1();
            String currencyIso4217Code = getCurrencyIso4217Code(aFg1fSDK.areAllFieldsValid, component1);
            boolean z14 = (currencyIso4217Code == null || Intrinsics.d(currencyIso4217Code, component1)) ? false : true;
            if (currencyIso4217Code == null && component1 != null) {
                z13 = true;
            }
            if (z14 || z13) {
                map.put("af_latestchannel", component1);
                values = (AFInAppEventType + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            String component2 = aFg1fSDK.component2();
            if (component2 != null) {
                AFInAppEventType = (values + 69) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = component2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                map.put("af_installstore", lowerCase);
            }
            String str = (String) AFAdRevenueData(new Object[]{aFg1fSDK}, 1962577071, -1962577066, System.identityHashCode(aFg1fSDK));
            if (str != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "");
                String lowerCase2 = str.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                map.put("af_preinstall_name", lowerCase2);
            }
            String component12 = aFg1fSDK.component1();
            if (component12 != null) {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                String lowerCase3 = component12.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                map.put("af_currentstore", lowerCase3);
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        getCurrencyIso4217Code(aFg1fSDK.areAllFieldsValid, aFg1fSDK.component1.component1());
        throw null;
    }

    private final void copydefault(Map<String, Object> map) {
        int i13 = values + 1;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            if (AFh1wSDK.AFAdRevenueData(this.getMediationNetwork)) {
                AFInAppEventType = (values + 95) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                map.put("inst_app", Boolean.TRUE);
                return;
            }
            return;
        }
        AFh1wSDK.AFAdRevenueData(this.getMediationNetwork);
        throw null;
    }

    private final boolean valueOf() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -279234499, 279234507, System.identityHashCode(this))).booleanValue();
    }

    private String component1() {
        AFInAppEventType = (values + 23) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String string = AFAdRevenueData().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        String currencyIso4217Code = getCurrencyIso4217Code("AF_STORE");
        AFInAppEventType = (values + 69) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return currencyIso4217Code;
    }

    @NotNull
    private static String areAllFieldsValid() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        AFInAppEventType = (values + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return str;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        String[] strArr;
        AFInAppEventType = (values + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFAdRevenueData().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
            values = (AFInAppEventType + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        String string2 = AFAdRevenueData().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb3 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb3.append(string2);
                sb3.append("' is not a legal value.");
                String obj = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "");
                AFLogger.afWarnLog(obj);
            }
            map.put("currency", string2);
        } else {
            values = (AFInAppEventType + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        String string3 = AFAdRevenueData().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            map.put("isUpdate", string3);
        }
        String string4 = AFAdRevenueData().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            int i13 = values + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                map.put("customData", string4);
            } else {
                map.put("customData", string4);
                throw null;
            }
        }
        String string5 = AFAdRevenueData().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFAdRevenueData().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFc1cSDK aFc1cSDK = this.copydefault.getCurrencyIso4217Code;
        if (aFc1cSDK != null) {
            int i14 = values + 83;
            AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                strArr = aFc1cSDK.getMediationNetwork;
                int i15 = 53 / 0;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFc1cSDK.getMediationNetwork;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    private final String AFKeystoreWrapper() {
        int i13 = values + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            File file = (File) AFAdRevenueData(new Object[]{getRevenue("ro.appsflyer.preinstall.path")}, -1694205835, 1694205835, (int) System.currentTimeMillis());
            if (getRevenue(file)) {
                file = (File) AFAdRevenueData(new Object[]{getCurrencyIso4217Code("AF_PRE_INSTALL_PATH")}, -1694205835, 1694205835, (int) System.currentTimeMillis());
            }
            if (!(!getRevenue(file))) {
                int i14 = AFInAppEventType + 1;
                values = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i14 % 2 != 0) {
                    file = (File) AFAdRevenueData(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -1694205835, 1694205835, (int) System.currentTimeMillis());
                    int i15 = 52 / 0;
                } else {
                    file = (File) AFAdRevenueData(new Object[]{"/data/local/tmp/pre_install.appsflyer"}, -1694205835, 1694205835, (int) System.currentTimeMillis());
                }
            }
            if (getRevenue(file)) {
                file = (File) AFAdRevenueData(new Object[]{"/etc/pre_install.appsflyer"}, -1694205835, 1694205835, (int) System.currentTimeMillis());
            }
            if (!getRevenue(file)) {
                String packageName = this.getMediationNetwork.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return getRevenue(file, packageName);
            }
            int i16 = values + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
            AFInAppEventType = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i16 % 2 == 0) {
                int i17 = 70 / 0;
            }
            return null;
        }
        getRevenue((File) AFAdRevenueData(new Object[]{getRevenue("ro.appsflyer.preinstall.path")}, -1694205835, 1694205835, (int) System.currentTimeMillis()));
        throw null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        Intrinsics.checkNotNullParameter(map, "");
        if (aFg1fSDK.AFAdRevenueData().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            int i13 = AFInAppEventType + 89;
            values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                return null;
            }
            throw null;
        }
        String mediationNetwork = aFg1fSDK.toString.getMediationNetwork(aFg1fSDK.areAllFieldsValid);
        if (mediationNetwork != null && mediationNetwork.length() != 0) {
            int i14 = values + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
            AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 != 0) {
                map.put("imei", mediationNetwork);
            } else {
                map.put("imei", mediationNetwork);
                throw null;
            }
        }
        String mediationNetwork2 = aFg1fSDK.getMediationNetwork(str);
        if (mediationNetwork2 != null) {
            int i15 = AFInAppEventType + 31;
            values = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 != 0) {
                aFg1fSDK.areAllFieldsValid.getMonetizationNetwork("androidIdCached", mediationNetwork2);
                map.put("android_id", mediationNetwork2);
                int i16 = 97 / 0;
            } else {
                aFg1fSDK.areAllFieldsValid.getMonetizationNetwork("androidIdCached", mediationNetwork2);
                map.put("android_id", mediationNetwork2);
            }
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1uSDK currencyIso4217Code = AFb1vSDK.getCurrencyIso4217Code(aFg1fSDK.getMediationNetwork);
        if (currencyIso4217Code != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = currencyIso4217Code.getRevenue;
            Intrinsics.checkNotNullExpressionValue(bool, "");
            linkedHashMap.put("isManual", bool);
            String str2 = currencyIso4217Code.getMonetizationNetwork;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("val", str2);
            Boolean bool2 = currencyIso4217Code.getCurrencyIso4217Code;
            if (bool2 != null) {
                int i17 = AFInAppEventType + 3;
                values = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i17 % 2 == 0) {
                    linkedHashMap.put("isLat", bool2);
                } else {
                    linkedHashMap.put("isLat", bool2);
                    throw null;
                }
            }
            map.put("oaid", linkedHashMap);
        }
        return null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        Map map = (Map) objArr[1];
        Intrinsics.checkNotNullParameter(map, "");
        AFb1uSDK b_ = AFb1vSDK.b_(aFg1fSDK.getMediationNetwork.getContentResolver());
        if (b_ != null) {
            AFInAppEventType = (values + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            map.put("amazon_aid", b_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(b_.getCurrencyIso4217Code));
            return null;
        }
        int i13 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 17 / 0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r3 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r6.put("prev_session_dur", java.lang.Long.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFInAppEventType(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFg1fSDK.values
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r3 = ""
            if (r0 != 0) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            com.appsflyer.internal.AFh1jSDK r0 = r5.component2
            long r3 = r0.hashCode
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L27
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            com.appsflyer.internal.AFh1jSDK r0 = r5.component2
            long r3 = r0.hashCode
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
        L27:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "prev_session_dur"
            r6.put(r1, r0)
        L30:
            int r6 = com.appsflyer.internal.AFg1fSDK.values
            int r6 = r6 + 53
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.AFInAppEventType(java.util.Map):void");
    }

    private String component2() {
        int i13 = AFInAppEventType + 77;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String str = null;
        if (i13 % 2 == 0) {
            if (this.areAllFieldsValid.getMediationNetwork("INSTALL_STORE")) {
                int i14 = values + 75;
                AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i14 % 2 != 0) {
                    return this.areAllFieldsValid.getCurrencyIso4217Code("INSTALL_STORE", null);
                }
                this.areAllFieldsValid.getCurrencyIso4217Code("INSTALL_STORE", null);
                throw null;
            }
            if (copydefault()) {
                int i15 = values + 41;
                AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i15 % 2 == 0) {
                    str = component1();
                    int i16 = 55 / 0;
                } else {
                    str = component1();
                }
            }
            this.areAllFieldsValid.getMonetizationNetwork("INSTALL_STORE", str);
            values = (AFInAppEventType + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return str;
        }
        this.areAllFieldsValid.getMediationNetwork("INSTALL_STORE");
        throw null;
    }

    private void areAllFieldsValid(@NotNull Map<String, Object> map) {
        values = (AFInAppEventType + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        AFg1qSDK.getRevenue(map, this.component1);
        int i13 = values + 7;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getCurrencyIso4217Code(@NotNull AFa1rSDK aFa1rSDK) {
        boolean z13;
        values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        boolean z14 = false;
        if (!this.component1.component4()) {
            values = (AFInAppEventType + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Map<String, Object> currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code(aFa1rSDK.getCurrencyIso4217Code());
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            currencyIso4217Code.put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AFh1kSDK aFh1kSDK = this.component1.getMonetizationNetwork.component1;
            if (aFh1kSDK == null) {
                int i13 = values + 81;
                AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    throw null;
                }
                return;
            }
            String str = aFh1kSDK.getCurrencyIso4217Code;
            if (str == null || str.length() == 0) {
                z13 = true;
            } else {
                values = (AFInAppEventType + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                z13 = false;
            }
            if (!z13) {
                aFa1rSDK.AFAdRevenueData("gaidError", aFh1kSDK.getCurrencyIso4217Code);
            }
            String str2 = aFh1kSDK.getRevenue;
            if (str2 != null) {
                int i14 = values + 19;
                AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i14 % 2 != 0) {
                    if (aFh1kSDK.AFAdRevenueData != null) {
                        aFa1rSDK.AFAdRevenueData("advertiserId", str2);
                        aFa1rSDK.AFAdRevenueData("advertiserIdEnabled", String.valueOf(aFh1kSDK.AFAdRevenueData));
                        aFa1rSDK.AFAdRevenueData("isGaidWithGps", String.valueOf(aFh1kSDK.getMediationNetwork));
                    }
                } else {
                    throw null;
                }
            }
        }
        AFh1kSDK aFh1kSDK2 = this.component1.getMonetizationNetwork.component1;
        if (aFh1kSDK2 != null) {
            AFInAppEventType = (values + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            z14 = Intrinsics.d(aFh1kSDK2.component2, Boolean.TRUE);
        }
        aFa1rSDK.AFAdRevenueData("GAID_retry", String.valueOf(z14));
        if (f0.j(AFf1rSDK.CONVERSION, AFf1rSDK.LAUNCH).contains(aFa1rSDK.getRevenue())) {
            int i15 = values + 67;
            AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 != 0) {
                AFe1mSDK aFe1mSDK = this.copydefault.component3;
                if (aFe1mSDK != null) {
                    Map<String, Object> currencyIso4217Code2 = AFb1tSDK.getCurrencyIso4217Code(aFa1rSDK.getCurrencyIso4217Code());
                    Intrinsics.checkNotNullExpressionValue(currencyIso4217Code2, "");
                    currencyIso4217Code2.put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.getMediationNetwork));
                    return;
                }
                return;
            }
            AFe1mSDK aFe1mSDK2 = this.copydefault.component3;
            throw null;
        }
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String string = aFg1fSDK.AFAdRevenueData().getString("preInstallName");
        if (string != null) {
            int i13 = (AFInAppEventType + 87) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            values = i13;
            int i14 = i13 + 31;
            AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                int i15 = 58 / 0;
            }
            return string;
        }
        if (aFg1fSDK.areAllFieldsValid.getMediationNetwork("preInstallName")) {
            string = aFg1fSDK.areAllFieldsValid.getCurrencyIso4217Code("preInstallName", null);
            AFInAppEventType = (values + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            if (aFg1fSDK.copydefault()) {
                AFInAppEventType = (values + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                string = aFg1fSDK.AFKeystoreWrapper();
                if (string == null) {
                    int i16 = AFInAppEventType + 57;
                    values = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i16 % 2 == 0) {
                        string = aFg1fSDK.getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                    } else {
                        aFg1fSDK.getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                        throw null;
                    }
                }
            }
            if (string != null) {
                values = (AFInAppEventType + 83) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                aFg1fSDK.areAllFieldsValid.getMonetizationNetwork("preInstallName", string);
            }
        }
        if (string != null) {
            int i17 = values + 93;
            AFInAppEventType = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i17 % 2 == 0) {
                aFg1fSDK.AFAdRevenueData().set("preInstallName", string);
                int i18 = 79 / 0;
            } else {
                aFg1fSDK.AFAdRevenueData().set("preInstallName", string);
            }
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r13.get("af_deeplink") == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r13 = com.appsflyer.internal.AFg1fSDK.values + 77;
        com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r13 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if ((r13 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r3 = xk2.s.f135225b;
        r3 = new org.json.JSONObject(r0);
        r3.put("isPush", "true");
        r13.put("af_deeplink", r3.toString());
        r13 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r0 = xk2.s.f135225b;
        r13 = ue.c.m(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007a, code lost:
    
        com.appsflyer.internal.AFg1fSDK.AFInAppEventType = (com.appsflyer.internal.AFg1fSDK.values + 49) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    @Override // com.appsflyer.internal.AFg1gSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getRevenue(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            r12 = this;
            int r0 = com.appsflyer.internal.AFg1fSDK.values
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L1d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            com.appsflyer.internal.AFd1lSDK r0 = r12.copydefault
            java.lang.String r0 = r0.getMonetizationNetwork
            r2 = 54
            int r2 = r2 / 0
            if (r0 == 0) goto L7a
            goto L26
        L1d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            com.appsflyer.internal.AFd1lSDK r0 = r12.copydefault
            java.lang.String r0 = r0.getMonetizationNetwork
            if (r0 == 0) goto L7a
        L26:
            java.lang.String r2 = "af_deeplink"
            java.lang.Object r3 = r13.get(r2)
            if (r3 == 0) goto L44
            int r13 = com.appsflyer.internal.AFg1fSDK.values
            int r13 = r13 + 77
            int r0 = r13 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r0
            int r13 = r13 % 2
            java.lang.String r0 = "Skip 'af' payload as deeplink was found by path"
            if (r13 == 0) goto L40
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L82
        L40:
            com.appsflyer.AFLogger.afDebugLog(r0)
            throw r1
        L44:
            xk2.q r3 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L5c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "isPush"
            java.lang.String r4 = "true"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            r13.put(r2, r0)     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r13 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L5c
            goto L63
        L5c:
            r13 = move-exception
            xk2.q r0 = xk2.s.f135225b
            xk2.r r13 = ue.c.m(r13)
        L63:
            java.lang.Throwable r5 = xk2.s.a(r13)
            if (r5 == 0) goto L82
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r3 = com.appsflyer.internal.AFh1sSDK.GENERAL
            r8 = 0
            r9 = 0
            java.lang.String r4 = "Exception while trying to create JSONObject from pushPayload"
            r6 = 0
            r7 = 0
            r10 = 120(0x78, float:1.68E-43)
            r11 = 0
            com.appsflyer.internal.AFh1rSDK.e$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L82
        L7a:
            int r13 = com.appsflyer.internal.AFg1fSDK.values
            int r13 = r13 + 49
            int r13 = r13 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r13
        L82:
            com.appsflyer.internal.AFd1lSDK r13 = r12.copydefault
            r13.getMonetizationNetwork = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.getRevenue(java.util.Map):void");
    }

    private String component4() {
        return (String) AFAdRevenueData(new Object[]{this}, -1722178192, 1722178196, System.identityHashCode(this));
    }

    private final AppsFlyerProperties AFAdRevenueData() {
        AFInAppEventType = (values + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.copy.getValue();
        int i13 = values + 97;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void AFAdRevenueData(@NotNull AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
        if (aFa1rSDK.getMediationNetwork()) {
            int i13 = AFInAppEventType + 37;
            values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                String str = aFa1rSDK.component3;
                AFd1lSDK aFd1lSDK = this.copydefault;
                getMediationNetwork(aFa1rSDK, str, aFd1lSDK.AFAdRevenueData, aFd1lSDK.getRevenue);
            } else {
                String str2 = aFa1rSDK.component3;
                AFd1lSDK aFd1lSDK2 = this.copydefault;
                getMediationNetwork(aFa1rSDK, str2, aFd1lSDK2.AFAdRevenueData, aFd1lSDK2.getRevenue);
                throw null;
            }
        } else if (!(aFa1rSDK instanceof AFh1aSDK)) {
            AFInAppEventType = (values + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            String str3 = aFa1rSDK.component4;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            getMonetizationNetwork(currencyIso4217Code, str3);
        }
        if (f0.j(AFf1rSDK.CONVERSION, AFf1rSDK.LAUNCH, AFf1rSDK.INAPP).contains(aFa1rSDK.getRevenue())) {
            values = (AFInAppEventType + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            AFAdRevenueData(new Object[]{this, currencyIso4217Code}, 1017725607, -1017725606, System.identityHashCode(this));
        }
        if (aFa1rSDK.component4()) {
            values = (AFInAppEventType + 97) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            areAllFieldsValid(currencyIso4217Code);
        }
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        i(currencyIso4217Code);
        AFKeystoreWrapper(currencyIso4217Code);
        AFInAppEventParameterName(currencyIso4217Code);
        valueOf(currencyIso4217Code);
        unregisterClient(currencyIso4217Code);
        AFAdRevenueData(currencyIso4217Code, aFa1rSDK.getMediationNetwork());
        e(currencyIso4217Code);
        v(currencyIso4217Code);
        getMonetizationNetwork(currencyIso4217Code, aFa1rSDK);
        currencyIso4217Code.put("af_events_api", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        int i14 = values + 15;
        AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        PackageManager packageManager;
        Context context = ((AFg1fSDK) objArr[0]).hashCode.getMonetizationNetwork;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            PackageInfo w_ = w_(packageManager, packageName);
            if (w_ != null) {
                int i13 = AFInAppEventType + 45;
                values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    return Long.valueOf(w_.firstInstallTime);
                }
                int i14 = 62 / 0;
                return Long.valueOf(w_.firstInstallTime);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map, int i13, int i14) {
        values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i13));
        map.put("iaecounter", String.valueOf(i14));
        map.put("isFirstCall", String.valueOf(!copy()));
        int i15 = values + 9;
        AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r5.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String getMediationNetwork(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFg1fSDK.values
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "collectAndroidId"
            r3 = 0
            if (r0 != 0) goto L1b
            com.appsflyer.AppsFlyerProperties r0 = r4.AFAdRevenueData()
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L42
            goto L25
        L1b:
            com.appsflyer.AppsFlyerProperties r0 = r4.AFAdRevenueData()
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 == 0) goto L42
        L25:
            if (r5 == 0) goto L35
            int r0 = com.appsflyer.internal.AFg1fSDK.values
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r0
            int r0 = r5.length()
            if (r0 != 0) goto L42
        L35:
            boolean r5 = r4.valueOf()
            if (r5 == 0) goto L40
            java.lang.String r5 = r4.AFInAppEventType()
            goto L4c
        L40:
            r5 = r3
            goto L4c
        L42:
            if (r5 == 0) goto L40
            int r0 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r0 = r0 + 71
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.values = r0
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.getMediationNetwork(java.lang.String):java.lang.String");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String e_;
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        int i13 = values + 91;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            e_ = AFb1qSDK.e_(aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageManager(), aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageName());
            int i14 = 69 / 0;
        } else {
            e_ = AFb1qSDK.e_(aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageManager(), aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageName());
        }
        int i15 = values + RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL;
        AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            return e_;
        }
        throw null;
    }

    private void getMonetizationNetwork(@NotNull Map<String, Object> map, boolean z13) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getRevenue("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getRevenue("ro.product.cpu.abi2"));
        hashMap.put("arch", getRevenue("os.arch"));
        hashMap.put("build_display_id", getRevenue("ro.build.display.id"));
        if (z13) {
            AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            component1(hashMap);
            if (this.component1.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i13 = values + 45;
                AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 != 0) {
                    hashMap.putAll(this.AFAdRevenueData.getMonetizationNetwork());
                    AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                } else {
                    hashMap.putAll(this.AFAdRevenueData.getMonetizationNetwork());
                    throw null;
                }
            }
        }
        hashMap.put("dim", this.component3.getRevenue(this.getMediationNetwork));
        map.put("deviceData", hashMap);
        int i14 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
        values = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            int i15 = 4 / 0;
        }
    }

    @SuppressLint({"PrivateApi"})
    private static String getRevenue(String str) {
        values = (AFInAppEventType + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.g(invoke, "");
            String str2 = (String) invoke;
            int i13 = AFInAppEventType + 23;
            values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
            return null;
        }
    }

    private void getMediationNetwork(@NotNull AFa1rSDK aFa1rSDK, String str, String str2, AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        Map<String, Object> currencyIso4217Code = aFa1rSDK.getCurrencyIso4217Code();
        if (aFa1rSDK.getRevenue() == AFf1rSDK.CONVERSION) {
            AFInAppEventType = (values + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            copy(currencyIso4217Code);
            equals(currencyIso4217Code);
            copydefault(currencyIso4217Code);
            AFc1tSDK.AFAdRevenueData(this.hashCode, this.areAllFieldsValid);
            AFInAppEventType = (values + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        hashCode(currencyIso4217Code);
        component4(currencyIso4217Code);
        component2((Map<String, ? extends Object>) currencyIso4217Code);
        AFAdRevenueData(new Object[]{currencyIso4217Code, str2}, -103865981, 103865987, (int) System.currentTimeMillis());
        AFAdRevenueData(currencyIso4217Code, str);
        AFInAppEventType(currencyIso4217Code);
        if (aFc1bSDK != null) {
            int i13 = values + 51;
            AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                aFc1bSDK.getMonetizationNetwork(currencyIso4217Code);
                return;
            } else {
                aFc1bSDK.getMonetizationNetwork(currencyIso4217Code);
                int i14 = 76 / 0;
                return;
            }
        }
        values = (AFInAppEventType + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i13 = AFInAppEventType + 15;
        int i14 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        values = i14;
        try {
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
        if (i13 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            AFInAppEventType = (i14 + 15) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (StringsKt.i0(str).toString().length() > 0) {
                values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return new File(StringsKt.i0(str).toString());
            }
        }
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        int i13 = values + 3;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return Long.valueOf(System.currentTimeMillis());
        }
        System.currentTimeMillis();
        throw null;
    }

    private static boolean getRevenue(File file) {
        int i13 = values + 45;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (file == null || !file.exists()) {
            return true;
        }
        values = (AFInAppEventType + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return false;
    }

    private static String getCurrencyIso4217Code(AFd1pSDK aFd1pSDK, String str) {
        String currencyIso4217Code = aFd1pSDK.getCurrencyIso4217Code("CACHED_CHANNEL", null);
        if (currencyIso4217Code != null) {
            AFInAppEventType = (values + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return currencyIso4217Code;
        }
        aFd1pSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
        int i13 = AFInAppEventType + 73;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r1.load(r3);
        com.appsflyer.AFLogger.afInfoLog("Found PreInstall property!");
        r6 = r1.getProperty(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("PreInstall file wasn't found: " + r6.getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        com.appsflyer.internal.AFg1fSDK.values = (com.appsflyer.internal.AFg1fSDK.AFInAppEventType + 79) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        com.appsflyer.internal.AFg1fSDK.values = (com.appsflyer.internal.AFg1fSDK.AFInAppEventType + 77) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r6.getMessage(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r3 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        com.appsflyer.internal.AFg1fSDK.AFInAppEventType = (com.appsflyer.internal.AFg1fSDK.values + 75) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0056, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r6.getMessage(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        com.appsflyer.AFLogger.afErrorLog(r7.getMessage(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0047, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0048, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0016, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r1 = new java.util.Properties();
        r3 = new java.io.InputStreamReader(new java.io.FileInputStream(r6), java.nio.charset.Charset.defaultCharset());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getRevenue(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "PreInstall file wasn't found: "
            int r1 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.appsflyer.internal.AFg1fSDK.values = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L16
            r1 = 80
            int r1 = r1 / 0
            if (r6 != 0) goto L19
            goto L18
        L16:
            if (r6 != 0) goto L19
        L18:
            return r2
        L19:
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L47 java.io.FileNotFoundException -> L6a
            r1.load(r3)     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L6b
            java.lang.String r4 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L6b
            java.lang.String r6 = r1.getProperty(r7)     // Catch: java.lang.Throwable -> L45 java.io.FileNotFoundException -> L6b
            r3.close()     // Catch: java.lang.Throwable -> L3c
            goto L44
        L3c:
            r7 = move-exception
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r7)
        L44:
            return r6
        L45:
            r6 = move-exception
            goto L49
        L47:
            r6 = move-exception
            r3 = r2
        L49:
            java.lang.String r7 = r6.getMessage()     // Catch: java.lang.Throwable -> L68
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L56
            goto L8c
        L56:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r7, r6)
            goto L8c
        L5f:
            int r6 = com.appsflyer.internal.AFg1fSDK.values
            int r6 = r6 + 75
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r6
            goto L8c
        L68:
            r6 = move-exception
            goto L95
        L6a:
            r3 = r2
        L6b:
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L68
            r7.append(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L68
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L84
            r3.close()     // Catch: java.lang.Throwable -> L56
            goto L8c
        L84:
            int r6 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r6 = r6 + 77
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1fSDK.values = r6
        L8c:
            int r6 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r6 = r6 + 79
            int r6 = r6 % 128
            com.appsflyer.internal.AFg1fSDK.values = r6
            return r2
        L95:
            if (r3 == 0) goto La3
            r3.close()     // Catch: java.lang.Throwable -> L9b
            goto La3
        L9b:
            r7 = move-exception
            java.lang.String r0 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r7)
        La3:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.getRevenue(java.io.File, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        r7.areAllFieldsValid.getMonetizationNetwork("prev_event_name", r9);
        r7.areAllFieldsValid.getMonetizationNetwork("prev_event_timestamp", java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        com.appsflyer.internal.AFg1fSDK.AFInAppEventType = (com.appsflyer.internal.AFg1fSDK.values + 99) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r1 = new org.json.JSONObject();
        r1.put("prev_event_timestamp", r7.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1));
        r1.put("prev_event_name", r0);
        r8.put("prev_event", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r0 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getMonetizationNetwork(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            r7 = this;
            int r0 = com.appsflyer.internal.AFg1fSDK.AFInAppEventType
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1fSDK.values = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "prev_event_timestamp"
            java.lang.String r3 = "prev_event_name"
            java.lang.String r4 = ""
            if (r0 == 0) goto L2a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            com.appsflyer.internal.AFd1pSDK r0 = r7.areAllFieldsValid     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = r0.getCurrencyIso4217Code(r3, r1)     // Catch: java.lang.Exception -> L28
            r1 = 82
            int r1 = r1 / 0
            if (r0 == 0) goto L50
            goto L38
        L26:
            r8 = move-exception
            throw r8
        L28:
            r8 = move-exception
            goto L67
        L2a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r4)
            com.appsflyer.internal.AFd1pSDK r0 = r7.areAllFieldsValid     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = r0.getCurrencyIso4217Code(r3, r1)     // Catch: java.lang.Exception -> L28
            if (r0 == 0) goto L50
        L38:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L28
            r1.<init>()     // Catch: java.lang.Exception -> L28
            com.appsflyer.internal.AFd1pSDK r4 = r7.areAllFieldsValid     // Catch: java.lang.Exception -> L28
            r5 = -1
            long r4 = r4.getMediationNetwork(r2, r5)     // Catch: java.lang.Exception -> L28
            r1.put(r2, r4)     // Catch: java.lang.Exception -> L28
            r1.put(r3, r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = "prev_event"
            r8.put(r0, r1)     // Catch: java.lang.Exception -> L28
        L50:
            com.appsflyer.internal.AFd1pSDK r8 = r7.areAllFieldsValid     // Catch: java.lang.Exception -> L28
            r8.getMonetizationNetwork(r3, r9)     // Catch: java.lang.Exception -> L28
            com.appsflyer.internal.AFd1pSDK r8 = r7.areAllFieldsValid     // Catch: java.lang.Exception -> L28
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L28
            r8.getMonetizationNetwork(r2, r0)     // Catch: java.lang.Exception -> L28
            int r8 = com.appsflyer.internal.AFg1fSDK.values
            int r8 = r8 + 99
            int r8 = r8 % 128
            com.appsflyer.internal.AFg1fSDK.AFInAppEventType = r8
            return
        L67:
            java.lang.String r9 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1fSDK.getMonetizationNetwork(java.util.Map, java.lang.String):void");
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, boolean z13) {
        int i13 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getMonetizationNetwork);
            int i14 = 12 / 0;
            if (!z13) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.getMonetizationNetwork);
            if (!z13) {
                return;
            }
        }
        AFInAppEventType = (values + 91) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        map.put("platform_extension_v2", this.getRevenue.AFAdRevenueData());
        values = (AFInAppEventType + 83) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private final String getCurrencyIso4217Code(String str) {
        values = (AFInAppEventType + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String revenue = this.component1.getRevenue(str);
        int i13 = values + 79;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 37 / 0;
        }
        return revenue;
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, String str) {
        AFAdRevenueData(new Object[]{map, str}, -103865981, 103865987, (int) System.currentTimeMillis());
    }

    private final void getCurrencyIso4217Code(Map<String, Object> map) {
        AFAdRevenueData(new Object[]{this, map}, -1877637159, 1877637169, System.identityHashCode(this));
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, String str) {
        AFAdRevenueData(new Object[]{this, map, str}, -653263176, 653263187, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void getMediationNetwork(@NotNull AFa1rSDK aFa1rSDK) {
        AFAdRevenueData(new Object[]{this, aFa1rSDK}, 1440059444, -1440059435, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        AFi1oSDK aFi1oSDK;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1mSDK aFi1mSDK = this.component4.AFAdRevenueData;
        if (aFi1mSDK != null) {
            AFInAppEventType = (values + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            aFi1oSDK = aFi1mSDK.getMonetizationNetwork();
        } else {
            AFInAppEventType = (values + 83) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            aFi1oSDK = null;
        }
        if (aFi1oSDK != null) {
            map.put("network", aFi1oSDK.getRevenue);
            map.put("ivc", Boolean.valueOf(aFi1oSDK.getMediationNetwork()));
            if (AFAdRevenueData().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            int i13 = AFInAppEventType + 19;
            int i14 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            values = i14;
            if (i13 % 2 != 0) {
                return;
            }
            String str = aFi1oSDK.getMediationNetwork;
            if (str != null) {
                AFInAppEventType = (i14 + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                map.put("operator", str);
            }
            String str2 = aFi1oSDK.getCurrencyIso4217Code;
            if (str2 == null) {
                values = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return;
            }
            int i15 = values + 7;
            AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 != 0) {
                map.put("carrier", str2);
            } else {
                map.put("carrier", str2);
                throw null;
            }
        }
    }

    @NotNull
    private String getMonetizationNetwork(@NotNull SimpleDateFormat simpleDateFormat) {
        int i13 = values + 17;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String currencyIso4217Code = this.areAllFieldsValid.getCurrencyIso4217Code("appsFlyerFirstInstall", null);
            if (currencyIso4217Code == null) {
                if (copydefault()) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    currencyIso4217Code = simpleDateFormat.format(new Date());
                } else {
                    currencyIso4217Code = "";
                }
                this.areAllFieldsValid.getMonetizationNetwork("appsFlyerFirstInstall", currencyIso4217Code);
                AFInAppEventType = (values + 31) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            AFh1rSDK.i$default(AFLogger.INSTANCE, AFh1sSDK.GENERAL, a.a.j("AppsFlyer: first launch date: ", currencyIso4217Code), false, 4, null);
            Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
            return currencyIso4217Code;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.areAllFieldsValid.getCurrencyIso4217Code("appsFlyerFirstInstall", null);
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final Long getRevenue() {
        return (Long) AFAdRevenueData(new Object[]{this}, -1180913183, 1180913186, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1fSDK aFg1fSDK = (AFg1fSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i13 = AFInAppEventType + 85;
        values = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            AFInAppEventType = (values + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(aFg1fSDK.getMediationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    private static void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFa1rSDK aFa1rSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFa1rSDK, "");
        String str = aFa1rSDK.component4;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1rSDK.AFAdRevenueData;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static File getMonetizationNetwork(String str) {
        return (File) AFAdRevenueData(new Object[]{str}, -1694205835, 1694205835, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final long getMonetizationNetwork() {
        return ((Long) AFAdRevenueData(new Object[]{this}, 765657071, -765657069, System.identityHashCode(this))).longValue();
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, String str) {
        int i13 = values + 11;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null && str.length() != 0) {
                map.put("referrer", str);
            }
            String currencyIso4217Code = this.areAllFieldsValid.getCurrencyIso4217Code("extraReferrers", null);
            if (currencyIso4217Code != null) {
                values = (AFInAppEventType + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                map.put("extraReferrers", currencyIso4217Code);
            }
            String referrer = AFAdRevenueData().getReferrer(this.areAllFieldsValid);
            if (referrer != null) {
                AFInAppEventType = (values + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (referrer.length() != 0) {
                    int i14 = values + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
                    AFInAppEventType = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i14 % 2 == 0) {
                        map.get("referrer");
                        throw null;
                    }
                    if (map.get("referrer") == null) {
                        int i15 = values + 63;
                        AFInAppEventType = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        if (i15 % 2 == 0) {
                            map.put("referrer", referrer);
                            throw null;
                        }
                        map.put("referrer", referrer);
                        return;
                    }
                    return;
                }
            }
            values = (AFInAppEventType + 93) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }
}
