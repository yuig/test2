package qn2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import pn2.a0;
import pn2.b0;
import pn2.b1;
import pn2.g1;
import pn2.h0;
import pn2.v1;
import pn2.w1;

/* loaded from: classes2.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static h0 b(h0 h0Var) {
        b0 type;
        b1 w03 = h0Var.w0();
        if (w03 instanceof cn2.c) {
            cn2.c cVar = (cn2.c) w03;
            g1 g1Var = cVar.f28263a;
            if (g1Var.c() != w1.IN_VARIANCE) {
                g1Var = null;
            }
            if (g1Var != null && (type = g1Var.getType()) != null) {
                r3 = type.z0();
            }
            v1 v1Var = r3;
            if (cVar.f28264b == null) {
                Collection c13 = cVar.c();
                ArrayList arrayList = new ArrayList(g0.q(c13, 10));
                Iterator it = c13.iterator();
                while (it.hasNext()) {
                    arrayList.add(((b0) it.next()).z0());
                }
                cVar.f28264b = new l(cVar.f28263a, arrayList);
            }
            sn2.b bVar = sn2.b.FOR_SUBTYPING;
            l lVar = cVar.f28264b;
            Intrinsics.f(lVar);
            return new k(bVar, lVar, v1Var, h0Var.v0(), h0Var.x0(), 32);
        }
        if (!(w03 instanceof a0) || !h0Var.x0()) {
            return h0Var;
        }
        a0 a0Var = (a0) w03;
        LinkedHashSet linkedHashSet = a0Var.f100761b;
        ArrayList typesToIntersect = new ArrayList(g0.q(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z13 = false;
        while (it2.hasNext()) {
            typesToIntersect.add(kotlin.jvm.internal.j.A((b0) it2.next()));
            z13 = true;
        }
        if (z13) {
            b0 b0Var = a0Var.f100760a;
            r3 = b0Var != null ? kotlin.jvm.internal.j.A(b0Var) : null;
            Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
            typesToIntersect.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
            linkedHashSet2.hashCode();
            a0 a0Var2 = new a0(linkedHashSet2);
            a0Var2.f100760a = r3;
            r3 = a0Var2;
        }
        if (r3 != null) {
            a0Var = r3;
        }
        return a0Var.g();
    }

    public final v1 a(sn2.f type) {
        v1 i13;
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof b0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        v1 origin = ((b0) type).z0();
        if (origin instanceof h0) {
            i13 = b((h0) origin);
        } else {
            if (!(origin instanceof pn2.v)) {
                throw new NoWhenBranchMatchedException();
            }
            pn2.v vVar = (pn2.v) origin;
            h0 h0Var = vVar.f100850b;
            h0 b13 = b(h0Var);
            h0 h0Var2 = vVar.f100851c;
            h0 b14 = b(h0Var2);
            i13 = (b13 == h0Var && b14 == h0Var2) ? origin : pn2.g.i(b13, b14);
        }
        f transform = new f(1, this);
        Intrinsics.checkNotNullParameter(i13, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        b0 J2 = com.bumptech.glide.c.J(origin);
        return com.bumptech.glide.c.w1(i13, J2 != null ? (b0) transform.invoke(J2) : null);
    }
}
