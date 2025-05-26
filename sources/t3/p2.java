package t3;

import android.graphics.Canvas;
import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class p2 implements s3.y1 {

    /* renamed from: a, reason: collision with root package name */
    public e3.d f116139a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.c0 f116140b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f116141c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f116142d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f116143e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116145g;

    /* renamed from: i, reason: collision with root package name */
    public float[] f116147i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f116148j;

    /* renamed from: n, reason: collision with root package name */
    public int f116152n;

    /* renamed from: p, reason: collision with root package name */
    public b3.m0 f116154p;

    /* renamed from: q, reason: collision with root package name */
    public b3.k f116155q;

    /* renamed from: r, reason: collision with root package name */
    public b3.i f116156r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f116157s;

    /* renamed from: f, reason: collision with root package name */
    public long f116144f = lb.l0.d(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final float[] f116146h = b3.i0.a();

    /* renamed from: k, reason: collision with root package name */
    public n4.b f116149k = ao2.m0.a();

    /* renamed from: l, reason: collision with root package name */
    public n4.k f116150l = n4.k.Ltr;

    /* renamed from: m, reason: collision with root package name */
    public final d3.c f116151m = new d3.c();

    /* renamed from: o, reason: collision with root package name */
    public long f116153o = b3.b1.f21304b;

    /* renamed from: t, reason: collision with root package name */
    public final k1.s2 f116158t = new k1.s2(this, 17);

    public p2(e3.d dVar, b3.c0 c0Var, c0 c0Var2, p1.p1 p1Var, androidx.activity.a0 a0Var) {
        this.f116139a = dVar;
        this.f116140b = c0Var;
        this.f116141c = c0Var2;
        this.f116142d = p1Var;
        this.f116143e = a0Var;
    }

    @Override // s3.y1
    public final void a(float[] fArr) {
        n();
        b3.i0.g(fArr, this.f116146h);
    }

    @Override // s3.y1
    public final void b(p1.p1 p1Var, androidx.activity.a0 a0Var) {
        b3.c0 c0Var = this.f116140b;
        if (c0Var == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle".toString());
        }
        if (!this.f116139a.f57021r) {
            throw new IllegalArgumentException("layer should have been released before reuse".toString());
        }
        this.f116139a = c0Var.a();
        this.f116145g = false;
        this.f116142d = p1Var;
        this.f116143e = a0Var;
        this.f116153o = b3.b1.f21304b;
        this.f116157s = false;
        this.f116144f = lb.l0.d(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f116154p = null;
        this.f116152n = 0;
    }

    @Override // s3.y1
    public final long c(long j13, boolean z13) {
        if (!z13) {
            n();
            return b3.i0.b(j13, this.f116146h);
        }
        float[] m13 = m();
        if (m13 != null) {
            return b3.i0.b(j13, m13);
        }
        return 9187343241974906880L;
    }

    @Override // s3.y1
    public final void d(long j13) {
        if (n4.j.a(j13, this.f116144f)) {
            return;
        }
        this.f116144f = j13;
        if (this.f116148j || this.f116145g) {
            return;
        }
        c0 c0Var = this.f116141c;
        c0Var.invalidate();
        if (true != this.f116148j) {
            this.f116148j = true;
            c0Var.w(this, true);
        }
    }

    @Override // s3.y1
    public final void destroy() {
        this.f116142d = null;
        this.f116143e = null;
        this.f116145g = true;
        boolean z13 = this.f116148j;
        c0 c0Var = this.f116141c;
        if (z13) {
            this.f116148j = false;
            c0Var.w(this, false);
        }
        b3.c0 c0Var2 = this.f116140b;
        if (c0Var2 != null) {
            c0Var2.b(this.f116139a);
            c0Var.E(this);
        }
    }

    @Override // s3.y1
    public final void e(b3.u uVar, e3.d dVar) {
        Canvas b13 = b3.e.b(uVar);
        if (b13.isHardwareAccelerated()) {
            j();
            this.f116157s = this.f116139a.f57004a.L() > 0.0f;
            d3.c cVar = this.f116151m;
            d3.b bVar = cVar.f53652b;
            bVar.f(uVar);
            bVar.f53649b = dVar;
            d7.b.A(cVar, this.f116139a);
            return;
        }
        float f13 = (int) (this.f116139a.f() >> 32);
        float f14 = (int) (this.f116139a.f() & 4294967295L);
        long j13 = this.f116144f;
        float f15 = ((int) (j13 >> 32)) + f13;
        float f16 = f14 + ((int) (j13 & 4294967295L));
        if (this.f116139a.f57004a.a() < 1.0f) {
            b3.i iVar = this.f116156r;
            if (iVar == null) {
                iVar = androidx.compose.ui.graphics.a.g();
                this.f116156r = iVar;
            }
            iVar.c(this.f116139a.f57004a.a());
            b13.saveLayer(f13, f14, f15, f16, iVar.f21325a);
        } else {
            uVar.j();
        }
        uVar.f(f13, f14);
        n();
        uVar.l(this.f116146h);
        if (this.f116139a.c()) {
            l(uVar);
        }
        Function2 function2 = this.f116142d;
        if (function2 != null) {
            function2.invoke(uVar, null);
        }
        uVar.restore();
    }

    @Override // s3.y1
    public final boolean f(long j13) {
        boolean e13;
        float d2 = a3.c.d(j13);
        float e14 = a3.c.e(j13);
        e3.d dVar = this.f116139a;
        if (!dVar.f57025v) {
            return true;
        }
        e13 = androidx.compose.ui.platform.a.e(dVar.d(), d2, e14, null, null);
        return e13;
    }

    @Override // s3.y1
    public final void g(b3.u0 u0Var) {
        Function0 function0;
        int i13;
        Function0 function02;
        int i14 = u0Var.f21354a | this.f116152n;
        this.f116150l = u0Var.f21373t;
        this.f116149k = u0Var.f21372s;
        int i15 = i14 & 4096;
        if (i15 != 0) {
            this.f116153o = u0Var.f21367n;
        }
        if ((i14 & 1) != 0) {
            e3.d dVar = this.f116139a;
            float f13 = u0Var.f21355b;
            e3.f fVar = dVar.f57004a;
            if (fVar.C() != f13) {
                fVar.e(f13);
            }
        }
        if ((i14 & 2) != 0) {
            e3.d dVar2 = this.f116139a;
            float f14 = u0Var.f21356c;
            e3.f fVar2 = dVar2.f57004a;
            if (fVar2.M() != f14) {
                fVar2.m(f14);
            }
        }
        if ((i14 & 4) != 0) {
            this.f116139a.j(u0Var.f21357d);
        }
        if ((i14 & 8) != 0) {
            this.f116139a.w(u0Var.f21358e);
        }
        if ((i14 & 16) != 0) {
            this.f116139a.x(u0Var.f21359f);
        }
        if ((i14 & 32) != 0) {
            this.f116139a.u(u0Var.d());
            if (u0Var.d() > 0.0f && !this.f116157s && (function02 = this.f116143e) != null) {
                function02.invoke();
            }
        }
        if ((i14 & 64) != 0) {
            this.f116139a.k(u0Var.a());
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            this.f116139a.v(u0Var.e());
        }
        if ((i14 & 1024) != 0) {
            this.f116139a.s(u0Var.f21365l);
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            this.f116139a.q(u0Var.f21363j);
        }
        if ((i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            this.f116139a.r(u0Var.f21364k);
        }
        if ((i14 & 2048) != 0) {
            this.f116139a.l(u0Var.f21366m);
        }
        if (i15 != 0) {
            if (b3.b1.a(this.f116153o, b3.b1.f21304b)) {
                this.f116139a.o(y2.h.f136670b);
            } else {
                this.f116139a.o(com.bumptech.glide.c.d(b3.b1.b(this.f116153o) * ((int) (this.f116144f >> 32)), b3.b1.c(this.f116153o) * ((int) (this.f116144f & 4294967295L))));
            }
        }
        boolean z13 = true;
        if ((i14 & 16384) != 0) {
            e3.d dVar3 = this.f116139a;
            boolean z14 = u0Var.f21369p;
            if (dVar3.f57025v != z14) {
                dVar3.f57025v = z14;
                dVar3.f57010g = true;
                dVar3.a();
            }
        }
        if ((131072 & i14) != 0) {
            this.f116139a.p();
        }
        if ((32768 & i14) != 0) {
            e3.d dVar4 = this.f116139a;
            int c13 = u0Var.c();
            if (b3.s0.b(c13, 0)) {
                i13 = 0;
            } else if (b3.s0.b(c13, 1)) {
                i13 = 1;
            } else {
                i13 = 2;
                if (!b3.s0.b(c13, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            dVar4.m(i13);
        }
        if (Intrinsics.d(this.f116154p, u0Var.f21374u)) {
            z13 = false;
        } else {
            b3.m0 m0Var = u0Var.f21374u;
            this.f116154p = m0Var;
            if (m0Var != null) {
                e3.d dVar5 = this.f116139a;
                if (m0Var instanceof b3.k0) {
                    a3.d dVar6 = ((b3.k0) m0Var).f21338a;
                    dVar5.t(com.bumptech.glide.c.d(dVar6.f484a, dVar6.f485b), bs1.c.c(dVar6.d(), dVar6.c()), 0.0f);
                } else if (m0Var instanceof b3.j0) {
                    dVar5.n(((b3.j0) m0Var).f21333a);
                } else if (m0Var instanceof b3.l0) {
                    b3.l0 l0Var = (b3.l0) m0Var;
                    b3.k kVar = l0Var.f21341b;
                    if (kVar != null) {
                        dVar5.n(kVar);
                    } else {
                        a3.e eVar = l0Var.f21340a;
                        dVar5.t(com.bumptech.glide.c.d(eVar.f488a, eVar.f489b), bs1.c.c(eVar.b(), eVar.a()), a3.a.b(eVar.f495h));
                    }
                }
                if ((m0Var instanceof b3.j0) && Build.VERSION.SDK_INT < 33 && (function0 = this.f116143e) != null) {
                    function0.invoke();
                }
            }
        }
        this.f116152n = u0Var.f21354a;
        if (i14 != 0 || z13) {
            e5.f115973a.a(this.f116141c);
        }
    }

    @Override // s3.y1
    public final void h(float[] fArr) {
        float[] m13 = m();
        if (m13 != null) {
            b3.i0.g(fArr, m13);
        }
    }

    @Override // s3.y1
    public final void i(long j13) {
        e3.d dVar = this.f116139a;
        if (!n4.h.a(dVar.f57022s, j13)) {
            dVar.f57022s = j13;
            long j14 = dVar.f57023t;
            dVar.f57004a.q((int) (j13 >> 32), (int) (j13 & 4294967295L), j14);
        }
        e5.f115973a.a(this.f116141c);
    }

    @Override // s3.y1
    public final void invalidate() {
        if (this.f116148j || this.f116145g) {
            return;
        }
        c0 c0Var = this.f116141c;
        c0Var.invalidate();
        if (true != this.f116148j) {
            this.f116148j = true;
            c0Var.w(this, true);
        }
    }

    @Override // s3.y1
    public final void j() {
        if (this.f116148j) {
            if (!b3.b1.a(this.f116153o, b3.b1.f21304b) && !n4.j.a(this.f116139a.e(), this.f116144f)) {
                this.f116139a.o(com.bumptech.glide.c.d(b3.b1.b(this.f116153o) * ((int) (this.f116144f >> 32)), b3.b1.c(this.f116153o) * ((int) (this.f116144f & 4294967295L))));
            }
            e3.d dVar = this.f116139a;
            n4.b bVar = this.f116149k;
            n4.k kVar = this.f116150l;
            long j13 = this.f116144f;
            boolean a13 = n4.j.a(dVar.f57023t, j13);
            e3.f fVar = dVar.f57004a;
            if (!a13) {
                dVar.f57023t = j13;
                long j14 = dVar.f57022s;
                fVar.q((int) (j14 >> 32), (int) (4294967295L & j14), j13);
                if (dVar.f57012i == y2.h.f136670b) {
                    dVar.f57010g = true;
                    dVar.a();
                }
            }
            dVar.f57005b = bVar;
            dVar.f57006c = kVar;
            dVar.f57007d = this.f116158t;
            fVar.getClass();
            dVar.i();
            if (this.f116148j) {
                this.f116148j = false;
                this.f116141c.w(this, false);
            }
        }
    }

    @Override // s3.y1
    public final void k(a3.b bVar, boolean z13) {
        if (!z13) {
            n();
            b3.i0.c(this.f116146h, bVar);
            return;
        }
        float[] m13 = m();
        if (m13 == null) {
            bVar.c();
        } else {
            b3.i0.c(m13, bVar);
        }
    }

    public final void l(b3.u uVar) {
        e3.d dVar = this.f116139a;
        if (dVar.f57025v) {
            b3.m0 d2 = dVar.d();
            if (d2 instanceof b3.k0) {
                b3.u.c(uVar, ((b3.k0) d2).f21338a);
                return;
            }
            if (!(d2 instanceof b3.l0)) {
                if (d2 instanceof b3.j0) {
                    uVar.d(((b3.j0) d2).f21333a, 1);
                    return;
                }
                return;
            }
            b3.k kVar = this.f116155q;
            if (kVar == null) {
                kVar = androidx.compose.ui.graphics.a.h();
                this.f116155q = kVar;
            }
            kVar.h();
            b3.o0.b(kVar, ((b3.l0) d2).f21340a);
            uVar.d(kVar, 1);
        }
    }

    public final float[] m() {
        n();
        float[] fArr = this.f116147i;
        if (fArr == null) {
            fArr = b3.i0.a();
            this.f116147i = fArr;
        }
        if (d7.b.d0(this.f116146h, fArr)) {
            return fArr;
        }
        return null;
    }

    public final void n() {
        e3.d dVar = this.f116139a;
        long r03 = com.bumptech.glide.c.z0(dVar.f57024u) ? bs1.c.r0(lb.l0.y1(this.f116144f)) : dVar.f57024u;
        float[] fArr = this.f116146h;
        b3.i0.d(fArr);
        float[] a13 = b3.i0.a();
        b3.i0.h(a13, -a3.c.d(r03), -a3.c.e(r03), 0.0f);
        b3.i0.g(fArr, a13);
        float[] a14 = b3.i0.a();
        e3.f fVar = dVar.f57004a;
        b3.i0.h(a14, fVar.I(), fVar.H(), 0.0f);
        double J2 = (fVar.J() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(J2);
        float sin = (float) Math.sin(J2);
        float f13 = a14[1];
        float f14 = a14[2];
        float f15 = a14[5];
        float f16 = a14[6];
        float f17 = a14[9];
        float f18 = a14[10];
        float f19 = a14[13];
        float f23 = a14[14];
        a14[1] = (f13 * cos) - (f14 * sin);
        a14[2] = (f14 * cos) + (f13 * sin);
        a14[5] = (f15 * cos) - (f16 * sin);
        a14[6] = (f16 * cos) + (f15 * sin);
        a14[9] = (f17 * cos) - (f18 * sin);
        a14[10] = (f18 * cos) + (f17 * sin);
        a14[13] = (f19 * cos) - (f23 * sin);
        a14[14] = (f23 * cos) + (f19 * sin);
        double r13 = (fVar.r() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(r13);
        float sin2 = (float) Math.sin(r13);
        float f24 = a14[0];
        float f25 = a14[2];
        float f26 = a14[4];
        float f27 = a14[6];
        float f28 = (f27 * sin2) + (f26 * cos2);
        float f29 = (f27 * cos2) + ((-f26) * sin2);
        float f33 = a14[8];
        float f34 = a14[10];
        float f35 = a14[12];
        float f36 = a14[14];
        a14[0] = (f25 * sin2) + (f24 * cos2);
        a14[2] = (f25 * cos2) + ((-f24) * sin2);
        a14[4] = f28;
        a14[6] = f29;
        a14[8] = (f34 * sin2) + (f33 * cos2);
        a14[10] = (f34 * cos2) + ((-f33) * sin2);
        a14[12] = (f36 * sin2) + (f35 * cos2);
        a14[14] = (f36 * cos2) + ((-f35) * sin2);
        b3.i0.e(fVar.s(), a14);
        b3.i0.f(a14, fVar.C(), fVar.M(), 1.0f);
        b3.i0.g(fArr, a14);
        float[] a15 = b3.i0.a();
        b3.i0.h(a15, a3.c.d(r03), a3.c.e(r03), 0.0f);
        b3.i0.g(fArr, a15);
    }
}
