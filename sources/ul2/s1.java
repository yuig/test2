package ul2;

import kh2.g2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s1 implements rl2.w, d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122598d;

    /* renamed from: a, reason: collision with root package name */
    public final am2.c1 f122599a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f122600b;

    /* renamed from: c, reason: collision with root package name */
    public final t1 f122601c;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122598d = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(s1.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public s1(t1 t1Var, am2.c1 descriptor) {
        Class cls;
        c0 c0Var;
        Object l03;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f122599a = descriptor;
        this.f122600b = ue.c.y(new g2(this, 11));
        if (t1Var == null) {
            am2.m g13 = descriptor.g();
            Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
            if (g13 instanceof am2.g) {
                l03 = d((am2.g) g13);
            } else {
                if (!(g13 instanceof am2.d)) {
                    throw new u1("Unknown type parameter container: " + g13);
                }
                am2.m g14 = ((am2.d) g13).g();
                Intrinsics.checkNotNullExpressionValue(g14, "getContainingDeclaration(...)");
                if (g14 instanceof am2.g) {
                    c0Var = d((am2.g) g14);
                } else {
                    nn2.m mVar = g13 instanceof nn2.m ? (nn2.m) g13 : null;
                    if (mVar == null) {
                        throw new u1("Non-class callable descriptor must be deserialized: " + g13);
                    }
                    nn2.l z13 = mVar.z();
                    rm2.u uVar = z13 instanceof rm2.u ? (rm2.u) z13 : null;
                    Object obj = uVar != null ? uVar.f108795d : null;
                    fm2.c cVar = obj instanceof fm2.c ? (fm2.c) obj : null;
                    if (cVar == null || (cls = cVar.f62576a) == null) {
                        throw new u1("Container of deserialized member is not resolved: " + mVar);
                    }
                    c0Var = (c0) lb.l0.w0(cls);
                }
                l03 = g13.l0(new e(c0Var), Unit.f80348a);
            }
            Intrinsics.f(l03);
            t1Var = (t1) l03;
        }
        this.f122601c = t1Var;
    }

    public static c0 d(am2.g gVar) {
        Class k13 = c2.k(gVar);
        c0 c0Var = (c0) (k13 != null ? lb.l0.w0(k13) : null);
        if (c0Var != null) {
            return c0Var;
        }
        throw new u1("Type parameter container is not resolved: " + gVar.g());
    }

    @Override // ul2.d0
    public final am2.j a() {
        return this.f122599a;
    }

    public final String c() {
        String b13 = this.f122599a.getName().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return b13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (Intrinsics.d(this.f122601c, s1Var.f122601c) && Intrinsics.d(c(), s1Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode() + (this.f122601c.hashCode() * 31);
    }

    public final String toString() {
        rl2.z zVar;
        kotlin.jvm.internal.r0.f80447a.getClass();
        Intrinsics.checkNotNullParameter(this, "typeParameter");
        StringBuilder sb3 = new StringBuilder();
        int i13 = r1.f122594a[this.f122599a.r().ordinal()];
        if (i13 == 1) {
            zVar = rl2.z.INVARIANT;
        } else if (i13 == 2) {
            zVar = rl2.z.IN;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zVar = rl2.z.OUT;
        }
        int i14 = kotlin.jvm.internal.p0.f80440a[zVar.ordinal()];
        if (i14 == 2) {
            sb3.append("in ");
        } else if (i14 == 3) {
            sb3.append("out ");
        }
        sb3.append(c());
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
