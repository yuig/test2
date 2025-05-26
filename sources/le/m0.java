package le;

import android.os.Bundle;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f83073b;

    public /* synthetic */ m0(long j13, int i13) {
        this.f83072a = i13;
        this.f83073b = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f83072a;
        long j13 = this.f83073b;
        switch (i13) {
            case 0:
                if (!p001if.a.b(o0.class)) {
                    try {
                        if (o0.f83086g.b()) {
                            df.e0 e0Var = df.e0.f54743a;
                            df.c0 f13 = df.e0.f(v.b(), false);
                            if (f13 != null && f13.f54733j) {
                                df.c q13 = wc.b.q(v.a());
                                String a13 = (q13 == null || q13.a() == null) ? null : q13.a();
                                if (a13 != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("advertiser_id", a13);
                                    bundle.putString("fields", "auto_event_setup_enabled");
                                    String str = a0.f83002j;
                                    a0 A = wc.b.A(null, "app", null);
                                    Intrinsics.checkNotNullParameter(bundle, "<set-?>");
                                    A.f83009d = bundle;
                                    JSONObject jSONObject = A.d().f83045b;
                                    if (jSONObject != null) {
                                        n0 n0Var = o0.f83087h;
                                        n0Var.f83077c = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                        n0Var.f83078d = j13;
                                        o0.f83080a.j(n0Var);
                                    }
                                }
                            }
                        }
                        o0.f83083d.set(false);
                        break;
                    } catch (Throwable th3) {
                        p001if.a.a(o0.class, th3);
                        return;
                    }
                }
                break;
            default:
                int i14 = m60.m0.O;
                new fy.d(((ha.k) ha.l.f68355a.get()).f68354a, SystemClock.elapsedRealtime() - j13, vb0.j.f125484s).i();
                break;
        }
    }
}
