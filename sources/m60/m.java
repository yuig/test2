package m60;

import android.util.LruCache;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.gw;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public abstract class m extends at1.d implements kb.c {
    public static final /* synthetic */ int E = 0;
    public final xk2.v B;
    public final xk2.v C;
    public final xk2.v D;

    /* renamed from: q, reason: collision with root package name */
    public so1.b f85922q;

    /* renamed from: r, reason: collision with root package name */
    public n f85923r;

    /* renamed from: s, reason: collision with root package name */
    public n1 f85924s;

    /* renamed from: t, reason: collision with root package name */
    public nx.d0 f85925t;

    /* renamed from: p, reason: collision with root package name */
    public final bk.f f85921p = new bk.f();

    /* renamed from: u, reason: collision with root package name */
    public final xk2.v f85926u = xk2.m.b(new g(this, 6));

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f85927v = xk2.m.b(new g(this, 10));

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f85928w = xk2.m.b(new g(this, 12));

    /* renamed from: x, reason: collision with root package name */
    public final xk2.v f85929x = xk2.m.b(new g(this, 2));

    /* renamed from: y, reason: collision with root package name */
    public final xk2.v f85930y = xk2.m.b(new g(this, 4));

    /* renamed from: z, reason: collision with root package name */
    public final xk2.v f85931z = xk2.m.b(new g(this, 0));
    public final xk2.v A = xk2.m.b(new g(this, 1));

    public m() {
        xk2.m.b(new g(this, 3));
        this.B = xk2.m.b(new g(this, 9));
        this.C = xk2.m.b(new g(this, 7));
        this.D = xk2.m.b(new g(this, 8));
        xk2.m.b(new g(this, 11));
    }

    public static final void g(m mVar, OkHttpClient.Builder builder) {
        tu1.s sVar = (tu1.s) ((bf2.b) ((se2.a) mVar.i().f89287g.getValue())).get();
        sVar.a();
        builder.a(sVar);
    }

    @Override // at1.d
    public final void b() {
        ((gw) this.f85926u.getValue()).getClass();
        LruCache lruCache = ew.f37365i;
        synchronized (lruCache) {
            lruCache.evictAll();
        }
        LruCache lruCache2 = ew.f37359c;
        synchronized (lruCache2) {
            lruCache2.evictAll();
        }
        LruCache lruCache3 = ew.f37360d;
        synchronized (lruCache3) {
            lruCache3.evictAll();
        }
        LruCache lruCache4 = ew.f37368l;
        synchronized (lruCache4) {
            lruCache4.evictAll();
        }
        ew.p();
        ew.q();
        ew.r();
        ew.t();
        ew.u();
        ew.x();
        ew.v();
        ew.w();
        ew.s();
    }

    public final n h() {
        n nVar = this.f85923r;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.r("baseApplicationDependencies");
        throw null;
    }

    public abstract n60.s i();

    public final n1 j() {
        n1 n1Var = this.f85924s;
        if (n1Var != null) {
            return n1Var;
        }
        Intrinsics.r("hairballExperiments");
        throw null;
    }

    public final float k() {
        n1 h10 = i().h();
        h10.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) h10.f83439a;
        return ql2.s.f(((g1Var.o("android_handled_exception_gate", "enabled", z3Var) || g1Var.l("android_handled_exception_gate")) ? ((lh0.o) ((bf2.b) ((se2.a) i().f89296p.getValue())).get()).h(0, "android_handled_exception_gate") : 100) / 100.0f, 0.0f, 1.0f);
    }

    public final cy.k l() {
        return (cy.k) this.D.getValue();
    }
}
