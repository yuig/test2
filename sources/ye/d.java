package ye;

import android.app.Activity;
import df.c0;
import df.e0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONArray;
import org.json.JSONObject;
import v.h;
import ve.g;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f138825a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f138826b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f138827c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f138828d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (p001if.a.b(d.class)) {
                return;
            }
            try {
                v.d().execute(new h(13));
            } catch (Throwable th3) {
                p001if.a.a(d.class, th3);
            }
        }
    }

    public static final void d(Activity activity) {
        if (p001if.a.b(d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f138826b.get() && !p001if.a.b(a.class)) {
                    try {
                        if (a.f138818f) {
                            if (f138827c.isEmpty()) {
                                if (!f138828d.isEmpty()) {
                                }
                            }
                            e.f138829d.r(activity);
                            return;
                        }
                    } catch (Throwable th3) {
                        p001if.a.a(a.class, th3);
                    }
                }
                me.f fVar = e.f138829d;
                me.f.s(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th4) {
            p001if.a.a(d.class, th4);
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
            if (f13 == null || (str = f13.f54737n) == null) {
                return;
            }
            c(str);
            if (!(!f138827c.isEmpty()) && !(!f138828d.isEmpty())) {
                return;
            }
            g gVar = g.f125671a;
            File d2 = g.d(ve.d.MTML_APP_EVENT_PREDICTION);
            if (d2 == null) {
                return;
            }
            a.d(d2);
            WeakReference weakReference = ue.b.f121948k;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final void c(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i13 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    LinkedHashSet linkedHashSet = f138827c;
                    String string = jSONArray2.getString(i14);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                    if (i15 >= length2) {
                        break;
                    } else {
                        i14 = i15;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i16 = i13 + 1;
                LinkedHashSet linkedHashSet2 = f138828d;
                String string2 = jSONArray.getString(i13);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                linkedHashSet2.add(string2);
                if (i16 >= length) {
                    return;
                } else {
                    i13 = i16;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
