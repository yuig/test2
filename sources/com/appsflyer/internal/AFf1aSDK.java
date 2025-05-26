package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class AFf1aSDK extends AFg1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private final AFg1gSDK AFKeystoreWrapper;
    private final AFd1nSDK copydefault;
    private final String equals;
    private final AFd1oSDK hashCode;
    private static char[] values = {17289, 30304, 30323, 17290, 17291, 30320, 30332, 30326, 17292};
    private static char valueOf = 17291;

    public AFf1aSDK(@NonNull String str, @NonNull AFd1gSDK aFd1gSDK) {
        super(new AFg1dSDK(aFd1gSDK.AFInAppEventType().getMonetizationNetwork), aFd1gSDK, str);
        this.copydefault = aFd1gSDK.getMonetizationNetwork();
        this.hashCode = aFd1gSDK.AFInAppEventType();
        this.equals = str;
        this.AFKeystoreWrapper = aFd1gSDK.component1();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        AFf1aSDK aFf1aSDK = (AFf1aSDK) objArr[0];
        AFInAppEventType = (AFInAppEventParameterName + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        super.getMediationNetwork();
        ResponseNetwork responseNetwork = ((AFf1hSDK) aFf1aSDK).component1;
        if (responseNetwork == null) {
            return null;
        }
        AFInAppEventType = (AFInAppEventParameterName + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (!responseNetwork.isSuccessful()) {
            return null;
        }
        aFf1aSDK.copydefault();
        AFInAppEventParameterName = (AFInAppEventType + 69) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return null;
    }

    private static void a(byte b13, String str, int i13, Object[] objArr) {
        int i14;
        $10 = ($11 + 55) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr3 = values;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $11 = ($10 + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            for (int i15 = 0; i15 < length; i15++) {
                cArr4[i15] = (char) (cArr3[i15] ^ 4738745460995343240L);
            }
            cArr3 = cArr4;
        }
        char c13 = (char) (4738745460995343240L ^ valueOf);
        char[] cArr5 = new char[i13];
        if (i13 % 2 != 0) {
            $10 = ($11 + 99) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            i14 = i13 - 1;
            cArr5[i14] = (char) (cArr2[i14] - b13);
        } else {
            i14 = i13;
        }
        if (i14 > 1) {
            aFk1iSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1iSDK.getMonetizationNetwork;
                if (i16 >= i14) {
                    break;
                }
                char c14 = cArr2[i16];
                aFk1iSDK.getMediationNetwork = c14;
                char c15 = cArr2[i16 + 1];
                aFk1iSDK.getRevenue = c15;
                if (c14 == c15) {
                    cArr5[i16] = (char) (c14 - b13);
                    cArr5[i16 + 1] = (char) (c15 - b13);
                    $11 = ($10 + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                } else {
                    int i17 = c14 / c13;
                    aFk1iSDK.getCurrencyIso4217Code = i17;
                    int i18 = c14 % c13;
                    aFk1iSDK.component1 = i18;
                    int i19 = c15 / c13;
                    aFk1iSDK.AFAdRevenueData = i19;
                    int i23 = c15 % c13;
                    aFk1iSDK.component3 = i23;
                    if (i18 == i23) {
                        int i24 = ((i17 + c13) - 1) % c13;
                        aFk1iSDK.getCurrencyIso4217Code = i24;
                        int i25 = ((i19 + c13) - 1) % c13;
                        aFk1iSDK.AFAdRevenueData = i25;
                        cArr5[i16] = cArr3[(i24 * c13) + i18];
                        cArr5[i16 + 1] = cArr3[(i25 * c13) + i23];
                        $10 = ($11 + 79) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    } else if (i17 == i19) {
                        int i26 = ((i18 + c13) - 1) % c13;
                        aFk1iSDK.component1 = i26;
                        int i27 = ((i23 + c13) - 1) % c13;
                        aFk1iSDK.component3 = i27;
                        cArr5[i16] = cArr3[(i17 * c13) + i26];
                        cArr5[i16 + 1] = cArr3[(i19 * c13) + i27];
                    } else {
                        cArr5[i16] = cArr3[(i17 * c13) + i23];
                        cArr5[i16 + 1] = cArr3[(i19 * c13) + i18];
                    }
                }
                aFk1iSDK.getMonetizationNetwork = i16 + 2;
            }
        }
        int i28 = 0;
        while (i28 < i13) {
            int i29 = $11 + 3;
            $10 = i29 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i29 % 2 != 0) {
                cArr5[i28] = (char) (cArr5[i28] ^ 15124);
                i28 += 4;
            } else {
                cArr5[i28] = (char) (cArr5[i28] ^ 13722);
                i28++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private void copydefault() {
        AFInAppEventType = (AFInAppEventParameterName + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.copy.getRevenue("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFInAppEventParameterName = (AFInAppEventType + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void component1(AFa1rSDK aFa1rSDK) {
        AFInAppEventType = (AFInAppEventParameterName + 67) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String currencyIso4217Code = this.copydefault.getCurrencyIso4217Code();
        if (currencyIso4217Code != null) {
            aFa1rSDK.AFAdRevenueData("advertiserId", currencyIso4217Code);
        }
        AFInAppEventParameterName = (AFInAppEventType + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    @Override // com.appsflyer.internal.AFg1xSDK, com.appsflyer.internal.AFf1hSDK
    public final boolean copy() {
        int i13 = (AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        AFInAppEventParameterName = i13;
        AFInAppEventType = (i13 + 73) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r3 = r0.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        r5 = r3.getPackageInfo(r0.getPackageName(), 0);
        r12.AFAdRevenueData("app_version_code", java.lang.Integer.toString(r5.versionCode));
        r12.AFAdRevenueData("app_version_name", r5.versionName);
        r12.AFAdRevenueData("app_name", r3.getApplicationLabel(r5.applicationInfo).toString());
        r12.AFAdRevenueData("installDate", (java.lang.String) com.appsflyer.internal.AFb1tSDK.getMonetizationNetwork(new java.lang.Object[]{new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), java.lang.Long.valueOf(r5.firstInstallTime)}, -1853371894, 1853371912, (int) java.lang.System.currentTimeMillis()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019d, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a9, code lost:
    
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x01b1, code lost:
    
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r3.getMonetizationNetwork() != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFg1xSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getCurrencyIso4217Code(com.appsflyer.internal.AFa1rSDK r12) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1aSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFa1rSDK):void");
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void getMediationNetwork(AFa1rSDK aFa1rSDK) {
        int i13 = AFInAppEventParameterName + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL;
        AFInAppEventType = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
        int i13 = AFInAppEventType + 65;
        AFInAppEventParameterName = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void getRevenue(AFa1rSDK aFa1rSDK) {
        int i13 = AFInAppEventType + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
        AFInAppEventParameterName = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 76 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFf1hSDK, com.appsflyer.internal.AFe1aSDK
    public final void getMediationNetwork() {
        AFAdRevenueData(new Object[]{this}, -2121079333, 2121079333, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final void AFAdRevenueData(AFa1rSDK aFa1rSDK) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }
}
