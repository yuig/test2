package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1hSDK implements AFb1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long component1 = 0;
    private static int component4 = 0;
    private static char copy = 0;
    private static int copydefault = 0;
    private static final int getCurrencyIso4217Code;
    private static int toString = 1;
    private final AFd1gSDK areAllFieldsValid;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getMediationNetwork = true;

    @NonNull
    private final Map<String, Object> getRevenue = new HashMap();
    private boolean component3 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMonetizationNetwork = 0;
    private boolean component2 = false;

    static {
        component1();
        getCurrencyIso4217Code = 98166;
        copydefault = (toString + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public AFb1hSDK(AFd1gSDK aFd1gSDK) {
        this.areAllFieldsValid = aFd1gSDK;
    }

    private boolean AFKeystoreWrapper() {
        int i13 = toString + 43;
        copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        boolean mediationNetwork = this.areAllFieldsValid.component2().getMediationNetwork("participantInProxy", false);
        toString = (copydefault + 23) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return mediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i13, char c13, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            $10 = ($11 + 93) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            cArr = str3.toCharArray();
            $11 = ($10 + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != 0) {
            int i14 = $11 + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            $10 = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 != 0) {
                cArr2 = str2.toCharArray();
                int i15 = 16 / 0;
            } else {
                cArr2 = str2.toCharArray();
            }
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1dSDK aFk1dSDK = new AFk1dSDK();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c13);
        cArr6[2] = (char) (cArr6[2] + ((char) i13));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        aFk1dSDK.AFAdRevenueData = 0;
        while (true) {
            int i16 = aFk1dSDK.AFAdRevenueData;
            if (i16 >= length3) {
                objArr[0] = new String(cArr7);
                return;
            }
            int i17 = (i16 + 3) % 4;
            int i18 = cArr5[i16 % 4] * 32718;
            char c14 = cArr6[(i16 + 2) % 4];
            char c15 = (char) ((i18 + c14) % 65535);
            aFk1dSDK.getCurrencyIso4217Code = c15;
            cArr6[i17] = (char) (((cArr5[i17] * 32718) + c14) / 65535);
            cArr5[i17] = c15;
            cArr7[i16] = (char) ((((cArr4[i16] ^ c15) ^ (component1 ^ 8487067883524747900L)) ^ ((int) (component4 ^ 8487067883524747900L))) ^ ((char) (copy ^ 8487067883524747900L)));
            aFk1dSDK.AFAdRevenueData = i16 + 1;
            $10 = ($11 + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
    }

    private static float areAllFieldsValid() {
        float nextFloat = new SecureRandom().nextFloat();
        int i13 = toString + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
        copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 29 / 0;
        }
        return nextFloat;
    }

    public static void component1() {
        component1 = -8055367207282910796L;
        component4 = 236876412;
        copy = (char) 29308;
    }

    private static String component3() {
        int i13 = toString;
        int i14 = i13 + 33;
        copydefault = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0) {
            throw null;
        }
        int i15 = i13 + 1;
        copydefault = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i15 % 2 != 0) {
            int i16 = 57 / 0;
        }
        return "6.16.0";
    }

    private synchronized void component4() {
        copydefault = (toString + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (this.component2) {
            return;
        }
        this.component2 = true;
        try {
            getRevenue("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i13 = copydefault + RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
            toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                int i14 = 73 / 0;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.PROXY, "Error while starting remote debugger", th3, true, true, true);
        }
    }

    private boolean copy() {
        int i13 = copydefault;
        int i14 = i13 + 43;
        toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (!this.component3) {
            return false;
        }
        if (this.getMediationNetwork) {
            return true;
        }
        toString = (i13 + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return this.component2;
    }

    @NonNull
    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        try {
            int i13 = copydefault + 41;
            toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                this.getRevenue.put("data", this.AFAdRevenueData);
                equals();
                map = this.getRevenue;
                int i14 = 80 / 0;
            } else {
                this.getRevenue.put("data", this.AFAdRevenueData);
                equals();
                map = this.getRevenue;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return map;
    }

    private synchronized void equals() {
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        int i13 = copydefault + 65;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object getMonetizationNetwork(Object[] objArr, int i13, int i14, int i15) {
        boolean revenue;
        int i16 = ~i13;
        int i17 = i16 | i14;
        int i18 = (((~i17) | (~(i16 | i15)) | (~(i14 | i15))) * (-754)) + (i14 * (-753)) + (i13 * 755);
        int i19 = ~(i17 | i15);
        int i23 = ~i15;
        int i24 = ((i16 | i23) * 754) + (((~(i13 | i23 | i14)) | i19) * (-754)) + i18;
        if (i24 == 1) {
            AFb1hSDK aFb1hSDK = (AFb1hSDK) objArr[0];
            AFi1rSDK aFi1rSDK = (AFi1rSDK) objArr[1];
            if (aFi1rSDK.equals((AFi1rSDK) objArr[2])) {
                toString = (copydefault + 19) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                revenue = aFb1hSDK.AFKeystoreWrapper();
            } else {
                revenue = getRevenue(aFi1rSDK.getRevenue);
                getMonetizationNetwork(new Object[]{aFb1hSDK, Boolean.valueOf(revenue)}, 1304128053, -1304128051, System.identityHashCode(aFb1hSDK));
            }
            toString = (copydefault + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return Boolean.valueOf(revenue);
        }
        if (i24 == 2) {
            return getRevenue(objArr);
        }
        if (i24 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFb1hSDK aFb1hSDK2 = (AFb1hSDK) objArr[0];
        String str = (String) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        String str2 = (String) objArr[3];
        toString = (copydefault + 51) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        aFb1hSDK2.getRevenue("server_response", str, String.valueOf(intValue), str2);
        toString = (copydefault + 65) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return null;
    }

    private Map<String, Object> l_(String str, PackageManager packageManager) {
        copydefault = (toString + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        m_(str, packageManager, this.areAllFieldsValid.AFKeystoreWrapper(), this.areAllFieldsValid.i());
        Map<String, Object> copydefault2 = copydefault();
        toString = (copydefault + 7) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return copydefault2;
    }

    private synchronized void m_(String str, PackageManager packageManager, AFg1qSDK aFg1qSDK, AFd1lSDK aFd1lSDK) {
        String str2;
        try {
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            String string = appsFlyerProperties.getString("remote_debug_static_data");
            this.getRevenue.clear();
            if (string != null) {
                try {
                    this.getRevenue.putAll(AFa1qSDK.getCurrencyIso4217Code(new JSONObject(string)));
                } catch (Throwable unused) {
                }
            } else {
                AFb1tSDK currencyIso4217Code = AFb1tSDK.getCurrencyIso4217Code();
                AFh1kSDK aFh1kSDK = AFb1tSDK.getCurrencyIso4217Code().AFAdRevenueData().getMonetizationNetwork().getMonetizationNetwork.component1;
                String str3 = null;
                AFb1uSDK aFb1uSDK = aFh1kSDK != null ? new AFb1uSDK(aFh1kSDK.getRevenue, aFh1kSDK.component3) : null;
                if (aFb1uSDK != null) {
                    int i13 = toString + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
                    copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i13 % 2 != 0) {
                        str2 = aFb1uSDK.getMonetizationNetwork;
                        int i14 = 74 / 0;
                    } else {
                        str2 = aFb1uSDK.getMonetizationNetwork;
                    }
                    str3 = str2;
                }
                AFAdRevenueData(str3, aFg1qSDK.getMediationNetwork(), aFd1lSDK.getMediationNetwork);
                StringBuilder sb3 = new StringBuilder("6.16.0.");
                sb3.append(AFb1tSDK.getMonetizationNetwork);
                String obj = sb3.toString();
                AFg1qSDK AFKeystoreWrapper = currencyIso4217Code.AFAdRevenueData().AFKeystoreWrapper();
                getRevenue(obj, (String) AFg1qSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper}, 1235496603, -1235496602, System.identityHashCode(AFKeystoreWrapper)), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
                try {
                    getCurrencyIso4217Code(str, String.valueOf(packageManager.getPackageInfo(str, 0).versionCode), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                    toString = (copydefault + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                } catch (Throwable unused2) {
                }
                appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getRevenue).toString());
                toString = (copydefault + 51) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            this.getRevenue.put("launch_counter", String.valueOf(this.areAllFieldsValid.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0)));
            int i15 = copydefault + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            toString = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i15 % 2 == 0) {
                int i16 = 95 / 0;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void values() {
        int i13 = copydefault + RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            this.areAllFieldsValid.component2().getCurrencyIso4217Code("participantInProxy");
            throw null;
        }
        this.areAllFieldsValid.component2().getCurrencyIso4217Code("participantInProxy");
        copydefault = (toString + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void AFAdRevenueData() {
        int i13 = toString;
        this.component3 = false;
        copydefault = (i13 + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean component2() {
        int i13 = toString;
        boolean z13 = this.component2;
        int i14 = i13 + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
        copydefault = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 == 0) {
            return z13;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i13 = toString + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL;
        copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            getRevenue("server_request", str, str2);
            return;
        }
        String[] strArr = new String[0];
        strArr[0] = str2;
        getRevenue("server_request", str, strArr);
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final synchronized void getMediationNetwork() {
        try {
            int i13 = copydefault + 75;
            toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                this.getRevenue.clear();
                this.AFAdRevenueData.clear();
                this.getMonetizationNetwork = 1;
            } else {
                this.getRevenue.clear();
                this.AFAdRevenueData.clear();
                this.getMonetizationNetwork = 0;
            }
            toString = (copydefault + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final synchronized void getRevenue() {
        int i13 = copydefault;
        toString = (i13 + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (!this.component2) {
            int i14 = i13 + 21;
            toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (!this.getMediationNetwork) {
                return;
            }
        }
        this.component2 = false;
        this.getMediationNetwork = false;
        try {
            getRevenue("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFh1sSDK.PROXY, "Error while stopping remote debugger", th3, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void k_(String str, PackageManager packageManager) {
        getMonetizationNetwork(new Object[]{this, str, packageManager}, -765755795, 765755798, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final synchronized void getCurrencyIso4217Code() {
        try {
            int i13 = toString + 3;
            copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                this.getMediationNetwork = true;
                getMediationNetwork();
            } else {
                this.getMediationNetwork = false;
                getMediationNetwork();
            }
            equals();
            copydefault = (toString + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private synchronized void AFAdRevenueData(String str, String str2, String str3) {
        try {
            toString = (copydefault + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            try {
                Map<String, Object> map = this.getRevenue;
                Object[] objArr = new Object[1];
                a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2124408176, (char) (Color.green(0) + 34822), "灁鿥پ\u0088", "읝뻧ᄼ홅訉", "⯈䲌襲\ue5fd", objArr);
                map.put(((String) objArr[0]).intern(), Build.BRAND);
                this.getRevenue.put("model", Build.MODEL);
                this.getRevenue.put("platform", "Android");
                this.getRevenue.put("platform_version", Build.VERSION.RELEASE);
                if (str != null && str.length() > 0) {
                    int i13 = copydefault + 59;
                    toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i13 % 2 != 0) {
                        this.getRevenue.put("advertiserId", str);
                    } else {
                        this.getRevenue.put("advertiserId", str);
                        throw null;
                    }
                }
                if (str2 != null && str2.length() > 0) {
                    this.getRevenue.put("imei", str2);
                    toString = (copydefault + 39) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
                if (str3 != null && str3.length() > 0) {
                    int i14 = copydefault + 33;
                    toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (i14 % 2 != 0) {
                        this.getRevenue.put("android_id", str3);
                    } else {
                        this.getRevenue.put("android_id", str3);
                        throw null;
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        com.appsflyer.internal.AFb1hSDK.toString = (com.appsflyer.internal.AFb1hSDK.copydefault + 71) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if ((!com.appsflyer.internal.AFc1sSDK.getRevenue(r3)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getRevenue(r3) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        new com.appsflyer.internal.AFe1vSDK();
        r3 = com.appsflyer.internal.AFe1vSDK.getCurrencyIso4217Code(component3(), r3);
        r0 = com.appsflyer.internal.AFb1hSDK.toString + com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
        com.appsflyer.internal.AFb1hSDK.copydefault = r0 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r0 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean getMediationNetwork(java.lang.String r3) {
        /*
            int r0 = com.appsflyer.internal.AFb1hSDK.copydefault
            int r0 = r0 + 121
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1hSDK.toString = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L18
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getRevenue(r3)
            r2 = 45
            int r2 = r2 / 0
            if (r0 == 0) goto L1f
            goto L3d
        L18:
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getRevenue(r3)
            r0 = r0 ^ r1
            if (r0 == 0) goto L3d
        L1f:
            com.appsflyer.internal.AFe1vSDK r0 = new com.appsflyer.internal.AFe1vSDK
            r0.<init>()
            java.lang.String r0 = component3()
            boolean r3 = com.appsflyer.internal.AFe1vSDK.getCurrencyIso4217Code(r0, r3)
            int r0 = com.appsflyer.internal.AFb1hSDK.toString
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1hSDK.copydefault = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L3c
            r0 = 17
            int r0 = r0 / 0
        L3c:
            return r3
        L3d:
            int r3 = com.appsflyer.internal.AFb1hSDK.copydefault
            int r3 = r3 + 71
            int r3 = r3 % 128
            com.appsflyer.internal.AFb1hSDK.toString = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1hSDK.getMediationNetwork(java.lang.String):boolean");
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    try {
                        toString = (copydefault + 51) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                        this.getRevenue.put("app_id", str);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.getRevenue.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            int i13 = toString + 19;
            copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 != 0) {
                this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
                int i14 = 91 / 0;
            } else {
                this.getRevenue.put(AppsFlyerProperties.CHANNEL, str3);
            }
        }
        if (str4 != null) {
            toString = (copydefault + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (str4.length() > 0) {
                this.getRevenue.put("preInstall", str4);
            }
        }
        copydefault = (toString + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getRevenue(String str, String... strArr) {
        int i13 = copydefault + 91;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            getRevenue("public_api_call", str, strArr);
        } else {
            getRevenue("public_api_call", str, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final boolean getMonetizationNetwork() {
        copydefault = (toString + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        boolean revenue = getRevenue(getRevenue(this.areAllFieldsValid.component3().getMediationNetwork.getMonetizationNetwork), getRevenue(this.areAllFieldsValid.component3().getMediationNetwork.AFAdRevenueData));
        if (revenue) {
            component4();
            copydefault = (toString + 97) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        } else {
            getCurrencyIso4217Code();
            getRevenue();
        }
        return revenue;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getRevenue(Throwable th3) {
        String message;
        int i13 = copydefault + 47;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            Throwable cause = th3.getCause();
            String simpleName = th3.getClass().getSimpleName();
            if (cause == null) {
                message = th3.getMessage();
            } else {
                message = cause.getMessage();
                toString = (copydefault + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
            getRevenue("exception", simpleName, AFAdRevenueData(message, cause == null ? th3.getStackTrace() : cause.getStackTrace()));
            return;
        }
        th3.getCause();
        throw null;
    }

    private static String[] AFAdRevenueData(String str, StackTraceElement[] stackTraceElementArr) {
        int i13 = (toString + 91) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        copydefault = i13;
        if (stackTraceElementArr == null) {
            int i14 = i13 + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
            toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i14 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[0] = str;
            return strArr;
        }
        int i15 = 1;
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i15 < stackTraceElementArr.length) {
            int i16 = toString + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
            copydefault = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i16 % 2 != 0) {
                strArr2[i15] = stackTraceElementArr[i15].toString();
                i15 += 28;
            } else {
                strArr2[i15] = stackTraceElementArr[i15].toString();
                i15++;
            }
        }
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getRevenue(String str, String str2) {
        int i13 = toString + 85;
        copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            getRevenue(null, str, str2);
        } else {
            getRevenue(null, str, str2);
        }
    }

    @Override // com.appsflyer.internal.AFb1gSDK
    public final void getCurrencyIso4217Code(String str, int i13, String str2) {
        getMonetizationNetwork(new Object[]{this, str, Integer.valueOf(i13), str2}, 999749718, -999749718, i13);
    }

    private boolean AFAdRevenueData(String str) {
        copydefault = (toString + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (AFc1sSDK.getRevenue(str)) {
            copydefault = (toString + 1) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return true;
        }
        Context context = this.areAllFieldsValid.getMonetizationNetwork().getRevenue.getMonetizationNetwork;
        return str.equals(AFb1qSDK.getRevenue(context, context.getPackageName()));
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1hSDK aFb1hSDK = (AFb1hSDK) objArr[0];
        String str = (String) objArr[1];
        PackageManager packageManager = (PackageManager) objArr[2];
        copydefault = (toString + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            Map<String, Object> l_ = aFb1hSDK.l_(str, packageManager);
            AFg1qSDK AFKeystoreWrapper = aFb1hSDK.areAllFieldsValid.AFKeystoreWrapper();
            AFe1qSDK AFAdRevenueData = aFb1hSDK.areAllFieldsValid.AFAdRevenueData().AFAdRevenueData(l_, (String) AFg1qSDK.AFAdRevenueData(new Object[]{AFKeystoreWrapper}, 1235496603, -1235496602, System.identityHashCode(AFKeystoreWrapper)));
            if (AFAdRevenueData == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                toString = (copydefault + RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return null;
            }
            aFb1hSDK.areAllFieldsValid.getMediationNetwork().execute(new com.airbnb.lottie.k(AFAdRevenueData, 2));
            return null;
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th3);
            return null;
        }
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        try {
            this.getRevenue.put("sdk_version", str);
            if (str2 != null) {
                try {
                    toString = (copydefault + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    if (str2.length() > 0) {
                        this.getRevenue.put("devkey", str2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (str3 != null && str3.length() > 0) {
                copydefault = (toString + 53) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                this.getRevenue.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.getRevenue.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean getMonetizationNetwork(@NonNull AFi1rSDK aFi1rSDK, AFi1rSDK aFi1rSDK2) {
        return ((Boolean) getMonetizationNetwork(new Object[]{this, aFi1rSDK, aFi1rSDK2}, 1420413741, -1420413740, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void getRevenue(String str, String str2, String... strArr) {
        String obj;
        if (!copy() || this.getMonetizationNetwork >= 98304) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String join = TextUtils.join(", ", strArr);
            if (str != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(currentTimeMillis);
                sb3.append(" ");
                sb3.append(Thread.currentThread().getId());
                sb3.append(" _/AppsFlyer_6.16.0 [");
                sb3.append(str);
                sb3.append("] ");
                sb3.append(str2);
                sb3.append(" ");
                sb3.append(join);
                obj = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(currentTimeMillis);
                sb4.append(" ");
                sb4.append(Thread.currentThread().getId());
                sb4.append(" ");
                sb4.append(str2);
                sb4.append("/AppsFlyer_6.16.0 ");
                sb4.append(join);
                obj = sb4.toString();
            }
            int length = this.getMonetizationNetwork + (obj.length() << 1);
            int i13 = getCurrencyIso4217Code;
            boolean z13 = false;
            if (length > i13) {
                int i14 = toString + 95;
                copydefault = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                obj = i14 % 2 != 0 ? obj.substring(0, (i13 / this.getMonetizationNetwork) * 4) : obj.substring(0, (i13 - this.getMonetizationNetwork) / 2);
                copydefault = (toString + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                z13 = true;
            }
            this.AFAdRevenueData.add(obj);
            this.getMonetizationNetwork += obj.length() << 1;
            if (z13) {
                this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                this.getMonetizationNetwork += RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL;
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized boolean getRevenue(AFi1rSDK aFi1rSDK, AFi1rSDK aFi1rSDK2) {
        int i13 = copydefault + 35;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (aFi1rSDK == null) {
            values();
            return false;
        }
        if (!aFi1rSDK.getMonetizationNetwork()) {
            return false;
        }
        if (this.areAllFieldsValid.getMonetizationNetwork().getCurrencyIso4217Code.AFAdRevenueData("appsFlyerCount", 0) <= aFi1rSDK.getMonetizationNetwork) {
            copydefault = (toString + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (!getMonetizationNetwork(aFi1rSDK, aFi1rSDK2)) {
                int i14 = copydefault + 25;
                toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return !(i14 % 2 != 0);
            }
            if (!AFAdRevenueData(aFi1rSDK.AFAdRevenueData)) {
                toString = (copydefault + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return false;
            }
            if (getMediationNetwork(aFi1rSDK.getMediationNetwork)) {
                return true;
            }
            int i15 = toString + 97;
            copydefault = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return i15 % 2 != 0;
        }
        toString = (copydefault + 39) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return false;
    }

    private static boolean getRevenue(float f13) {
        int i13 = copydefault;
        int i14 = i13 + 25;
        toString = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i14 % 2 != 0 ? f13 >= 1.0d : f13 >= 0.0d) {
            toString = (i13 + 47) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return true;
        }
        if (f13 > 0.0d) {
            return areAllFieldsValid() <= f13;
        }
        toString = (i13 + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return false;
    }

    private static AFi1rSDK getRevenue(AFi1qSDK aFi1qSDK) {
        if (aFi1qSDK != null) {
            copydefault = (toString + RecyclerViewTypes.VIEW_TYPE_LIVE_SINGLE_COLUMN_UPSELL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            AFi1xSDK aFi1xSDK = aFi1qSDK.getMediationNetwork;
            if (aFi1xSDK != null) {
                return aFi1xSDK.getMediationNetwork;
            }
        }
        copydefault = (toString + 89) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1hSDK aFb1hSDK = (AFb1hSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i13 = toString + 33;
        copydefault = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            aFb1hSDK.areAllFieldsValid.component2().getRevenue("participantInProxy", booleanValue);
            int i14 = 58 / 0;
            return null;
        }
        aFb1hSDK.areAllFieldsValid.component2().getRevenue("participantInProxy", booleanValue);
        return null;
    }

    private void getRevenue(boolean z13) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z13)}, 1304128053, -1304128051, System.identityHashCode(this));
    }
}
