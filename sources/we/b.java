package we;

import android.os.Bundle;
import com.bugsnag.android.a0;
import df.c0;
import df.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f129236a = new b();

    static {
        Intrinsics.checkNotNullExpressionValue(f.class.getSimpleName(), "RemoteServiceWrapper::class.java.simpleName");
    }

    public static final Bundle a(c eventType, String applicationId, List appEvents) {
        if (p001if.a.b(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", applicationId);
            if (c.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b13 = f129236a.b(applicationId, appEvents);
                if (b13.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b13.toString());
            }
            return bundle;
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList H0 = CollectionsKt.H0(list);
            re.b.b(H0);
            boolean z13 = false;
            if (!p001if.a.b(this)) {
                try {
                    c0 f13 = e0.f(str, false);
                    if (f13 != null) {
                        z13 = f13.f54724a;
                    }
                } catch (Throwable th3) {
                    p001if.a.a(this, th3);
                }
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                me.e eVar = (me.e) it.next();
                String str2 = eVar.f86984e;
                JSONObject jSONObject = eVar.f86980a;
                if (str2 != null) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    if (!Intrinsics.d(a0.m(jSONObject2), str2)) {
                        Intrinsics.n(eVar, "Event with invalid checksum: ");
                        v vVar = v.f83104a;
                    }
                }
                boolean z14 = eVar.f86981b;
                if ((!z14) || (z14 && z13)) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }
}
