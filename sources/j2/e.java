package j2;

import i2.r2;
import i2.y2;

/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f74442c = new e(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        i2.d dVar = (i2.d) k0Var.b(0);
        Object b13 = k0Var.b(1);
        if (b13 instanceof r2) {
            yVar.f71362b.add(((r2) b13).f71259a);
        }
        if (y2Var.f71389n != 0) {
            i2.u.i("Can only append a slot if not current inserting");
            throw null;
        }
        int i13 = y2Var.f71384i;
        int i14 = y2Var.f71385j;
        int c13 = y2Var.c(dVar);
        int f13 = y2Var.f(y2Var.f71377b, y2Var.p(c13 + 1));
        y2Var.f71384i = f13;
        y2Var.f71385j = f13;
        y2Var.t(1, c13);
        if (i13 >= f13) {
            i13++;
            i14++;
        }
        y2Var.f71378c[f13] = b13;
        y2Var.f71384i = i13;
        y2Var.f71385j = i14;
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "anchor" : com.bumptech.glide.d.B(i13, 1) ? "value" : super.c(i13);
    }
}
