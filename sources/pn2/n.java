package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f100820a;

    /* renamed from: b, reason: collision with root package name */
    public static final vb0.i f100821b;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f100820a = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.c(n.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        t0 t0Var = u0.f100848b;
        rl2.d kClass = l0Var.b(m.class);
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String e13 = kClass.e();
        Intrinsics.f(e13);
        f100821b = new vb0.i(t0Var.b(e13));
    }

    public static final bm2.i a(u0 u0Var) {
        bm2.i a13;
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        m mVar = (m) f100821b.e(u0Var, f100820a[0]);
        return (mVar == null || (a13 = mVar.a()) == null) ? bm2.h.f23540a : a13;
    }
}
