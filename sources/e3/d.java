package e3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import b3.j0;
import b3.k0;
import b3.m0;
import b3.o0;
import b3.s0;
import b3.w;
import g1.g0;
import g1.n0;
import k1.s2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f57004a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f57009f;

    /* renamed from: j, reason: collision with root package name */
    public float f57013j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f57014k;

    /* renamed from: l, reason: collision with root package name */
    public o0 f57015l;

    /* renamed from: m, reason: collision with root package name */
    public b3.k f57016m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f57017n;

    /* renamed from: o, reason: collision with root package name */
    public b3.i f57018o;

    /* renamed from: p, reason: collision with root package name */
    public int f57019p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f57021r;

    /* renamed from: s, reason: collision with root package name */
    public long f57022s;

    /* renamed from: t, reason: collision with root package name */
    public long f57023t;

    /* renamed from: u, reason: collision with root package name */
    public long f57024u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f57025v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f57026w;

    /* renamed from: b, reason: collision with root package name */
    public n4.b f57005b = d3.f.f53656a;

    /* renamed from: c, reason: collision with root package name */
    public n4.k f57006c = n4.k.Ltr;

    /* renamed from: d, reason: collision with root package name */
    public Function1 f57007d = c.f57001j;

    /* renamed from: e, reason: collision with root package name */
    public final s2 f57008e = new s2(this, 10);

    /* renamed from: g, reason: collision with root package name */
    public boolean f57010g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f57011h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f57012i = y2.h.f136670b;

    /* renamed from: q, reason: collision with root package name */
    public final a f57020q = new a(0);

    static {
        int i13 = k.f57103a;
        int i14 = k.f57103a;
    }

    public d(f fVar) {
        this.f57004a = fVar;
        fVar.y(false);
        this.f57022s = 0L;
        this.f57023t = 0L;
        this.f57024u = y2.h.f136670b;
    }

    public final void a() {
        if (this.f57010g) {
            boolean z13 = this.f57025v;
            Outline outline = null;
            f fVar = this.f57004a;
            if (z13 || fVar.L() > 0.0f) {
                o0 o0Var = this.f57015l;
                if (o0Var != null) {
                    RectF g13 = g();
                    if (!(o0Var instanceof b3.k)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((b3.k) o0Var).f21334a.computeBounds(g13, false);
                    Outline z14 = z(o0Var);
                    if (z14 != null) {
                        z14.setAlpha(fVar.a());
                        outline = z14;
                    }
                    fVar.E(outline, l0.d(Math.round(g13.width()), Math.round(g13.height())));
                    if (this.f57017n && this.f57025v) {
                        fVar.y(false);
                        fVar.c();
                    } else {
                        fVar.y(this.f57025v);
                    }
                } else {
                    fVar.y(this.f57025v);
                    Outline outline2 = this.f57009f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f57009f = outline2;
                    }
                    long y13 = l0.y1(this.f57023t);
                    long j13 = this.f57011h;
                    long j14 = this.f57012i;
                    long j15 = j14 == y2.h.f136670b ? y13 : j14;
                    outline2.setRoundRect(Math.round(a3.c.d(j13)), Math.round(a3.c.e(j13)), Math.round(a3.f.d(j15) + a3.c.d(j13)), Math.round(a3.f.b(j15) + a3.c.e(j13)), this.f57013j);
                    outline2.setAlpha(fVar.a());
                    fVar.E(outline2, (Math.round(a3.f.d(j15)) << 32) | (Math.round(a3.f.b(j15)) & 4294967295L));
                }
            } else {
                fVar.y(false);
                fVar.E(null, 0L);
            }
        }
        this.f57010g = false;
    }

    public final void b() {
        if (this.f57021r && this.f57019p == 0) {
            a aVar = this.f57020q;
            d dVar = (d) aVar.f56996b;
            if (dVar != null) {
                dVar.h();
                aVar.f56996b = null;
            }
            g0 g0Var = (g0) aVar.f56998d;
            if (g0Var != null) {
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
                                    ((d) objArr[(i13 << 3) + i15]).h();
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
                g0Var.f();
            }
            this.f57004a.c();
        }
    }

    public final boolean c() {
        return this.f57025v;
    }

    public final m0 d() {
        m0 k0Var;
        m0 m0Var = this.f57014k;
        o0 o0Var = this.f57015l;
        if (m0Var != null) {
            return m0Var;
        }
        if (o0Var != null) {
            j0 j0Var = new j0(o0Var);
            this.f57014k = j0Var;
            return j0Var;
        }
        long y13 = l0.y1(this.f57023t);
        long j13 = this.f57011h;
        long j14 = this.f57012i;
        if (j14 != y2.h.f136670b) {
            y13 = j14;
        }
        float d2 = a3.c.d(j13);
        float e13 = a3.c.e(j13);
        float d13 = a3.f.d(y13) + d2;
        float b13 = a3.f.b(y13) + e13;
        float f13 = this.f57013j;
        if (f13 > 0.0f) {
            long c13 = l0.c(f13, f13);
            long c14 = l0.c(a3.a.b(c13), a3.a.c(c13));
            k0Var = new b3.l0(new a3.e(d2, e13, d13, b13, c14, c14, c14, c14));
        } else {
            k0Var = new k0(new a3.d(d2, e13, d13, b13));
        }
        this.f57014k = k0Var;
        return k0Var;
    }

    public final long e() {
        return this.f57023t;
    }

    public final long f() {
        return this.f57022s;
    }

    public final RectF g() {
        RectF rectF = this.f57026w;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f57026w = rectF2;
        return rectF2;
    }

    public final void h() {
        this.f57019p--;
        b();
    }

    public final void i() {
        a aVar = this.f57020q;
        aVar.f56997c = (d) aVar.f56996b;
        g0 elements = (g0) aVar.f56998d;
        if (elements != null && elements.c()) {
            g0 g0Var = (g0) aVar.f56999e;
            if (g0Var == null) {
                int i13 = n0.f63290a;
                g0Var = new g0();
                aVar.f56999e = g0Var;
            }
            Intrinsics.checkNotNullParameter(elements, "elements");
            g0Var.j(elements);
            elements.f();
        }
        aVar.f56995a = true;
        this.f57004a.u(this.f57005b, this.f57006c, this, this.f57008e);
        aVar.f56995a = false;
        d dVar = (d) aVar.f56997c;
        if (dVar != null) {
            dVar.h();
        }
        g0 g0Var2 = (g0) aVar.f56999e;
        if (g0Var2 == null || !g0Var2.c()) {
            return;
        }
        Object[] objArr = g0Var2.f63286b;
        long[] jArr = g0Var2.f63285a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j13 = jArr[i14];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j13) < 128) {
                            ((d) objArr[(i14 << 3) + i16]).h();
                        }
                        j13 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        g0Var2.f();
    }

    public final void j(float f13) {
        f fVar = this.f57004a;
        if (fVar.a() == f13) {
            return;
        }
        fVar.n(f13);
    }

    public final void k(long j13) {
        f fVar = this.f57004a;
        if (w.c(j13, fVar.t())) {
            return;
        }
        fVar.w(j13);
    }

    public final void l(float f13) {
        f fVar = this.f57004a;
        if (fVar.x() == f13) {
            return;
        }
        fVar.f(f13);
    }

    public final void m(int i13) {
        f fVar = this.f57004a;
        if (tb.f.H(fVar.p(), i13)) {
            return;
        }
        fVar.K(i13);
    }

    public final void n(o0 o0Var) {
        this.f57014k = null;
        this.f57012i = y2.h.f136670b;
        this.f57011h = 0L;
        this.f57013j = 0.0f;
        this.f57010g = true;
        this.f57017n = false;
        this.f57015l = o0Var;
        a();
    }

    public final void o(long j13) {
        if (a3.c.b(this.f57024u, j13)) {
            return;
        }
        this.f57024u = j13;
        this.f57004a.F(j13);
    }

    public final void p() {
        f fVar = this.f57004a;
        fVar.getClass();
        if (Intrinsics.d(null, null)) {
            return;
        }
        fVar.k();
    }

    public final void q(float f13) {
        f fVar = this.f57004a;
        if (fVar.J() == f13) {
            return;
        }
        fVar.g(f13);
    }

    public final void r(float f13) {
        f fVar = this.f57004a;
        if (fVar.r() == f13) {
            return;
        }
        fVar.h(f13);
    }

    public final void s(float f13) {
        f fVar = this.f57004a;
        if (fVar.s() == f13) {
            return;
        }
        fVar.l(f13);
    }

    public final void t(long j13, long j14, float f13) {
        if (a3.c.b(this.f57011h, j13) && a3.f.a(this.f57012i, j14) && this.f57013j == f13 && this.f57015l == null) {
            return;
        }
        this.f57014k = null;
        this.f57015l = null;
        this.f57010g = true;
        this.f57017n = false;
        this.f57011h = j13;
        this.f57012i = j14;
        this.f57013j = f13;
        a();
    }

    public final void u(float f13) {
        f fVar = this.f57004a;
        if (fVar.L() == f13) {
            return;
        }
        fVar.D(f13);
        this.f57010g = true;
        a();
    }

    public final void v(long j13) {
        f fVar = this.f57004a;
        if (w.c(j13, fVar.v())) {
            return;
        }
        fVar.z(j13);
    }

    public final void w(float f13) {
        f fVar = this.f57004a;
        if (fVar.I() == f13) {
            return;
        }
        fVar.o(f13);
    }

    public final void x(float f13) {
        f fVar = this.f57004a;
        if (fVar.H() == f13) {
            return;
        }
        fVar.b(f13);
    }

    public final void y(Canvas canvas) {
        long j13 = this.f57022s;
        float f13 = (int) (j13 >> 32);
        float f14 = (int) (j13 & 4294967295L);
        long j14 = this.f57023t;
        float f15 = ((int) (j14 >> 32)) + f13;
        float f16 = f14 + ((int) (4294967295L & j14));
        f fVar = this.f57004a;
        float a13 = fVar.a();
        int B = fVar.B();
        if (a13 < 1.0f || !s0.a(B, 3) || tb.f.H(fVar.p(), 1)) {
            b3.i iVar = this.f57018o;
            if (iVar == null) {
                iVar = androidx.compose.ui.graphics.a.g();
                this.f57018o = iVar;
            }
            iVar.c(a13);
            iVar.d(B);
            iVar.f(null);
            canvas.saveLayer(f13, f14, f15, f16, iVar.f21325a);
        } else {
            canvas.save();
        }
        canvas.translate(f13, f14);
        canvas.concat(fVar.A());
    }

    public final Outline z(o0 o0Var) {
        Outline outline;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 > 28 || ((b3.k) o0Var).f21334a.isConvex()) {
            Outline outline2 = this.f57009f;
            if (outline2 == null) {
                outline2 = new Outline();
                this.f57009f = outline2;
            }
            if (i13 >= 30) {
                l.f57104a.a(outline2, o0Var);
            } else {
                if (!(o0Var instanceof b3.k)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline2.setConvexPath(((b3.k) o0Var).f21334a);
            }
            this.f57017n = !outline2.canClip();
            outline = outline2;
        } else {
            Outline outline3 = this.f57009f;
            if (outline3 != null) {
                outline3.setEmpty();
            }
            this.f57017n = true;
            this.f57004a.getClass();
            outline = null;
        }
        this.f57015l = o0Var;
        return outline;
    }
}
