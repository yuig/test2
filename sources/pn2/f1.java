package pn2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final m60.f0 f100792a;

    /* renamed from: b, reason: collision with root package name */
    public final g f100793b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f100794c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.n f100795d;

    public f1(m60.f0 projectionComputer) {
        g options = new g();
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f100792a = projectionComputer;
        this.f100793b = options;
        on2.q qVar = new on2.q("Type parameter upper bound erasure results");
        this.f100794c = xk2.m.b(new nn2.v(this, 2));
        on2.n d2 = qVar.d(new e82.l(this, 27));
        Intrinsics.checkNotNullExpressionValue(d2, "createMemoizedFunction(...)");
        this.f100795d = d2;
    }

    public final v1 a(c cVar) {
        v1 F;
        h0 h0Var = ((nm2.a) cVar).f91525f;
        return (h0Var == null || (F = kotlin.jvm.internal.j.F(h0Var)) == null) ? (rn2.j) this.f100794c.getValue() : F;
    }

    public final b0 b(am2.c1 typeParameter, c typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Object invoke = this.f100795d.invoke(new e1(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(invoke, "invoke(...)");
        return (b0) invoke;
    }

    public final yk2.o c(q1 substitutor, List list, c cVar) {
        v1 v1Var;
        Iterator it;
        yk2.o oVar = new yk2.o();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            b0 b0Var = (b0) it2.next();
            am2.j b13 = b0Var.w0().b();
            boolean z13 = b13 instanceof am2.g;
            g gVar = this.f100793b;
            if (z13) {
                Set set = ((nm2.a) cVar).f91524e;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(b0Var, "<this>");
                Intrinsics.checkNotNullParameter(substitutor, "substitutor");
                v1 z03 = b0Var.z0();
                if (z03 instanceof v) {
                    v vVar = (v) z03;
                    h0 h0Var = vVar.f100850b;
                    if (!h0Var.w0().getParameters().isEmpty() && h0Var.w0().b() != null) {
                        List parameters = h0Var.w0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        List list2 = parameters;
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            am2.c1 c1Var = (am2.c1) it3.next();
                            g1 g1Var = (g1) CollectionsKt.U(c1Var.getIndex(), b0Var.u0());
                            boolean z14 = set != null && set.contains(c1Var);
                            if (g1Var == null || z14) {
                                it = it3;
                            } else {
                                l1 h10 = substitutor.h();
                                it = it3;
                                b0 type = g1Var.getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                if (h10.e(type) != null) {
                                    arrayList.add(g1Var);
                                    it3 = it;
                                }
                            }
                            g1Var = new m0(c1Var);
                            arrayList.add(g1Var);
                            it3 = it;
                        }
                        h0Var = lb.l0.Z0(h0Var, arrayList, null, 2);
                    }
                    h0 h0Var2 = vVar.f100851c;
                    if (!h0Var2.w0().getParameters().isEmpty() && h0Var2.w0().b() != null) {
                        List parameters2 = h0Var2.w0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                        List<am2.c1> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                        for (am2.c1 c1Var2 : list3) {
                            g1 g1Var2 = (g1) CollectionsKt.U(c1Var2.getIndex(), b0Var.u0());
                            boolean z15 = set != null && set.contains(c1Var2);
                            if (g1Var2 != null && !z15) {
                                l1 h13 = substitutor.h();
                                b0 type2 = g1Var2.getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                                if (h13.e(type2) != null) {
                                    arrayList2.add(g1Var2);
                                }
                            }
                            g1Var2 = new m0(c1Var2);
                            arrayList2.add(g1Var2);
                        }
                        h0Var2 = lb.l0.Z0(h0Var2, arrayList2, null, 2);
                    }
                    v1Var = g.i(h0Var, h0Var2);
                } else {
                    if (!(z03 instanceof h0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var3 = (h0) z03;
                    if (h0Var3.w0().getParameters().isEmpty() || h0Var3.w0().b() == null) {
                        v1Var = h0Var3;
                    } else {
                        List parameters3 = h0Var3.w0().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
                        List<am2.c1> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                        for (am2.c1 c1Var3 : list4) {
                            g1 g1Var3 = (g1) CollectionsKt.U(c1Var3.getIndex(), b0Var.u0());
                            boolean z16 = set != null && set.contains(c1Var3);
                            if (g1Var3 != null && !z16) {
                                l1 h14 = substitutor.h();
                                b0 type3 = g1Var3.getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                if (h14.e(type3) != null) {
                                    arrayList3.add(g1Var3);
                                }
                            }
                            g1Var3 = new m0(c1Var3);
                            arrayList3.add(g1Var3);
                        }
                        v1Var = lb.l0.Z0(h0Var3, arrayList3, null, 2);
                    }
                }
                b0 j13 = substitutor.j(com.bumptech.glide.c.h0(v1Var, z03), w1.OUT_VARIANCE);
                Intrinsics.checkNotNullExpressionValue(j13, "safeSubstitute(...)");
                oVar.add(j13);
            } else if (b13 instanceof am2.c1) {
                Set set2 = ((nm2.a) cVar).f91524e;
                if (set2 == null || !set2.contains(b13)) {
                    List upperBounds = ((am2.c1) b13).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                    oVar.addAll(c(substitutor, upperBounds, cVar));
                } else {
                    oVar.add(a(cVar));
                }
            }
            gVar.getClass();
        }
        return kotlin.collections.g1.a(oVar);
    }
}
