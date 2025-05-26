package dm2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 extends o implements am2.o0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f55400h;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f55401c;

    /* renamed from: d, reason: collision with root package name */
    public final ym2.c f55402d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.l f55403e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.l f55404f;

    /* renamed from: g, reason: collision with root package name */
    public final in2.j f55405g;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f55400h = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(c0.class), "fragments", "getFragments()Ljava/util/List;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(c0.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 module, ym2.c fqName, on2.u storageManager) {
        super(bm2.h.f23540a, fqName.g());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f55401c = module;
        this.f55402d = fqName;
        b0 b0Var = new b0(this, 1);
        on2.q qVar = (on2.q) storageManager;
        qVar.getClass();
        this.f55403e = new on2.l(qVar, b0Var);
        this.f55404f = new on2.l(qVar, new b0(this, 0));
        this.f55405g = new in2.j(qVar, new b0(this, 2));
    }

    public final boolean equals(Object obj) {
        am2.o0 o0Var = obj instanceof am2.o0 ? (am2.o0) obj : null;
        if (o0Var == null) {
            return false;
        }
        c0 c0Var = (c0) o0Var;
        return Intrinsics.d(this.f55402d, c0Var.f55402d) && Intrinsics.d(this.f55401c, c0Var.f55401c);
    }

    @Override // am2.m
    public final am2.m g() {
        ym2.c cVar = this.f55402d;
        if (cVar.d()) {
            return null;
        }
        ym2.c e13 = cVar.e();
        Intrinsics.checkNotNullExpressionValue(e13, "parent(...)");
        return this.f55401c.H(e13);
    }

    public final int hashCode() {
        return this.f55402d.hashCode() + (this.f55401c.hashCode() * 31);
    }

    @Override // am2.m
    public final Object l0(ul2.e visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        switch (visitor.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) visitor.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.getClass();
                yVar.Y(this.f55402d, "package", builder);
                if (yVar.f15821a.h()) {
                    builder.append(" in context of ");
                    yVar.U(this.f55401c, builder, false);
                }
                return Unit.f80348a;
        }
    }
}
