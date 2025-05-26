package ul2;

import i2.j2;
import java.lang.reflect.Constructor;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 extends t implements kotlin.jvm.internal.n, rl2.g, g {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122538m;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f122539g;

    /* renamed from: h, reason: collision with root package name */
    public final String f122540h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f122541i;

    /* renamed from: j, reason: collision with root package name */
    public final w1 f122542j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.k f122543k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.k f122544l;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122538m = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(k0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0(ul2.i0 r8, am2.x r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            dm2.o r0 = (dm2.o) r0
            ym2.g r0 = r0.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            so.a r0 = ul2.a2.d(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.k0.<init>(ul2.i0, am2.x):void");
    }

    public static final vl2.y u(k0 k0Var, Constructor constructor, am2.x xVar, boolean z13) {
        if (!z13) {
            k0Var.getClass();
            if (m2.L1(xVar)) {
                return k0Var.t() ? new vl2.h(constructor, com.bumptech.glide.c.r(k0Var.f122541i, k0Var.n()), 0) : new vl2.i(constructor, 0);
            }
        }
        return k0Var.t() ? new vl2.h(constructor, com.bumptech.glide.c.r(k0Var.f122541i, k0Var.n()), 1) : new vl2.i(constructor, 1);
    }

    @Override // kl2.b
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return l3.c.B0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return l3.c.u0(this, obj, obj2, obj3, obj4);
    }

    @Override // kl2.q
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return l3.c.y0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final boolean equals(Object obj) {
        k0 b13 = c2.b(obj);
        return b13 != null && Intrinsics.d(this.f122539g, b13.f122539g) && Intrinsics.d(getName(), b13.getName()) && Intrinsics.d(this.f122540h, b13.f122540h) && Intrinsics.d(this.f122541i, b13.f122541i);
    }

    @Override // kl2.o
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return l3.c.w0(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.internal.n
    public final int getArity() {
        return lb.l0.o0(i());
    }

    @Override // rl2.c
    public final String getName() {
        String b13 = ((dm2.o) n()).getName().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return b13;
    }

    public final int hashCode() {
        return this.f122540h.hashCode() + ((getName().hashCode() + (this.f122539g.hashCode() * 31)) * 31);
    }

    @Override // ul2.t
    public final vl2.g i() {
        return (vl2.g) this.f122543k.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return l3.c.q0(this);
    }

    @Override // rl2.g
    public final boolean isExternal() {
        return n().isExternal();
    }

    @Override // rl2.g
    public final boolean isInfix() {
        return n().isInfix();
    }

    @Override // rl2.g
    public final boolean isInline() {
        return n().isInline();
    }

    @Override // rl2.g
    public final boolean isOperator() {
        return n().isOperator();
    }

    @Override // rl2.c
    public final boolean isSuspend() {
        return n().isSuspend();
    }

    @Override // ul2.t
    public final i0 j() {
        return this.f122539g;
    }

    @Override // kl2.p
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return l3.c.x0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // ul2.t
    public final vl2.g l() {
        return (vl2.g) this.f122544l.getValue();
    }

    @Override // kl2.c
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Integer num, Integer num2) {
        return l3.c.C0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, num, num2);
    }

    @Override // kl2.r
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return l3.c.z0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kl2.n
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l3.c.v0(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kl2.a
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return l3.c.A0(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // ul2.t
    public final boolean t() {
        return !Intrinsics.d(this.f122541i, kotlin.jvm.internal.e.NO_RECEIVER);
    }

    public final String toString() {
        an2.y yVar = z1.f122650a;
        return z1.b(n());
    }

    @Override // ul2.t
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final am2.x n() {
        rl2.u uVar = f122538m[0];
        Object invoke = this.f122542j.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (am2.x) invoke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return l3.c.r0(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return l3.c.s0(this, obj, obj2);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return l3.c.t0(this, obj, obj2, obj3);
    }

    public k0(i0 i0Var, String str, String str2, am2.x xVar, Object obj) {
        this.f122539g = i0Var;
        this.f122540h = str2;
        this.f122541i = obj;
        this.f122542j = new w1(xVar, new j2(16, this, str));
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122543k = xk2.m.a(nVar, new j0(this, 0));
        this.f122544l = xk2.m.a(nVar, new j0(this, 1));
    }
}
