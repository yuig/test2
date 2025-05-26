package j2;

import i2.y2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q f74473c = new q(1, 2);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        Object invoke = ((Function0) k0Var.b(0)).invoke();
        i2.d dVar = (i2.d) k0Var.b(1);
        int a13 = k0Var.a(0);
        Intrinsics.g(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        dVar.getClass();
        y2Var.Q(y2Var.c(dVar), invoke);
        fVar.c(a13, invoke);
        fVar.g(invoke);
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "insertIndex" : super.b(i13);
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "factory" : com.bumptech.glide.d.B(i13, 1) ? "groupAnchor" : super.c(i13);
    }
}
