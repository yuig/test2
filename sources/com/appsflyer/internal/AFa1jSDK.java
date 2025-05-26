package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFa1lSDK;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1jSDK {
    public static final Object getMonetizationNetwork = new Object() { // from class: com.appsflyer.internal.AFa1jSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getRevenue = Double.valueOf(-0.0d);
    final LinkedHashMap<String, Object> getMediationNetwork;

    public AFa1jSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public static String AFAdRevenueData(Number number) {
        if (number == null) {
            throw new AFa1hSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Map map = AFa1zSDK.unregisterClient;
            Object obj = map.get(-1761357608);
            if (obj == null) {
                obj = ((Class) AFa1zSDK.getMediationNetwork(KeyEvent.keyCodeFromString("") + 37, (Process.myPid() >> 22) + RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, (char) (64965 - KeyEvent.normalizeMetaState(0)))).getDeclaredMethod("getMediationNetwork", Double.TYPE);
                map.put(-1761357608, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).getClass();
            if (number.equals(getRevenue)) {
                return "-0";
            }
            long longValue = number.longValue();
            return doubleValue == ((double) longValue) ? Long.toString(longValue) : number.toString();
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    public static Object getMonetizationNetwork(Object obj) {
        if (obj == null) {
            return getMonetizationNetwork;
        }
        if (((Class) AFa1zSDK.getMediationNetwork((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36, 163 - Color.argb(0, 0, 0, 0), (char) (58996 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)))).isInstance(obj) || (obj instanceof AFa1jSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFa1zSDK.unregisterClient;
                Object obj2 = map.get(1203627246);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1zSDK.getMediationNetwork(View.resolveSize(0, 0) + 36, 163 - ExpandableListView.getPackedPositionGroup(0L), (char) (ExpandableListView.getPackedPositionType(0L) + 58996))).getDeclaredConstructor(String.class);
                    map.put(1203627246, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFa1jSDK(obj.toString());
        }
        if (obj.equals(getMonetizationNetwork)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFa1zSDK.unregisterClient;
                Object obj3 = map2.get(2118033703);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1zSDK.getMediationNetwork(37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58996))).getDeclaredConstructor(Collection.class);
                    map2.put(2118033703, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th4;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFa1zSDK.unregisterClient;
                Object obj4 = map3.get(-500886372);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1zSDK.getMediationNetwork(36 - (KeyEvent.getMaxKeyCode() >> 16), 164 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (58996 - KeyEvent.keyCodeFromString("")))).getDeclaredConstructor(Object.class);
                    map3.put(-500886372, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th5) {
                Throwable cause3 = th5.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th5;
            }
        }
        if (obj instanceof Map) {
            return new AFa1jSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public final AFa1jSDK getMediationNetwork(String str, Object obj) {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1zSDK.unregisterClient;
                Object obj2 = map.get(-1761357608);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1zSDK.getMediationNetwork(36 - TextUtils.lastIndexOf("", '0', 0, 0), 126 - View.resolveSizeAndState(0, 0, 0), (char) (View.MeasureSpec.getSize(0) + 64965))).getMethod("getMediationNetwork", Double.TYPE);
                    map.put(-1761357608, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).getClass();
            } catch (Throwable th3) {
                Throwable cause = th3.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th3;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFa1hSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFa1lSDK aFa1lSDK = new AFa1lSDK();
            getMonetizationNetwork(aFa1lSDK);
            return aFa1lSDK.toString();
        } catch (AFa1hSDK unused) {
            return null;
        }
    }

    public AFa1jSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getMediationNetwork.put(str, getMonetizationNetwork(entry.getValue()));
            } else {
                throw new NullPointerException("key == null");
            }
        }
    }

    public static String getMediationNetwork(String str) {
        if (str != null) {
            return str;
        }
        throw new AFa1hSDK("Names must be non-null");
    }

    private AFa1jSDK(Object obj) {
        try {
            Map map = AFa1zSDK.unregisterClient;
            Object obj2 = map.get(-2084427096);
            if (obj2 == null) {
                obj2 = ((Class) AFa1zSDK.getMediationNetwork((Process.myTid() >> 22) + 36, TextUtils.indexOf((CharSequence) "", '0', 0) + 200, (char) (62784 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))).getDeclaredMethod("getMonetizationNetwork", null);
                map.put(-2084427096, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFa1jSDK) {
                this.getMediationNetwork = ((AFa1jSDK) invoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = map.get(-1763314713);
            if (obj3 == null) {
                obj3 = ((Class) AFa1zSDK.getMediationNetwork(TextUtils.indexOf("", "", 0, 0) + 37, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64964))).getDeclaredMethod("getMonetizationNetwork", Object.class, String.class);
                map.put(-1763314713, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private AFa1jSDK(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4e
            java.util.Map r0 = com.appsflyer.internal.AFa1zSDK.unregisterClient     // Catch: java.lang.Throwable -> L4e
            r1 = 14083489(0xd6e5a1, float:1.9735172E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L14
            goto L44
        L14:
            r2 = 0
            int r3 = android.view.View.combineMeasuredStates(r2, r2)     // Catch: java.lang.Throwable -> L4e
            int r3 = 36 - r3
            java.lang.String r4 = ""
            int r4 = android.text.TextUtils.getCapsMode(r4, r2, r2)     // Catch: java.lang.Throwable -> L4e
            int r4 = r4 + 199
            int r5 = android.graphics.Color.rgb(r2, r2, r2)     // Catch: java.lang.Throwable -> L4e
            r6 = 16840000(0x100f540, float:2.3685845E-38)
            int r5 = r5 + r6
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = com.appsflyer.internal.AFa1zSDK.getMediationNetwork(r3, r4, r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4e
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r2] = r5     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Constructor r2 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4e
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L4e
        L44:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r8 = r2.newInstance(r8)     // Catch: java.lang.Throwable -> L4e
            r7.<init>(r8)
            return
        L4e:
            r8 = move-exception
            java.lang.Throwable r0 = r8.getCause()
            if (r0 == 0) goto L56
            throw r0
        L56:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1jSDK.<init>(java.lang.String):void");
    }

    public final void getMonetizationNetwork(AFa1lSDK aFa1lSDK) {
        aFa1lSDK.getRevenue(AFa1lSDK.AFa1zSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                aFa1lSDK.getRevenue();
                aFa1lSDK.getRevenue(key);
                aFa1lSDK.AFAdRevenueData(entry.getValue());
            } else {
                throw new AFa1hSDK("Names must be non-null");
            }
        }
        aFa1lSDK.getRevenue(AFa1lSDK.AFa1zSDK.EMPTY_OBJECT, AFa1lSDK.AFa1zSDK.NONEMPTY_OBJECT, "}");
    }
}
