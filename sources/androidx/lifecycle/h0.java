package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: k */
    public static final Object f18630k = new Object();

    /* renamed from: a */
    public final Object f18631a;

    /* renamed from: b */
    public final p.g f18632b;

    /* renamed from: c */
    public int f18633c;

    /* renamed from: d */
    public boolean f18634d;

    /* renamed from: e */
    public volatile Object f18635e;

    /* renamed from: f */
    public volatile Object f18636f;

    /* renamed from: g */
    public int f18637g;

    /* renamed from: h */
    public boolean f18638h;

    /* renamed from: i */
    public boolean f18639i;

    /* renamed from: j */
    public final androidx.appcompat.app.v f18640j;

    public h0(Object obj) {
        this.f18631a = new Object();
        this.f18632b = new p.g();
        this.f18633c = 0;
        this.f18636f = f18630k;
        this.f18640j = new androidx.appcompat.app.v(this, 2);
        this.f18635e = obj;
        this.f18637g = 0;
    }

    public static void a(String str) {
        o.b.l().f92736b.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.a.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(g0 g0Var) {
        if (g0Var.f18622b) {
            if (!g0Var.e()) {
                g0Var.a(false);
                return;
            }
            int i13 = g0Var.f18623c;
            int i14 = this.f18637g;
            if (i13 >= i14) {
                return;
            }
            g0Var.f18623c = i14;
            g0Var.f18621a.a(this.f18635e);
        }
    }

    public final void c(g0 g0Var) {
        if (this.f18638h) {
            this.f18639i = true;
            return;
        }
        this.f18638h = true;
        do {
            this.f18639i = false;
            if (g0Var != null) {
                b(g0Var);
                g0Var = null;
            } else {
                p.g gVar = this.f18632b;
                gVar.getClass();
                p.d dVar = new p.d(gVar);
                gVar.f98293c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((g0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f18639i) {
                        break;
                    }
                }
            }
        } while (this.f18639i);
        this.f18638h = false;
    }

    public Object d() {
        Object obj = this.f18635e;
        if (obj != f18630k) {
            return obj;
        }
        return null;
    }

    public final void e(z zVar, m0 m0Var) {
        a("observe");
        if (((b0) zVar.getLifecycle()).f18588d == r.DESTROYED) {
            return;
        }
        f0 f0Var = new f0(this, zVar, m0Var);
        g0 g0Var = (g0) this.f18632b.c(m0Var, f0Var);
        if (g0Var != null && !g0Var.d(zVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g0Var != null) {
            return;
        }
        zVar.getLifecycle().a(f0Var);
    }

    public final void f(m0 m0Var) {
        a("observeForever");
        e0 e0Var = new e0(this, m0Var);
        g0 g0Var = (g0) this.f18632b.c(m0Var, e0Var);
        if (g0Var instanceof f0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g0Var != null) {
            return;
        }
        e0Var.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z13;
        synchronized (this.f18631a) {
            z13 = this.f18636f == f18630k;
            this.f18636f = obj;
        }
        if (z13) {
            o.b.l().n(this.f18640j);
        }
    }

    public void j(m0 m0Var) {
        a("removeObserver");
        g0 g0Var = (g0) this.f18632b.d(m0Var);
        if (g0Var == null) {
            return;
        }
        g0Var.b();
        g0Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.f18637g++;
        this.f18635e = obj;
        c(null);
    }

    public h0() {
        this.f18631a = new Object();
        this.f18632b = new p.g();
        this.f18633c = 0;
        Object obj = f18630k;
        this.f18636f = obj;
        this.f18640j = new androidx.appcompat.app.v(this, 2);
        this.f18635e = obj;
        this.f18637g = -1;
    }
}
