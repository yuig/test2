package mm2;

import am2.w0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class r extends dm2.k0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f87722m;

    /* renamed from: g, reason: collision with root package name */
    public final gm2.a0 f87723g;

    /* renamed from: h, reason: collision with root package name */
    public final rg.a f87724h;

    /* renamed from: i, reason: collision with root package name */
    public final on2.l f87725i;

    /* renamed from: j, reason: collision with root package name */
    public final d f87726j;

    /* renamed from: k, reason: collision with root package name */
    public final on2.d f87727k;

    /* renamed from: l, reason: collision with root package name */
    public final bm2.i f87728l;

    static {
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f87722m = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(r.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(r.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rg.a outerContext, gm2.a0 jPackage) {
        super(outerContext.b(), jPackage.f65755a);
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.f87723g = jPackage;
        rg.a x13 = bs1.c.x(outerContext, this, null, 6);
        this.f87724h = x13;
        wn2.k.i(((lm2.a) outerContext.f107929a).f83934d.c().f84110c);
        on2.u c13 = x13.c();
        p pVar = new p(this, 0);
        on2.q qVar = (on2.q) c13;
        qVar.getClass();
        this.f87725i = new on2.l(qVar, pVar);
        this.f87726j = new d(x13, jPackage, this);
        on2.u c14 = x13.c();
        p pVar2 = new p(this, 2);
        q0 q0Var = q0.f80391a;
        on2.q qVar2 = (on2.q) c14;
        qVar2.getClass();
        if (q0Var == null) {
            on2.q.a(27);
            throw null;
        }
        this.f87727k = new on2.d(qVar2, pVar2, q0Var);
        this.f87728l = ((lm2.a) x13.f107929a).f83952v.f72795b ? bm2.h.f23540a : dl2.b.v2(x13, jPackage);
        ((on2.q) x13.c()).c(new p(this, 1));
    }

    @Override // dm2.k0, dm2.p, am2.n
    public final w0 b() {
        return new rm2.g0(this);
    }

    @Override // bm2.b, bm2.a
    public final bm2.i getAnnotations() {
        return this.f87728l;
    }

    @Override // dm2.k0, dm2.o
    public final String toString() {
        return "Lazy Java package fragment: " + this.f55454e + " of module " + ((lm2.a) this.f87724h.f107929a).f83945o;
    }

    @Override // am2.i0
    public final in2.n w() {
        return this.f87726j;
    }
}
