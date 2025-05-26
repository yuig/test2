package i2;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements i0, s2, g2 {

    /* renamed from: a, reason: collision with root package name */
    public final w f71401a;

    /* renamed from: b, reason: collision with root package name */
    public final f f71402b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f71403c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f71404d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final g1.f0 f71405e;

    /* renamed from: f, reason: collision with root package name */
    public final w2 f71406f;

    /* renamed from: g, reason: collision with root package name */
    public final k2.h f71407g;

    /* renamed from: h, reason: collision with root package name */
    public final g1.g0 f71408h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.g0 f71409i;

    /* renamed from: j, reason: collision with root package name */
    public final k2.h f71410j;

    /* renamed from: k, reason: collision with root package name */
    public final j2.a f71411k;

    /* renamed from: l, reason: collision with root package name */
    public final j2.a f71412l;

    /* renamed from: m, reason: collision with root package name */
    public final k2.h f71413m;

    /* renamed from: n, reason: collision with root package name */
    public k2.h f71414n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f71415o;

    /* renamed from: p, reason: collision with root package name */
    public z f71416p;

    /* renamed from: q, reason: collision with root package name */
    public int f71417q;

    /* renamed from: r, reason: collision with root package name */
    public final en.b f71418r;

    /* renamed from: s, reason: collision with root package name */
    public final s f71419s;

    /* renamed from: t, reason: collision with root package name */
    public final CoroutineContext f71420t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f71421u;

    /* renamed from: v, reason: collision with root package name */
    public Function2 f71422v;

    public z(w wVar, s3.l2 l2Var) {
        this.f71401a = wVar;
        this.f71402b = l2Var;
        g1.f0 f0Var = new g1.f0(new g1.g0());
        this.f71405e = f0Var;
        w2 w2Var = new w2();
        if (wVar.c()) {
            w2Var.c();
        }
        if (wVar.e()) {
            w2Var.d();
        }
        this.f71406f = w2Var;
        this.f71407g = new k2.h();
        this.f71408h = new g1.g0();
        this.f71409i = new g1.g0();
        this.f71410j = new k2.h();
        j2.a aVar = new j2.a();
        this.f71411k = aVar;
        j2.a aVar2 = new j2.a();
        this.f71412l = aVar2;
        this.f71413m = new k2.h();
        this.f71414n = new k2.h();
        en.b bVar = new en.b();
        bVar.f59642a = false;
        this.f71418r = bVar;
        s sVar = new s(l2Var, wVar, w2Var, f0Var, aVar, aVar2, this);
        wVar.l(sVar);
        this.f71419s = sVar;
        boolean z13 = wVar instanceof o2;
        q2.h hVar = l.f71152a;
    }

    public final void A(Object obj) {
        synchronized (this.f71404d) {
            try {
                v(obj);
                Object g13 = this.f71410j.f78194a.g(obj);
                if (g13 != null) {
                    if (g13 instanceof g1.g0) {
                        g1.g0 g0Var = (g1.g0) g13;
                        Object[] objArr = g0Var.f63286b;
                        long[] jArr = g0Var.f63285a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j13 = jArr[i13];
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((255 & j13) < 128) {
                                            v((p0) objArr[(i13 << 3) + i15]);
                                        }
                                        j13 >>= 8;
                                    }
                                    if (i14 != 8) {
                                        break;
                                    }
                                }
                                if (i13 == length) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    } else {
                        v((p0) g13);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void B(q2.h hVar) {
        s sVar = this.f71419s;
        sVar.f71289y = 100;
        sVar.f71288x = true;
        n(hVar);
        if (sVar.E || sVar.f71289y != 100) {
            ao2.m0.o0("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        sVar.f71289y = -1;
        sVar.f71288x = false;
    }

    @Override // i2.g2
    public final b1 a(f2 f2Var, Object obj) {
        z zVar;
        int i13 = f2Var.f71110a;
        if ((i13 & 2) != 0) {
            f2Var.f71110a = i13 | 4;
        }
        d dVar = f2Var.f71112c;
        if (dVar == null || !dVar.a()) {
            return b1.IGNORED;
        }
        if (this.f71406f.j(dVar)) {
            return f2Var.f71113d != null ? u(f2Var, dVar, obj) : b1.IGNORED;
        }
        synchronized (this.f71404d) {
            zVar = this.f71416p;
        }
        if (zVar != null) {
            s sVar = zVar.f71419s;
            if (sVar.E && sVar.c0(f2Var, obj)) {
                return b1.IMMINENT;
            }
        }
        return b1.IGNORED;
    }

    @Override // i2.g2
    public final void b() {
        this.f71415o = true;
    }

    @Override // i2.g2
    public final void c(Object obj) {
        f2 x13;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        s sVar = this.f71419s;
        if (sVar.f71290z <= 0 && (x13 = sVar.x()) != null) {
            boolean z15 = true;
            int i15 = x13.f71110a | 1;
            x13.f71110a = i15;
            if ((i15 & 32) == 0) {
                g1.z zVar = x13.f71115f;
                if (zVar == null) {
                    zVar = new g1.z();
                    x13.f71115f = zVar;
                }
                int i16 = x13.f71114e;
                int d2 = zVar.d(obj);
                if (d2 < 0) {
                    d2 = ~d2;
                    i14 = -1;
                } else {
                    i14 = zVar.f63355c[d2];
                }
                zVar.f63354b[d2] = obj;
                zVar.f63355c[d2] = i16;
                if (i14 == x13.f71114e) {
                    return;
                }
            }
            if (obj instanceof s2.a0) {
                ((s2.a0) obj).g(1);
            }
            this.f71407g.a(obj, x13);
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                m0 j13 = ((o0) p0Var).j();
                k2.h hVar = this.f71410j;
                hVar.c(obj);
                g1.z zVar2 = j13.f71169e;
                Object[] objArr = zVar2.f63354b;
                long[] jArr = zVar2.f63353a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j14 = jArr[i17];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            int i23 = 0;
                            while (i23 < i19) {
                                if ((j14 & 255) < 128) {
                                    s2.z zVar3 = (s2.z) objArr[(i17 << 3) + i23];
                                    if (zVar3 instanceof s2.a0) {
                                        z14 = true;
                                        ((s2.a0) zVar3).g(1);
                                    } else {
                                        z14 = true;
                                    }
                                    hVar.a(zVar3, obj);
                                    i13 = 8;
                                } else {
                                    z14 = z15;
                                    i13 = i18;
                                }
                                j14 >>= i13;
                                i23++;
                                i18 = i13;
                                z15 = z14;
                            }
                            z13 = z15;
                            if (i19 != i18) {
                                break;
                            }
                        } else {
                            z13 = z15;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17++;
                        z15 = z13;
                    }
                }
                Object obj2 = j13.f71170f;
                g1.c0 c0Var = x13.f71116g;
                if (c0Var == null) {
                    c0Var = new g1.c0();
                    x13.f71116g = c0Var;
                }
                c0Var.l(p0Var, obj2);
            }
        }
    }

    @Override // i2.v
    public final void d(Function2 function2) {
        n((q2.h) function2);
    }

    @Override // i2.v
    public final void dispose() {
        synchronized (this.f71404d) {
            try {
                s sVar = this.f71419s;
                if (!(!sVar.E)) {
                    ao2.m0.p0("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f71421u) {
                    this.f71421u = true;
                    q2.h hVar = l.f71153b;
                    j2.a aVar = sVar.K;
                    if (aVar != null) {
                        i(aVar);
                    }
                    boolean z13 = this.f71406f.f71341b > 0;
                    if (z13 || (!this.f71405e.f63283a.b())) {
                        y yVar = new y(this.f71405e);
                        if (z13) {
                            this.f71402b.getClass();
                            y2 i13 = this.f71406f.i();
                            try {
                                u.n(i13, yVar);
                                Unit unit = Unit.f80348a;
                                i13.e(true);
                                this.f71402b.clear();
                                this.f71402b.d();
                                yVar.b();
                            } catch (Throwable th3) {
                                i13.e(false);
                                throw th3;
                            }
                        }
                        yVar.a();
                    }
                    s sVar2 = this.f71419s;
                    sVar2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        sVar2.f71266b.o(sVar2);
                        sVar2.D.f71316a.clear();
                        sVar2.f71282r.clear();
                        sVar2.f71269e.f74422a.A1();
                        sVar2.f71285u = null;
                        sVar2.f71265a.clear();
                        Unit unit2 = Unit.f80348a;
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                Unit unit3 = Unit.f80348a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f71401a.p(this);
    }

    public final void e() {
        this.f71403c.set(null);
        this.f71411k.f74422a.A1();
        this.f71412l.f74422a.A1();
        g1.f0 f0Var = this.f71405e;
        if (!(!f0Var.f63283a.b())) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (!(!f0Var.f63283a.b())) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = f0Var.iterator();
            while (true) {
                g1.e0 e0Var = (g1.e0) it;
                if (!e0Var.hasNext()) {
                    Unit unit = Unit.f80348a;
                    Trace.endSection();
                    return;
                } else {
                    q2 q2Var = (q2) e0Var.next();
                    e0Var.remove();
                    q2Var.b();
                }
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void f(Object obj, boolean z13) {
        int i13;
        Object g13 = this.f71407g.f78194a.g(obj);
        if (g13 == null) {
            return;
        }
        boolean z14 = g13 instanceof g1.g0;
        g1.g0 g0Var = this.f71408h;
        g1.g0 g0Var2 = this.f71409i;
        k2.h hVar = this.f71413m;
        if (!z14) {
            f2 f2Var = (f2) g13;
            if (hVar.b(obj, f2Var) || f2Var.c(obj) == b1.IGNORED) {
                return;
            }
            if (f2Var.f71116g == null || z13) {
                g0Var.d(f2Var);
                return;
            } else {
                g0Var2.d(f2Var);
                return;
            }
        }
        g1.g0 g0Var3 = (g1.g0) g13;
        Object[] objArr = g0Var3.f63286b;
        long[] jArr = g0Var3.f63285a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j13 = jArr[i14];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j13) < 128) {
                        f2 f2Var2 = (f2) objArr[(i14 << 3) + i17];
                        if (!hVar.b(obj, f2Var2) && f2Var2.c(obj) != b1.IGNORED) {
                            if (f2Var2.f71116g == null || z13) {
                                g0Var.d(f2Var2);
                            } else {
                                g0Var2.d(f2Var2);
                            }
                        }
                        i13 = 8;
                    } else {
                        i13 = i15;
                    }
                    j13 >>= i13;
                    i17++;
                    i15 = i13;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x028d, code lost:
    
        if (r5.a(r13) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0271, code lost:
    
        if (r13.b() != false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.z.g(java.util.Set, boolean):void");
    }

    public final void h() {
        synchronized (this.f71404d) {
            try {
                i(this.f71411k);
                r();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                try {
                    try {
                        if (!this.f71405e.f63283a.b()) {
                            g1.f0 f0Var = this.f71405e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!f0Var.f63283a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = f0Var.iterator();
                                    while (true) {
                                        g1.e0 e0Var = (g1.e0) it;
                                        if (!e0Var.hasNext()) {
                                            break;
                                        }
                                        q2 q2Var = (q2) e0Var.next();
                                        e0Var.remove();
                                        q2Var.b();
                                    }
                                    Unit unit2 = Unit.f80348a;
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e13) {
                        e();
                        throw e13;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0147, code lost:
    
        if (((i2.f2) r12).b() == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(j2.a r32) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.z.i(j2.a):void");
    }

    public final void j() {
        synchronized (this.f71404d) {
            try {
                if (this.f71412l.f74422a.D1()) {
                    i(this.f71412l);
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                try {
                    try {
                        if (!this.f71405e.f63283a.b()) {
                            g1.f0 f0Var = this.f71405e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!f0Var.f63283a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = f0Var.iterator();
                                    while (true) {
                                        g1.e0 e0Var = (g1.e0) it;
                                        if (!e0Var.hasNext()) {
                                            break;
                                        }
                                        q2 q2Var = (q2) e0Var.next();
                                        e0Var.remove();
                                        q2Var.b();
                                    }
                                    Unit unit2 = Unit.f80348a;
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e13) {
                        e();
                        throw e13;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.f71404d) {
            try {
                this.f71419s.f71285u = null;
                if (!this.f71405e.f63283a.b()) {
                    g1.f0 f0Var = this.f71405e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!f0Var.f63283a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = f0Var.iterator();
                            while (true) {
                                g1.e0 e0Var = (g1.e0) it;
                                if (!e0Var.hasNext()) {
                                    break;
                                }
                                q2 q2Var = (q2) e0Var.next();
                                e0Var.remove();
                                q2Var.b();
                            }
                            Unit unit = Unit.f80348a;
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                Unit unit2 = Unit.f80348a;
            } catch (Throwable th3) {
                try {
                    try {
                        if (!this.f71405e.f63283a.b()) {
                            g1.f0 f0Var2 = this.f71405e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!f0Var2.f63283a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = f0Var2.iterator();
                                    while (true) {
                                        g1.e0 e0Var2 = (g1.e0) it2;
                                        if (!e0Var2.hasNext()) {
                                            break;
                                        }
                                        q2 q2Var2 = (q2) e0Var2.next();
                                        e0Var2.remove();
                                        q2Var2.b();
                                    }
                                    Unit unit3 = Unit.f80348a;
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e13) {
                        e();
                        throw e13;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r8.b() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        r1.k(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r13.f78194a.b((i2.p0) r8) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.z.l():void");
    }

    public final void m(q2.h hVar) {
        try {
            synchronized (this.f71404d) {
                q();
                k2.h hVar2 = this.f71414n;
                this.f71414n = new k2.h();
                try {
                    w();
                    s sVar = this.f71419s;
                    if (!sVar.f71269e.f74422a.C1()) {
                        u.i("Expected applyChanges() to have been called");
                        throw null;
                    }
                    sVar.p(hVar2, hVar);
                } catch (Exception e13) {
                    this.f71414n = hVar2;
                    throw e13;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f71405e.f63283a.b()) {
                    g1.f0 f0Var = this.f71405e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!f0Var.f63283a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = f0Var.iterator();
                            while (((g1.e0) it).f63258b.hasNext()) {
                                q2 q2Var = (q2) ((g1.e0) it).f63258b.next();
                                ((g1.e0) it).remove();
                                q2Var.b();
                            }
                            Unit unit = Unit.f80348a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                }
                throw th3;
            } catch (Exception e14) {
                e();
                throw e14;
            }
        }
    }

    public final void n(q2.h hVar) {
        if (!this.f71421u) {
            this.f71401a.a(this, hVar);
        } else {
            ao2.m0.p0("The composition is disposed");
            throw null;
        }
    }

    public final void o() {
        synchronized (this.f71404d) {
            try {
                boolean z13 = this.f71406f.f71341b > 0;
                try {
                    if (!z13) {
                        if (!this.f71405e.f63283a.b()) {
                        }
                        this.f71407g.f78194a.a();
                        this.f71410j.f78194a.a();
                        this.f71414n.f78194a.a();
                        this.f71411k.f74422a.A1();
                        this.f71412l.f74422a.A1();
                        s sVar = this.f71419s;
                        sVar.D.f71316a.clear();
                        sVar.f71282r.clear();
                        sVar.f71269e.f74422a.A1();
                        sVar.f71285u = null;
                        Unit unit = Unit.f80348a;
                    }
                    y yVar = new y(this.f71405e);
                    if (z13) {
                        this.f71402b.getClass();
                        y2 i13 = this.f71406f.i();
                        try {
                            u.l(i13, yVar);
                            Unit unit2 = Unit.f80348a;
                            i13.e(true);
                            this.f71402b.d();
                            yVar.b();
                        } catch (Throwable th3) {
                            i13.e(false);
                            throw th3;
                        }
                    }
                    yVar.a();
                    Unit unit3 = Unit.f80348a;
                    Trace.endSection();
                    this.f71407g.f78194a.a();
                    this.f71410j.f78194a.a();
                    this.f71414n.f78194a.a();
                    this.f71411k.f74422a.A1();
                    this.f71412l.f74422a.A1();
                    s sVar2 = this.f71419s;
                    sVar2.D.f71316a.clear();
                    sVar2.f71282r.clear();
                    sVar2.f71269e.f74422a.A1();
                    sVar2.f71285u = null;
                    Unit unit4 = Unit.f80348a;
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final void p(j1 j1Var) {
        y yVar = new y(this.f71405e);
        y2 i13 = j1Var.a().i();
        try {
            u.n(i13, yVar);
            Unit unit = Unit.f80348a;
            i13.e(true);
            yVar.b();
        } catch (Throwable th3) {
            i13.e(false);
            throw th3;
        }
    }

    public final void q() {
        AtomicReference atomicReference = this.f71403c;
        Object obj = a0.f71069a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (Intrinsics.d(andSet, obj)) {
                u.j("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                g((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                u.j("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                g(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.f71403c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.d(andSet, a0.f71069a)) {
            return;
        }
        if (andSet instanceof Set) {
            g((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                g(set, false);
            }
            return;
        }
        if (andSet == null) {
            u.j("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        u.j("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void s(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z13 = true;
                break;
            }
            ((k1) ((Pair) arrayList.get(i13)).f80346a).getClass();
            if (!Intrinsics.d(null, this)) {
                break;
            } else {
                i13++;
            }
        }
        u.o(z13);
        try {
            s sVar = this.f71419s;
            sVar.getClass();
            try {
                sVar.A(arrayList);
                sVar.k();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                sVar.a();
                throw th3;
            }
        } catch (Throwable th4) {
            g1.f0 f0Var = this.f71405e;
            try {
                if (!f0Var.f63283a.b()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!f0Var.f63283a.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = f0Var.iterator();
                            while (true) {
                                g1.e0 e0Var = (g1.e0) it;
                                if (!e0Var.hasNext()) {
                                    break;
                                }
                                q2 q2Var = (q2) e0Var.next();
                                e0Var.remove();
                                q2Var.b();
                            }
                            Unit unit2 = Unit.f80348a;
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                throw th4;
            } catch (Exception e13) {
                e();
                throw e13;
            }
        }
    }

    public final void t() {
        g2 g2Var;
        synchronized (this.f71404d) {
            try {
                for (Object obj : this.f71406f.f71342c) {
                    f2 f2Var = obj instanceof f2 ? (f2) obj : null;
                    if (f2Var != null && (g2Var = f2Var.f71111b) != null) {
                        g2Var.a(f2Var, null);
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final b1 u(f2 f2Var, d dVar, Object obj) {
        int i13;
        synchronized (this.f71404d) {
            try {
                z zVar = this.f71416p;
                z zVar2 = null;
                if (zVar != null) {
                    if (!this.f71406f.e(this.f71417q, dVar)) {
                        zVar = null;
                    }
                    zVar2 = zVar;
                }
                if (zVar2 == null) {
                    s sVar = this.f71419s;
                    if (sVar.E && sVar.c0(f2Var, obj)) {
                        return b1.IMMINENT;
                    }
                    w();
                    if (obj == null) {
                        this.f71414n.f78194a.l(f2Var, n.f71187c);
                    } else if (obj instanceof p0) {
                        Object g13 = this.f71414n.f78194a.g(f2Var);
                        if (g13 != null) {
                            if (g13 instanceof g1.g0) {
                                g1.g0 g0Var = (g1.g0) g13;
                                Object[] objArr = g0Var.f63286b;
                                long[] jArr = g0Var.f63285a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    loop0: while (true) {
                                        long j13 = jArr[i14];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j13 & 255) >= 128) {
                                                    i13 = i15;
                                                } else {
                                                    if (objArr[(i14 << 3) + i17] == n.f71187c) {
                                                        break loop0;
                                                    }
                                                    i13 = 8;
                                                }
                                                j13 >>= i13;
                                                i17++;
                                                i15 = i13;
                                            }
                                            if (i16 != i15) {
                                                break;
                                            }
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            } else if (g13 == n.f71187c) {
                            }
                        }
                        this.f71414n.a(f2Var, obj);
                    } else {
                        this.f71414n.f78194a.l(f2Var, n.f71187c);
                    }
                }
                if (zVar2 != null) {
                    return zVar2.u(f2Var, dVar, obj);
                }
                this.f71401a.i(this);
                return this.f71419s.E ? b1.DEFERRED : b1.SCHEDULED;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void v(Object obj) {
        Object g13 = this.f71407g.f78194a.g(obj);
        if (g13 == null) {
            return;
        }
        boolean z13 = g13 instanceof g1.g0;
        k2.h hVar = this.f71413m;
        if (!z13) {
            f2 f2Var = (f2) g13;
            if (f2Var.c(obj) == b1.IMMINENT) {
                hVar.a(obj, f2Var);
                return;
            }
            return;
        }
        g1.g0 g0Var = (g1.g0) g13;
        Object[] objArr = g0Var.f63286b;
        long[] jArr = g0Var.f63285a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        f2 f2Var2 = (f2) objArr[(i13 << 3) + i15];
                        if (f2Var2.c(obj) == b1.IMMINENT) {
                            hVar.a(obj, f2Var2);
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void w() {
        if (this.f71418r.f59642a) {
            return;
        }
        this.f71401a.getClass();
        Intrinsics.d(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof k2.g
            k2.h r3 = r0.f71410j
            k2.h r4 = r0.f71407g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L62
            k2.g r1 = (k2.g) r1
            g1.m0 r1 = r1.f78193a
            java.lang.Object[] r2 = r1.f63286b
            long[] r1 = r1.f63285a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L83
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            g1.c0 r15 = r4.f78194a
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L56
            g1.c0 r15 = r3.f78194a
            boolean r14 = r15.b(r14)
            if (r14 == 0) goto L57
        L56:
            return r6
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5b:
            if (r11 != r12) goto L83
        L5d:
            if (r8 == r7) goto L83
            int r8 = r8 + 1
            goto L1c
        L62:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            g1.c0 r7 = r4.f78194a
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L82
            g1.c0 r7 = r3.f78194a
            boolean r2 = r7.b(r2)
            if (r2 == 0) goto L68
        L82:
            return r6
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.z.x(java.util.Set):boolean");
    }

    public final boolean y() {
        boolean D;
        synchronized (this.f71404d) {
            try {
                q();
                try {
                    k2.h hVar = this.f71414n;
                    this.f71414n = new k2.h();
                    try {
                        w();
                        D = this.f71419s.D(hVar);
                        if (!D) {
                            r();
                        }
                    } catch (Exception e13) {
                        this.f71414n = hVar;
                        throw e13;
                    }
                } catch (Throwable th3) {
                    try {
                        if (!this.f71405e.f63283a.b()) {
                            g1.f0 f0Var = this.f71405e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!f0Var.f63283a.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = f0Var.iterator();
                                    while (true) {
                                        g1.e0 e0Var = (g1.e0) it;
                                        if (!e0Var.hasNext()) {
                                            break;
                                        }
                                        q2 q2Var = (q2) e0Var.next();
                                        e0Var.remove();
                                        q2Var.b();
                                    }
                                    Unit unit = Unit.f80348a;
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e14) {
                        e();
                        throw e14;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void z(k2.g gVar) {
        k2.g gVar2;
        while (true) {
            Object obj = this.f71403c.get();
            if (obj == null || Intrinsics.d(obj, a0.f71069a)) {
                gVar2 = gVar;
            } else if (obj instanceof Set) {
                gVar2 = new Set[]{obj, gVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f71403c).toString());
                }
                gVar2 = kotlin.collections.z.t((Set[]) obj, gVar);
            }
            AtomicReference atomicReference = this.f71403c;
            while (!atomicReference.compareAndSet(obj, gVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f71404d) {
                    r();
                    Unit unit = Unit.f80348a;
                }
                return;
            }
            return;
        }
    }
}
