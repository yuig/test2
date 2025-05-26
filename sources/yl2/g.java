package yl2;

import am2.i1;
import am2.w0;
import am2.x;
import dm2.b1;
import dm2.c1;
import dm2.o;
import dm2.u0;
import dm2.y;
import dm2.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.q1;
import vn2.a0;

/* loaded from: classes4.dex */
public final class g extends u0 {
    public g(am2.m mVar, g gVar, am2.c cVar, boolean z13) {
        super(mVar, gVar, bm2.h.f23540a, a0.f126293g, cVar, w0.f15602a);
        this.f55574m = true;
        this.f55583v = z13;
        this.f55584w = false;
    }

    @Override // dm2.z, am2.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // dm2.z, am2.x
    public final boolean isInline() {
        return false;
    }

    @Override // dm2.z, am2.x
    public final boolean t() {
        return false;
    }

    @Override // dm2.u0, dm2.z
    public final z v0(am2.c kind, am2.m newOwner, x xVar, w0 source, bm2.i annotations, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new g(newOwner, (g) xVar, kind, this.f55583v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dm2.z
    public final z w0(y configuration) {
        ym2.g gVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        g gVar2 = (g) super.w0(configuration);
        if (gVar2 == null) {
            return null;
        }
        List x13 = gVar2.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
        List list = x13;
        if ((list instanceof Collection) && list.isEmpty()) {
            return gVar2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 type = ((c1) ((i1) it.next())).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (kotlin.jvm.internal.j.j(type) != null) {
                List x14 = gVar2.x();
                Intrinsics.checkNotNullExpressionValue(x14, "getValueParameters(...)");
                List list2 = x14;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    b0 type2 = ((c1) ((i1) it2.next())).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(kotlin.jvm.internal.j.j(type2));
                }
                int size = gVar2.x().size() - arrayList.size();
                boolean z13 = true;
                if (size == 0) {
                    List x15 = gVar2.x();
                    Intrinsics.checkNotNullExpressionValue(x15, "getValueParameters(...)");
                    ArrayList N0 = CollectionsKt.N0(arrayList, x15);
                    if (N0.isEmpty()) {
                        return gVar2;
                    }
                    Iterator it3 = N0.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!Intrinsics.d((ym2.g) pair.f80346a, ((o) ((i1) pair.f80347b)).getName())) {
                        }
                    }
                    return gVar2;
                }
                List x16 = gVar2.x();
                Intrinsics.checkNotNullExpressionValue(x16, "getValueParameters(...)");
                List<i1> list3 = x16;
                ArrayList arrayList2 = new ArrayList(g0.q(list3, 10));
                for (i1 i1Var : list3) {
                    ym2.g name = ((o) i1Var).getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    int i13 = ((b1) i1Var).f55394f;
                    int i14 = i13 - size;
                    if (i14 >= 0 && (gVar = (ym2.g) arrayList.get(i14)) != null) {
                        name = gVar;
                    }
                    arrayList2.add(i1Var.U(gVar2, name, i13));
                }
                y z03 = gVar2.z0(q1.f100833b);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((ym2.g) it4.next()) == null) {
                            break;
                        }
                    }
                }
                z13 = false;
                z03.f55563v = Boolean.valueOf(z13);
                z03.f55548g = arrayList2;
                z03.f55546e = gVar2.o0();
                Intrinsics.checkNotNullExpressionValue(z03, "setOriginal(...)");
                z w03 = super.w0(z03);
                Intrinsics.f(w03);
                return w03;
            }
        }
        return gVar2;
    }
}
