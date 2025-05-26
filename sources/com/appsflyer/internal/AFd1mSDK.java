package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1mSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int component1 = 1;
    private static int getCurrencyIso4217Code;
    private static long getRevenue;
    private final Map<String, Object> getMediationNetwork;
    private final Context getMonetizationNetwork;

    public static class AFa1tSDK {
        public static byte[] getMonetizationNetwork(@NonNull byte[] bArr) {
            for (int i13 = 0; i13 < bArr.length; i13++) {
                bArr[i13] = (byte) (bArr[i13] ^ ((i13 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] getRevenue(@NonNull String str) {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        getMonetizationNetwork();
        KeyEvent.getMaxKeyCode();
        View.MeasureSpec.getMode(0);
        View.getDefaultSize(0, 0);
        Color.blue(0);
        Color.rgb(0, 0, 0);
        ViewConfiguration.getScrollBarFadeDuration();
        MotionEvent.axisFromString("");
        component1 = (getCurrencyIso4217Code + 31) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public AFd1mSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getMonetizationNetwork = context;
        put(AFAdRevenueData(), getCurrencyIso4217Code());
    }

    @NonNull
    private String AFAdRevenueData() {
        component1 = (getCurrencyIso4217Code + 25) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("꺎껯菠Ŝ\ue3b7\ue65c嗻ꖏ\udd01ා\uf725亄렪ᨫ蝹䈯", TextUtils.getOffsetBefore("", 0), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a("䈿䉝\ue686搮쾮쩻瑩䤳煎", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                getCurrencyIso4217Code = (component1 + 69) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                Object[] objArr3 = new Object[1];
                b("涪⦼\ue595ꇣ緪㧖\uf520넁", TextUtils.getOffsetBefore("", 0) + 17431, objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb3 = new StringBuilder(obj);
            sb3.reverse();
            StringBuilder monetizationNetwork = getMonetizationNetwork(num, obj2, sb3.toString());
            int length = monetizationNetwork.length();
            if (length > 4) {
                getCurrencyIso4217Code = (component1 + 59) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                monetizationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    component1 = (getCurrencyIso4217Code + 75) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    length++;
                    monetizationNetwork.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b("涏㤐쒠", 21648 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
            monetizationNetwork.insert(0, ((String) objArr4[0]).intern());
            return monetizationNetwork.toString();
        } catch (Exception e13) {
            Object[] objArr5 = new Object[1];
            a("㾩㾉듁㙼㉽㞬\ude33㒗囉㪱⛻앚⤀ⵋ⭎짶᷸ᆿဥﱫሩӜҝ\ue089ۄདॱ霫箰珥緯騗瀚昖扆躏撂檾圡딧奶崪宄릗", KeyEvent.getMaxKeyCode() >> 16, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e13);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b("涂ꓖＫ㙱䣍茟\uda36\uecc6✙繡낿쬇ɡ咧漇ꙗ\uf8b3㍇䩙鲨\ud7fe\uee0b₭篴뉕쓟´噌梄ꏫ奄ಌ䟼鸴킇\uebcd∼畲这옯ᤦ厏", Gravity.getAbsoluteGravity(0, 0) + 51539, objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e13);
            AFLogger.afRDLog(sb4.toString());
            Object[] objArr7 = new Object[1];
            b("涏\udb60@䥾뙙ﾸ⒛", View.MeasureSpec.getMode(0) + 46817, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        r12 = r12.toCharArray();
        com.appsflyer.internal.AFd1mSDK.$10 = (com.appsflyer.internal.AFd1mSDK.$11 + 51) % com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0013, code lost:
    
        if (r12 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r12 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r12, int r13, java.lang.Object[] r14) {
        /*
            int r0 = com.appsflyer.internal.AFd1mSDK.$10
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1mSDK.$11 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L13
            r0 = 39
            int r0 = r0 / r1
            if (r12 == 0) goto L21
            goto L15
        L13:
            if (r12 == 0) goto L21
        L15:
            char[] r12 = r12.toCharArray()
            int r0 = com.appsflyer.internal.AFd1mSDK.$11
            int r0 = r0 + 51
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r0
        L21:
            char[] r12 = (char[]) r12
            com.appsflyer.internal.AFk1gSDK r0 = new com.appsflyer.internal.AFk1gSDK
            r0.<init>()
            long r2 = com.appsflyer.internal.AFd1mSDK.getRevenue
            r4 = -6370451918771887178(0xa7979bbb62e563b6, double:-5.851226898170657E-118)
            long r2 = r2 ^ r4
            char[] r12 = com.appsflyer.internal.AFk1gSDK.getMediationNetwork(r2, r12, r13)
            r13 = 4
            r0.AFAdRevenueData = r13
        L37:
            int r2 = r0.AFAdRevenueData
            int r3 = r12.length
            if (r2 >= r3) goto L5f
            int r3 = com.appsflyer.internal.AFd1mSDK.$10
            int r3 = r3 + 75
            int r3 = r3 % 128
            com.appsflyer.internal.AFd1mSDK.$11 = r3
            int r3 = r2 + (-4)
            r0.getCurrencyIso4217Code = r3
            char r6 = r12[r2]
            int r7 = r2 % 4
            char r7 = r12[r7]
            r6 = r6 ^ r7
            long r6 = (long) r6
            long r8 = (long) r3
            long r10 = com.appsflyer.internal.AFd1mSDK.getRevenue
            long r10 = r10 ^ r4
            long r8 = r8 * r10
            long r6 = r6 ^ r8
            int r3 = (int) r6
            char r3 = (char) r3
            r12[r2] = r3
            int r2 = r2 + 1
            r0.AFAdRevenueData = r2
            goto L37
        L5f:
            java.lang.String r0 = new java.lang.String
            int r2 = r12.length
            int r2 = r2 - r13
            r0.<init>(r12, r13, r2)
            r14[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.a(java.lang.String, int, java.lang.Object[]):void");
    }

    private static void b(String str, int i13, Object[] objArr) {
        int i14;
        char[] cArr = str;
        if (str != null) {
            $10 = ($11 + RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        aFk1oSDK.getMonetizationNetwork = i13;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1oSDK.AFAdRevenueData = 0;
        while (true) {
            int i15 = aFk1oSDK.AFAdRevenueData;
            if (i15 >= cArr2.length) {
                break;
            }
            jArr[i15] = (cArr2[i15] ^ (i15 * aFk1oSDK.getMonetizationNetwork)) ^ (AFAdRevenueData ^ (-4329747452237546172L));
            aFk1oSDK.AFAdRevenueData = i15 + 1;
        }
        char[] cArr3 = new char[length];
        aFk1oSDK.AFAdRevenueData = 0;
        while (true) {
            int i16 = aFk1oSDK.AFAdRevenueData;
            if (i16 >= cArr2.length) {
                break;
            }
            int i17 = $11 + 53;
            $10 = i17 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            if (i17 % 2 != 0) {
                cArr3[i16] = (char) jArr[i16];
                i14 = i16 / 0;
            } else {
                cArr3[i16] = (char) jArr[i16];
                i14 = i16 + 1;
            }
            aFk1oSDK.AFAdRevenueData = i14;
        }
        String str2 = new String(cArr3);
        int i18 = $11 + 93;
        $10 = i18 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i18 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x024f A[Catch: Exception -> 0x0155, TRY_LEAVE, TryCatch #2 {Exception -> 0x0155, blocks: (B:6:0x010a, B:8:0x012f, B:10:0x0158, B:13:0x016a, B:18:0x0194, B:20:0x024f, B:24:0x0269, B:26:0x026f, B:29:0x0273, B:36:0x0277, B:39:0x0285), top: B:5:0x010a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getCurrencyIso4217Code() {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.getCurrencyIso4217Code():java.lang.String");
    }

    private static StringBuilder getMonetizationNetwork(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i13 = 0; i13 < 3; i13++) {
            arrayList.add(Integer.valueOf(strArr[i13].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb3 = new StringBuilder();
        getCurrencyIso4217Code = (component1 + 37) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        int i14 = 0;
        while (true) {
            Integer num = null;
            if (i14 >= intValue) {
                break;
            }
            component1 = (getCurrencyIso4217Code + 85) % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            for (int i15 = 0; i15 < 3; i15++) {
                int charAt = strArr[i15].charAt(i14);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb3.append(Integer.toHexString(num.intValue()));
            i14++;
        }
        int i16 = component1 + 13;
        getCurrencyIso4217Code = i16 % RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        if (i16 % 2 == 0) {
            return sb3;
        }
        throw null;
    }

    public static void getMonetizationNetwork() {
        getRevenue = -6945246941356236436L;
        AFAdRevenueData = 2930684496868610208L;
    }
}
