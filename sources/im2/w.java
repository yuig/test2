package im2;

import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.c f72784a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.c[] f72785b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f72786c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f72787d;

    static {
        ym2.c cVar = new ym2.c("org.jspecify.nullness");
        ym2.c cVar2 = new ym2.c("org.jspecify.annotations");
        f72784a = cVar2;
        ym2.c cVar3 = new ym2.c("io.reactivex.rxjava3.annotations");
        ym2.c cVar4 = new ym2.c("org.checkerframework.checker.nullness.compatqual");
        String b13 = cVar3.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        f72785b = new ym2.c[]{new ym2.c(b13.concat(".Nullable")), new ym2.c(b13.concat(".NonNull"))};
        ym2.c cVar5 = new ym2.c("org.jetbrains.annotations");
        x xVar = x.f72788d;
        Pair pair = new Pair(cVar5, xVar);
        Pair pair2 = new Pair(new ym2.c("androidx.annotation"), xVar);
        Pair pair3 = new Pair(new ym2.c("android.support.annotation"), xVar);
        Pair pair4 = new Pair(new ym2.c("android.annotation"), xVar);
        Pair pair5 = new Pair(new ym2.c("com.android.annotations"), xVar);
        Pair pair6 = new Pair(new ym2.c("org.eclipse.jdt.annotation"), xVar);
        Pair pair7 = new Pair(new ym2.c("org.checkerframework.checker.nullness.qual"), xVar);
        Pair pair8 = new Pair(cVar4, xVar);
        Pair pair9 = new Pair(new ym2.c("javax.annotation"), xVar);
        Pair pair10 = new Pair(new ym2.c("edu.umd.cs.findbugs.annotations"), xVar);
        Pair pair11 = new Pair(new ym2.c("io.reactivex.annotations"), xVar);
        ym2.c cVar6 = new ym2.c("androidx.annotation.RecentlyNullable");
        j0 j0Var = j0.WARN;
        Pair pair12 = new Pair(cVar6, new x(j0Var, 4));
        Pair pair13 = new Pair(new ym2.c("androidx.annotation.RecentlyNonNull"), new x(j0Var, 4));
        Pair pair14 = new Pair(new ym2.c("lombok"), xVar);
        xk2.j jVar = new xk2.j(2, 0, 0);
        j0 j0Var2 = j0.STRICT;
        f72786c = new h0(z0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(cVar, new x(j0Var, jVar, j0Var2)), new Pair(cVar2, new x(j0Var, new xk2.j(2, 0, 0), j0Var2)), new Pair(cVar3, new x(j0Var, new xk2.j(1, 8, 0), j0Var2))));
        f72787d = new x(j0Var, 4);
    }
}
