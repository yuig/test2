package j2;

import i2.w2;
import i2.y2;

/* loaded from: classes.dex */
public final class r extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r f74474c = new r(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        w2 w2Var = (w2) k0Var.b(1);
        i2.d dVar = (i2.d) k0Var.b(0);
        y2Var.d();
        dVar.getClass();
        y2Var.v(w2Var, w2Var.b(dVar));
        y2Var.j();
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "anchor" : com.bumptech.glide.d.B(i13, 1) ? "from" : super.c(i13);
    }
}
