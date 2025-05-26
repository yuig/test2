package vn2;

import am2.c1;
import am2.i1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.m0;
import pn2.t1;
import pn2.u0;
import pn2.v1;

/* loaded from: classes2.dex */
public final class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final n f126337a = new n();

    @Override // vn2.e
    public final boolean a(am2.x functionDescriptor) {
        pn2.h0 p13;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        am2.p pVar = (i1) functionDescriptor.x().get(1);
        re2.f fVar = xl2.p.f135286d;
        Intrinsics.f(pVar);
        am2.d0 module = fn2.d.j(pVar);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(module, "module");
        am2.g c03 = l0.c0(module, xl2.q.Q);
        if (c03 == null) {
            p13 = null;
        } else {
            u0.f100848b.getClass();
            u0 u0Var = u0.f100849c;
            List parameters = c03.e().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object s03 = CollectionsKt.s0(parameters);
            Intrinsics.checkNotNullExpressionValue(s03, "single(...)");
            p13 = pn2.g.p(u0Var, c03, kotlin.collections.e0.b(new m0((c1) s03)));
        }
        if (p13 == null) {
            return false;
        }
        pn2.b0 type = ((dm2.c1) pVar).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Intrinsics.checkNotNullParameter(type, "<this>");
        v1 i13 = t1.i(type);
        Intrinsics.checkNotNullExpressionValue(i13, "makeNotNullable(...)");
        return kotlin.jvm.internal.j.w(p13, i13);
    }

    @Override // vn2.e
    public final String b(am2.x xVar) {
        return ao2.m0.Q(this, xVar);
    }

    @Override // vn2.e
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
