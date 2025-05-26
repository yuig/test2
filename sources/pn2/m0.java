package pn2;

import kh2.g2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends h1 {

    /* renamed from: a, reason: collision with root package name */
    public final am2.c1 f100818a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.k f100819b;

    public m0(am2.c1 typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        this.f100818a = typeParameter;
        this.f100819b = xk2.m.a(xk2.n.PUBLICATION, new g2(this, 20));
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
        return (b0) this.f100819b.getValue();
    }
}
