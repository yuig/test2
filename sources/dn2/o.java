package dn2;

import am2.d0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kh2.g2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;
import pn2.h0;
import pn2.u0;

/* loaded from: classes2.dex */
public final class o implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f55630a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f55631b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f55632c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f55633d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f55634e;

    public o(long j13, d0 d0Var, LinkedHashSet linkedHashSet) {
        u0.f100848b.getClass();
        u0 attributes = u0.f100849c;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(this, "constructor");
        this.f55633d = pn2.g.r(q0.f80391a, rn2.m.a(rn2.i.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, this, false);
        this.f55634e = xk2.m.b(new g2(this, 18));
        this.f55630a = j13;
        this.f55631b = d0Var;
        this.f55632c = linkedHashSet;
    }

    @Override // pn2.b1
    public final am2.j b() {
        return null;
    }

    @Override // pn2.b1
    public final Collection c() {
        return (List) this.f55634e.getValue();
    }

    @Override // pn2.b1
    public final boolean d() {
        return false;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        return this.f55631b.f();
    }

    @Override // pn2.b1
    public final List getParameters() {
        return q0.f80391a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntegerLiteralType");
        sb3.append("[" + CollectionsKt.Z(this.f55632c, ",", null, null, 0, null, n.f55629i, 30) + ']');
        return sb3.toString();
    }
}
