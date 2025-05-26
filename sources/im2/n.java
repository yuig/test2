package im2;

import dm2.u0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class n implements bn2.h {
    @Override // bn2.h
    public bn2.g a(am2.b superDescriptor, am2.b subDescriptor, am2.g gVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof km2.g) {
            Intrinsics.checkNotNullExpressionValue(((km2.g) subDescriptor).getTypeParameters(), "getTypeParameters(...)");
            if (!(!r2.isEmpty())) {
                bn2.n j13 = bn2.o.j(superDescriptor, subDescriptor);
                if ((j13 != null ? j13.c() : null) != null) {
                    return bn2.g.UNKNOWN;
                }
                km2.g gVar2 = (km2.g) subDescriptor;
                List x13 = gVar2.x();
                Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                yn2.h0 p13 = yn2.c0.p(CollectionsKt.K(x13), m.f72752i);
                pn2.b0 b0Var = gVar2.f55568g;
                Intrinsics.f(b0Var);
                Intrinsics.checkNotNullParameter(p13, "<this>");
                Sequence f13 = yn2.x.f(p13, yn2.x.f(b0Var));
                Intrinsics.checkNotNullParameter(f13, "<this>");
                yn2.s sVar = yn2.s.f139588i;
                boolean z13 = f13 instanceof yn2.h0;
                yn2.u uVar = yn2.u.f139590i;
                yn2.k c13 = z13 ? ((yn2.h0) f13).c(sVar) : new yn2.k(f13, uVar, sVar);
                dm2.d dVar = gVar2.f55570i;
                List elements = kotlin.collections.f0.k(dVar != null ? dVar.getType() : null);
                Intrinsics.checkNotNullParameter(c13, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                Sequence f14 = yn2.x.f(c13, CollectionsKt.K(elements));
                Intrinsics.checkNotNullParameter(f14, "<this>");
                yn2.j jVar = new yn2.j(f14 instanceof yn2.h0 ? ((yn2.h0) f14).c(sVar) : new yn2.k(f14, uVar, sVar));
                while (jVar.b()) {
                    pn2.b0 b0Var2 = (pn2.b0) jVar.next();
                    if ((!b0Var2.u0().isEmpty()) && !(b0Var2.z0() instanceof nm2.g)) {
                        return bn2.g.UNKNOWN;
                    }
                }
                am2.b bVar = (am2.b) superDescriptor.d(new nm2.e().c());
                if (bVar == null) {
                    return bn2.g.UNKNOWN;
                }
                if (bVar instanceof u0) {
                    u0 u0Var = (u0) bVar;
                    Intrinsics.checkNotNullExpressionValue(u0Var.getTypeParameters(), "getTypeParameters(...)");
                    if (!r2.isEmpty()) {
                        bVar = u0Var.q0().a(kotlin.collections.q0.f80391a).build();
                        Intrinsics.f(bVar);
                    }
                }
                bn2.m c14 = bn2.o.f23590d.p(bVar, subDescriptor, false).c();
                Intrinsics.checkNotNullExpressionValue(c14, "getResult(...)");
                return l.f72750a[c14.ordinal()] == 1 ? bn2.g.OVERRIDABLE : bn2.g.UNKNOWN;
            }
        }
        return bn2.g.UNKNOWN;
    }

    @Override // bn2.h
    public bn2.f b() {
        return bn2.f.SUCCESS_ONLY;
    }
}
