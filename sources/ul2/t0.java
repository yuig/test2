package ul2;

import kh2.g2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 extends e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122608g;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f122609c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f122610d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f122611e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.k f122612f;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122608g = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(t0.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(t0.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(t0.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public t0(v0 v0Var) {
        super(v0Var);
        this.f122609c = ue.c.y(new g2(v0Var, 9));
        this.f122610d = ue.c.y(new s0(this, 1));
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122611e = xk2.m.a(nVar, new r0(this, v0Var));
        this.f122612f = xk2.m.a(nVar, new s0(this, 0));
        ue.c.y(new r0(v0Var, this));
    }

    public final xk2.w a() {
        return (xk2.w) this.f122612f.getValue();
    }

    public final Class b() {
        return (Class) this.f122611e.getValue();
    }

    public final in2.n c() {
        rl2.u uVar = f122608g[1];
        Object invoke = this.f122610d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (in2.n) invoke;
    }
}
