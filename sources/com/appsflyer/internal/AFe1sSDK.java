package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import t3.s1;

/* loaded from: classes.dex */
public final class AFe1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] areAllFieldsValid = null;
    private static int component2 = 0;
    private static char component3 = 0;
    private static int component4 = 1;
    public static String getCurrencyIso4217Code;
    private static String getRevenue;
    private final AppsFlyerProperties AFAdRevenueData;
    private final AFe1eSDK component1;
    private final AFe1tSDK getMediationNetwork;
    private final AFd1nSDK getMonetizationNetwork;

    static {
        getMonetizationNetwork();
        getCurrencyIso4217Code = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        component2 = (component4 + 91) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public AFe1sSDK(AFe1tSDK aFe1tSDK, AFd1nSDK aFd1nSDK, AppsFlyerProperties appsFlyerProperties, AFe1eSDK aFe1eSDK) {
        this.getMediationNetwork = aFe1tSDK;
        this.getMonetizationNetwork = aFd1nSDK;
        this.AFAdRevenueData = appsFlyerProperties;
        this.component1 = aFe1eSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        int i16 = ~i13;
        int i17 = ~i14;
        int i18 = i16 | i17;
        int i19 = ((~i18) * 497) + (i14 * (-496)) + (i13 * (-496));
        int i23 = ~(i18 | i15);
        int i24 = ~i15;
        int i25 = (((~(i13 | i17 | i15)) | (~(i14 | i16)) | (~(i24 | i16))) * 497) + ((i23 | (~(i17 | i24 | i13))) * 497) + i19;
        if (i25 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i25 != 2) {
            return getMonetizationNetwork(objArr);
        }
        if (!((AFe1sSDK) objArr[0]).AFAdRevenueData.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            component2 = (component4 + 35) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return Boolean.TRUE;
        }
        component2 = (component4 + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return Boolean.FALSE;
    }

    private static void a(byte b13, String str, int i13, Object[] objArr) {
        int i14;
        int length;
        char[] cArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr2 = areAllFieldsValid;
        if (cArr2 != null) {
            int i15 = $11 + 37;
            $10 = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i16 = 0;
            while (i16 < length) {
                int i17 = $11 + 3;
                $10 = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i17 % 2 != 0) {
                    cArr[i16] = (char) (cArr2[i16] % 4738745460995343240L);
                    i16 <<= 1;
                } else {
                    cArr[i16] = (char) (cArr2[i16] ^ 4738745460995343240L);
                    i16++;
                }
            }
            cArr2 = cArr;
        }
        char c13 = (char) (4738745460995343240L ^ component3);
        char[] cArr3 = new char[i13];
        if (i13 % 2 != 0) {
            int i18 = $10 + 13;
            $11 = i18 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i18 % 2 == 0) {
                i14 = i13 + 23;
                cArr3[i14] = (char) (charArray[i14] - b13);
            } else {
                i14 = i13 - 1;
                cArr3[i14] = (char) (charArray[i14] - b13);
            }
        } else {
            i14 = i13;
        }
        if (i14 > 1) {
            $11 = ($10 + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            aFk1iSDK.getMonetizationNetwork = 0;
            while (true) {
                int i19 = aFk1iSDK.getMonetizationNetwork;
                if (i19 >= i14) {
                    break;
                }
                char c14 = charArray[i19];
                aFk1iSDK.getMediationNetwork = c14;
                char c15 = charArray[i19 + 1];
                aFk1iSDK.getRevenue = c15;
                if (c14 == c15) {
                    cArr3[i19] = (char) (c14 - b13);
                    cArr3[i19 + 1] = (char) (c15 - b13);
                } else {
                    int i23 = c14 / c13;
                    aFk1iSDK.getCurrencyIso4217Code = i23;
                    int i24 = c14 % c13;
                    aFk1iSDK.component1 = i24;
                    int i25 = c15 / c13;
                    aFk1iSDK.AFAdRevenueData = i25;
                    int i26 = c15 % c13;
                    aFk1iSDK.component3 = i26;
                    if (i24 == i26) {
                        $10 = ($11 + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        int i27 = ((i23 + c13) - 1) % c13;
                        aFk1iSDK.getCurrencyIso4217Code = i27;
                        int i28 = ((i25 + c13) - 1) % c13;
                        aFk1iSDK.AFAdRevenueData = i28;
                        cArr3[i19] = cArr2[(i27 * c13) + i24];
                        cArr3[i19 + 1] = cArr2[(i28 * c13) + i26];
                    } else if (i23 == i25) {
                        int i29 = ((i24 + c13) - 1) % c13;
                        aFk1iSDK.component1 = i29;
                        int i33 = ((i26 + c13) - 1) % c13;
                        aFk1iSDK.component3 = i33;
                        cArr3[i19] = cArr2[(i23 * c13) + i29];
                        cArr3[i19 + 1] = cArr2[(i25 * c13) + i33];
                    } else {
                        cArr3[i19] = cArr2[(i23 * c13) + i26];
                        cArr3[i19 + 1] = cArr2[(i25 * c13) + i24];
                    }
                }
                aFk1iSDK.getMonetizationNetwork = i19 + 2;
            }
        }
        for (int i34 = 0; i34 < i13; i34++) {
            cArr3[i34] = (char) (cArr3[i34] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        String monetizationNetwork;
        AFe1sSDK aFe1sSDK = (AFe1sSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        component4 = (component2 + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            Object[] objArr2 = {map, str};
            Map map2 = AFa1zSDK.unregisterClient;
            Object obj = map2.get(-695765603);
            if (obj == null) {
                obj = ((Class) AFa1zSDK.getMediationNetwork(TextUtils.getOffsetBefore("", 0) + 37, ((Process.getThreadPriority(0) + 20) >> 6) + 37, (char) (53535 - (ViewConfiguration.getDoubleTapTimeout() >> 16)))).getMethod("getRevenue", Map.class, String.class);
                map2.put(-695765603, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr2);
            AFj1bSDK aFj1bSDK = new AFj1bSDK(aFe1sSDK.getMonetizationNetwork);
            if (str2 != null && str2.length() != 0) {
                component2 = (component4 + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (!new Regex("4.?(\\d+)?.?(\\d+)").e(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").e(str2)) {
                    monetizationNetwork = aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                    return (AFe1rSDK) AFAdRevenueData(new Object[]{aFe1sSDK, new AFe1kSDK(aFj1bSDK.getCurrencyIso4217Code(aFj1bSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(aFe1sSDK));
                }
            }
            monetizationNetwork = aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            return (AFe1rSDK) AFAdRevenueData(new Object[]{aFe1sSDK, new AFe1kSDK(aFj1bSDK.getCurrencyIso4217Code(aFj1bSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(aFe1sSDK));
        } catch (Throwable th3) {
            try {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            } catch (Exception e13) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e13);
                return null;
            }
        }
    }

    @NonNull
    public final AFe1rSDK<AFi1qSDK> getCurrencyIso4217Code(boolean z13, boolean z14, @NonNull String str, int i13) {
        String str2;
        String str3;
        AFe1eSDK aFe1eSDK = this.component1;
        Intrinsics.checkNotNullParameter(str, "");
        if (z13) {
            component4 = (component2 + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            str2 = AFe1eSDK.getMediationNetwork;
        } else {
            str2 = AFe1eSDK.AFAdRevenueData;
        }
        if (z14) {
            int i14 = component4 + 91;
            component2 = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 != 0) {
                throw null;
            }
            str3 = "stg";
        } else {
            component4 = (component2 + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            str3 = "";
        }
        Object[] objArr = new Object[4];
        objArr[0] = AFe1eSDK.AFAdRevenueData() ^ true ? "" : (String) aFe1eSDK.getRevenue.getValue();
        objArr[1] = str3;
        objArr[2] = aFe1eSDK.getMonetizationNetwork();
        objArr[3] = str;
        AFe1kSDK aFe1kSDK = new AFe1kSDK(s1.d(objArr, 4, str2, ""), "GET");
        aFe1kSDK.component1 = 1500;
        return (AFe1rSDK) AFAdRevenueData(new Object[]{this, aFe1kSDK, new AFe1gSDK()}, 725080723, -725080722, System.identityHashCode(this));
    }

    public final AFe1rSDK<String> getMediationNetwork(Map<String, Object> map, String str) {
        byte[] bArr;
        int i13 = component4 + 31;
        component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            if (i13 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1zSDK.unregisterClient;
                    Object obj = map2.get(-695765603);
                    if (obj == null) {
                        obj = ((Class) AFa1zSDK.getMediationNetwork(38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 53536))).getMethod("getRevenue", Map.class, String.class);
                        map2.put(-695765603, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    byte[] bArr2 = bArr;
                    AFj1bSDK aFj1bSDK = new AFj1bSDK(this.getMonetizationNetwork);
                    AFe1rSDK<String> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFj1bSDK.getMediationNetwork(aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr2, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
                    component4 = (component2 + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    return aFe1rSDK;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1zSDK.unregisterClient;
                Object obj2 = map3.get(-695765603);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1zSDK.getMediationNetwork((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 37 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 53535))).getMethod("getRevenue", Map.class, String.class);
                    map3.put(-695765603, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                int i14 = 38 / 0;
                byte[] bArr22 = bArr;
                AFj1bSDK aFj1bSDK2 = new AFj1bSDK(this.getMonetizationNetwork);
                AFe1rSDK<String> aFe1rSDK2 = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFj1bSDK2.getMediationNetwork(aFj1bSDK2.AFAdRevenueData.getMonetizationNetwork("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr22, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
                component4 = (component2 + 63) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return aFe1rSDK2;
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            AFLogger.INSTANCE.e(AFh1sSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed", th5, false, false);
            return null;
        }
    }

    @NonNull
    public final AFe1rSDK<AFc1oSDK> getRevenue(AFc1pSDK aFc1pSDK) {
        AFe1rSDK<AFc1oSDK> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFc1pSDK.component1, AFa1qSDK.getCurrencyIso4217Code((Map<String, ?>) aFc1pSDK.getCurrencyIso4217Code()).toString().getBytes(Charset.defaultCharset()), "POST", Collections.emptyMap(), aFc1pSDK.getMonetizationNetwork()), new AFc1jSDK()}, 725080723, -725080722, System.identityHashCode(this));
        int i13 = component4 + RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL;
        component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return aFe1rSDK;
        }
        throw null;
    }

    public final AFe1rSDK<Map<String, Object>> AFAdRevenueData(String str, String str2) {
        String packageName = this.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getPackageName();
        AFd1nSDK aFd1nSDK = this.getMonetizationNetwork;
        AFe1rSDK<Map<String, Object>> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, AFe1pSDK.getMediationNetwork(packageName, AFb1iSDK.getMediationNetwork(aFd1nSDK.getRevenue, aFd1nSDK.getCurrencyIso4217Code), str, str2), new AFe1nSDK()}, 725080723, -725080722, System.identityHashCode(this));
        int i13 = component2 + 87;
        component4 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 91 / 0;
        }
        return aFe1rSDK;
    }

    public final AFe1rSDK<String> getRevenue(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        HashMap x13 = a.a.x("ttl", "-1", "uuid", obj);
        x13.put("data", map);
        x13.put("meta", getRevenue());
        if (str2 != null) {
            int i13 = component4 + 93;
            component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                x13.put("brand_domain", str2);
            } else {
                x13.put("brand_domain", str2);
                throw null;
            }
        }
        String jSONObject = AFa1qSDK.getCurrencyIso4217Code((Map<String, ?>) x13).toString();
        HashMap hashMap = new HashMap();
        Object[] objArr = new Object[1];
        a((byte) (((Process.getThreadPriority(0) + 20) >> 6) + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE), "\u000f\u0006\b\u0003\u0003\u000e\t\u0000\u0001\u000b\u0001\t", 12 - (Process.myTid() >> 22), objArr);
        hashMap.put(((String) objArr[0]).intern(), getCurrencyIso4217Code(str3, obj, "POST", jSONObject));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName()));
        sb3.append("/");
        sb3.append(str);
        return getMonetizationNetwork(new AFe1kSDK(sb3.toString(), jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap, false), new AFe1iSDK(), true);
    }

    public final AFe1rSDK<String> AFAdRevenueData(AFh1bSDK aFh1bSDK) {
        AFe1rSDK<String> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFh1bSDK.component1, aFh1bSDK.AFAdRevenueData(), "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
        component4 = (component2 + 5) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return aFe1rSDK;
    }

    public final AFe1rSDK<String> getMediationNetwork(@NonNull String str) {
        AFe1kSDK aFe1kSDK = new AFe1kSDK(str, null, "GET", Collections.emptyMap(), false);
        aFe1kSDK.component1 = 10000;
        aFe1kSDK.getCurrencyIso4217Code = false;
        AFe1rSDK<String> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, aFe1kSDK, new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
        int i13 = component2 + 27;
        component4 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 81 / 0;
        }
        return aFe1rSDK;
    }

    private <T> AFe1rSDK<T> getMonetizationNetwork(AFe1kSDK aFe1kSDK, AFe1cSDK<T> aFe1cSDK, boolean z13) {
        aFe1kSDK.getMediationNetwork = z13;
        AFe1tSDK aFe1tSDK = this.getMediationNetwork;
        AFe1rSDK<T> aFe1rSDK = new AFe1rSDK<>(aFe1kSDK, aFe1tSDK.getRevenue, aFe1tSDK.getMonetizationNetwork, aFe1cSDK);
        int i13 = component2 + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
        component4 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return aFe1rSDK;
        }
        throw null;
    }

    public final AFe1qSDK AFAdRevenueData(Map<String, Object> map, String str) {
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1zSDK.unregisterClient;
                Object obj = map2.get(-695765603);
                if (obj == null) {
                    obj = ((Class) AFa1zSDK.getMediationNetwork(((byte) KeyEvent.getModifierMetaStateMask()) + 38, (KeyEvent.getMaxKeyCode() >> 16) + 37, (char) ((-16723681) - Color.rgb(0, 0, 0)))).getMethod("getRevenue", Map.class, String.class);
                    map2.put(-695765603, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: failed to create bytes", new IllegalArgumentException("failed to create bytes from proxyData"));
                    return null;
                }
                component4 = (component2 + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                AFe1qSDK aFe1qSDK = new AFe1qSDK(this.getMonetizationNetwork, bArr);
                int i13 = component4 + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
                component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (i13 % 2 == 0) {
                    return aFe1qSDK;
                }
                throw null;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e13);
            return null;
        }
    }

    private boolean getMediationNetwork() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, 749355586, -749355584, System.identityHashCode(this))).booleanValue();
    }

    public static void getMonetizationNetwork() {
        areAllFieldsValid = new char[]{30273, 30323, 30331, 30310, 30320, 30327, 30275, 30324, 30332, 30311, 30274, 30271, 30326, 30304, 30291, 30325};
        component3 = (char) 17292;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFe1sSDK aFe1sSDK = (AFe1sSDK) objArr[0];
        AFe1kSDK aFe1kSDK = (AFe1kSDK) objArr[1];
        AFe1cSDK aFe1cSDK = (AFe1cSDK) objArr[2];
        component2 = (component4 + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFe1rSDK monetizationNetwork = aFe1sSDK.getMonetizationNetwork(aFe1kSDK, aFe1cSDK, aFe1sSDK.getMediationNetwork());
        int i13 = component4 + 31;
        component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    public final AFe1rSDK<String> getCurrencyIso4217Code(AFa1rSDK aFa1rSDK, String str, AFd1oSDK aFd1oSDK) {
        byte[] bArr;
        int i13 = component4 + 99;
        component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            if (i13 % 2 != 0) {
                try {
                    Object[] objArr = {aFa1rSDK, str, aFd1oSDK};
                    Map map = AFa1zSDK.unregisterClient;
                    Object obj = map.get(1374633606);
                    if (obj == null) {
                        obj = ((Class) AFa1zSDK.getMediationNetwork(37 - Gravity.getAbsoluteGravity(0, 0), 37 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53535))).getMethod("AFAdRevenueData", AFa1rSDK.class, String.class, AFd1oSDK.class);
                        map.put(1374633606, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    int i14 = 5 / 0;
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th3;
                }
            } else {
                try {
                    Object[] objArr2 = {aFa1rSDK, str, aFd1oSDK};
                    Map map2 = AFa1zSDK.unregisterClient;
                    Object obj2 = map2.get(1374633606);
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1zSDK.getMediationNetwork(37 - (ViewConfiguration.getLongPressTimeout() >> 16), View.MeasureSpec.getMode(0) + 37, (char) (53535 - Drawable.resolveOpacity(0, 0)))).getMethod("AFAdRevenueData", AFa1rSDK.class, String.class, AFd1oSDK.class);
                        map2.put(1374633606, obj2);
                    }
                    bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                } catch (Throwable th4) {
                    try {
                        Throwable cause2 = th4.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th4;
                    } catch (Throwable th5) {
                        th = th5;
                        AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", th);
                        return null;
                    }
                }
            }
            AFe1rSDK<String> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFa1rSDK.component1, bArr, "POST", Collections.emptyMap(), aFa1rSDK.getMonetizationNetwork()), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
            component2 = (component4 + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return aFe1rSDK;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final AFe1rSDK<String> getMediationNetwork(Map<String, Object> map, String str, String str2) {
        return (AFe1rSDK) AFAdRevenueData(new Object[]{this, map, str, str2}, -1521127320, 1521127320, System.identityHashCode(this));
    }

    public final AFe1rSDK<Map<String, String>> getRevenue(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1tSDK.getCurrencyIso4217Code().getHostName()));
        sb3.append("/");
        sb3.append(str);
        sb3.append("?id=");
        sb3.append(str2);
        String obj2 = sb3.toString();
        Map<String, Object> revenue = getRevenue();
        String valueOf = String.valueOf(revenue.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(revenue.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(revenue.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(revenue.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(revenue.get("sdk")));
        Object[] objArr = new Object[1];
        a((byte) (114 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u000f\u0006\b\u0003\u0003\u000e\t\u0000\u0001\u000b\u0001\t", TextUtils.indexOf((CharSequence) "", '0') + 13, objArr);
        hashMap.put(((String) objArr[0]).intern(), getCurrencyIso4217Code(str3, obj, "GET", obj, str, str2, valueOf));
        AFe1rSDK<Map<String, String>> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(obj2, null, "GET", hashMap, false), new AFe1hSDK()}, 725080723, -725080722, System.identityHashCode(this));
        component2 = (component4 + 21) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return aFe1rSDK;
    }

    private static String getCurrencyIso4217Code(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        sb3.append("v2");
        String revenue = AFb1mSDK.getRevenue(join, sb3.toString());
        component4 = (component2 + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return revenue;
    }

    public final AFe1rSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str, String str2) {
        String monetizationNetwork;
        component4 = (component2 + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1zSDK.unregisterClient;
            Object obj = map2.get(-695765603);
            if (obj == null) {
                obj = ((Class) AFa1zSDK.getMediationNetwork(37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 37 - (ViewConfiguration.getTouchSlop() >> 8), (char) (53535 - (ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("getRevenue", Map.class, String.class);
                map2.put(-695765603, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            AFj1bSDK aFj1bSDK = new AFj1bSDK(this.getMonetizationNetwork);
            if (str2 != null && str2.length() != 0) {
                component2 = (component4 + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                if (!new Regex("4.?(\\d+)?.?(\\d+)").e(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").e(str2)) {
                    component4 = (component2 + 93) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    monetizationNetwork = aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                    AFe1rSDK<String> aFe1rSDK = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFj1bSDK.getCurrencyIso4217Code(aFj1bSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
                    component4 = (component2 + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    return aFe1rSDK;
                }
            }
            int i13 = component4 + 45;
            component2 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                monetizationNetwork = aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
                int i14 = 43 / 0;
            } else {
                monetizationNetwork = aFj1bSDK.AFAdRevenueData.getMonetizationNetwork("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            AFe1rSDK<String> aFe1rSDK2 = (AFe1rSDK) AFAdRevenueData(new Object[]{this, new AFe1kSDK(aFj1bSDK.getCurrencyIso4217Code(aFj1bSDK.getMediationNetwork(monetizationNetwork)), bArr, "POST", Collections.emptyMap(), true), new AFe1iSDK()}, 725080723, -725080722, System.identityHashCode(this));
            component4 = (component2 + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return aFe1rSDK2;
        } catch (Throwable th3) {
            try {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            } catch (Exception e13) {
                AFLogger.afErrorLogForExcManagerOnly("AFFinalizer: reflection init failed", e13);
                return null;
            }
        }
    }

    private Map<String, Object> getRevenue() {
        HashMap o13 = ep.b.o("build_number", "6.16.0");
        o13.put("counter", Integer.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0)));
        o13.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a((byte) (13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0005\f\u0000\t㘌", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4, objArr);
        o13.put(((String) objArr[0]).intern(), Build.BRAND);
        o13.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        Context context = this.getMonetizationNetwork.getRevenue.getMonetizationNetwork;
        o13.put("app_version_name", AFb1qSDK.getRevenue(context, context.getPackageName()));
        o13.put("app_id", this.getMonetizationNetwork.getRevenue.getMonetizationNetwork.getPackageName());
        o13.put("platformextension", new AFb1cSDK().getMonetizationNetwork());
        component4 = (component2 + 95) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return o13;
    }

    private <T> AFe1rSDK<T> getRevenue(AFe1kSDK aFe1kSDK, AFe1cSDK<T> aFe1cSDK) {
        return (AFe1rSDK) AFAdRevenueData(new Object[]{this, aFe1kSDK, aFe1cSDK}, 725080723, -725080722, System.identityHashCode(this));
    }
}
