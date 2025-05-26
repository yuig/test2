package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends e0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122632l;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f122633c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f122634d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f122635e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f122636f;

    /* renamed from: g, reason: collision with root package name */
    public final w1 f122637g;

    /* renamed from: h, reason: collision with root package name */
    public final w1 f122638h;

    /* renamed from: i, reason: collision with root package name */
    public final w1 f122639i;

    /* renamed from: j, reason: collision with root package name */
    public final w1 f122640j;

    /* renamed from: k, reason: collision with root package name */
    public final w1 f122641k;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122632l = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "annotations", "getAnnotations()Ljava/util/List;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "simpleName", "getSimpleName()Ljava/lang/String;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "constructors", "getConstructors()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "supertypes", "getSupertypes()Ljava/util/List;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
    }

    public y(c0 c0Var) {
        super(c0Var);
        int i13 = 3;
        this.f122633c = ue.c.y(new v(c0Var, i13));
        ue.c.y(new u(this, i13));
        this.f122634d = ue.c.y(new w(c0Var, this));
        int i14 = 6;
        this.f122635e = ue.c.y(new v(c0Var, i14));
        int i15 = 0;
        ue.c.y(new v(c0Var, i15));
        int i16 = 5;
        ue.c.y(new u(this, i16));
        xk2.m.a(xk2.n.PUBLICATION, new w(this, c0Var, i15));
        ue.c.y(new w(this, c0Var, i13));
        int i17 = 2;
        ue.c.y(new w(this, c0Var, i17));
        ue.c.y(new u(this, i14));
        int i18 = 1;
        this.f122636f = ue.c.y(new v(c0Var, i18));
        this.f122637g = ue.c.y(new v(c0Var, i17));
        int i19 = 4;
        this.f122638h = ue.c.y(new v(c0Var, i19));
        this.f122639i = ue.c.y(new v(c0Var, i16));
        this.f122640j = ue.c.y(new u(this, i18));
        this.f122641k = ue.c.y(new u(this, i17));
        ue.c.y(new u(this, i19));
        ue.c.y(new u(this, i15));
    }

    public final am2.g a() {
        rl2.u uVar = f122632l[0];
        Object invoke = this.f122633c.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (am2.g) invoke;
    }
}
