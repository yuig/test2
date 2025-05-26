package se;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import le.v;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f112365b;

    /* renamed from: a, reason: collision with root package name */
    public static final i f112364a = new i();

    /* renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArraySet f112366c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f112367d = new ConcurrentHashMap();

    public static final boolean d() {
        if (p001if.a.b(i.class)) {
            return false;
        }
        try {
            f112364a.f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f112365b;
            if (sharedPreferences == null) {
                Intrinsics.r("sharedPreferences");
                throw null;
            }
            long j13 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j13 != 0 && currentTimeMillis - j13 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f112365b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            Intrinsics.r("sharedPreferences");
            throw null;
        } catch (Throwable th3) {
            p001if.a.a(i.class, th3);
            return false;
        }
    }

    public static final void e(ConcurrentHashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (p001if.a.b(i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            i iVar = f112364a;
            iVar.f();
            LinkedHashMap c13 = iVar.c(iVar.a(purchaseDetailsMap), skuDetailsMap);
            if (p001if.a.b(iVar)) {
                return;
            }
            try {
                for (Map.Entry entry : c13.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str != null && str2 != null) {
                        ue.g.b(str, str2, false);
                    }
                }
            } catch (Throwable th3) {
                p001if.a.a(iVar, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(i.class, th4);
        }
    }

    public final HashMap a(ConcurrentHashMap purchaseDetailsMap) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = z0.n(purchaseDetailsMap).entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                copyOnWriteArraySet = f112366c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f112367d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append((Object) string);
                            sb3.append(';');
                            sb3.append(currentTimeMillis);
                            copyOnWriteArraySet.add(sb3.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f112365b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.r("sharedPreferences");
            throw null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f112365b;
            if (sharedPreferences == null) {
                Intrinsics.r("sharedPreferences");
                throw null;
            }
            long j13 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j13 == 0) {
                SharedPreferences sharedPreferences2 = f112365b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                    return;
                } else {
                    Intrinsics.r("sharedPreferences");
                    throw null;
                }
            }
            if (currentTimeMillis - j13 > 604800) {
                ConcurrentHashMap concurrentHashMap = f112367d;
                Iterator it = z0.n(concurrentHashMap).entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    copyOnWriteArraySet = f112366c;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        copyOnWriteArraySet.remove(str + ';' + longValue);
                        concurrentHashMap.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f112365b;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else {
                    Intrinsics.r("sharedPreferences");
                    throw null;
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final LinkedHashMap c(HashMap purchaseDetailsMap, ConcurrentHashMap skuDetailsMap) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void f() {
        List split$default;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = v.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = v.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = v.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f112365b = sharedPreferences3;
            CopyOnWriteArraySet copyOnWriteArraySet = f112366c;
            if (sharedPreferences3 == null) {
                Intrinsics.r("sharedPreferences");
                throw null;
            }
            Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, null);
                f112367d.put(split$default.get(0), Long.valueOf(Long.parseLong((String) split$default.get(1))));
            }
            b();
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
