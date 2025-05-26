package j2;

import i2.y2;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f74445c = new f0(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        ((Function2) k0Var.b(1)).invoke(fVar.e(), k0Var.b(0));
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "value" : com.bumptech.glide.d.B(i13, 1) ? "block" : super.c(i13);
    }
}
