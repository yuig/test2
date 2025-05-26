package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class q1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public static q1 f18672a;

    @Override // androidx.lifecycle.p1
    public final l1 a(rl2.d modelClass, u6.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return c(lb.l0.t0(modelClass), extras);
    }

    @Override // androidx.lifecycle.p1
    public l1 b(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return kh2.r.A(modelClass);
    }

    @Override // androidx.lifecycle.p1
    public l1 c(Class modelClass, u6.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(modelClass);
    }
}
