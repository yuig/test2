package m7;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u0 implements Handler.Callback, g8.b0, k8.x, m1, o, p1, f {

    /* renamed from: f0, reason: collision with root package name */
    public static final long f86402f0 = d7.n0.o0(10000);

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f86403g0 = 0;
    public final d7.i0 A;
    public final boolean B;
    public final g C;
    public x1 D;
    public o1 E;
    public r0 F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f86404J;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public t0 S;
    public long T;
    public long U;
    public int V;
    public boolean W;
    public ExoPlaybackException X;
    public final long Y;

    /* renamed from: a, reason: collision with root package name */
    public final w1[] f86405a;

    /* renamed from: a0, reason: collision with root package name */
    public y f86406a0;

    /* renamed from: b, reason: collision with root package name */
    public final h[] f86407b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f86409c;

    /* renamed from: d, reason: collision with root package name */
    public final k8.y f86411d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f86412d0;

    /* renamed from: e, reason: collision with root package name */
    public final k8.z f86413e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f86415f;

    /* renamed from: g, reason: collision with root package name */
    public final l8.e f86416g;

    /* renamed from: h, reason: collision with root package name */
    public final d7.i0 f86417h;

    /* renamed from: i, reason: collision with root package name */
    public final hh.k f86418i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f86419j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.a1 f86420k;

    /* renamed from: l, reason: collision with root package name */
    public final a7.z0 f86421l;

    /* renamed from: m, reason: collision with root package name */
    public final long f86422m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f86423n;

    /* renamed from: o, reason: collision with root package name */
    public final p f86424o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f86425p;

    /* renamed from: q, reason: collision with root package name */
    public final d7.e f86426q;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f86427r;

    /* renamed from: s, reason: collision with root package name */
    public final h1.b f86428s;

    /* renamed from: t, reason: collision with root package name */
    public final c1 f86429t;

    /* renamed from: u, reason: collision with root package name */
    public final n1 f86430u;

    /* renamed from: v, reason: collision with root package name */
    public final k f86431v;

    /* renamed from: w, reason: collision with root package name */
    public final long f86432w;

    /* renamed from: x, reason: collision with root package name */
    public final n7.q0 f86433x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f86434y;

    /* renamed from: z, reason: collision with root package name */
    public final n7.a f86435z;

    /* renamed from: c0, reason: collision with root package name */
    public long f86410c0 = -9223372036854775807L;

    /* renamed from: e0, reason: collision with root package name */
    public float f86414e0 = 1.0f;
    public long Z = -9223372036854775807L;
    public long K = -9223372036854775807L;

    /* renamed from: b0, reason: collision with root package name */
    public a7.b1 f86408b0 = a7.b1.f958a;

    public u0(Context context, h[] hVarArr, h[] hVarArr2, k8.y yVar, k8.z zVar, w0 w0Var, l8.e eVar, int i13, boolean z13, n7.a aVar, x1 x1Var, k kVar, long j13, boolean z14, boolean z15, Looper looper, d7.e eVar2, f0 f0Var, n7.q0 q0Var, y yVar2, h1.b bVar) {
        Looper looper2;
        this.f86427r = f0Var;
        this.f86411d = yVar;
        this.f86413e = zVar;
        this.f86415f = w0Var;
        this.f86416g = eVar;
        this.M = i13;
        this.N = z13;
        this.D = x1Var;
        this.f86431v = kVar;
        this.f86432w = j13;
        this.Y = j13;
        this.H = z14;
        this.f86434y = z15;
        this.f86426q = eVar2;
        this.f86433x = q0Var;
        this.f86406a0 = yVar2;
        this.f86435z = aVar;
        this.f86428s = bVar;
        n nVar = (n) w0Var;
        this.f86422m = nVar.f86307h;
        this.f86423n = nVar.f86308i;
        o1 k13 = o1.k(zVar);
        this.E = k13;
        this.F = new r0(k13);
        this.f86407b = new h[hVarArr.length];
        this.f86409c = new boolean[hVarArr.length];
        u1 b13 = yVar.b();
        this.f86405a = new w1[hVarArr.length];
        boolean z16 = false;
        boolean z17 = false;
        for (int i14 = 0; i14 < hVarArr.length; i14++) {
            h hVar = hVarArr[i14];
            hVar.f86174e = i14;
            hVar.f86175f = q0Var;
            hVar.f86176g = eVar2;
            h[] hVarArr3 = this.f86407b;
            hVar.getClass();
            hVarArr3[i14] = hVar;
            if (b13 != null) {
                h hVar2 = this.f86407b[i14];
                synchronized (hVar2.f86170a) {
                    hVar2.f86186q = b13;
                }
            }
            h hVar3 = hVarArr2[i14];
            if (hVar3 != null) {
                hVar3.f86174e = hVarArr.length + i14;
                hVar3.f86175f = q0Var;
                hVar3.f86176g = eVar2;
                z17 = true;
            }
            this.f86405a[i14] = new w1(hVarArr[i14], hVar3, i14);
        }
        this.B = z17;
        this.f86424o = new p(this, eVar2);
        this.f86425p = new ArrayList();
        this.f86420k = new a7.a1();
        this.f86421l = new a7.z0();
        yVar.f78582a = this;
        yVar.f78583b = eVar;
        this.W = true;
        d7.g0 g0Var = (d7.g0) eVar2;
        d7.i0 a13 = g0Var.a(looper, null);
        this.A = a13;
        this.f86429t = new c1(aVar, a13, new com.google.firebase.messaging.a0(this, 6), yVar2);
        this.f86430u = new n1(this, aVar, a13, q0Var);
        hh.k kVar2 = new hh.k();
        this.f86418i = kVar2;
        synchronized (kVar2.f69124b) {
            try {
                if (((Looper) kVar2.f69125c) == null) {
                    if (kVar2.f69123a == 0 && ((HandlerThread) kVar2.f69126d) == null) {
                        z16 = true;
                    }
                    bf.b.t(z16);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    kVar2.f69126d = handlerThread;
                    handlerThread.start();
                    kVar2.f69125c = ((HandlerThread) kVar2.f69126d).getLooper();
                }
                kVar2.f69123a++;
                looper2 = (Looper) kVar2.f69125c;
            } finally {
            }
        }
        this.f86419j = looper2;
        this.f86417h = g0Var.a(looper2, this);
        this.C = new g(context, looper2, this);
    }

    public static Pair W(a7.b1 b1Var, t0 t0Var, boolean z13, int i13, boolean z14, a7.a1 a1Var, a7.z0 z0Var) {
        Pair j13;
        int X;
        a7.b1 b1Var2 = t0Var.f86388a;
        if (b1Var.q()) {
            return null;
        }
        a7.b1 b1Var3 = b1Var2.q() ? b1Var : b1Var2;
        try {
            j13 = b1Var3.j(a1Var, z0Var, t0Var.f86389b, t0Var.f86390c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (b1Var.equals(b1Var3)) {
            return j13;
        }
        if (b1Var.b(j13.first) != -1) {
            return (b1Var3.h(j13.first, z0Var).f1256f && b1Var3.n(z0Var.f1253c, a1Var, 0L).f942n == b1Var3.b(j13.first)) ? b1Var.j(a1Var, z0Var, b1Var.h(j13.first, z0Var).f1253c, t0Var.f86390c) : j13;
        }
        if (z13 && (X = X(a1Var, z0Var, i13, z14, j13.first, b1Var3, b1Var)) != -1) {
            return b1Var.j(a1Var, z0Var, X, -9223372036854775807L);
        }
        return null;
    }

    public static int X(a7.a1 a1Var, a7.z0 z0Var, int i13, boolean z13, Object obj, a7.b1 b1Var, a7.b1 b1Var2) {
        Object obj2 = b1Var.n(b1Var.h(obj, z0Var).f1253c, a1Var, 0L).f929a;
        for (int i14 = 0; i14 < b1Var2.p(); i14++) {
            if (b1Var2.n(i14, a1Var, 0L).f929a.equals(obj2)) {
                return i14;
            }
        }
        int b13 = b1Var.b(obj);
        int i15 = b1Var.i();
        int i16 = b13;
        int i17 = -1;
        for (int i18 = 0; i18 < i15 && i17 == -1; i18++) {
            i16 = b1Var.d(i16, z0Var, a1Var, i13, z13);
            if (i16 == -1) {
                break;
            }
            i17 = b1Var2.b(b1Var.m(i16));
        }
        if (i17 == -1) {
            return -1;
        }
        return b1Var2.g(i17, z0Var, false).f1253c;
    }

    public static boolean z(a1 a1Var) {
        if (a1Var == null) {
            return false;
        }
        try {
            g8.c0 c0Var = a1Var.f86073a;
            if (a1Var.f86078f) {
                for (g8.b1 b1Var : a1Var.f86075c) {
                    if (b1Var != null) {
                        b1Var.b();
                    }
                }
            } else {
                c0Var.n();
            }
            return (!a1Var.f86078f ? 0L : c0Var.a()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean A() {
        a1 a1Var = this.f86429t.f86129j;
        long j13 = a1Var.f86080h.f86104e;
        return a1Var.f86078f && (j13 == -9223372036854775807L || this.E.f86348s < j13 || !u0());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void A0(k8.z zVar) {
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86132m;
        a1Var.getClass();
        if (a1Var != c1Var.f86129j) {
            long j13 = a1Var.f86080h.f86101b;
        }
        o(a1Var.e());
        if (v0(this.E.f86330a, a1Var.f86080h.f86100a)) {
            this.f86431v.getClass();
        }
        a7.b1 b1Var = this.E.f86330a;
        float f13 = this.f86424o.d().f1164a;
        boolean z13 = this.E.f86341l;
        k8.t[] tVarArr = zVar.f78586c;
        n nVar = (n) this.f86415f;
        m mVar = (m) nVar.f86309j.get(this.f86433x);
        mVar.getClass();
        int i13 = nVar.f86305f;
        if (i13 == -1) {
            int length = tVarArr.length;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = 13107200;
                if (i14 < length) {
                    k8.t tVar = tVarArr[i14];
                    if (tVar != null) {
                        switch (tVar.m().f966c) {
                            case -2:
                                i16 = 0;
                                i15 += i16;
                                break;
                            case -1:
                            case 1:
                                i15 += i16;
                                break;
                            case 0:
                                i16 = 144310272;
                                i15 += i16;
                                break;
                            case 2:
                                i16 = 131072000;
                                i15 += i16;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i16 = 131072;
                                i15 += i16;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i14++;
                } else {
                    i13 = Math.max(13107200, i15);
                }
            }
        }
        mVar.f86298b = i13;
        nVar.d();
    }

    public final void B() {
        boolean c13;
        if (z(this.f86429t.f86132m)) {
            a1 a1Var = this.f86429t.f86132m;
            long o13 = o(!a1Var.f86078f ? 0L : a1Var.f86073a.a());
            if (a1Var != this.f86429t.f86129j) {
                long j13 = a1Var.f86080h.f86101b;
            }
            long b13 = v0(this.E.f86330a, a1Var.f86080h.f86100a) ? this.f86431v.b() : -9223372036854775807L;
            n7.q0 q0Var = this.f86433x;
            a7.b1 b1Var = this.E.f86330a;
            g8.e0 e0Var = a1Var.f86080h.f86100a;
            float f13 = this.f86424o.d().f1164a;
            boolean z13 = this.E.f86341l;
            v0 v0Var = new v0(q0Var, o13, f13, this.f86404J, b13);
            c13 = ((n) this.f86415f).c(v0Var);
            a1 a1Var2 = this.f86429t.f86129j;
            if (!c13 && a1Var2.f86078f && o13 < 500000 && (this.f86422m > 0 || this.f86423n)) {
                a1Var2.f86073a.u(this.E.f86348s, false);
                c13 = ((n) this.f86415f).c(v0Var);
            }
        } else {
            c13 = false;
        }
        this.L = c13;
        if (c13) {
            a1 a1Var3 = this.f86429t.f86132m;
            a1Var3.getClass();
            x0 x0Var = new x0();
            x0Var.f86477a = this.T - a1Var3.f86089q;
            float f14 = this.f86424o.d().f1164a;
            bf.b.i(f14 > 0.0f || f14 == -3.4028235E38f);
            x0Var.f86478b = f14;
            long j14 = this.K;
            bf.b.i(j14 >= 0 || j14 == -9223372036854775807L);
            x0Var.f86479c = j14;
            y0 y0Var = new y0(x0Var);
            bf.b.t(a1Var3.f86086n == null);
            a1Var3.f86073a.q(y0Var);
        }
        z0();
    }

    public final void B0(int i13, int i14, List list) {
        this.F.a(1);
        n1 n1Var = this.f86430u;
        n1Var.getClass();
        ArrayList arrayList = n1Var.f86316b;
        bf.b.i(i13 >= 0 && i13 <= i14 && i14 <= arrayList.size());
        bf.b.i(list.size() == i14 - i13);
        for (int i15 = i13; i15 < i14; i15++) {
            ((l1) arrayList.get(i15)).f86292a.w((a7.i0) list.get(i15 - i13));
        }
        u(n1Var.b(), false);
    }

    public final void C() {
        c1 c1Var = this.f86429t;
        c1Var.q();
        a1 a1Var = c1Var.f86133n;
        if (a1Var != null) {
            if (!a1Var.f86077e || a1Var.f86078f) {
                g8.c0 c0Var = a1Var.f86073a;
                if (c0Var.g()) {
                    return;
                }
                a7.b1 b1Var = this.E.f86330a;
                g8.e0 e0Var = a1Var.f86080h.f86100a;
                if (a1Var.f86078f) {
                    c0Var.t();
                }
                Iterator it = ((n) this.f86415f).f86309j.values().iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).f86297a) {
                        return;
                    }
                }
                if (!a1Var.f86077e) {
                    long j13 = a1Var.f86080h.f86101b;
                    a1Var.f86077e = true;
                    c0Var.h(this, j13);
                    return;
                }
                x0 x0Var = new x0();
                x0Var.f86477a = this.T - a1Var.f86089q;
                float f13 = this.f86424o.d().f1164a;
                bf.b.i(f13 > 0.0f || f13 == -3.4028235E38f);
                x0Var.f86478b = f13;
                long j14 = this.K;
                bf.b.i(j14 >= 0 || j14 == -9223372036854775807L);
                x0Var.f86479c = j14;
                y0 y0Var = new y0(x0Var);
                bf.b.t(a1Var.f86086n == null);
                c0Var.q(y0Var);
            }
        }
    }

    public final void C0(int i13, int i14, boolean z13, int i15) {
        boolean z14 = z13 && i13 != -1;
        if (i13 == -1) {
            i15 = 2;
        } else if (i15 == 2) {
            i15 = 1;
        }
        if (i13 == 0) {
            i14 = 1;
        } else if (i14 == 1) {
            i14 = 0;
        }
        o1 o1Var = this.E;
        if (o1Var.f86341l == z14 && o1Var.f86343n == i14 && o1Var.f86342m == i15) {
            return;
        }
        this.E = o1Var.e(i15, i14, z14);
        F0(false, false);
        c1 c1Var = this.f86429t;
        for (a1 a1Var = c1Var.f86129j; a1Var != null; a1Var = a1Var.f86086n) {
            for (k8.t tVar : a1Var.f86088p.f78586c) {
                if (tVar != null) {
                    tVar.n(z14);
                }
            }
        }
        if (!u0()) {
            y0();
            D0();
            c1Var.s(this.T);
            return;
        }
        int i16 = this.E.f86334e;
        d7.i0 i0Var = this.f86417h;
        if (i16 != 3) {
            if (i16 == 2) {
                i0Var.f(2);
            }
        } else {
            p pVar = this.f86424o;
            pVar.f86355f = true;
            pVar.f86350a.f();
            w0();
            i0Var.f(2);
        }
    }

    public final void D() {
        for (w1 w1Var : this.f86405a) {
            int i13 = w1Var.f86449d;
            if (i13 == 3 || i13 == 4) {
                w1Var.u(i13 == 4);
                w1Var.f86449d = w1Var.f86449d == 4 ? 0 : 1;
            } else if (i13 == 2) {
                w1Var.f86449d = 0;
            }
        }
    }

    public final void D0() {
        a1 a1Var = this.f86429t.f86129j;
        if (a1Var == null) {
            return;
        }
        long k13 = a1Var.f86078f ? a1Var.f86073a.k() : -9223372036854775807L;
        if (k13 != -9223372036854775807L) {
            if (!a1Var.h()) {
                this.f86429t.u(a1Var);
                t(false);
                B();
            }
            U(k13);
            if (k13 != this.E.f86348s) {
                o1 o1Var = this.E;
                this.E = y(o1Var.f86331b, k13, o1Var.f86332c, k13, true, 5);
            }
        } else {
            p pVar = this.f86424o;
            boolean z13 = a1Var != this.f86429t.f86130k;
            h hVar = pVar.f86352c;
            y1 y1Var = pVar.f86350a;
            if (hVar == null || hVar.o() || ((z13 && pVar.f86352c.f86177h != 2) || (!pVar.f86352c.q() && (z13 || pVar.f86352c.n())))) {
                pVar.f86354e = true;
                if (pVar.f86355f) {
                    y1Var.f();
                }
            } else {
                z0 z0Var = pVar.f86353d;
                z0Var.getClass();
                long e13 = z0Var.e();
                if (pVar.f86354e) {
                    if (e13 >= y1Var.e()) {
                        pVar.f86354e = false;
                        if (pVar.f86355f) {
                            y1Var.f();
                        }
                    } else if (y1Var.f86490b) {
                        y1Var.b(y1Var.e());
                        y1Var.f86490b = false;
                    }
                }
                y1Var.b(e13);
                a7.p0 d2 = z0Var.d();
                if (!d2.equals(y1Var.f86493e)) {
                    y1Var.c(d2);
                    ((u0) pVar.f86351b).L(d2);
                }
            }
            long e14 = pVar.e();
            this.T = e14;
            long j13 = e14 - a1Var.f86089q;
            long j14 = this.E.f86348s;
            if (!this.f86425p.isEmpty() && !this.E.f86331b.b()) {
                if (this.W) {
                    this.W = false;
                }
                o1 o1Var2 = this.E;
                o1Var2.f86330a.b(o1Var2.f86331b.f64233a);
                int min = Math.min(this.V, this.f86425p.size());
                if (min > 0) {
                    ep.b.A(this.f86425p.get(min - 1));
                }
                if (min < this.f86425p.size()) {
                    ep.b.A(this.f86425p.get(min));
                }
                this.V = min;
            }
            if (this.f86424o.a()) {
                boolean z14 = !this.F.f86372d;
                o1 o1Var3 = this.E;
                this.E = y(o1Var3.f86331b, j13, o1Var3.f86332c, j13, z14, 6);
            } else {
                o1 o1Var4 = this.E;
                o1Var4.f86348s = j13;
                o1Var4.f86349t = SystemClock.elapsedRealtime();
            }
        }
        this.E.f86346q = this.f86429t.f86132m.e();
        o1 o1Var5 = this.E;
        o1Var5.f86347r = o(o1Var5.f86346q);
        o1 o1Var6 = this.E;
        if (o1Var6.f86341l && o1Var6.f86334e == 3 && v0(o1Var6.f86330a, o1Var6.f86331b) && this.E.f86344o.f1164a == 1.0f) {
            float a13 = this.f86431v.a(k(), this.E.f86347r);
            if (this.f86424o.d().f1164a != a13) {
                h0(this.E.f86344o.b(a13));
                w(this.E.f86344o, this.f86424o.d().f1164a, false, false);
            }
        }
    }

    public final void E() {
        r0 r0Var = this.F;
        o1 o1Var = this.E;
        boolean z13 = r0Var.f86369a | (r0Var.f86370b != o1Var);
        r0Var.f86369a = z13;
        r0Var.f86370b = o1Var;
        if (z13) {
            l0 l0Var = this.f86427r.f86151a;
            l0Var.getClass();
            l0Var.f86271k.d(new w2.c(16, l0Var, r0Var));
            this.F = new r0(this.E);
        }
    }

    public final void E0(a7.b1 b1Var, g8.e0 e0Var, a7.b1 b1Var2, g8.e0 e0Var2, long j13, boolean z13) {
        if (!v0(b1Var, e0Var)) {
            a7.p0 p0Var = e0Var.b() ? a7.p0.f1163d : this.E.f86344o;
            if (this.f86424o.d().equals(p0Var)) {
                return;
            }
            h0(p0Var);
            w(this.E.f86344o, p0Var.f1164a, false, false);
            return;
        }
        Object obj = e0Var.f64233a;
        a7.z0 z0Var = this.f86421l;
        int i13 = b1Var.h(obj, z0Var).f1253c;
        a7.a1 a1Var = this.f86420k;
        b1Var.o(i13, a1Var);
        a7.c0 c0Var = a1Var.f938j;
        k kVar = this.f86431v;
        kVar.e(c0Var);
        if (j13 != -9223372036854775807L) {
            kVar.f(l(b1Var, obj, j13));
            return;
        }
        if (!Objects.equals(!b1Var2.q() ? b1Var2.n(b1Var2.h(e0Var2.f64233a, z0Var).f1253c, a1Var, 0L).f929a : null, a1Var.f929a) || z13) {
            kVar.f(-9223372036854775807L);
        }
    }

    public final void F() {
        int i13;
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86131l;
        if (a1Var == null) {
            return;
        }
        k8.z zVar = a1Var.f86088p;
        int i14 = 0;
        while (true) {
            w1[] w1VarArr = this.f86405a;
            if (i14 >= w1VarArr.length) {
                break;
            }
            if (zVar.c(i14)) {
                w1 w1Var = w1VarArr[i14];
                if (w1Var.f86448c != null && !w1Var.j()) {
                    w1 w1Var2 = w1VarArr[i14];
                    bf.b.t(!w1Var2.j());
                    if (w1.l(w1Var2.f86446a)) {
                        i13 = 3;
                    } else {
                        h hVar = w1Var2.f86448c;
                        i13 = (hVar == null || !w1.l(hVar)) ? 2 : 4;
                    }
                    w1Var2.f86449d = i13;
                    h(a1Var, i14, false, a1Var.f());
                }
            }
            i14++;
        }
        if (b()) {
            this.f86410c0 = a1Var.f86073a.k();
            if (a1Var.h()) {
                return;
            }
            c1Var.u(a1Var);
            t(false);
            B();
        }
    }

    public final void F0(boolean z13, boolean z14) {
        long j13;
        this.f86404J = z13;
        if (!z13 || z14) {
            j13 = -9223372036854775807L;
        } else {
            ((d7.g0) this.f86426q).getClass();
            j13 = SystemClock.elapsedRealtime();
        }
        this.K = j13;
    }

    public final void G(int i13) {
        w1 w1Var = this.f86405a[i13];
        try {
            a1 a1Var = this.f86429t.f86129j;
            a1Var.getClass();
            h g13 = w1Var.g(a1Var);
            g13.getClass();
            g8.b1 b1Var = g13.f86178i;
            b1Var.getClass();
            b1Var.b();
        } catch (IOException | RuntimeException e13) {
            int i14 = w1Var.f86446a.f86171b;
            if (i14 != 3 && i14 != 5) {
                throw e13;
            }
            k8.z zVar = this.f86429t.f86129j.f86088p;
            d7.u.d("ExoPlayerImplInternal", "Disabling track due to error: " + androidx.media3.common.b.d(zVar.f78586c[i13].r()), e13);
            k8.z zVar2 = new k8.z((v1[]) zVar.f78585b.clone(), (k8.t[]) zVar.f78586c.clone(), zVar.f78587d, zVar.f78588e);
            zVar2.f78585b[i13] = null;
            zVar2.f78586c[i13] = null;
            f(i13);
            a1 a1Var2 = this.f86429t.f86129j;
            a1Var2.a(zVar2, this.E.f86348s, false, new boolean[a1Var2.f86083k.length]);
        }
    }

    public final synchronized void G0(ok.g0 g0Var, long j13) {
        ((d7.g0) this.f86426q).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j13;
        boolean z13 = false;
        while (!((Boolean) g0Var.get()).booleanValue() && j13 > 0) {
            try {
                this.f86426q.getClass();
                wait(j13);
            } catch (InterruptedException unused) {
                z13 = true;
            }
            ((d7.g0) this.f86426q).getClass();
            j13 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    public final void H(final int i13, final boolean z13) {
        boolean[] zArr = this.f86409c;
        if (zArr[i13] != z13) {
            zArr[i13] = z13;
            this.A.d(new Runnable() { // from class: m7.n0
                @Override // java.lang.Runnable
                public final void run() {
                    u0 u0Var = u0.this;
                    w1[] w1VarArr = u0Var.f86405a;
                    final int i14 = i13;
                    final int i15 = w1VarArr[i14].f86446a.f86171b;
                    n7.c0 c0Var = (n7.c0) u0Var.f86435z;
                    final n7.b w13 = c0Var.w();
                    final boolean z14 = z13;
                    c0Var.x(w13, 1033, new d7.r() { // from class: n7.a0
                        @Override // d7.r
                        /* renamed from: invoke */
                        public final void mo0invoke(Object obj) {
                            ((c) obj).a0(i14, i15, w13, z14);
                        }
                    });
                }
            });
        }
    }

    public final void I() {
        u(this.f86430u.b(), true);
    }

    public final void J() {
        this.F.a(1);
        throw null;
    }

    public final void K() {
        for (a1 a1Var = this.f86429t.f86129j; a1Var != null; a1Var = a1Var.f86086n) {
            for (k8.t tVar : a1Var.f86088p.f78586c) {
                if (tVar != null) {
                    tVar.v();
                }
            }
        }
    }

    public final void L(a7.p0 p0Var) {
        this.f86417h.b(16, p0Var).b();
    }

    public final void M() {
        this.F.a(1);
        int i13 = 0;
        S(false, false, false, true);
        n nVar = (n) this.f86415f;
        nVar.getClass();
        long id3 = Thread.currentThread().getId();
        long j13 = nVar.f86310k;
        bf.b.s("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j13 == -1 || j13 == id3);
        nVar.f86310k = id3;
        HashMap hashMap = nVar.f86309j;
        n7.q0 q0Var = this.f86433x;
        if (!hashMap.containsKey(q0Var)) {
            hashMap.put(q0Var, new m());
        }
        m mVar = (m) hashMap.get(q0Var);
        mVar.getClass();
        int i14 = nVar.f86305f;
        if (i14 == -1) {
            i14 = 13107200;
        }
        mVar.f86298b = i14;
        mVar.f86297a = false;
        q0(this.E.f86330a.q() ? 4 : 2);
        o1 o1Var = this.E;
        boolean z13 = o1Var.f86341l;
        C0(this.C.e(o1Var.f86334e, z13), o1Var.f86343n, z13, o1Var.f86342m);
        g7.a0 c13 = this.f86416g.c();
        n1 n1Var = this.f86430u;
        bf.b.t(!n1Var.f86325k);
        n1Var.f86326l = c13;
        while (true) {
            ArrayList arrayList = n1Var.f86316b;
            if (i13 >= arrayList.size()) {
                n1Var.f86325k = true;
                this.f86417h.f(2);
                return;
            } else {
                l1 l1Var = (l1) arrayList.get(i13);
                n1Var.f(l1Var);
                n1Var.f86321g.add(l1Var);
                i13++;
            }
        }
    }

    public final void N() {
        try {
            S(true, false, true, false);
            O();
            w0 w0Var = this.f86415f;
            n nVar = (n) w0Var;
            if (nVar.f86309j.remove(this.f86433x) != null) {
                nVar.d();
            }
            if (nVar.f86309j.isEmpty()) {
                nVar.f86310k = -1L;
            }
            g gVar = this.C;
            gVar.f86157c = null;
            gVar.a();
            gVar.d(0);
            this.f86411d.f();
            q0(1);
            this.f86418i.a();
            synchronized (this) {
                this.G = true;
                notifyAll();
            }
        } catch (Throwable th3) {
            this.f86418i.a();
            synchronized (this) {
                this.G = true;
                notifyAll();
                throw th3;
            }
        }
    }

    public final void O() {
        for (int i13 = 0; i13 < this.f86405a.length; i13++) {
            h hVar = this.f86407b[i13];
            synchronized (hVar.f86170a) {
                hVar.f86186q = null;
            }
            w1 w1Var = this.f86405a[i13];
            h hVar2 = w1Var.f86446a;
            bf.b.t(hVar2.f86177h == 0);
            hVar2.u();
            w1Var.f86450e = false;
            h hVar3 = w1Var.f86448c;
            if (hVar3 != null) {
                bf.b.t(hVar3.f86177h == 0);
                hVar3.u();
                w1Var.f86451f = false;
            }
        }
    }

    public final void P(int i13, int i14, g8.e1 e1Var) {
        this.F.a(1);
        n1 n1Var = this.f86430u;
        n1Var.getClass();
        bf.b.i(i13 >= 0 && i13 <= i14 && i14 <= n1Var.f86316b.size());
        n1Var.f86324j = e1Var;
        n1Var.h(i13, i14);
        u(n1Var.b(), false);
    }

    public final void Q() {
        boolean z13;
        float f13 = this.f86424o.d().f1164a;
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86129j;
        a1 a1Var2 = c1Var.f86130k;
        boolean z14 = true;
        k8.z zVar = null;
        a1 a1Var3 = a1Var;
        boolean z15 = true;
        while (a1Var3 != null && a1Var3.f86078f) {
            o1 o1Var = this.E;
            k8.z k13 = a1Var3.k(f13, o1Var.f86330a, o1Var.f86341l);
            k8.z zVar2 = a1Var3 == this.f86429t.f86129j ? k13 : zVar;
            if (!k13.a(a1Var3.f86088p)) {
                if (z15) {
                    c1 c1Var2 = this.f86429t;
                    a1 a1Var4 = c1Var2.f86129j;
                    boolean z16 = (c1Var2.u(a1Var4) & z14) != 0 ? z14 : false;
                    boolean[] zArr = new boolean[this.f86405a.length];
                    zVar2.getClass();
                    long a13 = a1Var4.a(zVar2, this.E.f86348s, z16, zArr);
                    o1 o1Var2 = this.E;
                    boolean z17 = (o1Var2.f86334e == 4 || a13 == o1Var2.f86348s) ? false : z14;
                    o1 o1Var3 = this.E;
                    this.E = y(o1Var3.f86331b, a13, o1Var3.f86332c, o1Var3.f86333d, z17, 5);
                    if (z17) {
                        U(a13);
                    }
                    d();
                    boolean[] zArr2 = new boolean[this.f86405a.length];
                    int i13 = 0;
                    while (true) {
                        w1[] w1VarArr = this.f86405a;
                        if (i13 >= w1VarArr.length) {
                            break;
                        }
                        int d2 = w1VarArr[i13].d();
                        zArr2[i13] = this.f86405a[i13].k();
                        this.f86405a[i13].n(a1Var4.f86075c[i13], this.f86424o, this.T, zArr[i13]);
                        if (d2 - this.f86405a[i13].d() > 0) {
                            H(i13, false);
                        }
                        this.R -= d2 - this.f86405a[i13].d();
                        i13++;
                    }
                    j(zArr2, this.T);
                    a1Var4.f86081i = true;
                    z13 = true;
                } else {
                    this.f86429t.u(a1Var3);
                    if (a1Var3.f86078f) {
                        long max = Math.max(a1Var3.f86080h.f86101b, this.T - a1Var3.f86089q);
                        if (this.B && b() && this.f86429t.k() == a1Var3) {
                            d();
                        }
                        a1Var3.a(k13, max, false, new boolean[a1Var3.f86083k.length]);
                    }
                    z13 = true;
                }
                t(z13);
                if (this.E.f86334e != 4) {
                    B();
                    D0();
                    this.f86417h.f(2);
                    return;
                }
                return;
            }
            boolean z18 = z14;
            if (a1Var3 == a1Var2) {
                z15 = false;
            }
            a1Var3 = a1Var3.f86086n;
            z14 = z18;
            zVar = zVar2;
        }
    }

    public final void R() {
        Q();
        Z(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u0.S(boolean, boolean, boolean, boolean):void");
    }

    public final void T() {
        a1 a1Var = this.f86429t.f86129j;
        this.I = a1Var != null && a1Var.f86080h.f86108i && this.H;
    }

    public final void U(long j13) {
        a1 a1Var = this.f86429t.f86129j;
        long m13 = a1Var == null ? j13 + 1000000000000L : a1Var.m(j13);
        this.T = m13;
        this.f86424o.f86350a.b(m13);
        for (w1 w1Var : this.f86405a) {
            long j14 = this.T;
            h g13 = w1Var.g(a1Var);
            if (g13 != null) {
                g13.f86183n = false;
                g13.f86181l = j14;
                g13.f86182m = j14;
                g13.t(j14, false);
            }
        }
        for (a1 a1Var2 = r0.f86129j; a1Var2 != null; a1Var2 = a1Var2.f86086n) {
            for (k8.t tVar : a1Var2.f86088p.f78586c) {
                if (tVar != null) {
                    tVar.k();
                }
            }
        }
    }

    public final void V(a7.b1 b1Var, a7.b1 b1Var2) {
        if (b1Var.q() && b1Var2.q()) {
            return;
        }
        ArrayList arrayList = this.f86425p;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ep.b.A(arrayList.get(size));
            throw null;
        }
    }

    public final void Y(long j13) {
        int i13 = this.E.f86334e;
        long j14 = f86402f0;
        boolean z13 = this.f86434y;
        long j15 = (i13 != 3 || (!z13 && u0())) ? j14 : 1000L;
        if (z13 && u0()) {
            for (w1 w1Var : this.f86405a) {
                j15 = Math.min(j15, d7.n0.o0(w1Var.e(this.T, this.U)));
            }
            a1 a1Var = this.f86429t.f86129j;
            if ((a1Var != null ? a1Var.f86086n : null) != null) {
                if ((d7.n0.X(j15) * this.E.f86344o.f1164a) + this.T >= r4.f()) {
                    j15 = Math.min(j15, j14);
                }
            }
        }
        this.f86417h.f53829a.sendEmptyMessageAtTime(2, j13 + j15);
    }

    public final void Z(boolean z13) {
        g8.e0 e0Var = this.f86429t.f86129j.f86080h.f86100a;
        long b03 = b0(e0Var, this.E.f86348s, true, false);
        if (b03 != this.E.f86348s) {
            o1 o1Var = this.E;
            this.E = y(e0Var, b03, o1Var.f86332c, o1Var.f86333d, z13, 5);
        }
    }

    public final void a(q0 q0Var, int i13) {
        this.F.a(1);
        n1 n1Var = this.f86430u;
        if (i13 == -1) {
            i13 = n1Var.f86316b.size();
        }
        u(n1Var.a(i13, q0Var.f86363a, q0Var.f86364b), false);
    }

    public final void a0(t0 t0Var) {
        long j13;
        long j14;
        boolean z13;
        g8.e0 e0Var;
        long j15;
        long j16;
        long j17;
        o1 o1Var;
        int i13;
        this.F.a(1);
        Pair W = W(this.E.f86330a, t0Var, true, this.M, this.N, this.f86420k, this.f86421l);
        if (W == null) {
            Pair n13 = n(this.E.f86330a);
            e0Var = (g8.e0) n13.first;
            long longValue = ((Long) n13.second).longValue();
            z13 = !this.E.f86330a.q();
            j13 = longValue;
            j14 = -9223372036854775807L;
        } else {
            Object obj = W.first;
            long longValue2 = ((Long) W.second).longValue();
            long j18 = t0Var.f86390c == -9223372036854775807L ? -9223372036854775807L : longValue2;
            g8.e0 x13 = this.f86429t.x(this.E.f86330a, obj, longValue2);
            if (x13.b()) {
                this.E.f86330a.h(x13.f64233a, this.f86421l);
                j13 = this.f86421l.h(x13.f64234b) == x13.f64235c ? this.f86421l.e() : 0L;
                j14 = j18;
                e0Var = x13;
                z13 = true;
            } else {
                j13 = longValue2;
                j14 = j18;
                z13 = t0Var.f86390c == -9223372036854775807L;
                e0Var = x13;
            }
        }
        try {
            if (this.E.f86330a.q()) {
                this.S = t0Var;
            } else {
                if (W != null) {
                    if (e0Var.equals(this.E.f86331b)) {
                        a1 a1Var = this.f86429t.f86129j;
                        long c13 = (a1Var == null || !a1Var.f86078f || j13 == 0) ? j13 : a1Var.f86073a.c(j13, this.D);
                        if (d7.n0.o0(c13) == d7.n0.o0(this.E.f86348s) && ((i13 = (o1Var = this.E).f86334e) == 2 || i13 == 3)) {
                            long j19 = o1Var.f86348s;
                            this.E = y(e0Var, j19, j14, j19, z13, 2);
                            return;
                        }
                        j16 = c13;
                    } else {
                        j16 = j13;
                    }
                    boolean z14 = this.E.f86334e == 4;
                    c1 c1Var = this.f86429t;
                    long b03 = b0(e0Var, j16, c1Var.f86129j != c1Var.f86130k, z14);
                    z13 |= j13 != b03;
                    try {
                        o1 o1Var2 = this.E;
                        a7.b1 b1Var = o1Var2.f86330a;
                        E0(b1Var, e0Var, b1Var, o1Var2.f86331b, j14, true);
                        j17 = b03;
                        this.E = y(e0Var, j17, j14, j17, z13, 2);
                    } catch (Throwable th3) {
                        th = th3;
                        j15 = b03;
                        this.E = y(e0Var, j15, j14, j15, z13, 2);
                        throw th;
                    }
                }
                if (this.E.f86334e != 1) {
                    q0(4);
                }
                S(false, true, false, true);
            }
            j17 = j13;
            this.E = y(e0Var, j17, j14, j17, z13, 2);
        } catch (Throwable th4) {
            th = th4;
            j15 = j13;
        }
    }

    public final boolean b() {
        if (!this.B) {
            return false;
        }
        for (w1 w1Var : this.f86405a) {
            if (w1Var.j()) {
                return true;
            }
        }
        return false;
    }

    public final long b0(g8.e0 e0Var, long j13, boolean z13, boolean z14) {
        w1[] w1VarArr;
        y0();
        F0(false, true);
        if (z14 || this.E.f86334e == 3) {
            q0(2);
        }
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86129j;
        a1 a1Var2 = a1Var;
        while (a1Var2 != null && !e0Var.equals(a1Var2.f86080h.f86100a)) {
            a1Var2 = a1Var2.f86086n;
        }
        if (z13 || a1Var != a1Var2 || (a1Var2 != null && a1Var2.m(j13) < 0)) {
            int i13 = 0;
            while (true) {
                w1VarArr = this.f86405a;
                if (i13 >= w1VarArr.length) {
                    break;
                }
                f(i13);
                i13++;
            }
            this.f86410c0 = -9223372036854775807L;
            if (a1Var2 != null) {
                while (c1Var.f86129j != a1Var2) {
                    c1Var.a();
                }
                c1Var.u(a1Var2);
                a1Var2.l(1000000000000L);
                j(new boolean[w1VarArr.length], c1Var.f86130k.f());
                a1Var2.f86081i = true;
            }
        }
        d();
        if (a1Var2 != null) {
            c1Var.u(a1Var2);
            if (!a1Var2.f86078f) {
                a1Var2.f86080h = a1Var2.f86080h.b(j13);
            } else if (a1Var2.f86079g) {
                g8.c0 c0Var = a1Var2.f86073a;
                j13 = c0Var.f(j13);
                c0Var.u(j13 - this.f86422m, this.f86423n);
            }
            U(j13);
            B();
        } else {
            c1Var.d();
            U(j13);
        }
        t(false);
        this.f86417h.f(2);
        return j13;
    }

    public final void c() {
        R();
    }

    public final void c0(r1 r1Var) {
        r1Var.getClass();
        Looper looper = r1Var.f86378e;
        Looper looper2 = this.f86419j;
        d7.i0 i0Var = this.f86417h;
        if (looper != looper2) {
            i0Var.b(15, r1Var).b();
            return;
        }
        synchronized (r1Var) {
        }
        try {
            r1Var.f86374a.b(r1Var.f86376c, r1Var.f86377d);
            r1Var.a(true);
            int i13 = this.E.f86334e;
            if (i13 == 3 || i13 == 2) {
                i0Var.f(2);
            }
        } catch (Throwable th3) {
            r1Var.a(true);
            throw th3;
        }
    }

    public final void d() {
        if (this.B && b()) {
            for (w1 w1Var : this.f86405a) {
                int d2 = w1Var.d();
                w1Var.a(this.f86424o);
                this.R -= d2 - w1Var.d();
            }
            this.f86410c0 = -9223372036854775807L;
        }
    }

    public final void d0(r1 r1Var) {
        Looper looper = r1Var.f86378e;
        if (looper.getThread().isAlive()) {
            ((d7.g0) this.f86426q).a(looper, null).d(new w2.c(17, this, r1Var));
        } else {
            d7.u.g("TAG", "Trying to send message on a dead thread.");
            r1Var.a(false);
        }
    }

    @Override // g8.b0
    public final void e(g8.c0 c0Var) {
        this.f86417h.b(8, c0Var).b();
    }

    public final void e0(long j13) {
        int i13;
        for (w1 w1Var : this.f86405a) {
            h hVar = w1Var.f86446a;
            if (w1.l(hVar) && (i13 = w1Var.f86449d) != 4 && i13 != 2) {
                w1.s(hVar, j13);
            }
            h hVar2 = w1Var.f86448c;
            if (hVar2 != null && hVar2.f86177h != 0 && w1Var.f86449d != 3) {
                w1.s(hVar2, j13);
            }
        }
    }

    public final void f(int i13) {
        w1[] w1VarArr = this.f86405a;
        int d2 = w1VarArr[i13].d();
        w1 w1Var = w1VarArr[i13];
        h hVar = w1Var.f86446a;
        p pVar = this.f86424o;
        w1Var.b(hVar, pVar);
        h hVar2 = w1Var.f86448c;
        if (hVar2 != null) {
            boolean z13 = w1.l(hVar2) && w1Var.f86449d != 3;
            w1Var.b(hVar2, pVar);
            w1Var.o(false);
            if (z13) {
                w1Var.u(true);
            }
        }
        w1Var.f86449d = 0;
        H(i13, false);
        this.R -= d2;
    }

    public final void f0(a7.f fVar, boolean z13) {
        this.f86411d.h(fVar);
        if (!z13) {
            fVar = null;
        }
        g gVar = this.C;
        if (!Objects.equals(gVar.f86158d, fVar)) {
            gVar.f86158d = fVar;
            int b13 = g.b(fVar);
            gVar.f86160f = b13;
            boolean z14 = true;
            if (b13 != 1 && b13 != 0) {
                z14 = false;
            }
            bf.b.h("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z14);
        }
        o1 o1Var = this.E;
        boolean z15 = o1Var.f86341l;
        C0(gVar.e(o1Var.f86334e, z15), o1Var.f86343n, z15, o1Var.f86342m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x0619, code lost:
    
        if (A() != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x06c9, code lost:
    
        if (r3 >= r13.b()) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0236, code lost:
    
        if (r35.f86410c0 == (-9223372036854775807L)) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0248, code lost:
    
        r35.f86410c0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x024a, code lost:
    
        if (r1 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x024e, code lost:
    
        if (r35.f86412d0 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0250, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0253, code lost:
    
        if (r1 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0255, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0257, code lost:
    
        if (r2 >= r15.length) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x025d, code lost:
    
        if (r7.c(r2) != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0260, code lost:
    
        r3 = r7.f78586c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0276, code lost:
    
        if (a7.o0.a(r3[r2].r().f18765o, r3[r2].r().f18761k) != false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x027e, code lost:
    
        if (r15[r2].j() != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0286, code lost:
    
        e0(r0.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0291, code lost:
    
        if (r0.h() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0293, code lost:
    
        r9.u(r0);
        t(false);
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x029c, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0281, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0284, code lost:
    
        if (r1 != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x02cc, code lost:
    
        if (m7.w1.l(r12) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0252, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0246, code lost:
    
        if (r0.f86073a.k() != r7) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ae A[EDGE_INSN: B:68:0x03ae->B:69:0x03ae BREAK  A[LOOP:0: B:48:0x035e->B:65:0x03aa], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0409  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 2015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u0.g():void");
    }

    public final void g0(AtomicBoolean atomicBoolean, boolean z13) {
        if (this.O != z13) {
            this.O = z13;
            if (!z13) {
                for (w1 w1Var : this.f86405a) {
                    w1Var.q();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void h(a1 a1Var, int i13, boolean z13, long j13) {
        boolean z14;
        w1 w1Var = this.f86405a[i13];
        if (w1Var.k()) {
            return;
        }
        boolean z15 = a1Var == this.f86429t.f86129j;
        k8.z zVar = a1Var.f86088p;
        v1 v1Var = zVar.f78585b[i13];
        k8.t tVar = zVar.f78586c[i13];
        boolean z16 = u0() && this.E.f86334e == 3;
        boolean z17 = !z13 && z16;
        this.R++;
        g8.b1 b1Var = a1Var.f86075c[i13];
        long j14 = a1Var.f86089q;
        g8.e0 e0Var = a1Var.f86080h.f86100a;
        int length = tVar != null ? tVar.length() : 0;
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[length];
        for (int i14 = 0; i14 < length; i14++) {
            tVar.getClass();
            bVarArr[i14] = tVar.e(i14);
        }
        int i15 = w1Var.f86449d;
        p pVar = this.f86424o;
        if (i15 == 0 || i15 == 2 || i15 == 4) {
            boolean z18 = z17;
            z14 = z16;
            w1Var.f86450e = true;
            h hVar = w1Var.f86446a;
            bf.b.t(hVar.f86177h == 0);
            hVar.f86173d = v1Var;
            hVar.f86177h = 1;
            hVar.s(z18, z15);
            hVar.B(bVarArr, b1Var, j13, j14, e0Var);
            hVar.f86183n = false;
            hVar.f86181l = j13;
            hVar.f86182m = j13;
            hVar.t(j13, z18);
            pVar.b(hVar);
        } else {
            w1Var.f86451f = true;
            h hVar2 = w1Var.f86448c;
            hVar2.getClass();
            bf.b.t(hVar2.f86177h == 0);
            hVar2.f86173d = v1Var;
            hVar2.f86177h = 1;
            hVar2.s(z17, z15);
            z14 = z16;
            hVar2.B(bVarArr, b1Var, j13, j14, e0Var);
            hVar2.f86183n = false;
            hVar2.f86181l = j13;
            hVar2.f86182m = j13;
            hVar2.t(j13, z17);
            pVar.b(hVar2);
        }
        p0 p0Var = new p0(this);
        h g13 = w1Var.g(a1Var);
        g13.getClass();
        g13.b(11, p0Var);
        if (z14 && z15) {
            w1Var.t();
        }
    }

    public final void h0(a7.p0 p0Var) {
        this.f86417h.e(16);
        this.f86424o.c(p0Var);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ExoPlaybackException exoPlaybackException;
        d7.i0 i0Var;
        boolean z13;
        int i13;
        a1 a1Var;
        a1 a1Var2;
        a1 a1Var3;
        int i14;
        try {
            switch (message.what) {
                case 1:
                    boolean z14 = message.arg1 != 0;
                    int i15 = message.arg2;
                    int i16 = i15 >> 4;
                    int i17 = i15 & 15;
                    if (z14) {
                        ((n) this.f86415f).getClass();
                    }
                    this.F.a(1);
                    C0(this.C.e(this.E.f86334e, z14), i16, z14, i17);
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    a0((t0) message.obj);
                    break;
                case 4:
                    k0((a7.p0) message.obj);
                    break;
                case 5:
                    n0((x1) message.obj);
                    break;
                case 6:
                    x0(false, true);
                    break;
                case 7:
                    N();
                    return true;
                case 8:
                    v((g8.c0) message.obj);
                    break;
                case 9:
                    r((g8.c0) message.obj);
                    break;
                case 10:
                    Q();
                    break;
                case 11:
                    m0(message.arg1);
                    break;
                case 12:
                    o0(message.arg1 != 0);
                    break;
                case 13:
                    g0((AtomicBoolean) message.obj, message.arg1 != 0);
                    break;
                case 14:
                    c0((r1) message.obj);
                    break;
                case 15:
                    d0((r1) message.obj);
                    break;
                case 16:
                    x((a7.p0) message.obj, false);
                    break;
                case 17:
                    i0((q0) message.obj);
                    break;
                case 18:
                    a((q0) message.obj, message.arg1);
                    break;
                case 19:
                    ep.b.A(message.obj);
                    J();
                    throw null;
                case 20:
                    P(message.arg1, message.arg2, (g8.e1) message.obj);
                    break;
                case 21:
                    p0((g8.e1) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    j0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    c();
                    break;
                case 26:
                    R();
                    break;
                case 27:
                    B0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    l0((y) message.obj);
                    break;
                case 29:
                    M();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    r0(pair.first, (AtomicBoolean) pair.second);
                    break;
                case 31:
                    f0((a7.f) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    s0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
            }
        } catch (ParserException e13) {
            boolean z15 = e13.f18743a;
            int i18 = e13.f18744b;
            if (i18 == 1) {
                i14 = z15 ? 3001 : 3003;
            } else {
                if (i18 == 4) {
                    i14 = z15 ? 3002 : 3004;
                }
                s(e13, r3);
            }
            r3 = i14;
            s(e13, r3);
        } catch (DataSourceException e14) {
            s(e14, e14.f18778a);
        } catch (ExoPlaybackException e15) {
            ExoPlaybackException exoPlaybackException2 = e15;
            int i19 = exoPlaybackException2.f18786c;
            w1[] w1VarArr = this.f86405a;
            c1 c1Var = this.f86429t;
            if (i19 == 1 && (a1Var2 = c1Var.f86130k) != null) {
                int length = w1VarArr.length;
                int i23 = exoPlaybackException2.f18788e;
                exoPlaybackException2 = exoPlaybackException2.a((!w1VarArr[i23 % length].m(i23) || (a1Var3 = a1Var2.f86086n) == null) ? a1Var2.f86080h.f86100a : a1Var3.f86080h.f86100a);
            }
            int i24 = exoPlaybackException2.f18786c;
            d7.i0 i0Var2 = this.f86417h;
            if (i24 == 1) {
                int length2 = w1VarArr.length;
                int i25 = exoPlaybackException2.f18788e;
                if (w1VarArr[i25 % length2].m(i25)) {
                    this.f86412d0 = true;
                    d();
                    a1 k13 = c1Var.k();
                    a1 a1Var4 = c1Var.f86129j;
                    if (a1Var4 != k13) {
                        while (a1Var4 != null) {
                            a1 a1Var5 = a1Var4.f86086n;
                            if (a1Var5 == k13) {
                                break;
                            }
                            a1Var4 = a1Var5;
                        }
                    }
                    c1Var.u(a1Var4);
                    if (this.E.f86334e != 4) {
                        B();
                        i0Var2.f(2);
                    }
                }
            }
            ExoPlaybackException exoPlaybackException3 = this.X;
            if (exoPlaybackException3 != null) {
                exoPlaybackException3.addSuppressed(exoPlaybackException2);
                exoPlaybackException2 = this.X;
            }
            ExoPlaybackException exoPlaybackException4 = exoPlaybackException2;
            if (exoPlaybackException4.f18786c != 1 || c1Var.f86129j == c1Var.f86130k) {
                exoPlaybackException = exoPlaybackException4;
                i0Var = i0Var2;
            } else {
                while (true) {
                    a1Var = c1Var.f86129j;
                    if (a1Var == c1Var.f86130k) {
                        break;
                    }
                    c1Var.a();
                }
                bf.b.n(a1Var);
                E();
                b1 b1Var = a1Var.f86080h;
                g8.e0 e0Var = b1Var.f86100a;
                long j13 = b1Var.f86101b;
                exoPlaybackException = exoPlaybackException4;
                i0Var = i0Var2;
                this.E = y(e0Var, j13, b1Var.f86102c, j13, true, 0);
            }
            if (exoPlaybackException.f18792i && (this.X == null || (i13 = exoPlaybackException.f18745a) == 5004 || i13 == 5003)) {
                d7.u.h("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException);
                if (this.X == null) {
                    this.X = exoPlaybackException;
                }
                d7.h0 b13 = i0Var.b(25, exoPlaybackException);
                i0Var.getClass();
                Message message2 = b13.f53827a;
                message2.getClass();
                i0Var.f53829a.sendMessageAtFrontOfQueue(message2);
                b13.a();
                z13 = true;
            } else {
                d7.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
                z13 = true;
                x0(true, false);
                this.E = this.E.f(exoPlaybackException);
            }
        } catch (DrmSession$DrmSessionException e16) {
            s(e16, e16.f18807a);
        } catch (BehindLiveWindowException e17) {
            s(e17, 1002);
        } catch (IOException e18) {
            s(e18, 2000);
        } catch (RuntimeException e19) {
            ExoPlaybackException b14 = ExoPlaybackException.b(e19, ((e19 instanceof IllegalStateException) || (e19 instanceof IllegalArgumentException)) ? 1004 : 1000);
            d7.u.d("ExoPlayerImplInternal", "Playback error", b14);
            x0(true, false);
            this.E = this.E.f(b14);
        }
        z13 = true;
        E();
        return z13;
    }

    @Override // g8.c1
    public final void i(g8.d1 d1Var) {
        this.f86417h.b(9, (g8.c0) d1Var).b();
    }

    public final void i0(q0 q0Var) {
        this.F.a(1);
        int i13 = q0Var.f86365c;
        g8.e1 e1Var = q0Var.f86364b;
        List list = q0Var.f86363a;
        if (i13 != -1) {
            this.S = new t0(new t1(list, e1Var), q0Var.f86365c, q0Var.f86366d);
        }
        n1 n1Var = this.f86430u;
        ArrayList arrayList = n1Var.f86316b;
        n1Var.h(0, arrayList.size());
        u(n1Var.a(arrayList.size(), list, e1Var), false);
    }

    public final void j(boolean[] zArr, long j13) {
        w1[] w1VarArr;
        a1 a1Var = this.f86429t.f86130k;
        k8.z zVar = a1Var.f86088p;
        int i13 = 0;
        while (true) {
            w1VarArr = this.f86405a;
            if (i13 >= w1VarArr.length) {
                break;
            }
            if (!zVar.c(i13)) {
                w1VarArr[i13].q();
            }
            i13++;
        }
        for (int i14 = 0; i14 < w1VarArr.length; i14++) {
            if (zVar.c(i14) && w1VarArr[i14].g(a1Var) == null) {
                h(a1Var, i14, zArr[i14], j13);
            }
        }
    }

    public final void j0(boolean z13) {
        this.H = z13;
        T();
        if (this.I) {
            c1 c1Var = this.f86429t;
            if (c1Var.f86130k != c1Var.f86129j) {
                Z(true);
                t(false);
            }
        }
    }

    public final long k() {
        o1 o1Var = this.E;
        return l(o1Var.f86330a, o1Var.f86331b.f64233a, o1Var.f86348s);
    }

    public final void k0(a7.p0 p0Var) {
        h0(p0Var);
        x(this.f86424o.d(), true);
    }

    public final long l(a7.b1 b1Var, Object obj, long j13) {
        a7.z0 z0Var = this.f86421l;
        int i13 = b1Var.h(obj, z0Var).f1253c;
        a7.a1 a1Var = this.f86420k;
        b1Var.o(i13, a1Var);
        if (a1Var.f934f != -9223372036854775807L && a1Var.b() && a1Var.f937i) {
            return d7.n0.X(d7.n0.E(a1Var.f935g) - a1Var.f934f) - (j13 + z0Var.f1255e);
        }
        return -9223372036854775807L;
    }

    public final void l0(y yVar) {
        this.f86406a0 = yVar;
        a7.b1 b1Var = this.E.f86330a;
        c1 c1Var = this.f86429t;
        c1Var.f86128i = yVar;
        c1Var.m(b1Var);
    }

    public final long m(a1 a1Var) {
        if (a1Var == null) {
            return 0L;
        }
        long j13 = a1Var.f86089q;
        if (!a1Var.f86078f) {
            return j13;
        }
        int i13 = 0;
        while (true) {
            w1[] w1VarArr = this.f86405a;
            if (i13 >= w1VarArr.length) {
                return j13;
            }
            if (w1VarArr[i13].g(a1Var) != null) {
                long f13 = w1VarArr[i13].f(a1Var);
                if (f13 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j13 = Math.max(f13, j13);
            }
            i13++;
        }
    }

    public final void m0(int i13) {
        this.M = i13;
        a7.b1 b1Var = this.E.f86330a;
        c1 c1Var = this.f86429t;
        c1Var.f86126g = i13;
        int z13 = c1Var.z(b1Var);
        if ((z13 & 1) != 0) {
            Z(true);
        } else if ((z13 & 2) != 0) {
            d();
        }
        t(false);
    }

    public final Pair n(a7.b1 b1Var) {
        if (b1Var.q()) {
            return Pair.create(o1.f86329u, 0L);
        }
        Pair j13 = b1Var.j(this.f86420k, this.f86421l, b1Var.a(this.N), -9223372036854775807L);
        g8.e0 x13 = this.f86429t.x(b1Var, j13.first, 0L);
        long longValue = ((Long) j13.second).longValue();
        if (x13.b()) {
            Object obj = x13.f64233a;
            a7.z0 z0Var = this.f86421l;
            b1Var.h(obj, z0Var);
            longValue = x13.f64235c == z0Var.h(x13.f64234b) ? z0Var.f1257g.f949c : 0L;
        }
        return Pair.create(x13, Long.valueOf(longValue));
    }

    public final void n0(x1 x1Var) {
        this.D = x1Var;
    }

    public final long o(long j13) {
        a1 a1Var = this.f86429t.f86132m;
        if (a1Var == null) {
            return 0L;
        }
        return Math.max(0L, j13 - (this.T - a1Var.f86089q));
    }

    public final void o0(boolean z13) {
        this.N = z13;
        a7.b1 b1Var = this.E.f86330a;
        c1 c1Var = this.f86429t;
        c1Var.f86127h = z13;
        int z14 = c1Var.z(b1Var);
        if ((z14 & 1) != 0) {
            Z(true);
        } else if ((z14 & 2) != 0) {
            d();
        }
        t(false);
    }

    public final void p(int i13) {
        o1 o1Var = this.E;
        C0(i13, o1Var.f86343n, o1Var.f86341l, o1Var.f86342m);
    }

    public final void p0(g8.e1 e1Var) {
        this.F.a(1);
        n1 n1Var = this.f86430u;
        int size = n1Var.f86316b.size();
        if (e1Var.f64239b.length != size) {
            e1Var = new g8.e1(new Random(e1Var.f64238a.nextLong())).a(0, size);
        }
        n1Var.f86324j = e1Var;
        u(n1Var.b(), false);
    }

    public final void q() {
        s0(this.f86414e0);
    }

    public final void q0(int i13) {
        o1 o1Var = this.E;
        if (o1Var.f86334e != i13) {
            if (i13 != 2) {
                this.Z = -9223372036854775807L;
            }
            this.E = o1Var.h(i13);
        }
    }

    public final void r(g8.c0 c0Var) {
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86132m;
        if (a1Var != null && a1Var.f86073a == c0Var) {
            c1Var.s(this.T);
            B();
        } else if (c1Var.p(c0Var)) {
            C();
        }
    }

    public final void r0(Object obj, AtomicBoolean atomicBoolean) {
        for (w1 w1Var : this.f86405a) {
            h hVar = w1Var.f86446a;
            if (hVar.f86171b == 2) {
                int i13 = w1Var.f86449d;
                if (i13 == 4 || i13 == 1) {
                    h hVar2 = w1Var.f86448c;
                    hVar2.getClass();
                    hVar2.b(1, obj);
                } else {
                    hVar.b(1, obj);
                }
            }
        }
        int i14 = this.E.f86334e;
        if (i14 == 3 || i14 == 2) {
            this.f86417h.f(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void s(IOException iOException, int i13) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, i13, iOException);
        a1 a1Var = this.f86429t.f86129j;
        if (a1Var != null) {
            exoPlaybackException = exoPlaybackException.a(a1Var.f86080h.f86100a);
        }
        d7.u.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        x0(false, false);
        this.E = this.E.f(exoPlaybackException);
    }

    public final void s0(float f13) {
        this.f86414e0 = f13;
        float f14 = f13 * this.C.f86161g;
        for (w1 w1Var : this.f86405a) {
            h hVar = w1Var.f86446a;
            if (hVar.f86171b == 1) {
                hVar.b(2, Float.valueOf(f14));
                h hVar2 = w1Var.f86448c;
                if (hVar2 != null) {
                    hVar2.b(2, Float.valueOf(f14));
                }
            }
        }
    }

    public final void t(boolean z13) {
        a1 a1Var = this.f86429t.f86132m;
        g8.e0 e0Var = a1Var == null ? this.E.f86331b : a1Var.f86080h.f86100a;
        boolean z14 = !this.E.f86340k.equals(e0Var);
        if (z14) {
            this.E = this.E.c(e0Var);
        }
        o1 o1Var = this.E;
        o1Var.f86346q = a1Var == null ? o1Var.f86348s : a1Var.e();
        o1 o1Var2 = this.E;
        o1Var2.f86347r = o(o1Var2.f86346q);
        if ((z14 || z13) && a1Var != null && a1Var.f86078f) {
            g8.e0 e0Var2 = a1Var.f86080h.f86100a;
            A0(a1Var.f86088p);
        }
    }

    public final void t0() {
        this.f86417h.f(34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x01db, code lost:
    
        if (r4.f(r5, r6) != 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x01dd, code lost:
    
        r4 = true;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01ec, code lost:
    
        if (r4.n(r3.f64234b) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f2 A[Catch: all -> 0x02ef, TryCatch #5 {all -> 0x02ef, blocks: (B:77:0x02e2, B:79:0x02ea, B:106:0x02f2, B:108:0x02f6, B:115:0x02fe, B:117:0x030b, B:119:0x0311, B:121:0x031b, B:123:0x0328, B:126:0x032b, B:129:0x0336), top: B:61:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ea A[Catch: all -> 0x02ef, TryCatch #5 {all -> 0x02ef, blocks: (B:77:0x02e2, B:79:0x02ea, B:106:0x02f2, B:108:0x02f6, B:115:0x02fe, B:117:0x030b, B:119:0x0311, B:121:0x031b, B:123:0x0328, B:126:0x032b, B:129:0x0336), top: B:61:0x02a6 }] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r37v0, types: [a7.b1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [m7.c1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(a7.b1 r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u0.u(a7.b1, boolean):void");
    }

    public final boolean u0() {
        o1 o1Var = this.E;
        return o1Var.f86341l && o1Var.f86343n == 0;
    }

    public final void v(g8.c0 c0Var) {
        c1 c1Var = this.f86429t;
        a1 a1Var = c1Var.f86132m;
        boolean z13 = a1Var != null && a1Var.f86073a == c0Var;
        p pVar = this.f86424o;
        if (!z13) {
            a1 j13 = c1Var.j(c0Var);
            if (j13 != null) {
                bf.b.t(true ^ j13.f86078f);
                float f13 = pVar.d().f1164a;
                o1 o1Var = this.E;
                j13.g(f13, o1Var.f86330a, o1Var.f86341l);
                if (c1Var.p(c0Var)) {
                    C();
                    return;
                }
                return;
            }
            return;
        }
        a1Var.getClass();
        if (!a1Var.f86078f) {
            float f14 = pVar.d().f1164a;
            o1 o1Var2 = this.E;
            a1Var.g(f14, o1Var2.f86330a, o1Var2.f86341l);
        }
        g8.e0 e0Var = a1Var.f86080h.f86100a;
        A0(a1Var.f86088p);
        if (a1Var == c1Var.f86129j) {
            U(a1Var.f86080h.f86101b);
            j(new boolean[this.f86405a.length], c1Var.f86130k.f());
            a1Var.f86081i = true;
            o1 o1Var3 = this.E;
            g8.e0 e0Var2 = o1Var3.f86331b;
            long j14 = a1Var.f86080h.f86101b;
            this.E = y(e0Var2, j14, o1Var3.f86332c, j14, false, 5);
        }
        B();
    }

    public final boolean v0(a7.b1 b1Var, g8.e0 e0Var) {
        if (e0Var.b() || b1Var.q()) {
            return false;
        }
        int i13 = b1Var.h(e0Var.f64233a, this.f86421l).f1253c;
        a7.a1 a1Var = this.f86420k;
        b1Var.o(i13, a1Var);
        return a1Var.b() && a1Var.f937i && a1Var.f934f != -9223372036854775807L;
    }

    public final void w(a7.p0 p0Var, float f13, boolean z13, boolean z14) {
        int i13;
        if (z13) {
            if (z14) {
                this.F.a(1);
            }
            this.E = this.E.g(p0Var);
        }
        float f14 = p0Var.f1164a;
        a1 a1Var = this.f86429t.f86129j;
        while (true) {
            i13 = 0;
            if (a1Var == null) {
                break;
            }
            k8.t[] tVarArr = a1Var.f86088p.f78586c;
            int length = tVarArr.length;
            while (i13 < length) {
                k8.t tVar = tVarArr[i13];
                if (tVar != null) {
                    tVar.i(f14);
                }
                i13++;
            }
            a1Var = a1Var.f86086n;
        }
        w1[] w1VarArr = this.f86405a;
        int length2 = w1VarArr.length;
        while (i13 < length2) {
            w1 w1Var = w1VarArr[i13];
            h hVar = w1Var.f86446a;
            float f15 = p0Var.f1164a;
            hVar.D(f13, f15);
            h hVar2 = w1Var.f86448c;
            if (hVar2 != null) {
                hVar2.D(f13, f15);
            }
            i13++;
        }
    }

    public final void w0() {
        a1 a1Var = this.f86429t.f86129j;
        if (a1Var == null) {
            return;
        }
        k8.z zVar = a1Var.f86088p;
        int i13 = 0;
        while (true) {
            w1[] w1VarArr = this.f86405a;
            if (i13 >= w1VarArr.length) {
                return;
            }
            if (zVar.c(i13)) {
                w1VarArr[i13].t();
            }
            i13++;
        }
    }

    public final void x(a7.p0 p0Var, boolean z13) {
        w(p0Var, p0Var.f1164a, true, z13);
    }

    public final void x0(boolean z13, boolean z14) {
        S(z13 || !this.O, false, true, false);
        this.F.a(z14 ? 1 : 0);
        n nVar = (n) this.f86415f;
        if (nVar.f86309j.remove(this.f86433x) != null) {
            nVar.d();
        }
        this.C.e(1, this.E.f86341l);
        q0(1);
        h1.b bVar = this.f86428s;
        ((l0) bVar.f66449b).f86271k.d(new e5.k(6, bVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m7.o1 y(g8.e0 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.u0.y(g8.e0, long, long, long, boolean, int):m7.o1");
    }

    public final void y0() {
        p pVar = this.f86424o;
        pVar.f86355f = false;
        y1 y1Var = pVar.f86350a;
        if (y1Var.f86490b) {
            y1Var.b(y1Var.e());
            y1Var.f86490b = false;
        }
        for (w1 w1Var : this.f86405a) {
            h hVar = w1Var.f86446a;
            if (w1.l(hVar)) {
                w1.c(hVar);
            }
            h hVar2 = w1Var.f86448c;
            if (hVar2 != null && hVar2.f86177h != 0) {
                w1.c(hVar2);
            }
        }
    }

    public final void z0() {
        a1 a1Var = this.f86429t.f86132m;
        boolean z13 = this.L || (a1Var != null && a1Var.f86073a.g());
        o1 o1Var = this.E;
        if (z13 != o1Var.f86336g) {
            this.E = o1Var.b(z13);
        }
    }
}
