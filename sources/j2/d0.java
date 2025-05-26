package j2;

import i2.f2;
import i2.r2;
import i2.y2;

/* loaded from: classes.dex */
public final class d0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f74441c = new d0(1, 2);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        int i13;
        int i14;
        Object b13 = k0Var.b(0);
        i2.d dVar = (i2.d) k0Var.b(1);
        int a13 = k0Var.a(0);
        if (b13 instanceof r2) {
            yVar.f71362b.add(((r2) b13).f71259a);
        }
        int c13 = y2Var.c(dVar);
        int g13 = y2Var.g(y2Var.I(c13, a13));
        Object[] objArr = y2Var.f71378c;
        Object obj = objArr[g13];
        objArr[g13] = b13;
        if (!(obj instanceof r2)) {
            if (obj instanceof f2) {
                ((f2) obj).d();
                return;
            }
            return;
        }
        int o13 = y2Var.o() - y2Var.I(c13, a13);
        r2 r2Var = (r2) obj;
        i2.d dVar2 = r2Var.f71260b;
        if (dVar2 == null || !dVar2.a()) {
            i13 = -1;
            i14 = -1;
        } else {
            i13 = y2Var.c(dVar2);
            i14 = y2Var.o() - y2Var.f(y2Var.f71377b, y2Var.p(y2Var.q(i13) + i13));
        }
        yVar.e(o13, i13, r2Var.f71259a, i14);
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "groupSlotIndex" : super.b(i13);
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "value" : com.bumptech.glide.d.B(i13, 1) ? "anchor" : super.c(i13);
    }
}
