package am2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final re2.f f15593e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f15594f;

    /* renamed from: a, reason: collision with root package name */
    public final g f15595a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f15596b;

    /* renamed from: c, reason: collision with root package name */
    public final qn2.i f15597c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f15598d;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f15594f = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(u0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        f15593e = new re2.f(9, 0);
    }

    public u0(g gVar, on2.u uVar, Function1 function1) {
        qn2.h hVar = qn2.h.f104498a;
        this.f15595a = gVar;
        this.f15596b = function1;
        this.f15597c = hVar;
        tu1.u uVar2 = new tu1.u(this, 19);
        on2.q qVar = (on2.q) uVar;
        qVar.getClass();
        this.f15598d = new on2.l(qVar, uVar2);
    }

    public final in2.n a(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        d0 moduleDescriptor = fn2.d.j(this.f15595a);
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return (in2.n) lb.l0.B0(this.f15598d, f15594f[0]);
    }
}
