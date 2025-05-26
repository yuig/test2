package xe;

import android.util.Log;
import df.c0;
import df.e0;
import df.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f134645b;

    /* renamed from: a, reason: collision with root package name */
    public static final b f134644a = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f134646c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f134647d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            try {
                Iterator it = new ArrayList(f134646c).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar != null && Intrinsics.d(str, aVar.f134642a)) {
                        for (String str3 : aVar.f134643b.keySet()) {
                            if (Intrinsics.d(str2, str3)) {
                                return (String) aVar.f134643b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e13) {
                Log.w("xe.b", "getMatchedRuleType failed", e13);
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void b() {
        String str;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            e0 e0Var = e0.f54743a;
            c0 f13 = e0.f(v.b(), false);
            if (f13 != null && (str = f13.f54738o) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                ArrayList arrayList = f134646c;
                arrayList.clear();
                CopyOnWriteArraySet copyOnWriteArraySet = f134647d;
                copyOnWriteArraySet.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String eventName = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(eventName);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(eventName, "key");
                        HashMap restrictiveParams = new HashMap();
                        Intrinsics.checkNotNullParameter(eventName, "eventName");
                        Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
                        a aVar = new a();
                        aVar.f134642a = eventName;
                        aVar.f134643b = restrictiveParams;
                        if (optJSONObject != null) {
                            aVar.b(j1.D(optJSONObject));
                            arrayList.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(aVar.a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
