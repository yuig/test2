package j2;

import i2.f2;
import i2.r2;
import i2.y2;

/* loaded from: classes.dex */
public final class g0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f74447c = new g0(1, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        Object b13 = k0Var.b(0);
        int a13 = k0Var.a(0);
        if (b13 instanceof r2) {
            yVar.f71362b.add(((r2) b13).f71259a);
        }
        int g13 = y2Var.g(y2Var.I(y2Var.f71395t, a13));
        Object[] objArr = y2Var.f71378c;
        Object obj = objArr[g13];
        objArr[g13] = b13;
        if (obj instanceof r2) {
            yVar.e(y2Var.o() - y2Var.I(y2Var.f71395t, a13), -1, ((r2) obj).f71259a, -1);
        } else if (obj instanceof f2) {
            ((f2) obj).d();
        }
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "groupSlotIndex" : super.b(i13);
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "value" : super.c(i13);
    }
}
