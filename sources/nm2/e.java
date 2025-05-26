package nm2;

import am2.c1;
import am2.j;
import ao2.m0;
import et1.t0;
import in2.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pn2.b0;
import pn2.b1;
import pn2.f1;
import pn2.g1;
import pn2.h0;
import pn2.i1;
import pn2.l1;
import pn2.r1;
import pn2.u0;
import pn2.w1;
import rn2.m;
import xl2.l;

/* loaded from: classes4.dex */
public final class e extends l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f91528d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f91529e;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f91530b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f91531c;

    static {
        r1 r1Var = r1.COMMON;
        f91528d = com.bumptech.glide.c.m1(r1Var, false, true, null, 5).h(b.FLEXIBLE_LOWER_BOUND);
        f91529e = com.bumptech.glide.c.m1(r1Var, false, true, null, 5).h(b.FLEXIBLE_UPPER_BOUND);
    }

    public e() {
        f0 f0Var = new f0();
        this.f91530b = f0Var;
        this.f91531c = new f1(f0Var);
    }

    @Override // pn2.l1
    public final g1 e(b0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new i1(i(key, new a(r1.COMMON, false, false, null, 62)));
    }

    public final Pair h(h0 h0Var, am2.g gVar, a aVar) {
        if (h0Var.w0().getParameters().isEmpty()) {
            return new Pair(h0Var, Boolean.FALSE);
        }
        if (l.z(h0Var)) {
            g1 g1Var = (g1) h0Var.u0().get(0);
            w1 c13 = g1Var.c();
            b0 type = g1Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return new Pair(pn2.g.q(h0Var.v0(), h0Var.w0(), e0.b(new i1(i(type, aVar), c13)), h0Var.x0()), Boolean.FALSE);
        }
        if (m0.U(h0Var)) {
            return new Pair(m.d(rn2.l.ERROR_RAW_TYPE, h0Var.w0().toString()), Boolean.FALSE);
        }
        n G = gVar.G(this);
        Intrinsics.checkNotNullExpressionValue(G, "getMemberScope(...)");
        u0 v03 = h0Var.v0();
        b1 e13 = gVar.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
        List parameters = gVar.e().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<c1> list = parameters;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (c1 c1Var : list) {
            Intrinsics.f(c1Var);
            f1 f1Var = this.f91531c;
            b0 b13 = f1Var.b(c1Var, aVar);
            this.f91530b.getClass();
            arrayList.add(f0.V(c1Var, aVar, f1Var, b13));
        }
        return new Pair(pn2.g.s(v03, e13, arrayList, h0Var.x0(), G, new t0(gVar, this, h0Var, aVar, 9)), Boolean.TRUE);
    }

    public final b0 i(b0 b0Var, a aVar) {
        j b13 = b0Var.w0().b();
        if (b13 instanceof c1) {
            aVar.getClass();
            return i(this.f91531c.b((c1) b13, a.g(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(b13 instanceof am2.g)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + b13).toString());
        }
        j b14 = dl2.b.Y2(b0Var).w0().b();
        if (b14 instanceof am2.g) {
            Pair h10 = h(dl2.b.b2(b0Var), (am2.g) b13, f91528d);
            h0 h0Var = (h0) h10.f80346a;
            boolean booleanValue = ((Boolean) h10.f80347b).booleanValue();
            Pair h13 = h(dl2.b.Y2(b0Var), (am2.g) b14, f91529e);
            h0 h0Var2 = (h0) h13.f80346a;
            return (booleanValue || ((Boolean) h13.f80347b).booleanValue()) ? new g(h0Var, h0Var2) : pn2.g.i(h0Var, h0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + b14 + "\" while for lower it's \"" + b13 + '\"').toString());
    }
}
