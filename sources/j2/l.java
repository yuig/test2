package j2;

import i2.y2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f74460c = new l(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        ((Function1) k0Var.b(0)).invoke((i2.v) k0Var.b(1));
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "anchor" : com.bumptech.glide.d.B(i13, 1) ? "composition" : super.c(i13);
    }
}
