package ul2;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 implements rl2.o {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f122642e;

    /* renamed from: a, reason: collision with root package name */
    public final t f122643a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122644b;

    /* renamed from: c, reason: collision with root package name */
    public final rl2.n f122645c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f122646d;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f122642e = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(y0.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public y0(t callable, int i13, rl2.n kind, Function0 computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f122643a = callable;
        this.f122644b = i13;
        this.f122645c = kind;
        this.f122646d = ue.c.y(computeDescriptor);
        ue.c.y(new x0(this, 0));
    }

    public static final Type a(y0 y0Var, Type... typeArr) {
        y0Var.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new w0(typeArr) : (Type) kotlin.collections.c0.R(typeArr);
        }
        throw new jl2.a("Expected at least 1 type for compound type");
    }

    public final am2.p0 c() {
        rl2.u uVar = f122642e[0];
        Object invoke = this.f122646d.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (am2.p0) invoke;
    }

    public final int d() {
        return this.f122644b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (Intrinsics.d(this.f122643a, y0Var.f122643a)) {
                if (this.f122644b == y0Var.f122644b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final rl2.n g() {
        return this.f122645c;
    }

    public final String getName() {
        Object c13 = c();
        Object obj = c13 instanceof am2.i1 ? (am2.i1) c13 : null;
        if (obj == null || ((dm2.b1) obj).g().V()) {
            return null;
        }
        ym2.g name = ((dm2.o) obj).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.f139479b) {
            return null;
        }
        return name.b();
    }

    public final q1 h() {
        pn2.b0 type = c().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new q1(type, new x0(this, 1));
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122644b) + (this.f122643a.hashCode() * 31);
    }

    public final boolean i() {
        am2.p0 c13 = c();
        am2.i1 i1Var = c13 instanceof am2.i1 ? (am2.i1) c13 : null;
        if (i1Var != null) {
            return fn2.d.a(i1Var);
        }
        return false;
    }

    public final boolean j() {
        am2.p0 c13 = c();
        return (c13 instanceof am2.i1) && ((dm2.b1) ((am2.i1) c13)).f55398j != null;
    }

    public final String toString() {
        String b13;
        an2.y yVar = z1.f122650a;
        Intrinsics.checkNotNullParameter(this, "parameter");
        StringBuilder sb3 = new StringBuilder();
        int i13 = y1.f122647a[this.f122645c.ordinal()];
        if (i13 == 1) {
            sb3.append("extension receiver parameter");
        } else if (i13 == 2) {
            sb3.append("instance parameter");
        } else if (i13 == 3) {
            sb3.append("parameter #" + this.f122644b + ' ' + getName());
        }
        sb3.append(" of ");
        am2.d n13 = this.f122643a.n();
        if (n13 instanceof am2.r0) {
            b13 = z1.d((am2.r0) n13);
        } else {
            if (!(n13 instanceof am2.x)) {
                throw new IllegalStateException(("Illegal callable: " + n13).toString());
            }
            b13 = z1.b((am2.x) n13);
        }
        sb3.append(b13);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }
}
