package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class m1 extends i1 implements rl2.h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122556i;

    /* renamed from: g, reason: collision with root package name */
    public final w1 f122557g = ue.c.y(new l1(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final xk2.k f122558h = xk2.m.a(xk2.n.PUBLICATION, new l1(this, 0));

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122556i = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(m1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m1) && Intrinsics.d(v(), ((m1) obj).v());
    }

    @Override // rl2.c
    public final String getName() {
        return ep.b.k(new StringBuilder("<set-"), v().f122568h, '>');
    }

    public final int hashCode() {
        return v().hashCode();
    }

    @Override // ul2.t
    public final vl2.g i() {
        return (vl2.g) this.f122558h.getValue();
    }

    @Override // ul2.t
    public final am2.d n() {
        rl2.u uVar = f122556i[0];
        Object invoke = this.f122557g.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (am2.t0) invoke;
    }

    public final String toString() {
        return "setter of " + v();
    }

    @Override // ul2.i1
    public final am2.q0 u() {
        rl2.u uVar = f122556i[0];
        Object invoke = this.f122557g.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (am2.t0) invoke;
    }
}
