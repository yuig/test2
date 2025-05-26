package pe;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.ui.z;
import df.u0;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import le.a0;
import le.e0;
import le.g0;
import le.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final String f99921e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f99922a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f99923b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f99924c;

    /* renamed from: d, reason: collision with root package name */
    public String f99925d;

    static {
        String canonicalName = k.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f99921e = canonicalName;
    }

    public k(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f99923b = new WeakReference(activity);
        this.f99925d = null;
        this.f99922a = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a() {
        if (p001if.a.b(k.class)) {
            return null;
        }
        try {
            return f99921e;
        } catch (Throwable th3) {
            p001if.a.a(k.class, th3);
            return null;
        }
    }

    public final void b(a0 a0Var, String str) {
        String str2 = f99921e;
        if (p001if.a.b(this) || a0Var == null) {
            return;
        }
        try {
            e0 d2 = a0Var.d();
            try {
                JSONObject jSONObject = d2.f83045b;
                if (jSONObject == null) {
                    Log.e(str2, Intrinsics.n(d2.f83046c, "Error sending UI component tree to Facebook: "));
                    return;
                }
                if (Intrinsics.d("true", jSONObject.optString("success"))) {
                    wc.b bVar = u0.f54860d;
                    wc.b.x(g0.APP_EVENTS, str2, "Successfully send UI component tree to server");
                    this.f99925d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z13 = jSONObject.getBoolean("is_app_indexing_enabled");
                    d dVar = d.f99893a;
                    if (p001if.a.b(d.class)) {
                        return;
                    }
                    try {
                        d.f99899g.set(z13);
                    } catch (Throwable th3) {
                        p001if.a.a(d.class, th3);
                    }
                }
            } catch (JSONException e13) {
                Log.e(str2, "Error decoding server response.", e13);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }

    public final void c() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            try {
                v.d().execute(new z(14, this, new j(this, 0)));
            } catch (RejectedExecutionException e13) {
                Log.e(f99921e, "Error scheduling indexing job", e13);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
