package j2;

import i2.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k f74455c = new k(0, 1, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        Intrinsics.g(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) k0Var.b(0)) {
            fVar.g(obj);
        }
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "nodes" : super.c(i13);
    }
}
