package fn2;

import am2.d0;
import am2.i0;
import am2.i1;
import am2.j;
import am2.m;
import am2.q0;
import am2.r0;
import dm2.k0;
import dm2.o0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.sequences.Sequence;
import wn2.k;
import xl2.l;
import ym2.e;
import ym2.g;
import yn2.c0;
import yn2.x;
import zl2.q;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f62727a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(g.e("value"), "identifier(...)");
    }

    public static final boolean a(i1 i1Var) {
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        Boolean h10 = k.h(e0.b(i1Var), a.f62724a, b.f62725a);
        Intrinsics.checkNotNullExpressionValue(h10, "ifAny(...)");
        return h10.booleanValue();
    }

    public static am2.d b(am2.d dVar, Function1 predicate) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (am2.d) k.f(e0.b(dVar), new en.b(false), new q(predicate, new j0()));
    }

    public static final ym2.c c(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        e h10 = h(mVar);
        if (!h10.d()) {
            h10 = null;
        }
        if (h10 != null) {
            return h10.g();
        }
        return null;
    }

    public static final am2.g d(bm2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        j b13 = cVar.getType().w0().b();
        if (b13 instanceof am2.g) {
            return (am2.g) b13;
        }
        return null;
    }

    public static final l e(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return j(mVar).f();
    }

    public static final ym2.b f(j jVar) {
        m g13;
        ym2.b f13;
        if (jVar == null || (g13 = jVar.g()) == null) {
            return null;
        }
        if (g13 instanceof i0) {
            return new ym2.b(((k0) ((i0) g13)).f55454e, jVar.getName());
        }
        if (!(g13 instanceof am2.k) || (f13 = f((j) g13)) == null) {
            return null;
        }
        return f13.d(jVar.getName());
    }

    public static final ym2.c g(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (mVar == null) {
            bn2.e.a(3);
            throw null;
        }
        ym2.c i13 = bn2.e.i(mVar);
        if (i13 == null) {
            i13 = bn2.e.j(mVar).g();
        }
        if (i13 != null) {
            Intrinsics.checkNotNullExpressionValue(i13, "getFqNameSafe(...)");
            return i13;
        }
        bn2.e.a(4);
        throw null;
    }

    public static final e h(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        e h10 = bn2.e.h(mVar);
        Intrinsics.checkNotNullExpressionValue(h10, "getFqName(...)");
        return h10;
    }

    public static final void i(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ep.b.A(d0Var.g0(qn2.j.f104499a));
    }

    public static final d0 j(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        d0 d2 = bn2.e.d(mVar);
        Intrinsics.checkNotNullExpressionValue(d2, "getContainingModule(...)");
        return d2;
    }

    public static final Sequence k(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return c0.i(x.e(mVar, c.f62726i), 1);
    }

    public static final am2.d l(am2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof q0)) {
            return dVar;
        }
        r0 r03 = ((o0) ((q0) dVar)).r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getCorrespondingProperty(...)");
        return r03;
    }

    public static final am2.g m(d0 d0Var, ym2.c topLevelClassFqName, hm2.e location) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(location, "location");
        topLevelClassFqName.d();
        ym2.c e13 = topLevelClassFqName.e();
        Intrinsics.checkNotNullExpressionValue(e13, "parent(...)");
        in2.j jVar = ((dm2.c0) d0Var.H(e13)).f55405g;
        g f13 = topLevelClassFqName.f();
        Intrinsics.checkNotNullExpressionValue(f13, "shortName(...)");
        j e14 = jVar.e(f13, location);
        if (e14 instanceof am2.g) {
            return (am2.g) e14;
        }
        return null;
    }
}
