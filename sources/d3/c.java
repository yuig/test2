package d3;

import android.graphics.Paint;
import b3.f0;
import b3.o0;
import b3.p;
import b3.p0;
import b3.s;
import b3.s0;
import b3.u;
import b3.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final a f53651a;

    /* renamed from: b, reason: collision with root package name */
    public final b f53652b;

    /* renamed from: c, reason: collision with root package name */
    public b3.i f53653c;

    /* renamed from: d, reason: collision with root package name */
    public b3.i f53654d;

    public c() {
        n4.c cVar = f.f53656a;
        n4.k kVar = n4.k.Ltr;
        j jVar = new j();
        a aVar = new a();
        aVar.f53644a = cVar;
        aVar.f53645b = kVar;
        aVar.f53646c = jVar;
        aVar.f53647d = 0L;
        this.f53651a = aVar;
        this.f53652b = new b(this);
    }

    public static b3.i a(c cVar, long j13, i iVar, float f13, p pVar, int i13) {
        h.Qn.getClass();
        int i14 = g.f53659c;
        b3.i f14 = cVar.f(iVar);
        if (f13 != 1.0f) {
            j13 = w.b(j13, w.d(j13) * f13);
        }
        if (!w.c(androidx.compose.ui.graphics.a.c(f14.f21325a.getColor()), j13)) {
            f14.e(j13);
        }
        if (f14.f21327c != null) {
            f14.i(null);
        }
        if (!Intrinsics.d(f14.f21328d, pVar)) {
            f14.f(pVar);
        }
        if (!s0.a(f14.f21326b, i13)) {
            f14.d(i13);
        }
        if (!s0.c(f14.f21325a.isFilterBitmap() ? 1 : 0, i14)) {
            f14.g(i14);
        }
        return f14;
    }

    public static b3.i d(c cVar, s sVar, i iVar, float f13, p pVar, int i13) {
        h.Qn.getClass();
        return cVar.c(sVar, iVar, f13, pVar, i13, g.f53659c);
    }

    @Override // d3.h
    public final void G(f0 f0Var, long j13, long j14, long j15, long j16, float f13, i iVar, p pVar, int i13, int i14) {
        this.f53651a.f53646c.s(f0Var, j13, j14, j15, j16, c(null, iVar, f13, pVar, i13, i14));
    }

    @Override // d3.h
    public final void H(long j13, float f13, long j14, float f14, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.r(f13, j14, a(this, j13, iVar, f14, pVar, i13));
    }

    @Override // d3.h
    public final void I(long j13, long j14, long j15, float f13, int i13, p0 p0Var, float f14, p pVar, int i14) {
        u uVar = this.f53651a.f53646c;
        h.Qn.getClass();
        int i15 = g.f53659c;
        b3.i e13 = e();
        long b13 = f14 == 1.0f ? j13 : w.b(j13, w.d(j13) * f14);
        if (!w.c(androidx.compose.ui.graphics.a.c(e13.f21325a.getColor()), b13)) {
            e13.e(b13);
        }
        if (e13.f21327c != null) {
            e13.i(null);
        }
        if (!Intrinsics.d(e13.f21328d, pVar)) {
            e13.f(pVar);
        }
        if (!s0.a(e13.f21326b, i14)) {
            e13.d(i14);
        }
        Paint paint = e13.f21325a;
        if (paint.getStrokeWidth() != f13) {
            e13.l(f13);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            e13.f21325a.setStrokeMiter(4.0f);
        }
        if (!s0.d(e13.a(), i13)) {
            e13.j(i13);
        }
        if (!s0.e(e13.b(), 0)) {
            e13.k(0);
        }
        if (!Intrinsics.d(e13.f21329e, p0Var)) {
            e13.h(p0Var);
        }
        if (!s0.c(paint.isFilterBitmap() ? 1 : 0, i15)) {
            e13.g(i15);
        }
        uVar.h(j14, j15, e13);
    }

    @Override // d3.h
    public final void M(long j13, long j14, long j15, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.a(a3.c.d(j14), a3.c.e(j14), a3.f.d(j15) + a3.c.d(j14), a3.f.b(j15) + a3.c.e(j14), a(this, j13, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final void S(s sVar, long j13, long j14, long j15, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.i(a3.c.d(j13), a3.c.e(j13), a3.c.d(j13) + a3.f.d(j14), a3.c.e(j13) + a3.f.b(j14), a3.a.b(j15), a3.a.c(j15), d(this, sVar, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final void U(s sVar, long j13, long j14, float f13, int i13, p0 p0Var, float f14, p pVar, int i14) {
        u uVar = this.f53651a.f53646c;
        h.Qn.getClass();
        int i15 = g.f53659c;
        b3.i e13 = e();
        if (sVar != null) {
            sVar.a(f14, g(), e13);
        } else if (e13.f21325a.getAlpha() / 255.0f != f14) {
            e13.c(f14);
        }
        if (!Intrinsics.d(e13.f21328d, pVar)) {
            e13.f(pVar);
        }
        if (!s0.a(e13.f21326b, i14)) {
            e13.d(i14);
        }
        Paint paint = e13.f21325a;
        if (paint.getStrokeWidth() != f13) {
            e13.l(f13);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            e13.f21325a.setStrokeMiter(4.0f);
        }
        if (!s0.d(e13.a(), i13)) {
            e13.j(i13);
        }
        if (!s0.e(e13.b(), 0)) {
            e13.k(0);
        }
        if (!Intrinsics.d(e13.f21329e, p0Var)) {
            e13.h(p0Var);
        }
        if (!s0.c(paint.isFilterBitmap() ? 1 : 0, i15)) {
            e13.g(i15);
        }
        uVar.h(j13, j14, e13);
    }

    @Override // n4.b
    public final float b() {
        return this.f53651a.f53644a.b();
    }

    public final b3.i c(s sVar, i iVar, float f13, p pVar, int i13, int i14) {
        b3.i f14 = f(iVar);
        if (sVar != null) {
            sVar.a(f13, g(), f14);
        } else {
            if (f14.f21327c != null) {
                f14.i(null);
            }
            long c13 = androidx.compose.ui.graphics.a.c(f14.f21325a.getColor());
            long j13 = w.f21378b;
            if (!w.c(c13, j13)) {
                f14.e(j13);
            }
            if (f14.f21325a.getAlpha() / 255.0f != f13) {
                f14.c(f13);
            }
        }
        if (!Intrinsics.d(f14.f21328d, pVar)) {
            f14.f(pVar);
        }
        if (!s0.a(f14.f21326b, i13)) {
            f14.d(i13);
        }
        if (!s0.c(f14.f21325a.isFilterBitmap() ? 1 : 0, i14)) {
            f14.g(i14);
        }
        return f14;
    }

    public final b3.i e() {
        b3.i iVar = this.f53654d;
        if (iVar != null) {
            return iVar;
        }
        b3.i g13 = androidx.compose.ui.graphics.a.g();
        g13.m(1);
        this.f53654d = g13;
        return g13;
    }

    public final b3.i f(i iVar) {
        if (Intrinsics.d(iVar, k.f53660a)) {
            b3.i iVar2 = this.f53653c;
            if (iVar2 != null) {
                return iVar2;
            }
            b3.i g13 = androidx.compose.ui.graphics.a.g();
            g13.m(0);
            this.f53653c = g13;
            return g13;
        }
        if (!(iVar instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        b3.i e13 = e();
        Paint paint = e13.f21325a;
        float strokeWidth = paint.getStrokeWidth();
        l lVar = (l) iVar;
        float f13 = lVar.f53661a;
        if (strokeWidth != f13) {
            e13.l(f13);
        }
        int a13 = e13.a();
        int i13 = lVar.f53663c;
        if (!s0.d(a13, i13)) {
            e13.j(i13);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f14 = lVar.f53662b;
        if (strokeMiter != f14) {
            e13.f21325a.setStrokeMiter(f14);
        }
        int b13 = e13.b();
        int i14 = lVar.f53664d;
        if (!s0.e(b13, i14)) {
            e13.k(i14);
        }
        p0 p0Var = e13.f21329e;
        p0 p0Var2 = lVar.f53665e;
        if (!Intrinsics.d(p0Var, p0Var2)) {
            e13.h(p0Var2);
        }
        return e13;
    }

    @Override // d3.h
    public final n4.k getLayoutDirection() {
        return this.f53651a.f53645b;
    }

    @Override // n4.b
    public final float j0() {
        return this.f53651a.f53644a.j0();
    }

    @Override // d3.h
    public final void n0(s sVar, long j13, long j14, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.a(a3.c.d(j13), a3.c.e(j13), a3.f.d(j14) + a3.c.d(j13), a3.f.b(j14) + a3.c.e(j13), d(this, sVar, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final b p0() {
        return this.f53652b;
    }

    @Override // d3.h
    public final void r(long j13, long j14, long j15, long j16, i iVar, float f13, p pVar, int i13) {
        this.f53651a.f53646c.i(a3.c.d(j14), a3.c.e(j14), a3.f.d(j15) + a3.c.d(j14), a3.f.b(j15) + a3.c.e(j14), a3.a.b(j16), a3.a.c(j16), a(this, j13, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final void r0(f0 f0Var, long j13, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.m(f0Var, j13, d(this, null, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final void s(o0 o0Var, long j13, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.p(o0Var, a(this, j13, iVar, f13, pVar, i13));
    }

    @Override // d3.h
    public final void y(o0 o0Var, s sVar, float f13, i iVar, p pVar, int i13) {
        this.f53651a.f53646c.p(o0Var, d(this, sVar, iVar, f13, pVar, i13));
    }
}
