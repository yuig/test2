package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public final class AFg1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFAdRevenueData = null;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int getCurrencyIso4217Code;
    private static short[] getMediationNetwork;
    private static int getMonetizationNetwork;
    private static int getRevenue;

    static {
        getMonetizationNetwork();
        ExpandableListView.getPackedPositionForGroup(0);
        Process.getGidForName("");
        MotionEvent.axisFromString("");
        SystemClock.elapsedRealtime();
        Color.red(0);
        int i13 = component2 + 53;
        component4 = i13 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    private static void a(byte b13, short s13, int i13, int i14, int i15, Object[] objArr) {
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        StringBuilder sb3 = new StringBuilder();
        int i16 = ((int) (getMonetizationNetwork ^ 6890078025477362053L)) + i13;
        int i17 = i16 == -1 ? 1 : 0;
        if (i17 != 0) {
            $11 = ($10 + 85) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            byte[] bArr = AFAdRevenueData;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i18 = 0; i18 < length; i18++) {
                    $11 = ($10 + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    bArr2[i18] = (byte) (bArr[i18] ^ 6890078025477362053L);
                }
                bArr = bArr2;
            }
            i16 = bArr != null ? (byte) (((byte) (AFAdRevenueData[i14 + ((int) (getRevenue ^ 6890078025477362053L))] ^ 6890078025477362053L)) + ((int) (getMonetizationNetwork ^ 6890078025477362053L))) : (short) (((short) (getMediationNetwork[i14 + ((int) (getRevenue ^ 6890078025477362053L))] ^ 6890078025477362053L)) + ((int) (getMonetizationNetwork ^ 6890078025477362053L)));
        }
        if (i16 > 0) {
            aFk1lSDK.getMonetizationNetwork = ((i14 + i16) - 2) + ((int) (getRevenue ^ 6890078025477362053L)) + i17;
            char c13 = (char) (i15 + ((int) (getCurrencyIso4217Code ^ 6890078025477362053L)));
            aFk1lSDK.getRevenue = c13;
            sb3.append(c13);
            aFk1lSDK.AFAdRevenueData = aFk1lSDK.getRevenue;
            byte[] bArr3 = AFAdRevenueData;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    bArr4[i19] = (byte) (bArr3[i19] ^ 6890078025477362053L);
                }
                $10 = ($11 + 39) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                bArr3 = bArr4;
            }
            boolean z13 = bArr3 != null;
            aFk1lSDK.getMediationNetwork = 1;
            while (aFk1lSDK.getMediationNetwork < i16) {
                if (z13) {
                    $10 = ($11 + 53) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    byte[] bArr5 = AFAdRevenueData;
                    aFk1lSDK.getMonetizationNetwork = aFk1lSDK.getMonetizationNetwork - 1;
                    aFk1lSDK.getRevenue = (char) (aFk1lSDK.AFAdRevenueData + (((byte) (((byte) (bArr5[r9] ^ 6890078025477362053L)) + s13)) ^ b13));
                } else {
                    short[] sArr = getMediationNetwork;
                    aFk1lSDK.getMonetizationNetwork = aFk1lSDK.getMonetizationNetwork - 1;
                    aFk1lSDK.getRevenue = (char) (aFk1lSDK.AFAdRevenueData + (((short) (((short) (sArr[r9] ^ 6890078025477362053L)) + s13)) ^ b13));
                }
                sb3.append(aFk1lSDK.getRevenue);
                aFk1lSDK.AFAdRevenueData = aFk1lSDK.getRevenue;
                aFk1lSDK.getMediationNetwork++;
                $10 = ($11 + 71) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            }
        }
        objArr[0] = sb3.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r6.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r6.length() < 127) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        return r6.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        com.appsflyer.internal.AFg1uSDK.component2 = (com.appsflyer.internal.AFg1uSDK.component4 + 43) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getMediationNetwork(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            int r0 = com.appsflyer.internal.AFg1uSDK.component2
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFg1uSDK.component4 = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = "\u2063"
            java.lang.String r4 = ""
            if (r0 != 0) goto L32
            java.lang.String[] r0 = new java.lang.String[r1]
            r5 = 1
            r0[r5] = r7
            r0[r5] = r8
            r7 = 3
            r0[r7] = r9
            r0[r1] = r10
            r7 = 5
            r0[r7] = r4
            java.lang.String r7 = android.text.TextUtils.join(r3, r0)
            java.lang.String r6 = com.appsflyer.internal.AFb1mSDK.getRevenue(r7, r6)
            int r7 = r6.length()
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 >= r8) goto L4d
            goto L44
        L32:
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r4}
            java.lang.String r7 = android.text.TextUtils.join(r3, r7)
            java.lang.String r6 = com.appsflyer.internal.AFb1mSDK.getRevenue(r7, r6)
            int r7 = r6.length()
            if (r7 >= r2) goto L4d
        L44:
            int r7 = com.appsflyer.internal.AFg1uSDK.component4
            int r7 = r7 + 43
            int r7 = r7 % 128
            com.appsflyer.internal.AFg1uSDK.component2 = r7
            return r6
        L4d:
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1uSDK.getMediationNetwork(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    @NonNull
    private static AFi1kSDK getMonetizationNetwork(@NonNull AFi1qSDK aFi1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1kSDK(aFi1qSDK.AFAdRevenueData == AFi1ySDK.DEFAULT, AFi1pSDK.NA);
        }
        String str4 = "";
        Object[] objArr = new Object[1];
        a((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 94), TextUtils.indexOf("", "", 0, 0) + 62, TextUtils.lastIndexOf("", '0', 0) + 431480849, (-307599361) + Color.blue(0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1qSDK.AFAdRevenueData == AFi1ySDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = intern;
        }
        boolean equals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1qSDK.getRevenue, "android", "v1", str4).equals(str);
        return new AFi1kSDK(equals, equals ? AFi1pSDK.SUCCESS : AFi1pSDK.FAILURE);
    }

    @NonNull
    public final AFi1kSDK getCurrencyIso4217Code(@NonNull AFi1qSDK aFi1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i13 = component4;
        int i14 = i13 + RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL;
        int i15 = i14 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        component2 = i15;
        if (i14 % 2 != 0) {
            throw null;
        }
        if (aFi1qSDK == null || str2 == null || str3 == null) {
            component4 = (i15 + 27) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            return new AFi1kSDK(false, AFi1pSDK.INTERNAL_ERROR);
        }
        component2 = (i13 + 11) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        return getMonetizationNetwork(aFi1qSDK, str, str2, str3);
    }

    public static void getMonetizationNetwork() {
        getRevenue = -1727689099;
        getMonetizationNetwork = 2135789959;
        getCurrencyIso4217Code = 1830291889;
        AFAdRevenueData = new byte[]{30, -82, -82, -82, 10, -92, 19, 23, -82, -94, 21, 21, 17, -82, -88, 10, 20, 11, -93, -89, 25, -91, 30, -82, 11, -95, 18, 11, -82, -82, 21, 16, -87, 11, -88, -101, 5, 17, -87, -87, 17, -94, 22, -88, 20, -81, 17, 21, -81, 21, 11, -84, 11, -81, 23, -88, -82, 20, 10, 21, -87, 17, 21, -123};
    }
}
