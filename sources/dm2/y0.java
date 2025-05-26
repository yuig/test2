package dm2;

import kotlin.jvm.internal.Intrinsics;
import pn2.q1;

/* loaded from: classes4.dex */
public final class y0 extends z implements w0 {
    public static final gi2.b H;
    public final on2.u E;
    public final am2.b1 F;
    public am2.f G;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        H = new gi2.b();
    }

    public y0(on2.u uVar, am2.b1 b1Var, am2.f fVar, w0 w0Var, bm2.i iVar, am2.c cVar, am2.w0 w0Var2) {
        super(cVar, b1Var, w0Var, w0Var2, iVar, ym2.i.f139486e);
        this.E = uVar;
        this.F = b1Var;
        b1Var.getClass();
        this.f55580s = false;
        ((on2.q) uVar).f(new x0(this, fVar));
        this.G = fVar;
    }

    @Override // dm2.p
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final w0 o0() {
        am2.x o03 = super.o0();
        Intrinsics.g(o03, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (w0) o03;
    }

    @Override // dm2.z, am2.x, am2.y0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final y0 d(q1 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        am2.x d2 = super.d(substitutor);
        Intrinsics.g(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        y0 y0Var = (y0) d2;
        pn2.b0 b0Var = y0Var.f55568g;
        Intrinsics.f(b0Var);
        q1 d13 = q1.d(b0Var);
        Intrinsics.checkNotNullExpressionValue(d13, "create(...)");
        am2.f d14 = ((k) ((k) this.G).o0()).d(d13);
        if (d14 == null) {
            return null;
        }
        y0Var.G = d14;
        return y0Var;
    }

    @Override // am2.l
    public final boolean Q() {
        return ((k) this.G).E;
    }

    @Override // am2.l
    public final am2.g R() {
        am2.g R = ((k) this.G).R();
        Intrinsics.checkNotNullExpressionValue(R, "getConstructedClass(...)");
        return R;
    }

    @Override // am2.d
    public final am2.d W(am2.m newOwner, am2.c0 modality, am2.r visibility, am2.c kind) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        y z03 = z0(q1.f100833b);
        z03.k(newOwner);
        z03.h(modality);
        z03.i(visibility);
        z03.j(kind);
        z03.f55554m = false;
        am2.p w03 = z03.f55565x.w0(z03);
        Intrinsics.g(w03, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (w0) w03;
    }

    @Override // dm2.p, am2.m
    public final am2.k g() {
        return this.F;
    }

    @Override // dm2.z, am2.b
    public final pn2.b0 getReturnType() {
        pn2.b0 b0Var = this.f55568g;
        Intrinsics.f(b0Var);
        return b0Var;
    }

    @Override // dm2.z
    public final z v0(am2.c kind, am2.m newOwner, am2.x xVar, am2.w0 source, bm2.i annotations, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        am2.c cVar = am2.c.DECLARATION;
        if (kind != cVar) {
            am2.c cVar2 = am2.c.SYNTHESIZED;
        }
        return new y0(this.E, this.F, this.G, this, annotations, cVar, source);
    }

    @Override // dm2.p, am2.m
    public final am2.m g() {
        return this.F;
    }
}
