package n7;

import a.o3;
import a7.a1;
import a7.b1;
import a7.g1;
import a7.i1;
import a7.o1;
import a7.r0;
import a7.s0;
import a7.u0;
import a7.v0;
import a7.z0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import pk.c1;

/* loaded from: classes.dex */
public final class c0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d7.e f89394a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f89395b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f89396c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f89397d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f89398e;

    /* renamed from: f, reason: collision with root package name */
    public v4.f f89399f;

    /* renamed from: g, reason: collision with root package name */
    public v0 f89400g;

    /* renamed from: h, reason: collision with root package name */
    public d7.i0 f89401h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f89402i;

    public c0(d7.e eVar) {
        eVar.getClass();
        this.f89394a = eVar;
        int i13 = d7.n0.f53866a;
        Looper myLooper = Looper.myLooper();
        this.f89399f = new v4.f(myLooper == null ? Looper.getMainLooper() : myLooper, eVar, new c3.e(7));
        z0 z0Var = new z0();
        this.f89395b = z0Var;
        this.f89396c = new a1();
        this.f89397d = new b0(z0Var);
        this.f89398e = new SparseArray();
    }

    @Override // a7.t0
    public final void A2(final int i13, final int i14) {
        final b w13 = w();
        x(w13, 24, new d7.r() { // from class: n7.h
            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((c) obj).e(b.this, i13, i14);
            }
        });
    }

    @Override // a7.t0
    public final void B3(boolean z13) {
        b r13 = r();
        x(r13, 3, new d(r13, z13, 0));
    }

    @Override // a7.t0
    public final void C4(ExoPlaybackException exoPlaybackException) {
        g8.e0 e0Var;
        b r13 = (!(exoPlaybackException instanceof ExoPlaybackException) || (e0Var = exoPlaybackException.f18791h) == null) ? r() : u(e0Var);
        x(r13, 10, new z(r13, exoPlaybackException, 1));
    }

    @Override // a7.t0
    public final void E2(g1 g1Var) {
        b r13 = r();
        x(r13, 19, new o3(19, r13, g1Var));
    }

    @Override // a7.t0
    public final void J1(a7.n nVar) {
        b r13 = r();
        x(r13, 29, new o3(20, r13, nVar));
    }

    @Override // a7.t0
    public final void J4(a7.n0 n0Var) {
        b r13 = r();
        x(r13, 28, new o3(17, r13, n0Var));
    }

    @Override // a7.t0
    public final void K0(boolean z13) {
        b r13 = r();
        x(r13, 9, new g(r13, z13, 0));
    }

    @Override // a7.t0
    public final void K5(int i13, boolean z13) {
        b r13 = r();
        x(r13, -1, new w(i13, 0, r13, z13));
    }

    @Override // a7.t0
    public final void K6(boolean z13) {
        b r13 = r();
        x(r13, 7, new d(r13, z13, 1));
    }

    @Override // a7.t0
    public final void L5() {
    }

    @Override // a7.t0
    public final void N4(int i13, u0 u0Var, u0 u0Var2) {
        if (i13 == 1) {
            this.f89402i = false;
        }
        v0 v0Var = this.f89400g;
        v0Var.getClass();
        b0 b0Var = this.f89397d;
        b0Var.f89391d = b0.c(v0Var, b0Var.f89389b, b0Var.f89392e, b0Var.f89388a);
        b r13 = r();
        x(r13, 11, new e(r13, u0Var, u0Var2, i13));
    }

    @Override // a7.t0
    public final void O1() {
    }

    @Override // a7.t0
    public final void R1(boolean z13) {
        b w13 = w();
        x(w13, 23, new g(w13, z13, 1));
    }

    @Override // a7.t0
    public final void R4(a7.f fVar) {
        b w13 = w();
        x(w13, 20, new androidx.fragment.app.c(4, w13, fVar));
    }

    @Override // a7.t0
    public final void T3(int i13, boolean z13) {
        b r13 = r();
        x(r13, 5, new w(i13, 1, r13, z13));
    }

    @Override // a7.t0
    public final void U1(List list) {
        b r13 = r();
        x(r13, 27, new o3(18, r13, list));
    }

    @Override // a7.t0
    public final void W3(final float f13) {
        final b w13 = w();
        x(w13, 22, new d7.r() { // from class: n7.u
            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((c) obj).V(b.this, f13);
            }
        });
    }

    @Override // a7.t0
    public final void Y3(a7.l0 l0Var) {
        b r13 = r();
        x(r13, 14, new o3(16, r13, l0Var));
    }

    @Override // g8.i0
    public final void a(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var, int i14) {
        b v13 = v(i13, e0Var);
        x(v13, 1000, new e(v13, vVar, a0Var, i14, 1));
    }

    @Override // a7.t0
    public final void a0(ExoPlaybackException exoPlaybackException) {
        g8.e0 e0Var;
        b r13 = (!(exoPlaybackException instanceof ExoPlaybackException) || (e0Var = exoPlaybackException.f18791h) == null) ? r() : u(e0Var);
        x(r13, 10, new z(r13, exoPlaybackException, 0));
    }

    @Override // s7.n
    public final void b(int i13, g8.e0 e0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1027, new j(v13, 1));
    }

    @Override // l8.d
    public final void c(final int i13, final long j13, final long j14) {
        b0 b0Var = this.f89397d;
        final b u13 = u(b0Var.f89389b.isEmpty() ? null : (g8.e0) com.bumptech.glide.c.P(b0Var.f89389b));
        x(u13, 1006, new d7.r() { // from class: n7.q
            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((c) obj).Q(b.this, i13, j13, j14);
            }
        });
    }

    @Override // g8.i0
    public final void d(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1001, new o(v13, vVar, a0Var, 0));
    }

    @Override // a7.t0
    public final void d0(r0 r0Var) {
        b r13 = r();
        x(r13, 13, new androidx.fragment.app.c(2, r13, r0Var));
    }

    @Override // g8.i0
    public final void e(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1002, new l0.d(v13, vVar, a0Var, 5));
    }

    @Override // g8.i0
    public final void f(int i13, g8.e0 e0Var, g8.v vVar, g8.a0 a0Var, IOException iOException, boolean z13) {
        b v13 = v(i13, e0Var);
        x(v13, 1003, new l(v13, vVar, a0Var, iOException, z13));
    }

    @Override // g8.i0
    public final void g(int i13, g8.e0 e0Var, g8.a0 a0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1004, new androidx.fragment.app.c(5, v13, a0Var));
    }

    @Override // s7.n
    public final void h(int i13, g8.e0 e0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1025, new j(v13, 3));
    }

    @Override // a7.t0
    public final void h3(int i13) {
    }

    @Override // s7.n
    public final void i(int i13, g8.e0 e0Var, int i14) {
        b v13 = v(i13, e0Var);
        x(v13, 1022, new y(v13, i14, 1));
    }

    @Override // s7.n
    public final void j(int i13, g8.e0 e0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1026, new j(v13, 2));
    }

    @Override // a7.t0
    public final void k(i1 i1Var) {
        b r13 = r();
        x(r13, 2, new androidx.fragment.app.c(1, r13, i1Var));
    }

    @Override // a7.t0
    public final void l(int i13) {
        b r13 = r();
        x(r13, 6, new y(r13, i13, 0));
    }

    @Override // s7.n
    public final void m(int i13, g8.e0 e0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1023, new j(v13, 4));
    }

    @Override // a7.t0
    public final void m5(int i13) {
        b r13 = r();
        x(r13, 8, new t(r13, i13, 2));
    }

    @Override // a7.t0
    public final void n(boolean z13) {
    }

    @Override // a7.t0
    public final void o(a7.i0 i0Var, int i13) {
        b r13 = r();
        x(r13, 1, new m7.b0(r13, i0Var, i13));
    }

    @Override // a7.t0
    public final void o0(int i13) {
        b w13 = w();
        x(w13, 21, new t(w13, i13, 3));
    }

    @Override // g8.i0
    public final void p(int i13, g8.e0 e0Var, g8.a0 a0Var) {
        b v13 = v(i13, e0Var);
        x(v13, 1005, new o3(21, v13, a0Var));
    }

    @Override // s7.n
    public final void q(int i13, g8.e0 e0Var, Exception exc) {
        b v13 = v(i13, e0Var);
        x(v13, 1024, new v(v13, exc, 2));
    }

    public final b r() {
        return u(this.f89397d.f89391d);
    }

    @Override // a7.t0
    public final void r0(int i13) {
        b r13 = r();
        x(r13, 4, new t(r13, i13, 1));
    }

    @Override // a7.t0
    public final void r5(s0 s0Var) {
    }

    public final b s(b1 b1Var, int i13, g8.e0 e0Var) {
        g8.e0 e0Var2 = b1Var.q() ? null : e0Var;
        ((d7.g0) this.f89394a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z13 = b1Var.equals(this.f89400g.v()) && i13 == this.f89400g.N();
        long j13 = 0;
        if (e0Var2 == null || !e0Var2.b()) {
            if (z13) {
                j13 = this.f89400g.I();
            } else if (!b1Var.q()) {
                j13 = b1Var.n(i13, this.f89396c, 0L).a();
            }
        } else if (z13 && this.f89400g.q() == e0Var2.f64234b && this.f89400g.G() == e0Var2.f64235c) {
            j13 = this.f89400g.X();
        }
        return new b(elapsedRealtime, b1Var, i13, e0Var2, j13, this.f89400g.v(), this.f89400g.N(), this.f89397d.f89391d, this.f89400g.X(), this.f89400g.h());
    }

    @Override // a7.t0
    public final void s5(b1 b1Var, int i13) {
        v0 v0Var = this.f89400g;
        v0Var.getClass();
        b0 b0Var = this.f89397d;
        b0Var.f89391d = b0.c(v0Var, b0Var.f89389b, b0Var.f89392e, b0Var.f89388a);
        b0Var.e(v0Var.v());
        b r13 = r();
        x(r13, 0, new t(r13, i13, 0));
    }

    @Override // a7.t0
    public final void t(a7.p0 p0Var) {
        b r13 = r();
        x(r13, 12, new o3(14, r13, p0Var));
    }

    @Override // a7.t0
    public final void t0(o1 o1Var) {
        b w13 = w();
        x(w13, 25, new androidx.fragment.app.c(6, w13, o1Var));
    }

    public final b u(g8.e0 e0Var) {
        this.f89400g.getClass();
        b1 b1Var = e0Var == null ? null : (b1) this.f89397d.f89390c.get(e0Var);
        if (e0Var != null && b1Var != null) {
            return s(b1Var, b1Var.h(e0Var.f64233a, this.f89395b).f1253c, e0Var);
        }
        int N = this.f89400g.N();
        b1 v13 = this.f89400g.v();
        if (N >= v13.p()) {
            v13 = b1.f958a;
        }
        return s(v13, N, null);
    }

    public final b v(int i13, g8.e0 e0Var) {
        this.f89400g.getClass();
        if (e0Var != null) {
            return ((b1) this.f89397d.f89390c.get(e0Var)) != null ? u(e0Var) : s(b1.f958a, i13, e0Var);
        }
        b1 v13 = this.f89400g.v();
        if (i13 >= v13.p()) {
            v13 = b1.f958a;
        }
        return s(v13, i13, null);
    }

    public final b w() {
        return u(this.f89397d.f89393f);
    }

    @Override // a7.t0
    public final void w1(c7.c cVar) {
        b r13 = r();
        x(r13, 27, new o3(15, r13, cVar));
    }

    public final void x(b bVar, int i13, d7.r rVar) {
        this.f89398e.put(i13, bVar);
        this.f89399f.m(i13, rVar);
    }

    public final void y(v0 v0Var, Looper looper) {
        boolean z13;
        c1 c1Var;
        if (this.f89400g != null) {
            c1Var = this.f89397d.f89389b;
            if (!c1Var.isEmpty()) {
                z13 = false;
                bf.b.t(z13);
                v0Var.getClass();
                this.f89400g = v0Var;
                this.f89401h = ((d7.g0) this.f89394a).a(looper, null);
                v4.f fVar = this.f89399f;
                androidx.fragment.app.c cVar = new androidx.fragment.app.c(3, this, v0Var);
                this.f89399f = new v4.f((CopyOnWriteArraySet) fVar.f123986f, looper, (d7.e) fVar.f123983c, cVar, fVar.f123982b);
            }
        }
        z13 = true;
        bf.b.t(z13);
        v0Var.getClass();
        this.f89400g = v0Var;
        this.f89401h = ((d7.g0) this.f89394a).a(looper, null);
        v4.f fVar2 = this.f89399f;
        androidx.fragment.app.c cVar2 = new androidx.fragment.app.c(3, this, v0Var);
        this.f89399f = new v4.f((CopyOnWriteArraySet) fVar2.f123986f, looper, (d7.e) fVar2.f123983c, cVar2, fVar2.f123982b);
    }

    @Override // a7.t0
    public final void z0(Throwable th3) {
    }
}
