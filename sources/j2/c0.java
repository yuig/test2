package j2;

import i2.f2;
import i2.r2;
import i2.y2;

/* loaded from: classes.dex */
public final class c0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f74439c = new c0(1, 0, 2);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        int a13 = k0Var.a(0);
        int o13 = y2Var.o();
        int i13 = y2Var.f71397v;
        int H = y2Var.H(y2Var.f71377b, y2Var.p(i13));
        int f13 = y2Var.f(y2Var.f71377b, y2Var.p(i13 + 1));
        for (int max = Math.max(H, f13 - a13); max < f13; max++) {
            Object obj = y2Var.f71378c[y2Var.g(max)];
            if (obj instanceof r2) {
                yVar.e(o13 - max, -1, ((r2) obj).f71259a, -1);
            } else if (obj instanceof f2) {
                ((f2) obj).d();
            }
        }
        i2.u.o(a13 > 0);
        int i14 = y2Var.f71397v;
        int H2 = y2Var.H(y2Var.f71377b, y2Var.p(i14));
        int f14 = y2Var.f(y2Var.f71377b, y2Var.p(i14 + 1)) - a13;
        i2.u.o(f14 >= H2);
        y2Var.E(f14, a13, i14);
        int i15 = y2Var.f71384i;
        if (i15 >= H2) {
            y2Var.f71384i = i15 - a13;
        }
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "count" : super.b(i13);
    }
}
