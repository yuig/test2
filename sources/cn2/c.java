package cn2;

import am2.j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.g1;
import pn2.w1;
import qn2.l;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f28263a;

    /* renamed from: b, reason: collision with root package name */
    public l f28264b;

    public c(g1 projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f28263a = projection;
        projection.c();
        w1 w1Var = w1.INVARIANT;
    }

    @Override // cn2.b
    public final g1 a() {
        return this.f28263a;
    }

    @Override // pn2.b1
    public final /* bridge */ /* synthetic */ j b() {
        return null;
    }

    @Override // pn2.b1
    public final Collection c() {
        g1 g1Var = this.f28263a;
        b0 type = g1Var.c() == w1.OUT_VARIANCE ? g1Var.getType() : f().p();
        Intrinsics.f(type);
        return e0.b(type);
    }

    @Override // pn2.b1
    public final boolean d() {
        return false;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        xl2.l f13 = this.f28263a.getType().w0().f();
        Intrinsics.checkNotNullExpressionValue(f13, "getBuiltIns(...)");
        return f13;
    }

    @Override // pn2.b1
    public final List getParameters() {
        return q0.f80391a;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f28263a + ')';
    }
}
