package pn2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 implements b1, sn2.i {

    /* renamed from: a, reason: collision with root package name */
    public b0 f100760a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f100761b;

    /* renamed from: c, reason: collision with root package name */
    public final int f100762c;

    public a0(AbstractCollection typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f100761b = linkedHashSet;
        this.f100762c = linkedHashSet.hashCode();
    }

    @Override // pn2.b1
    public final am2.j b() {
        return null;
    }

    @Override // pn2.b1
    public final Collection c() {
        return this.f100761b;
    }

    @Override // pn2.b1
    public final boolean d() {
        return false;
    }

    public final in2.n e() {
        return rm2.i0.d(this.f100761b, "member scope for intersection type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return Intrinsics.d(this.f100761b, ((a0) obj).f100761b);
        }
        return false;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        xl2.l f13 = ((b0) this.f100761b.iterator().next()).w0().f();
        Intrinsics.checkNotNullExpressionValue(f13, "getBuiltIns(...)");
        return f13;
    }

    public final h0 g() {
        u0.f100848b.getClass();
        return g.s(u0.f100849c, this, kotlin.collections.q0.f80391a, false, e(), new cd2.n(this, 16));
    }

    @Override // pn2.b1
    public final List getParameters() {
        return kotlin.collections.q0.f80391a;
    }

    public final String h(Function1 getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.Z(CollectionsKt.x0(this.f100761b, new s4.g(getProperTypeRelatedToStringify, 12)), " & ", "{", "}", 0, null, new al1.j(18, getProperTypeRelatedToStringify), 24);
    }

    public final int hashCode() {
        return this.f100762c;
    }

    public final a0 i(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        LinkedHashSet linkedHashSet = this.f100761b;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            arrayList.add(((b0) it.next()).y0(kotlinTypeRefiner));
            z13 = true;
        }
        a0 a0Var = null;
        if (z13) {
            b0 b0Var = this.f100760a;
            a0Var = new a0(arrayList).j(b0Var != null ? b0Var.y0(kotlinTypeRefiner) : null);
        }
        return a0Var == null ? this : a0Var;
    }

    public final a0 j(b0 b0Var) {
        a0 a0Var = new a0(this.f100761b);
        a0Var.f100760a = b0Var;
        return a0Var;
    }

    public final String toString() {
        return h(z.f100860i);
    }
}
