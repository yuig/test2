package j2;

import i2.y2;

/* loaded from: classes2.dex */
public final class u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f74477c = new u(3, 0, 2);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        fVar.a(k0Var.a(0), k0Var.a(1), k0Var.a(2));
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "from" : com.bumptech.glide.c.y(i13, 1) ? "to" : com.bumptech.glide.c.y(i13, 2) ? "count" : super.b(i13);
    }
}
