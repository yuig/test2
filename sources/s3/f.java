package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final org.chromium.net.y f110773a = new org.chromium.net.y();

    public static final boolean a(d dVar) {
        h2 h2Var = com.bumptech.glide.c.U0(dVar).f110837y.f110807d;
        Intrinsics.g(h2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return h2Var.f110787n;
    }

    public static int b(b0 b0Var, q3.s sVar, q3.r rVar, int i13) {
        return b0Var.a(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, s1.Max, t1.Height, 1), bs1.c.b(i13, 0, 13)).i();
    }

    public static int c(b0 b0Var, q3.s sVar, q3.r rVar, int i13) {
        return b0Var.a(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, s1.Max, t1.Width, 1), bs1.c.b(0, i13, 7)).j();
    }

    public static int d(b0 b0Var, q3.s sVar, q3.r rVar, int i13) {
        return b0Var.a(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, s1.Min, t1.Height, 1), bs1.c.b(i13, 0, 13)).i();
    }

    public static int e(b0 b0Var, q3.s sVar, q3.r rVar, int i13) {
        return b0Var.a(new q3.w(sVar, sVar.getLayoutDirection()), new q3.t0(rVar, s1.Min, t1.Width, 1), bs1.c.b(0, i13, 7)).j();
    }
}
