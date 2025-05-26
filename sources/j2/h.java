package j2;

import i2.k1;
import i2.y2;

/* loaded from: classes2.dex */
public final class h extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f74448c = new h(0, 4, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        k1 k1Var = (k1) k0Var.b(2);
        i2.w wVar = (i2.w) k0Var.b(1);
        wVar.j(k1Var);
        i2.u.j("Could not resolve state for movable content");
        throw null;
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "resolvedState" : com.bumptech.glide.d.B(i13, 1) ? "resolvedCompositionContext" : com.bumptech.glide.d.B(i13, 2) ? "from" : com.bumptech.glide.d.B(i13, 3) ? "to" : super.c(i13);
    }
}
