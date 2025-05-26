package j2;

import i2.y2;

/* loaded from: classes.dex */
public final class o extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o f74471c;

    static {
        int i13 = 1;
        f74471c = new o(0, i13, i13);
    }

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        i2.d dVar = (i2.d) k0Var.b(0);
        dVar.getClass();
        y2Var.k(y2Var.c(dVar));
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "anchor" : super.c(i13);
    }
}
