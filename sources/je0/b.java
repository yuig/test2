package je0;

import android.app.Activity;
import df.j1;
import df.k1;
import fl.q;
import lb0.n;
import lb0.o;
import le.v;
import nm.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f75835a;

    /* renamed from: b, reason: collision with root package name */
    public final o f75836b = n.f82724c.a();

    /* renamed from: c, reason: collision with root package name */
    public final wk2.a f75837c;

    public b(d dVar, bf2.d dVar2) {
        this.f75835a = dVar;
        this.f75837c = dVar2;
    }

    public static void b(Activity activity) {
        if (!v.f83119p.get()) {
            v.k(activity);
        }
        q qVar = new q(22);
        k1.d(activity, "context");
        k1.d(qVar, "completionHandler");
        k1.d(activity, "context");
        String b13 = v.b();
        k1.d(b13, "applicationId");
        v.d().execute(new ze.a(activity.getApplicationContext(), b13, qVar));
    }

    public final u a() {
        String j13 = ((lb0.b) this.f75835a.f75839a).j("PREF_GOOGLE_PLAY_INSTALL_REFERRER_DATA", null);
        return j13 != null ? j1.p1(j13).i() : new u();
    }
}
