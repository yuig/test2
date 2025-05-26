package bn2;

import am2.b1;
import am2.c0;
import am2.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import sw0.u;

/* loaded from: classes4.dex */
public abstract class a extends l3.c {
    public static Collection h1(nn2.j sealedClass) {
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.f91598i != c0.SEALED) {
            return q0.f80391a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        am2.m mVar = sealedClass.f91606q;
        if (mVar instanceof i0) {
            i1(sealedClass, linkedHashSet, ((i0) mVar).w(), false);
        }
        in2.n I = sealedClass.I();
        Intrinsics.checkNotNullExpressionValue(I, "getUnsubstitutedInnerClassesScope(...)");
        i1(sealedClass, linkedHashSet, I, true);
        return CollectionsKt.x0(linkedHashSet, new u(24));
    }

    public static final void i1(nn2.j jVar, LinkedHashSet linkedHashSet, in2.n nVar, boolean z13) {
        for (am2.m mVar : ue.c.s(nVar, in2.g.f72860n, 2)) {
            if (mVar instanceof am2.g) {
                am2.g gVar = (am2.g) mVar;
                if (gVar.Z()) {
                    ym2.g name = gVar.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    am2.j e13 = nVar.e(name, hm2.e.WHEN_GET_ALL_DESCRIPTORS);
                    gVar = e13 instanceof am2.g ? (am2.g) e13 : e13 instanceof b1 ? ((nn2.u) ((b1) e13)).r0() : null;
                }
                if (gVar != null) {
                    int i13 = e.f23579a;
                    Iterator it = gVar.e().c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (e.r((b0) it.next(), jVar)) {
                                linkedHashSet.add(gVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z13) {
                        in2.n I = gVar.I();
                        Intrinsics.checkNotNullExpressionValue(I, "getUnsubstitutedInnerClassesScope(...)");
                        i1(jVar, linkedHashSet, I, z13);
                    }
                }
            }
        }
    }
}
