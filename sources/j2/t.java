package j2;

import i2.y2;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f74476c = new t(1, 0, 2);

    @Override // j2.j0
    public final void a(k0 k0Var, i2.f fVar, y2 y2Var, i2.y yVar) {
        i2.d dVar;
        int c13;
        int a13 = k0Var.a(0);
        if (!(y2Var.f71389n == 0)) {
            i2.u.i("Cannot move a group while inserting");
            throw null;
        }
        if (!(a13 >= 0)) {
            i2.u.i("Parameter offset is out of bounds");
            throw null;
        }
        if (a13 == 0) {
            return;
        }
        int i13 = y2Var.f71395t;
        int i14 = y2Var.f71397v;
        int i15 = y2Var.f71396u;
        int i16 = i13;
        while (a13 > 0) {
            i16 += lb.l0.i(y2Var.f71377b, y2Var.p(i16));
            if (i16 > i15) {
                i2.u.i("Parameter offset is out of bounds");
                throw null;
            }
            a13--;
        }
        int i17 = lb.l0.i(y2Var.f71377b, y2Var.p(i16));
        int f13 = y2Var.f(y2Var.f71377b, y2Var.p(y2Var.f71395t));
        int f14 = y2Var.f(y2Var.f71377b, y2Var.p(i16));
        int i18 = i16 + i17;
        int f15 = y2Var.f(y2Var.f71377b, y2Var.p(i18));
        int i19 = f15 - f14;
        y2Var.t(i19, Math.max(y2Var.f71395t - 1, 0));
        y2Var.s(i17);
        int[] iArr = y2Var.f71377b;
        int p13 = y2Var.p(i18) * 5;
        kotlin.collections.z.g(y2Var.p(i13) * 5, p13, (i17 * 5) + p13, iArr, iArr);
        if (i19 > 0) {
            Object[] objArr = y2Var.f71378c;
            kotlin.collections.z.h(f13, y2Var.g(f14 + i19), y2Var.g(f15 + i19), objArr, objArr);
        }
        int i23 = f14 + i19;
        int i24 = i23 - f13;
        int i25 = y2Var.f71386k;
        int i26 = y2Var.f71387l;
        int length = y2Var.f71378c.length;
        int i27 = y2Var.f71388m;
        int i28 = i13 + i17;
        int i29 = i13;
        while (i29 < i28) {
            int p14 = y2Var.p(i29);
            int i33 = i28;
            int i34 = i24;
            iArr[(p14 * 5) + 4] = y2.h(y2.h(y2Var.f(iArr, p14) - i24, i27 < p14 ? 0 : i25, i26, length), y2Var.f71386k, y2Var.f71387l, y2Var.f71378c.length);
            i29++;
            i24 = i34;
            i28 = i33;
            i25 = i25;
            i26 = i26;
        }
        int i35 = i18 + i17;
        int n13 = y2Var.n();
        int n14 = lb.l0.n(y2Var.f71379d, i18, n13);
        ArrayList arrayList = new ArrayList();
        if (n14 >= 0) {
            while (n14 < y2Var.f71379d.size() && (c13 = y2Var.c((dVar = (i2.d) y2Var.f71379d.get(n14)))) >= i18 && c13 < i35) {
                arrayList.add(dVar);
                y2Var.f71379d.remove(n14);
            }
        }
        int i36 = i13 - i18;
        int size = arrayList.size();
        for (int i37 = 0; i37 < size; i37++) {
            i2.d dVar2 = (i2.d) arrayList.get(i37);
            int c14 = y2Var.c(dVar2) + i36;
            if (c14 >= y2Var.f71382g) {
                dVar2.f71087a = -(n13 - c14);
            } else {
                dVar2.f71087a = c14;
            }
            y2Var.f71379d.add(lb.l0.n(y2Var.f71379d, c14, n13), dVar2);
        }
        if (!(!y2Var.D(i18, i17))) {
            i2.u.i("Unexpectedly removed anchors");
            throw null;
        }
        y2Var.l(i14, y2Var.f71396u, i13);
        if (i19 > 0) {
            y2Var.E(i23, i19, i18 - 1);
        }
    }

    @Override // j2.j0
    public final String b(int i13) {
        return com.bumptech.glide.c.y(i13, 0) ? "offset" : super.b(i13);
    }
}
