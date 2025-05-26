package com.appsflyer.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1nSDK;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AFg1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int equals = 1;
    private static int toString;
    private volatile String component1;
    private volatile String component2;
    private long getCurrencyIso4217Code;

    @NonNull
    private final AFd1oSDK getMediationNetwork;

    @NonNull
    private final AFg1nSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;
    private static char[] areAllFieldsValid = {37379, 37388, 37381, 37406, 37387, 37399, 37391, 37393, 37394};
    private static int component4 = 351900322;
    private static boolean copy = true;
    private static boolean hashCode = true;
    private boolean AFAdRevenueData = false;
    private volatile boolean component3 = false;

    /* renamed from: com.appsflyer.internal.AFg1qSDK$2 */
    public class AnonymousClass2 implements AFg1nSDK.AFa1ySDK {
        public AnonymousClass2() {
        }

        @Override // com.appsflyer.internal.AFg1nSDK.AFa1ySDK
        public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
            AFg1qSDK.this.getRevenue = new ConcurrentHashMap();
            AFg1qSDK.this.getRevenue.put("signedData", str);
            AFg1qSDK.this.getRevenue.put("signature", str2);
            AFg1qSDK.this.component1();
            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
        }

        @Override // com.appsflyer.internal.AFg1nSDK.AFa1ySDK
        public final void getMediationNetwork(String str, Exception exc) {
            AFg1qSDK.this.getRevenue = new ConcurrentHashMap();
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            AFg1qSDK.this.component1();
            AFg1qSDK.this.getRevenue.put("error", message);
            AFLogger.afErrorLog(str, exc, true, true, false);
        }
    }

    public AFg1qSDK(@NonNull AFd1oSDK aFd1oSDK, @NonNull AFg1nSDK aFg1nSDK) {
        this.getMediationNetwork = aFd1oSDK;
        this.getMonetizationNetwork = aFg1nSDK;
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i13, int i14, int i15) {
        int i16 = ~i13;
        int i17 = ~(i16 | i15);
        int i18 = ~i15;
        int i19 = ((i17 | (~(i18 | i14))) * (-1808)) + (i14 * (-903)) + (i13 * 905);
        int i23 = ~i14;
        int i24 = i13 | i18;
        int i25 = (((~i24) | (~(i14 | i16)) | (~(i15 | i23))) * 904) + (((~(i24 | i14)) | (~(i16 | i23 | i15))) * 904) + i19;
        if (i25 == 1) {
            return AFAdRevenueData(objArr);
        }
        if (i25 == 2) {
            return getRevenue(objArr);
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        equals = (toString + 3) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        boolean z13 = aFg1qSDK.component3;
        toString = (equals + 61) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return Boolean.valueOf(z13);
    }

    private static void a(String str, int[] iArr, String str2, int i13, Object[] objArr) {
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr3 = areAllFieldsValid;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i14 = 0; i14 < length; i14++) {
                cArr4[i14] = (char) (cArr3[i14] ^ (-4509188474687352186L));
            }
            cArr3 = cArr4;
        }
        int i15 = (int) ((-4509188474687352186L) ^ component4);
        if (hashCode) {
            $10 = ($11 + 13) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            int length2 = bArr2.length;
            aFk1kSDK.getMediationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1kSDK.getMonetizationNetwork = 0;
            while (true) {
                int i16 = aFk1kSDK.getMonetizationNetwork;
                int i17 = aFk1kSDK.getMediationNetwork;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 53) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    cArr5[i16] = (char) (cArr3[bArr2[(i17 - 1) - i16] + i13] - i15);
                    aFk1kSDK.getMonetizationNetwork = i16 + 1;
                }
            }
        } else if (copy) {
            int length3 = cArr2.length;
            aFk1kSDK.getMediationNetwork = length3;
            char[] cArr6 = new char[length3];
            aFk1kSDK.getMonetizationNetwork = 0;
            while (true) {
                int i18 = aFk1kSDK.getMonetizationNetwork;
                int i19 = aFk1kSDK.getMediationNetwork;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i18] = (char) (cArr3[cArr2[(i19 - 1) - i18] - i13] - i15);
                    aFk1kSDK.getMonetizationNetwork = i18 + 1;
                }
            }
        } else {
            int length4 = iArr.length;
            aFk1kSDK.getMediationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1kSDK.getMonetizationNetwork = 0;
            while (true) {
                int i23 = aFk1kSDK.getMonetizationNetwork;
                int i24 = aFk1kSDK.getMediationNetwork;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i23] = (char) (cArr3[iArr[(i24 - 1) - i23] - i13] - i15);
                    aFk1kSDK.getMonetizationNetwork = i23 + 1;
                    $10 = ($11 + 31) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
            }
        }
    }

    private long component2() {
        int i13 = equals + RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        r1 = r1 + 37;
        com.appsflyer.internal.AFg1qSDK.equals = r1 % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        r1 = r1 % 2;
        r0 = r4.getRevenue.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r1 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0016, code lost:
    
        if (r4.getRevenue != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4.getRevenue != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean component3() {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFg1qSDK.equals
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.toString = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L14
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.getRevenue
            r3 = 5
            int r3 = r3 / r2
            if (r0 == 0) goto L32
            goto L18
        L14:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.getRevenue
            if (r0 == 0) goto L32
        L18:
            int r1 = r1 + 37
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1qSDK.equals = r0
            int r1 = r1 % 2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.getRevenue
            boolean r0 = r0.isEmpty()
            if (r1 != 0) goto L2e
            r1 = 28
            int r1 = r1 / r2
            if (r0 != 0) goto L32
            goto L30
        L2e:
            if (r0 != 0) goto L32
        L30:
            r0 = 1
            return r0
        L32:
            int r0 = com.appsflyer.internal.AFg1qSDK.toString
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.equals = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L3f
            return r2
        L3f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.component3():boolean");
    }

    public final void component1() {
        toString = (equals + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.getRevenue.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.getRevenue.put("lvl_timestamp", Long.valueOf(component2()));
        int i13 = toString + 61;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public final void getCurrencyIso4217Code(@NonNull String str) {
        equals = (toString + 77) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.component1 = str;
        int i13 = toString + 23;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            int i14 = 3 / 0;
        }
    }

    public final String getMediationNetwork() {
        toString = (equals + 45) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        String str = this.component1;
        int i13 = toString + 93;
        equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getMediationNetwork.getMonetizationNetwork};
                Map map2 = AFa1zSDK.unregisterClient;
                Object obj = map2.get(610051608);
                if (obj == null) {
                    obj = ((Class) AFa1zSDK.getMediationNetwork((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, 360 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(610051608, obj);
                }
                Map<String, Object> map3 = (Map) ((Constructor) obj).newInstance(objArr);
                toString = (equals + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                return map3;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th4);
            return new HashMap();
        }
    }

    public final void getRevenue(String str) {
        equals = (toString + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.component2 = str;
        int i13 = equals + 39;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMediationNetwork(com.appsflyer.internal.AFd1pSDK r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.getMediationNetwork(com.appsflyer.internal.AFd1pSDK):java.lang.String");
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        int i13 = equals + 95;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = i13 % 2;
        String str = aFg1qSDK.component2;
        if (i14 != 0) {
            int i15 = 65 / 0;
        }
        return str;
    }

    public final Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        AFd1mSDK aFd1mSDK = new AFd1mSDK(map, this.getMediationNetwork.getMonetizationNetwork);
        equals = (toString + 27) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return aFd1mSDK;
    }

    public final void getRevenue(boolean z13) {
        equals = (toString + 17) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        this.component3 = z13;
        toString = (equals + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public final boolean AFAdRevenueData() {
        int i13 = equals + 35;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 != 0) {
            int i14 = 99 / 0;
            if (!this.AFAdRevenueData) {
                return false;
            }
        } else if (!this.AFAdRevenueData) {
            return false;
        }
        if (component3()) {
            return false;
        }
        int i15 = toString + 79;
        equals = i15 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return i15 % 2 != 0;
    }

    private long AFAdRevenueData(AFd1nSDK aFd1nSDK) {
        return ((Long) AFAdRevenueData(new Object[]{this, aFd1nSDK}, -1271825328, 1271825330, System.identityHashCode(this))).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if ((!com.appsflyer.internal.AFb1tSDK.getRevenue(r4)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (com.appsflyer.internal.AFb1tSDK.getRevenue(r4) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean getCurrencyIso4217Code(android.content.Context r4) {
        /*
            int r0 = com.appsflyer.internal.AFg1qSDK.toString
            int r0 = r0 + 29
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.equals = r1
            int r0 = r0 % 2
            r1 = 1
            java.lang.String r2 = "collectAndroidIdForceByUser"
            r3 = 0
            if (r0 != 0) goto L1b
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 != 0) goto L5f
            goto L25
        L1b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 != 0) goto L5f
        L25:
            int r0 = com.appsflyer.internal.AFg1qSDK.toString
            int r0 = r0 + 3
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.equals = r0
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L3a
            goto L5f
        L3a:
            int r0 = com.appsflyer.internal.AFg1qSDK.toString
            int r0 = r0 + 65
            int r2 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.equals = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L54
            com.appsflyer.internal.AFb1tSDK.getCurrencyIso4217Code()
            boolean r4 = com.appsflyer.internal.AFb1tSDK.getRevenue(r4)
            r0 = 29
            int r0 = r0 / r3
            r4 = r4 ^ r1
            if (r4 == 0) goto L5e
            goto L5f
        L54:
            com.appsflyer.internal.AFb1tSDK.getCurrencyIso4217Code()
            boolean r4 = com.appsflyer.internal.AFb1tSDK.getRevenue(r4)
            if (r4 != 0) goto L5e
            goto L5f
        L5e:
            return r3
        L5f:
            int r4 = com.appsflyer.internal.AFg1qSDK.equals
            int r4 = r4 + 103
            int r4 = r4 % 128
            com.appsflyer.internal.AFg1qSDK.toString = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.getCurrencyIso4217Code(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
    
        r0 = r6.getRevenue("com.appsflyer.security.uuid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002d, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r0) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002f, code lost:
    
        r0 = com.appsflyer.internal.AFd1nSDK.getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0033, code lost:
    
        r6.AFAdRevenueData = r0.substring(0, 8);
        com.appsflyer.internal.AFg1qSDK.toString = (com.appsflyer.internal.AFg1qSDK.equals + 63) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0021, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r6.AFAdRevenueData) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r6.AFAdRevenueData) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void getRevenue(java.util.Map<java.lang.String, java.lang.Object> r5, com.appsflyer.internal.AFd1nSDK r6) {
        /*
            int r0 = com.appsflyer.internal.AFg1qSDK.equals
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.toString = r1
            int r0 = r0 % 2
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L1b
            java.lang.String r0 = r6.AFAdRevenueData
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r0)
            r3 = 9
            int r3 = r3 / r2
            if (r0 == 0) goto L41
            goto L23
        L1b:
            java.lang.String r0 = r6.AFAdRevenueData
            boolean r0 = com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r0)
            if (r0 == 0) goto L41
        L23:
            java.lang.String r0 = "com.appsflyer.security.uuid"
            java.lang.String r0 = r6.getRevenue(r0)
            boolean r3 = com.appsflyer.internal.AFc1sSDK.getMonetizationNetwork(r0)
            if (r3 == 0) goto L33
            java.lang.String r0 = com.appsflyer.internal.AFd1nSDK.getRevenue()
        L33:
            java.lang.String r0 = r0.substring(r2, r1)
            r6.AFAdRevenueData = r0
            int r0 = com.appsflyer.internal.AFg1qSDK.equals
            int r0 = r0 + 63
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1qSDK.toString = r0
        L41:
            java.lang.String r6 = r6.AFAdRevenueData
            java.lang.String r0 = "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            int r3 = android.view.ViewConfiguration.getScrollBarSize()     // Catch: java.lang.Exception -> L8a
            int r1 = r3 >> 8
            int r1 = r1 + 127
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L8a
            r4 = 0
            a(r0, r4, r4, r1, r3)     // Catch: java.lang.Exception -> L8a
            r0 = r3[r2]     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L8a
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L8a
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L8a
            char[] r6 = r6.toCharArray()     // Catch: java.lang.Exception -> L8a
            r3 = 94
            long r0 = r0 % r3
            int r0 = (int) r0     // Catch: java.lang.Exception -> L8a
            int r0 = r0 + 33
        L72:
            int r1 = r6.length     // Catch: java.lang.Exception -> L8a
            if (r2 >= r1) goto L95
            int r1 = com.appsflyer.internal.AFg1qSDK.equals
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.appsflyer.internal.AFg1qSDK.toString = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L8c
            char r1 = r6[r2]     // Catch: java.lang.Exception -> L8a
            r1 = r1 ^ r0
            char r1 = (char) r1     // Catch: java.lang.Exception -> L8a
            r6[r2] = r1     // Catch: java.lang.Exception -> L8a
            int r2 = r2 + 58
            goto L72
        L8a:
            r5 = move-exception
            goto La0
        L8c:
            char r1 = r6[r2]     // Catch: java.lang.Exception -> L8a
            r1 = r1 ^ r0
            char r1 = (char) r1     // Catch: java.lang.Exception -> L8a
            r6[r2] = r1     // Catch: java.lang.Exception -> L8a
            int r2 = r2 + 1
            goto L72
        L95:
            java.lang.String r0 = "sbid"
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L8a
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8a
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L8a
            return
        La0:
            com.appsflyer.AFLogger r6 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1sSDK r0 = com.appsflyer.internal.AFh1sSDK.GENERAL
            java.lang.String r1 = "Exception occurred while generating sbid "
            r6.e(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1qSDK.getRevenue(java.util.Map, com.appsflyer.internal.AFd1nSDK):void");
    }

    public static void getMonetizationNetwork(AFa1rSDK aFa1rSDK) {
        try {
            new AFb1sSDK(aFa1rSDK).afInfoLog();
            int i13 = toString + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
            equals = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (Exception e13) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e13);
        }
    }

    @NonNull
    public final Map<String, Object> getMonetizationNetwork() {
        HashMap hashMap = new HashMap();
        if (component3()) {
            equals = (toString + 49) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            hashMap.put("lvl", this.getRevenue);
        } else if (this.AFAdRevenueData) {
            this.getRevenue = new HashMap();
            component1();
            this.getRevenue.put("error", "pending LVL response");
            hashMap.put("lvl", this.getRevenue);
        }
        equals = (toString + 43) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return hashMap;
    }

    public final String getCurrencyIso4217Code() {
        return (String) AFAdRevenueData(new Object[]{this}, 1235496603, -1235496602, System.identityHashCode(this));
    }

    public final void getMonetizationNetwork(AFd1nSDK aFd1nSDK) {
        this.getCurrencyIso4217Code = System.currentTimeMillis();
        this.AFAdRevenueData = this.getMonetizationNetwork.getCurrencyIso4217Code(((Long) AFAdRevenueData(new Object[]{this, aFd1nSDK}, -1271825328, 1271825330, System.identityHashCode(this))).longValue(), this.getMediationNetwork.getMonetizationNetwork, new AFg1nSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFg1qSDK.2
            public AnonymousClass2() {
            }

            @Override // com.appsflyer.internal.AFg1nSDK.AFa1ySDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFg1qSDK.this.getRevenue = new ConcurrentHashMap();
                AFg1qSDK.this.getRevenue.put("signedData", str);
                AFg1qSDK.this.getRevenue.put("signature", str2);
                AFg1qSDK.this.component1();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFg1nSDK.AFa1ySDK
            public final void getMediationNetwork(String str, Exception exc) {
                AFg1qSDK.this.getRevenue = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFg1qSDK.this.component1();
                AFg1qSDK.this.getRevenue.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        equals = (toString + 29) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[0];
        AFd1nSDK aFd1nSDK = (AFd1nSDK) objArr[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AFb1iSDK.getMediationNetwork(aFd1nSDK.getRevenue, aFd1nSDK.getCurrencyIso4217Code));
        sb3.append(aFg1qSDK.component2());
        long monetizationNetwork = AFb1mSDK.getMonetizationNetwork(sb3.toString());
        int i13 = equals + 21;
        toString = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            return Long.valueOf(monetizationNetwork);
        }
        int i14 = 65 / 0;
        return Long.valueOf(monetizationNetwork);
    }

    public final boolean getRevenue() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -185886874, 185886874, System.identityHashCode(this))).booleanValue();
    }
}
