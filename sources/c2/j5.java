package c2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j5 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f24864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f24865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f24866k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f24867l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f24868m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(float f13, long j13, Function2 function2, boolean z13, long j14) {
        super(2);
        this.f24864i = f13;
        this.f24865j = j13;
        this.f24866k = function2;
        this.f24867l = z13;
        this.f24868m = j14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b4.y yVar;
        b4.x xVar;
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        i2.w3 w3Var = f6.f24738b;
        i2.s sVar2 = (i2.s) oVar;
        b4.q0 q0Var = ((e6) sVar2.m(w3Var)).f24708g;
        b4.q0 q0Var2 = ((e6) sVar2.m(w3Var)).f24713l;
        b4.g0 g0Var = q0Var.f21648a;
        b4.g0 g0Var2 = q0Var2.f21648a;
        m4.o oVar2 = b4.h0.f21595d;
        m4.o oVar3 = g0Var.f21575a;
        m4.o oVar4 = g0Var2.f21575a;
        boolean z13 = oVar3 instanceof m4.b;
        m4.o oVar5 = m4.m.f85803a;
        float f13 = this.f24864i;
        if (!z13 && !(oVar4 instanceof m4.b)) {
            long p13 = androidx.compose.ui.graphics.a.p(oVar3.b(), oVar4.b(), f13);
            if (p13 != 16) {
                oVar5 = new m4.c(p13);
            }
        } else if (z13 && (oVar4 instanceof m4.b)) {
            b3.s sVar3 = (b3.s) b4.h0.b(f13, ((m4.b) oVar3).f85784a, ((m4.b) oVar4).f85784a);
            float U = tb.f.U(oVar3.a(), oVar4.a(), f13);
            if (sVar3 != null) {
                if (sVar3 instanceof b3.z0) {
                    long x13 = bp1.h.x(((b3.z0) sVar3).f21414a, U);
                    if (x13 != 16) {
                        oVar5 = new m4.c(x13);
                    }
                } else {
                    if (!(sVar3 instanceof b3.v0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oVar5 = new m4.b((b3.v0) sVar3, U);
                }
            }
        } else {
            oVar5 = (m4.o) b4.h0.b(f13, oVar3, oVar4);
        }
        m4.o oVar6 = oVar5;
        g4.e eVar = (g4.e) b4.h0.b(f13, g0Var.f21580f, g0Var2.f21580f);
        long c13 = b4.h0.c(g0Var.f21576b, g0Var2.f21576b, f13);
        g4.l lVar = g0Var.f21577c;
        if (lVar == null) {
            lVar = g4.l.f63469d;
        }
        g4.l lVar2 = g0Var2.f21577c;
        if (lVar2 == null) {
            lVar2 = g4.l.f63469d;
        }
        g4.l lVar3 = new g4.l(ql2.s.g(tb.f.V(lVar.f63474a, f13, lVar2.f63474a), 1, 1000));
        g4.j jVar = (g4.j) b4.h0.b(f13, g0Var.f21578d, g0Var2.f21578d);
        g4.k kVar = (g4.k) b4.h0.b(f13, g0Var.f21579e, g0Var2.f21579e);
        String str = (String) b4.h0.b(f13, g0Var.f21581g, g0Var2.f21581g);
        long c14 = b4.h0.c(g0Var.f21582h, g0Var2.f21582h, f13);
        m4.a aVar = g0Var.f21583i;
        float f14 = aVar != null ? aVar.f85783a : 0.0f;
        m4.a aVar2 = g0Var2.f21583i;
        float U2 = tb.f.U(f14, aVar2 != null ? aVar2.f85783a : 0.0f, f13);
        m4.p pVar = m4.p.f85806c;
        m4.p pVar2 = g0Var.f21584j;
        if (pVar2 == null) {
            pVar2 = pVar;
        }
        m4.p pVar3 = g0Var2.f21584j;
        if (pVar3 != null) {
            pVar = pVar3;
        }
        m4.p pVar4 = new m4.p(tb.f.U(pVar2.f85807a, pVar.f85807a, f13), tb.f.U(pVar2.f85808b, pVar.f85808b, f13));
        i4.c cVar = (i4.c) b4.h0.b(f13, g0Var.f21585k, g0Var2.f21585k);
        long p14 = androidx.compose.ui.graphics.a.p(g0Var.f21586l, g0Var2.f21586l, f13);
        m4.k kVar2 = (m4.k) b4.h0.b(f13, g0Var.f21587m, g0Var2.f21587m);
        b3.w0 w0Var = g0Var.f21588n;
        if (w0Var == null) {
            w0Var = new b3.w0();
        }
        b3.w0 w0Var2 = g0Var2.f21588n;
        if (w0Var2 == null) {
            w0Var2 = new b3.w0();
        }
        b3.w0 w0Var3 = new b3.w0(androidx.compose.ui.graphics.a.p(w0Var.f21394a, w0Var2.f21394a, f13), com.bumptech.glide.c.H0(w0Var.f21395b, w0Var2.f21395b, f13), tb.f.U(w0Var.f21396c, w0Var2.f21396c, f13));
        b4.y yVar2 = g0Var.f21589o;
        if (yVar2 == null && g0Var2.f21589o == null) {
            yVar = null;
        } else {
            if (yVar2 == null) {
                yVar2 = b4.y.f21678a;
            }
            yVar = yVar2;
        }
        b4.g0 g0Var3 = new b4.g0(oVar6, c13, lVar3, jVar, kVar, eVar, str, c14, new m4.a(U2), pVar4, cVar, p14, kVar2, w0Var3, yVar, (d3.i) b4.h0.b(f13, g0Var.f21590p, g0Var2.f21590p));
        int i13 = b4.w.f21674b;
        b4.v vVar = q0Var.f21649b;
        m4.j jVar2 = new m4.j(vVar.f21664a);
        b4.v vVar2 = q0Var2.f21649b;
        int i14 = ((m4.j) b4.h0.b(f13, jVar2, new m4.j(vVar2.f21664a))).f85797a;
        int i15 = ((m4.l) b4.h0.b(f13, new m4.l(vVar.f21665b), new m4.l(vVar2.f21665b))).f85802a;
        long c15 = b4.h0.c(vVar.f21666c, vVar2.f21666c, f13);
        m4.q qVar = vVar.f21667d;
        if (qVar == null) {
            qVar = m4.q.f85809c;
        }
        m4.q qVar2 = vVar2.f21667d;
        if (qVar2 == null) {
            qVar2 = m4.q.f85809c;
        }
        m4.q qVar3 = new m4.q(b4.h0.c(qVar.f85810a, qVar2.f85810a, f13), b4.h0.c(qVar.f85811b, qVar2.f85811b, f13));
        b4.x xVar2 = vVar.f21668e;
        b4.x xVar3 = vVar2.f21668e;
        if (xVar2 == null && xVar3 == null) {
            xVar = null;
        } else {
            b4.x xVar4 = b4.x.f21675c;
            if (xVar2 == null) {
                xVar2 = xVar4;
            }
            if (xVar3 == null) {
                xVar3 = xVar4;
            }
            boolean z14 = xVar2.f21676a;
            boolean z15 = xVar3.f21676a;
            if (z14 != z15) {
                xVar2 = new b4.x(((b4.k) b4.h0.b(f13, new b4.k(xVar2.f21677b), new b4.k(xVar3.f21677b))).f21599a, ((Boolean) b4.h0.b(f13, Boolean.valueOf(z14), Boolean.valueOf(z15))).booleanValue());
            }
            xVar = xVar2;
        }
        b4.q0 q0Var3 = new b4.q0(g0Var3, new b4.v(i14, i15, c15, qVar3, xVar, (m4.g) b4.h0.b(f13, vVar.f21669f, vVar2.f21669f), ((m4.e) b4.h0.b(f13, new m4.e(vVar.f21670g), new m4.e(vVar2.f21670g))).f85789a, ((m4.d) b4.h0.b(f13, new m4.d(vVar.f21671h), new m4.d(vVar2.f21671h))).f85787a, (m4.r) b4.h0.b(f13, vVar.f21672i, vVar2.f21672i)));
        if (this.f24867l) {
            q0Var3 = b4.q0.a(0, 16777214, this.f24868m, 0L, 0L, 0L, null, q0Var3, null, null, null);
        }
        q5.b(this.f24865j, q0Var3, null, this.f24866k, oVar, 384, 0);
        return Unit.f80348a;
    }
}
