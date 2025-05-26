package j2;

import i2.y2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f74452c = new j(0, 2, 1);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        int i13;
        q2.j jVar = (q2.j) k0Var.b(0);
        i2.d dVar = (i2.d) k0Var.b(1);
        Intrinsics.g(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int c13 = y2Var.c(dVar);
        i2.u.o(y2Var.f71395t < c13);
        bp1.h.E(y2Var, fVar, c13);
        int i14 = y2Var.f71395t;
        int i15 = y2Var.f71397v;
        while (i15 >= 0 && !lb.l0.m(y2Var.f71377b, y2Var.p(i15))) {
            i15 = y2Var.z(y2Var.f71377b, i15);
        }
        int i16 = i15 + 1;
        int i17 = 0;
        while (i16 < i14) {
            if (y2Var.r(i14, i16)) {
                if (lb.l0.m(y2Var.f71377b, y2Var.p(i16))) {
                    i17 = 0;
                }
                i16++;
            } else {
                i17 += lb.l0.m(y2Var.f71377b, y2Var.p(i16)) ? 1 : lb.l0.o(y2Var.f71377b, y2Var.p(i16));
                i16 += y2Var.q(i16);
            }
        }
        while (true) {
            i13 = y2Var.f71395t;
            if (i13 >= c13) {
                break;
            }
            if (y2Var.r(c13, i13)) {
                int i18 = y2Var.f71395t;
                if (i18 < y2Var.f71396u && lb.l0.m(y2Var.f71377b, y2Var.p(i18))) {
                    fVar.g(y2Var.y(y2Var.f71395t));
                    i17 = 0;
                }
                y2Var.K();
            } else {
                i17 += y2Var.F();
            }
        }
        i2.u.o(i13 == c13);
        jVar.f102114a = i17;
    }

    @Override // j2.j0
    public final String c(int i13) {
        return com.bumptech.glide.d.B(i13, 0) ? "effectiveNodeIndexOut" : com.bumptech.glide.d.B(i13, 1) ? "anchor" : super.c(i13);
    }
}
