package se;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import le.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f112358a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f112359b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f112360c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f112361d = v.a().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f112362e = v.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f112363f = v.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final void a() {
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f112362e;
            long j13 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j13 == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j13 > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public static final ArrayList g(Context context, Object obj) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            h hVar = f112358a;
            return hVar.b(hVar.f(context, obj, "inapp"));
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final LinkedHashMap h(Context context, ArrayList skuList, Object obj, boolean z13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            h hVar = f112358a;
            LinkedHashMap m13 = hVar.m(skuList);
            ArrayList arrayList = new ArrayList();
            Iterator it = skuList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!m13.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            m13.putAll(hVar.i(context, arrayList, obj, z13));
            return m13;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public final ArrayList b(ArrayList arrayList) {
        SharedPreferences sharedPreferences = f112363f;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j13 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j13 / 1000) <= 86400 && !Intrinsics.d(sharedPreferences.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:7:0x000a, B:10:0x0013, B:14:0x0037, B:24:0x0031, B:18:0x001d, B:20:0x0027), top: B:6:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class c(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = p001if.a.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = se.h.f112360c
            java.lang.Object r2 = r0.get(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L13
            return r2
        L13:
            java.lang.Class<se.l> r2 = se.l.class
            boolean r3 = p001if.a.b(r2)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L1d
        L1b:
            r5 = r1
            goto L35
        L1d:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "className"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> L30
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L30
            java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L1b java.lang.Throwable -> L30
            goto L35
        L30:
            r5 = move-exception
            p001if.a.a(r2, r5)     // Catch: java.lang.Throwable -> L3b
            goto L1b
        L35:
            if (r5 == 0) goto L3d
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r5 = move-exception
            goto L3e
        L3d:
            return r5
        L3e:
            p001if.a.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: se.h.c(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method d(Class cls, String str) {
        Class[] clsArr;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            HashMap hashMap = f112359b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class TYPE = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE2 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE3 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE4 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            Method c13 = clsArr == null ? l.c(cls, str, null) : l.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (c13 != null) {
                hashMap.put(str, c13);
            }
            return c13;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final ArrayList e(Context context, Object obj) {
        ArrayList<String> stringArrayList;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (l(context, obj, "inapp")) {
                char c13 = 0;
                String str = null;
                int i13 = 0;
                boolean z13 = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c13] = 6;
                    objArr[1] = f112361d;
                    objArr[2] = "inapp";
                    objArr[3] = str;
                    objArr[4] = new Bundle();
                    Object k13 = k(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (k13 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) k13;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z13 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i13++;
                            }
                            str = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i13 < 30 || str == null || z13) {
                                break;
                                break;
                            }
                            c13 = 0;
                        }
                    }
                    str = null;
                    if (i13 < 30) {
                        break;
                    }
                    c13 = 0;
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:28:0x0064 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList f(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = p001if.a.b(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.l(r13, r14, r15)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L64
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5b
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            r11[r2] = r6     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = se.h.f112361d     // Catch: java.lang.Throwable -> L5b
            r7 = 1
            r11[r7] = r6     // Catch: java.lang.Throwable -> L5b
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L5b
            r11[r5] = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.k(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L5d
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L64
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r13 = move-exception
            goto L65
        L5d:
            r3 = r1
        L5e:
            r5 = 30
            if (r4 >= r5) goto L64
            if (r3 != 0) goto L19
        L64:
            return r0
        L65:
            p001if.a.a(r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: se.h.f(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final LinkedHashMap i(Context context, ArrayList arrayList, Object obj, boolean z13) {
        int size;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i13 = 0;
                objArr[0] = 3;
                objArr[1] = f112361d;
                objArr[2] = z13 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object k13 = k(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (k13 != null) {
                    Bundle bundle2 = (Bundle) k13;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i14 = i13 + 1;
                                Object obj2 = arrayList.get(i13);
                                Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                String str = stringArrayList.get(i13);
                                Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                                if (i14 > size) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                        n(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final boolean j(String skuDetail) {
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return false;
        }
    }

    public final Object k(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method d2;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Class c13 = c(context, str);
            if (c13 == null || (d2 = d(c13, str2)) == null) {
                return null;
            }
            return l.h(c13, obj, d2, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final boolean l(Context context, Object obj, String str) {
        if (p001if.a.b(this) || obj == null) {
            return false;
        }
        try {
            Object k13 = k(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f112361d, str});
            if (k13 != null) {
                return ((Integer) k13).intValue() == 0;
            }
            return false;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return false;
        }
    }

    public final LinkedHashMap m(ArrayList arrayList) {
        List split$default;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f112362e.getString(sku, null);
                if (string != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) split$default.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, split$default.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void n(LinkedHashMap linkedHashMap) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f112362e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
