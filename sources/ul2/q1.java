package ul2;

import i2.j2;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q1 implements rl2.v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122584e;

    /* renamed from: a, reason: collision with root package name */
    public final pn2.b0 f122585a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f122586b;

    /* renamed from: c, reason: collision with root package name */
    public final w1 f122587c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f122588d;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122584e = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(q1.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(q1.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public q1(pn2.b0 type, Function0 function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f122585a = type;
        w1 w1Var = null;
        w1 w1Var2 = function0 instanceof w1 ? (w1) function0 : null;
        if (w1Var2 != null) {
            w1Var = w1Var2;
        } else if (function0 != null) {
            w1Var = ue.c.y(function0);
        }
        this.f122586b = w1Var;
        this.f122587c = ue.c.y(new tu1.u(this, 16));
        this.f122588d = ue.c.y(new j2(17, this, function0));
    }

    public final rl2.e a(pn2.b0 b0Var) {
        pn2.b0 type;
        am2.j b13 = b0Var.w0().b();
        if (!(b13 instanceof am2.g)) {
            if (b13 instanceof am2.c1) {
                return new s1(null, (am2.c1) b13);
            }
            if (b13 instanceof am2.b1) {
                throw new xk2.o("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class k13 = c2.k((am2.g) b13);
        if (k13 == null) {
            return null;
        }
        if (!k13.isArray()) {
            if (pn2.t1.g(b0Var)) {
                return new c0(k13);
            }
            List list = gm2.d.f65761a;
            Intrinsics.checkNotNullParameter(k13, "<this>");
            Class cls = (Class) gm2.d.f65762b.get(k13);
            if (cls != null) {
                k13 = cls;
            }
            return new c0(k13);
        }
        pn2.g1 g1Var = (pn2.g1) CollectionsKt.u0(b0Var.u0());
        if (g1Var == null || (type = g1Var.getType()) == null) {
            return new c0(k13);
        }
        rl2.e a13 = a(type);
        if (a13 != null) {
            Class t03 = lb.l0.t0(kh2.w.H(a13));
            Intrinsics.checkNotNullParameter(t03, "<this>");
            return new c0(Array.newInstance((Class<?>) t03, 0).getClass());
        }
        throw new u1("Cannot determine classifier for array element type: " + this);
    }

    public final List c() {
        rl2.u uVar = f122584e[1];
        Object invoke = this.f122588d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (List) invoke;
    }

    public final rl2.e d() {
        rl2.u uVar = f122584e[0];
        return (rl2.e) this.f122587c.invoke();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q1) {
            q1 q1Var = (q1) obj;
            if (Intrinsics.d(this.f122585a, q1Var.f122585a) && Intrinsics.d(d(), q1Var.d()) && Intrinsics.d(c(), q1Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f122585a.hashCode() * 31;
        rl2.e d2 = d();
        return c().hashCode() + ((hashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        an2.y yVar = z1.f122650a;
        return z1.e(this.f122585a);
    }
}
