package n8;

import a7.m1;
import a7.o1;
import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import d7.n0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import l7.p0;
import l7.u0;
import l7.z0;
import pk.c1;
import pk.v2;
import pk.x0;
import pk.y0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f89858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89859b = 0;

    /* renamed from: c, reason: collision with root package name */
    public c1 f89860c;

    /* renamed from: d, reason: collision with root package name */
    public m1 f89861d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.common.b f89862e;

    /* renamed from: f, reason: collision with root package name */
    public int f89863f;

    /* renamed from: g, reason: collision with root package name */
    public long f89864g;

    /* renamed from: h, reason: collision with root package name */
    public long f89865h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f89866i;

    /* renamed from: j, reason: collision with root package name */
    public Executor f89867j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f89868k;

    public o(s sVar, Context context) {
        this.f89868k = sVar;
        this.f89858a = n0.S(context) ? 1 : 5;
        y0 y0Var = c1.f100372b;
        this.f89860c = v2.f100502e;
        this.f89865h = -9223372036854775807L;
        this.f89866i = j0.Ko;
        this.f89867j = s.f89871y;
    }

    public final void a() {
        s sVar = this.f89868k;
        sVar.getClass();
        d7.f0 f0Var = d7.f0.f53820c;
        sVar.b(null, f0Var.f53821a, f0Var.f53822b);
        sVar.f89886o = null;
    }

    public final void b() {
        this.f89868k.f89878g.a();
    }

    public final void c(boolean z13) {
        d7.j0 j0Var;
        int i13 = 1;
        int i14 = 0;
        if (h()) {
            l7.w wVar = (l7.w) this.f89861d;
            u0 u0Var = wVar.f81897e.f81816k;
            if (u0Var != null) {
                try {
                    bf.b.w(u0Var);
                    u0Var.a();
                    wVar.f81898f.a();
                    u0Var.g();
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    l7.p pVar = new l7.p(countDownLatch, i14);
                    synchronized (u0Var.f81882b) {
                        u0Var.f81883c = pVar;
                    }
                    z0 z0Var = wVar.f81898f;
                    l7.c0 c0Var = wVar.f81902j;
                    Objects.requireNonNull(c0Var);
                    z0Var.e(new l7.p(c0Var, i13), true);
                    countDownLatch.await();
                    synchronized (u0Var.f81882b) {
                        u0Var.f81883c = null;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                wVar.c();
            }
        }
        this.f89865h = -9223372036854775807L;
        s sVar = this.f89868k;
        if (sVar.f89888q == 1) {
            sVar.f89887p++;
            c cVar = sVar.f89878g;
            if (z13) {
                x xVar = cVar.f89748a;
                a0 a0Var = xVar.f89905b;
                a0Var.f89741m = 0L;
                a0Var.f89744p = -1L;
                a0Var.f89742n = -1L;
                xVar.f89911h = -9223372036854775807L;
                xVar.f89909f = -9223372036854775807L;
                xVar.d(1);
                xVar.f89912i = -9223372036854775807L;
            }
            c0 c0Var2 = cVar.f89750c;
            d7.v vVar = c0Var2.f89764f;
            vVar.f53891a = 0;
            vVar.f53892b = -1;
            vVar.f53893c = 0;
            c0Var2.f89765g = -9223372036854775807L;
            c0Var2.f89766h = -9223372036854775807L;
            c0Var2.f89767i = -9223372036854775807L;
            d7.j0 j0Var2 = c0Var2.f89763e;
            if (j0Var2.k() > 0) {
                bf.b.i(j0Var2.k() > 0);
                while (j0Var2.k() > 1) {
                    j0Var2.h();
                }
                Object h10 = j0Var2.h();
                h10.getClass();
                j0Var2.a(0L, (Long) h10);
            }
            d7.j0 j0Var3 = c0Var2.f89762d;
            if (j0Var3.k() > 0) {
                bf.b.i(j0Var3.k() > 0);
                while (j0Var3.k() > 1) {
                    j0Var3.h();
                }
                Object h13 = j0Var3.h();
                h13.getClass();
                j0Var3.a(0L, (o1) h13);
            }
            cVar.f89751d.clear();
            while (true) {
                j0Var = sVar.f89873b;
                if (j0Var.k() <= 1) {
                    break;
                } else {
                    j0Var.h();
                }
            }
            if (j0Var.k() == 1) {
                Long l13 = (Long) j0Var.h();
                l13.getClass();
                cVar.i(l13.longValue(), sVar.f89893v);
            }
            sVar.f89890s = -9223372036854775807L;
            sVar.f89891t = -9223372036854775807L;
            sVar.f89892u = false;
            d7.i0 i0Var = sVar.f89883l;
            bf.b.w(i0Var);
            i0Var.d(new u0.n(sVar, 20));
        }
    }

    public final Surface d() {
        bf.b.t(h());
        m1 m1Var = this.f89861d;
        bf.b.w(m1Var);
        SparseArray sparseArray = ((l7.w) m1Var).f81897e.f81812g;
        bf.b.t(n0.k(sparseArray, 1));
        return ((l7.k0) sparseArray.get(1)).f81801a.c();
    }

    public final boolean e(long j13, k0 k0Var) {
        int i13;
        boolean z13;
        bf.b.t(h());
        s sVar = this.f89868k;
        int i14 = sVar.f89894w;
        if (i14 == -1 || i14 != sVar.f89895x) {
            return false;
        }
        m1 m1Var = this.f89861d;
        bf.b.w(m1Var);
        u0 u0Var = ((l7.w) m1Var).f81897e.f81816k;
        if (u0Var != null) {
            bf.b.w(u0Var);
            i13 = u0Var.d();
        } else {
            i13 = 0;
        }
        if (i13 >= this.f89858a) {
            return false;
        }
        m1 m1Var2 = this.f89861d;
        bf.b.w(m1Var2);
        l7.w wVar = (l7.w) m1Var2;
        bf.b.x(wVar.f81912t, "registerInputStream must be called before registering input frames");
        a7.o oVar = wVar.f81904l;
        synchronized (oVar) {
            z13 = oVar.f1154a;
        }
        if (!z13) {
            return false;
        }
        u0 u0Var2 = wVar.f81897e.f81816k;
        bf.b.w(u0Var2);
        u0Var2.e(wVar.f81912t);
        this.f89865h = j13 - this.f89864g;
        ((f) k0Var).a(j13 * 1000);
        return true;
    }

    public final boolean f(androidx.media3.common.b bVar) {
        bf.b.t(!h());
        m1 c13 = this.f89868k.c(this.f89859b, bVar);
        this.f89861d = c13;
        return c13 != null;
    }

    public final boolean g() {
        if (h()) {
            s sVar = this.f89868k;
            if (sVar.f89887p == 0 && sVar.f89892u && sVar.f89878g.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f89861d != null;
    }

    public final boolean i(boolean z13) {
        boolean z14 = false;
        boolean z15 = z13 && h();
        s sVar = this.f89868k;
        c cVar = sVar.f89878g;
        if (z15 && sVar.f89887p == 0) {
            z14 = true;
        }
        return cVar.f89748a.b(z14);
    }

    public final void j(boolean z13) {
        this.f89868k.f89878g.f89748a.c(z13);
    }

    public final void k(androidx.media3.common.b bVar, List list) {
        bf.b.t(h());
        u(list);
        this.f89863f = 1;
        this.f89862e = bVar;
        s sVar = this.f89868k;
        sVar.f89891t = -9223372036854775807L;
        sVar.f89892u = false;
        p(bVar);
    }

    public final void l() {
        this.f89868k.f89878g.f89748a.d(0);
    }

    public final void m(boolean z13) {
        this.f89868k.f89878g.f89748a.f89908e = z13 ? 1 : 0;
    }

    public final void n() {
        this.f89868k.f89878g.d();
    }

    public final void o() {
        this.f89868k.f89878g.e();
    }

    public final void p(androidx.media3.common.b bVar) {
        androidx.media3.common.b bVar2;
        a7.q a13 = bVar.a();
        a7.j jVar = bVar.C;
        if (jVar == null || !jVar.e()) {
            jVar = a7.j.f1080h;
        }
        a13.B = jVar;
        androidx.media3.common.b bVar3 = new androidx.media3.common.b(a13);
        m1 m1Var = this.f89861d;
        bf.b.w(m1Var);
        int i13 = this.f89863f;
        c1 c1Var = this.f89860c;
        l7.w wVar = (l7.w) m1Var;
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(String.valueOf(i13));
        }
        int i14 = l7.g.f81778a;
        synchronized (l7.g.class) {
        }
        float f13 = bVar3.f18776z;
        if (f13 > 1.0f) {
            a7.q a14 = bVar3.a();
            a14.f1188u = (int) (bVar3.f18772v * f13);
            a14.f1192y = 1.0f;
            bVar2 = new androidx.media3.common.b(a14);
        } else if (f13 < 1.0f) {
            a7.q a15 = bVar3.a();
            a15.f1189v = (int) (bVar3.f18773w / f13);
            a15.f1192y = 1.0f;
            bVar2 = new androidx.media3.common.b(a15);
        } else {
            bVar2 = bVar3;
        }
        wVar.f81912t = new a7.s(bVar2, 0L);
        try {
            wVar.f81904l.b();
        } catch (InterruptedException e13) {
            Thread.currentThread().interrupt();
            wVar.f81900h.execute(new w2.c(8, wVar, e13));
        }
        synchronized (wVar.f81909q) {
            try {
                l7.v vVar = new l7.v(i13, bVar3, c1Var);
                if (wVar.f81907o) {
                    wVar.f81906n = vVar;
                    wVar.f81904l.f();
                    u0 u0Var = wVar.f81897e.f81816k;
                    u0Var.getClass();
                    u0Var.j();
                } else {
                    wVar.f81907o = true;
                    wVar.f81904l.f();
                    wVar.f81898f.e(new l7.o(wVar, vVar, 0), true);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q() {
        s sVar = this.f89868k;
        int i13 = 2;
        if (sVar.f89888q == 2) {
            return;
        }
        d7.i0 i0Var = sVar.f89883l;
        if (i0Var != null) {
            i0Var.f53829a.removeCallbacksAndMessages(null);
        }
        p0 p0Var = sVar.f89884m;
        if (p0Var != null && !p0Var.f81865j) {
            m1 m1Var = p0Var.f81863h;
            if (m1Var != null) {
                l7.w wVar = (l7.w) m1Var;
                try {
                    wVar.f81898f.d(new l7.p(wVar, i13));
                    p0Var.f81863h = null;
                } catch (InterruptedException e13) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException(e13);
                }
            }
            p0Var.f81865j = true;
        }
        sVar.f89886o = null;
        sVar.f89888q = 2;
    }

    public final void r(long j13, long j14) {
        c cVar = this.f89868k.f89878g;
        cVar.getClass();
        try {
            cVar.f89750c.a(j13, j14);
        } catch (ExoPlaybackException e13) {
            throw new VideoSink$VideoSinkException(e13, cVar.f89753f);
        }
    }

    public final void s(int i13) {
        this.f89868k.f89878g.f(i13);
    }

    public final void t(Surface surface, d7.f0 f0Var) {
        s sVar = this.f89868k;
        Pair pair = sVar.f89886o;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((d7.f0) sVar.f89886o.second).equals(f0Var)) {
            return;
        }
        sVar.f89886o = Pair.create(surface, f0Var);
        sVar.b(surface, f0Var.f53821a, f0Var.f53822b);
    }

    public final void u(List list) {
        s sVar = this.f89868k;
        sVar.f89874c.getClass();
        x0 x0Var = new x0(4);
        x0Var.b(list);
        x0Var.b(sVar.f89876e);
        this.f89860c = x0Var.i();
    }

    public final void v(float f13) {
        this.f89868k.f89878g.h(f13);
    }

    public final void w(long j13, long j14) {
        s sVar = this.f89868k;
        d7.j0 j0Var = sVar.f89873b;
        long j15 = this.f89865h;
        j0Var.a(j15 == -9223372036854775807L ? 0L : j15 + 1, Long.valueOf(j13));
        this.f89864g = j14;
        sVar.f89893v = j14;
        sVar.f89878g.i(sVar.f89885n, j14);
    }

    public final void x(List list) {
        if (this.f89860c.equals(list)) {
            return;
        }
        u(list);
        androidx.media3.common.b bVar = this.f89862e;
        if (bVar != null) {
            p(bVar);
        }
    }

    public final void y(v vVar) {
        this.f89868k.f89878g.f89758k = vVar;
    }

    public final void z() {
        long j13 = this.f89865h;
        s sVar = this.f89868k;
        sVar.f89891t = j13;
        if (sVar.f89890s >= j13) {
            sVar.f89878g.j();
            sVar.f89892u = true;
        }
    }
}
