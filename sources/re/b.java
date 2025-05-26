package re;

import df.c0;
import df.e0;
import df.j1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import me.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f107533b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f107532a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f107534c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f107535d = new HashSet();

    public static final void b(ArrayList events) {
        if (p001if.a.b(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (f107533b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f107535d.contains(((e) it.next()).f86983d)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
        }
    }

    public final synchronized void a() {
        c0 f13;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            e0 e0Var = e0.f54743a;
            f13 = e0.f(v.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return;
        }
        if (f13 == null) {
            return;
        }
        String str = f13.f54738o;
        if (str != null && str.length() > 0) {
            JSONObject jSONObject = new JSONObject(str);
            f107534c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        HashSet hashSet = f107535d;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashSet.add(key);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        ArrayList deprecateParams = new ArrayList();
                        Intrinsics.checkNotNullParameter(key, "eventName");
                        Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
                        a aVar = new a();
                        aVar.f107530a = key;
                        aVar.f107531b = deprecateParams;
                        if (optJSONArray != null) {
                            ArrayList B = j1.B(optJSONArray);
                            Intrinsics.checkNotNullParameter(B, "<set-?>");
                            aVar.f107531b = B;
                        }
                        f107534c.add(aVar);
                    }
                }
            }
        }
    }
}
