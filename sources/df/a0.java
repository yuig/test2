package df;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f54697a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f54698b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f54699c;

    /* renamed from: d, reason: collision with root package name */
    public static Long f54700d;

    /* renamed from: e, reason: collision with root package name */
    public static f5.o f54701e;

    static {
        kotlin.jvm.internal.k0.f80436a.b(a0.class).f();
        f54697a = new AtomicBoolean(false);
        f54698b = new ConcurrentLinkedQueue();
        f54699c = new ConcurrentHashMap();
    }

    public static JSONObject a() {
        Bundle a13 = n60.o.a("platform", "android");
        le.v vVar = le.v.f83104a;
        a13.putString("sdk_version", "15.0.2");
        a13.putString("fields", "gatekeepers");
        String str = le.a0.f83002j;
        le.a0 A = wc.b.A(null, t3.s1.d(new Object[]{"mobile_sdk_gk"}, 1, "app/%s", "java.lang.String.format(format, *args)"), null);
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        A.f83009d = a13;
        JSONObject jSONObject = A.d().f83047d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String name, String appId, boolean z13) {
        HashMap hashMap;
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList<ef.a> arrayList = null;
        c(null);
        ConcurrentHashMap concurrentHashMap = f54699c;
        if (concurrentHashMap.containsKey(appId)) {
            f5.o oVar = f54701e;
            if (oVar != null) {
                Intrinsics.checkNotNullParameter(appId, "appId");
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) oVar.f61105a.get(appId);
                if (concurrentHashMap2 != null) {
                    arrayList = new ArrayList(concurrentHashMap2.size());
                    Iterator it = concurrentHashMap2.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((ef.a) ((Map.Entry) it.next()).getValue());
                    }
                }
            }
            if (arrayList != null) {
                hashMap = new HashMap();
                for (ef.a aVar : arrayList) {
                    hashMap.put(aVar.f58826a, Boolean.valueOf(aVar.f58827b));
                }
            } else {
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) concurrentHashMap.get(appId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                f5.o oVar2 = f54701e;
                if (oVar2 == null) {
                    oVar2 = new f5.o(1);
                }
                ArrayList gateKeeperList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    gateKeeperList.add(new ef.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                Intrinsics.checkNotNullParameter(appId, "appId");
                Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
                ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                Iterator it2 = gateKeeperList.iterator();
                while (it2.hasNext()) {
                    ef.a aVar2 = (ef.a) it2.next();
                    concurrentHashMap3.put(aVar2.f58826a, aVar2);
                }
                oVar2.f61105a.put(appId, concurrentHashMap3);
                f54701e = oVar2;
                hashMap = hashMap2;
            }
        } else {
            hashMap = new HashMap();
        }
        return (hashMap.containsKey(name) && (bool = (Boolean) hashMap.get(name)) != null) ? bool.booleanValue() : z13;
    }

    public static final synchronized void c(x xVar) {
        synchronized (a0.class) {
            if (xVar != null) {
                try {
                    f54698b.add(xVar);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            String b13 = le.v.b();
            Long l13 = f54700d;
            if (l13 != null && System.currentTimeMillis() - l13.longValue() < 3600000 && f54699c.containsKey(b13)) {
                e();
                return;
            }
            Context a13 = le.v.a();
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{b13}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            JSONObject jSONObject = null;
            String string = a13.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!j1.V0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    le.v vVar = le.v.f83104a;
                }
                if (jSONObject != null) {
                    d(b13, jSONObject);
                }
            }
            Executor d2 = le.v.d();
            if (f54697a.compareAndSet(false, true)) {
                d2.execute(new z(b13, a13, format));
            }
        }
    }

    public static final synchronized JSONObject d(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (a0.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                jSONObject2 = (JSONObject) f54699c.get(applicationId);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                int i13 = 0;
                JSONObject optJSONObject = optJSONArray == null ? null : optJSONArray.optJSONObject(0);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i14 = i13 + 1;
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                            jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                        } catch (JSONException unused) {
                            le.v vVar = le.v.f83104a;
                        }
                        if (i14 >= length) {
                            break;
                        }
                        i13 = i14;
                    }
                }
                f54699c.put(applicationId, jSONObject2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return jSONObject2;
    }

    public static void e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f54698b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            x xVar = (x) concurrentLinkedQueue.poll();
            if (xVar != null) {
                handler.post(new androidx.activity.d(xVar, 19));
            }
        }
    }
}
