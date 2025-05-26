package qo2;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f104543a;

    static {
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        rl2.d b13 = l0Var.b(String.class);
        f0.h.n0(kotlin.jvm.internal.o0.f80439a);
        Pair pair = new Pair(b13, j1.f104576a);
        rl2.d b14 = l0Var.b(Character.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.f.f80423a, "<this>");
        Pair pair2 = new Pair(b14, n.f104595a);
        Pair pair3 = new Pair(l0Var.b(char[].class), m.f104591c);
        rl2.d b15 = l0Var.b(Double.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.k.f80435a, "<this>");
        Pair pair4 = new Pair(b15, s.f104618a);
        Pair pair5 = new Pair(l0Var.b(double[].class), r.f104614c);
        rl2.d b16 = l0Var.b(Float.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.l.f80437a, "<this>");
        Pair pair6 = new Pair(b16, z.f104669a);
        Pair pair7 = new Pair(l0Var.b(float[].class), y.f104655c);
        rl2.d b17 = l0Var.b(Long.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.t.f80448a, "<this>");
        Pair pair8 = new Pair(b17, m0.f104592a);
        Pair pair9 = new Pair(l0Var.b(long[].class), l0.f104586c);
        rl2.d b18 = l0Var.b(xk2.e0.class);
        Intrinsics.checkNotNullParameter(xk2.e0.f135207b, "<this>");
        Pair pair10 = new Pair(b18, v1.f104640a);
        Pair pair11 = new Pair(l0Var.b(xk2.f0.class), u1.f104635c);
        rl2.d b19 = l0Var.b(Integer.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.q.f80441a, "<this>");
        Pair pair12 = new Pair(b19, f0.f104550a);
        Pair pair13 = new Pair(l0Var.b(int[].class), e0.f104546c);
        rl2.d b23 = l0Var.b(xk2.b0.class);
        Intrinsics.checkNotNullParameter(xk2.b0.f135200b, "<this>");
        Pair pair14 = new Pair(b23, s1.f104621a);
        Pair pair15 = new Pair(l0Var.b(xk2.c0.class), r1.f104617c);
        rl2.d b24 = l0Var.b(Short.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.n0.f80438a, "<this>");
        Pair pair16 = new Pair(b24, i1.f104570a);
        Pair pair17 = new Pair(l0Var.b(short[].class), h1.f104565c);
        rl2.d b25 = l0Var.b(xk2.i0.class);
        Intrinsics.checkNotNullParameter(xk2.i0.f135212b, "<this>");
        Pair pair18 = new Pair(b25, y1.f104667a);
        Pair pair19 = new Pair(l0Var.b(xk2.j0.class), x1.f104654c);
        rl2.d b26 = l0Var.b(Byte.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.c.f80421a, "<this>");
        Pair pair20 = new Pair(b26, j.f104572a);
        Pair pair21 = new Pair(l0Var.b(byte[].class), i.f104566c);
        rl2.d b27 = l0Var.b(xk2.y.class);
        Intrinsics.checkNotNullParameter(xk2.y.f135237b, "<this>");
        Pair pair22 = new Pair(b27, p1.f104608a);
        Pair pair23 = new Pair(l0Var.b(xk2.z.class), o1.f104605c);
        rl2.d b28 = l0Var.b(Boolean.TYPE);
        Intrinsics.checkNotNullParameter(kotlin.jvm.internal.b.f80420a, "<this>");
        Pair pair24 = new Pair(b28, g.f104555a);
        Pair pair25 = new Pair(l0Var.b(boolean[].class), f.f104549c);
        rl2.d b29 = l0Var.b(Unit.class);
        Intrinsics.checkNotNullParameter(Unit.f80348a, "<this>");
        Pair pair26 = new Pair(b29, z1.f104671b);
        Pair pair27 = new Pair(l0Var.b(Void.class), u0.f104633a);
        rl2.d b33 = l0Var.b(zn2.b.class);
        Intrinsics.checkNotNullParameter(zn2.b.f142311b, "<this>");
        f104543a = kotlin.collections.z0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, new Pair(b33, t.f104623a));
    }

    public static final String a(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        char charAt = str.charAt(0);
        sb3.append((Object) (Character.isLowerCase(charAt) ? kotlin.text.f0.a(charAt) : String.valueOf(charAt)));
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb3.append(substring);
        return sb3.toString();
    }
}
