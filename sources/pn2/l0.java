package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f100815a;

    public l0(xl2.l kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        h0 p13 = kotlinBuiltIns.p();
        Intrinsics.checkNotNullExpressionValue(p13, "getNullableAnyType(...)");
        this.f100815a = p13;
    }

    @Override // pn2.g1
    public final g1 a(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pn2.g1
    public final boolean b() {
        return true;
    }

    @Override // pn2.g1
    public final w1 c() {
        return w1.OUT_VARIANCE;
    }

    @Override // pn2.g1
    public final b0 getType() {
        return this.f100815a;
    }
}
