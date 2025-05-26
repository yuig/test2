package j2;

import i2.j1;
import i2.k1;
import i2.u3;
import i2.z0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final i2.s f74424a;

    /* renamed from: b, reason: collision with root package name */
    public a f74425b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f74426c;

    /* renamed from: f, reason: collision with root package name */
    public int f74429f;

    /* renamed from: g, reason: collision with root package name */
    public int f74430g;

    /* renamed from: l, reason: collision with root package name */
    public int f74435l;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f74427d = new z0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f74428e = true;

    /* renamed from: h, reason: collision with root package name */
    public final u3 f74431h = new u3();

    /* renamed from: i, reason: collision with root package name */
    public int f74432i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f74433j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f74434k = -1;

    public b(i2.s sVar, a aVar) {
        this.f74424a = sVar;
        this.f74425b = aVar;
    }

    public final void a(ArrayList arrayList, q2.j jVar) {
        a aVar = this.f74425b;
        aVar.getClass();
        if (!arrayList.isEmpty()) {
            g gVar = g.f74446c;
            l0 l0Var = aVar.f74422a;
            l0Var.G1(gVar);
            bf.b.o0(l0Var, 1, arrayList);
            bf.b.o0(l0Var, 0, jVar);
            int i13 = l0Var.f74467g;
            int i14 = gVar.f74453a;
            int z13 = l0.z1(l0Var, i14);
            int i15 = gVar.f74454b;
            if (i13 == z13 && l0Var.f74468h == l0.z1(l0Var, i15)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                if (((1 << i17) & l0Var.f74467g) != 0) {
                    if (i16 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(gVar.b(i17));
                    i16++;
                }
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                if (((1 << i19) & l0Var.f74468h) != 0) {
                    if (i16 > 0) {
                        n13.append(", ");
                    }
                    n13.append(gVar.c(i19));
                    i18++;
                }
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(gVar);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i18, " object arguments (", sb5, ").");
            throw null;
        }
    }

    public final void b(j1 j1Var, i2.w wVar, k1 k1Var, k1 k1Var2) {
        a aVar = this.f74425b;
        aVar.getClass();
        h hVar = h.f74448c;
        l0 l0Var = aVar.f74422a;
        l0Var.G1(hVar);
        bf.b.o0(l0Var, 0, j1Var);
        bf.b.o0(l0Var, 1, wVar);
        bf.b.o0(l0Var, 3, k1Var2);
        bf.b.o0(l0Var, 2, k1Var);
        int i13 = l0Var.f74467g;
        int i14 = hVar.f74453a;
        int z13 = l0.z1(l0Var, i14);
        int i15 = hVar.f74454b;
        if (i13 == z13 && l0Var.f74468h == l0.z1(l0Var, i15)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            if (((1 << i17) & l0Var.f74467g) != 0) {
                if (i16 > 0) {
                    sb3.append(", ");
                }
                sb3.append(hVar.b(i17));
                i16++;
            }
        }
        String sb4 = sb3.toString();
        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            if (((1 << i19) & l0Var.f74468h) != 0) {
                if (i16 > 0) {
                    n13.append(", ");
                }
                n13.append(hVar.c(i19));
                i18++;
            }
        }
        String sb5 = n13.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(hVar);
        sb6.append(". Not all arguments were provided. Missing ");
        a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
        ep.b.B(sb6, i18, " object arguments (", sb5, ").");
        throw null;
    }

    public final void c(q2.j jVar, i2.d dVar) {
        f();
        a aVar = this.f74425b;
        aVar.getClass();
        j jVar2 = j.f74452c;
        l0 l0Var = aVar.f74422a;
        l0Var.G1(jVar2);
        bf.b.o0(l0Var, 0, jVar);
        bf.b.o0(l0Var, 1, dVar);
        int i13 = l0Var.f74467g;
        int i14 = jVar2.f74453a;
        int z13 = l0.z1(l0Var, i14);
        int i15 = jVar2.f74454b;
        if (i13 == z13 && l0Var.f74468h == l0.z1(l0Var, i15)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            if (((1 << i17) & l0Var.f74467g) != 0) {
                if (i16 > 0) {
                    sb3.append(", ");
                }
                sb3.append(jVar2.b(i17));
                i16++;
            }
        }
        String sb4 = sb3.toString();
        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            if (((1 << i19) & l0Var.f74468h) != 0) {
                if (i16 > 0) {
                    n13.append(", ");
                }
                n13.append(jVar2.c(i19));
                i18++;
            }
        }
        String sb5 = n13.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(jVar2);
        sb6.append(". Not all arguments were provided. Missing ");
        a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
        ep.b.B(sb6, i18, " object arguments (", sb5, ").");
        throw null;
    }

    public final void d(a aVar, q2.j jVar) {
        a aVar2 = this.f74425b;
        aVar2.getClass();
        if (aVar.f74422a.D1()) {
            f fVar = f.f74444c;
            l0 l0Var = aVar2.f74422a;
            l0Var.G1(fVar);
            bf.b.o0(l0Var, 0, aVar);
            bf.b.o0(l0Var, 1, jVar);
            int i13 = l0Var.f74467g;
            int i14 = fVar.f74453a;
            int z13 = l0.z1(l0Var, i14);
            int i15 = fVar.f74454b;
            if (i13 == z13 && l0Var.f74468h == l0.z1(l0Var, i15)) {
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                if (((1 << i17) & l0Var.f74467g) != 0) {
                    if (i16 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(fVar.b(i17));
                    i16++;
                }
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                if (((1 << i19) & l0Var.f74468h) != 0) {
                    if (i16 > 0) {
                        n13.append(", ");
                    }
                    n13.append(fVar.c(i19));
                    i18++;
                }
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(fVar);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i18, " object arguments (", sb5, ").");
            throw null;
        }
    }

    public final void e() {
        h();
        u3 u3Var = this.f74431h;
        if (!(!u3Var.f71316a.isEmpty())) {
            this.f74430g++;
        } else {
            u3Var.f71316a.remove(r0.size() - 1);
        }
    }

    public final void f() {
        b bVar = this;
        int i13 = bVar.f74430g;
        int i14 = 0;
        if (i13 > 0) {
            a aVar = bVar.f74425b;
            aVar.getClass();
            h0 h0Var = h0.f74449c;
            l0 l0Var = aVar.f74422a;
            l0Var.G1(h0Var);
            bf.b.n0(l0Var, 0, i13);
            int i15 = l0Var.f74467g;
            int i16 = h0Var.f74453a;
            int z13 = l0.z1(l0Var, i16);
            int i17 = h0Var.f74454b;
            if (i15 != z13 || l0Var.f74468h != l0.z1(l0Var, i17)) {
                StringBuilder sb3 = new StringBuilder();
                int i18 = 0;
                while (i18 < i16) {
                    int i19 = i16;
                    if (((1 << i18) & l0Var.f74467g) != 0) {
                        if (i14 > 0) {
                            sb3.append(", ");
                        }
                        sb3.append(h0Var.b(i18));
                        i14++;
                    }
                    i18++;
                    i16 = i19;
                }
                String sb4 = sb3.toString();
                StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
                int i23 = 0;
                int i24 = 0;
                while (i24 < i17) {
                    int i25 = i17;
                    if (((1 << i24) & l0Var.f74468h) != 0) {
                        if (i14 > 0) {
                            n13.append(", ");
                        }
                        n13.append(h0Var.c(i24));
                        i23++;
                    }
                    i24++;
                    i17 = i25;
                }
                String sb5 = n13.toString();
                Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb6 = new StringBuilder("Error while pushing ");
                sb6.append(h0Var);
                sb6.append(". Not all arguments were provided. Missing ");
                a.a.A(sb6, i14, " int arguments (", sb4, ") and ");
                ep.b.B(sb6, i23, " object arguments (", sb5, ").");
                throw null;
            }
            bVar.f74430g = 0;
        } else {
            bVar = this;
        }
        u3 u3Var = bVar.f74431h;
        if (!u3Var.f71316a.isEmpty()) {
            a aVar2 = bVar.f74425b;
            ArrayList arrayList = u3Var.f71316a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i26 = 0; i26 < size; i26++) {
                objArr[i26] = arrayList.get(i26);
            }
            aVar2.getClass();
            if (!(size == 0)) {
                k kVar = k.f74455c;
                l0 l0Var2 = aVar2.f74422a;
                l0Var2.G1(kVar);
                bf.b.o0(l0Var2, 0, objArr);
                int i27 = l0Var2.f74467g;
                int i28 = kVar.f74453a;
                int z14 = l0.z1(l0Var2, i28);
                int i29 = kVar.f74454b;
                if (i27 != z14 || l0Var2.f74468h != l0.z1(l0Var2, i29)) {
                    StringBuilder sb7 = new StringBuilder();
                    int i33 = 0;
                    for (int i34 = 0; i34 < i28; i34++) {
                        if (((1 << i34) & l0Var2.f74467g) != 0) {
                            if (i33 > 0) {
                                sb7.append(", ");
                            }
                            sb7.append(kVar.b(i34));
                            i33++;
                        }
                    }
                    String sb8 = sb7.toString();
                    StringBuilder n14 = ep.b.n(sb8, "StringBuilder().apply(builderAction).toString()");
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < i29) {
                        int i37 = i29;
                        if (((1 << i35) & l0Var2.f74468h) != 0) {
                            if (i33 > 0) {
                                n14.append(", ");
                            }
                            n14.append(kVar.c(i35));
                            i36++;
                        }
                        i35++;
                        i29 = i37;
                    }
                    String sb9 = n14.toString();
                    Intrinsics.checkNotNullExpressionValue(sb9, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb10 = new StringBuilder("Error while pushing ");
                    sb10.append(kVar);
                    sb10.append(". Not all arguments were provided. Missing ");
                    a.a.A(sb10, i33, " int arguments (", sb8, ") and ");
                    ep.b.B(sb10, i36, " object arguments (", sb9, ").");
                    throw null;
                }
            }
            arrayList.clear();
        }
    }

    public final void g(int i13, int i14, int i15) {
        f();
        a aVar = this.f74425b;
        aVar.getClass();
        u uVar = u.f74477c;
        l0 l0Var = aVar.f74422a;
        l0Var.G1(uVar);
        bf.b.n0(l0Var, 1, i13);
        bf.b.n0(l0Var, 0, i14);
        bf.b.n0(l0Var, 2, i15);
        int i16 = l0Var.f74467g;
        int i17 = uVar.f74453a;
        int z13 = l0.z1(l0Var, i17);
        int i18 = uVar.f74454b;
        if (i16 == z13 && l0Var.f74468h == l0.z1(l0Var, i18)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i19 = 0;
        for (int i23 = 0; i23 < i17; i23++) {
            if (((1 << i23) & l0Var.f74467g) != 0) {
                if (i19 > 0) {
                    sb3.append(", ");
                }
                sb3.append(uVar.b(i23));
                i19++;
            }
        }
        String sb4 = sb3.toString();
        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
        int i24 = 0;
        for (int i25 = 0; i25 < i18; i25++) {
            if (((1 << i25) & l0Var.f74468h) != 0) {
                if (i19 > 0) {
                    n13.append(", ");
                }
                n13.append(uVar.c(i25));
                i24++;
            }
        }
        String sb5 = n13.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(uVar);
        sb6.append(". Not all arguments were provided. Missing ");
        a.a.A(sb6, i19, " int arguments (", sb4, ") and ");
        ep.b.B(sb6, i24, " object arguments (", sb5, ").");
        throw null;
    }

    public final void h() {
        int i13 = this.f74435l;
        if (i13 > 0) {
            int i14 = this.f74432i;
            if (i14 >= 0) {
                j(i14, i13);
                this.f74432i = -1;
            } else {
                g(this.f74434k, this.f74433j, i13);
                this.f74433j = -1;
                this.f74434k = -1;
            }
            this.f74435l = 0;
        }
    }

    public final void i(boolean z13) {
        i2.s sVar = this.f74424a;
        int i13 = z13 ? sVar.F.f71326i : sVar.F.f71324g;
        int i14 = i13 - this.f74429f;
        if (!(i14 >= 0)) {
            i2.u.i("Tried to seek backward");
            throw null;
        }
        if (i14 > 0) {
            a aVar = this.f74425b;
            aVar.getClass();
            d dVar = d.f74440c;
            l0 l0Var = aVar.f74422a;
            l0Var.G1(dVar);
            bf.b.n0(l0Var, 0, i14);
            int i15 = l0Var.f74467g;
            int i16 = dVar.f74453a;
            int z14 = l0.z1(l0Var, i16);
            int i17 = dVar.f74454b;
            if (i15 == z14 && l0Var.f74468h == l0.z1(l0Var, i17)) {
                this.f74429f = i13;
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                if (((1 << i19) & l0Var.f74467g) != 0) {
                    if (i18 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(dVar.b(i19));
                    i18++;
                }
            }
            String sb4 = sb3.toString();
            StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
            int i23 = 0;
            for (int i24 = 0; i24 < i17; i24++) {
                if (((1 << i24) & l0Var.f74468h) != 0) {
                    if (i18 > 0) {
                        n13.append(", ");
                    }
                    n13.append(dVar.c(i24));
                    i23++;
                }
            }
            String sb5 = n13.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb6 = new StringBuilder("Error while pushing ");
            sb6.append(dVar);
            sb6.append(". Not all arguments were provided. Missing ");
            a.a.A(sb6, i18, " int arguments (", sb4, ") and ");
            ep.b.B(sb6, i23, " object arguments (", sb5, ").");
            throw null;
        }
    }

    public final void j(int i13, int i14) {
        f();
        a aVar = this.f74425b;
        aVar.getClass();
        y yVar = y.f74481c;
        l0 l0Var = aVar.f74422a;
        l0Var.G1(yVar);
        bf.b.n0(l0Var, 0, i13);
        bf.b.n0(l0Var, 1, i14);
        int i15 = l0Var.f74467g;
        int i16 = yVar.f74453a;
        int z13 = l0.z1(l0Var, i16);
        int i17 = yVar.f74454b;
        if (i15 == z13 && l0Var.f74468h == l0.z1(l0Var, i17)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            if (((1 << i19) & l0Var.f74467g) != 0) {
                if (i18 > 0) {
                    sb3.append(", ");
                }
                sb3.append(yVar.b(i19));
                i18++;
            }
        }
        String sb4 = sb3.toString();
        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
        int i23 = 0;
        for (int i24 = 0; i24 < i17; i24++) {
            if (((1 << i24) & l0Var.f74468h) != 0) {
                if (i18 > 0) {
                    n13.append(", ");
                }
                n13.append(yVar.c(i24));
                i23++;
            }
        }
        String sb5 = n13.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(yVar);
        sb6.append(". Not all arguments were provided. Missing ");
        a.a.A(sb6, i18, " int arguments (", sb4, ") and ");
        ep.b.B(sb6, i23, " object arguments (", sb5, ").");
        throw null;
    }

    public final void k(int i13, int i14) {
        if (i14 > 0) {
            if (!(i13 >= 0)) {
                i2.u.i("Invalid remove index " + i13);
                throw null;
            }
            if (this.f74432i == i13) {
                this.f74435l += i14;
                return;
            }
            h();
            this.f74432i = i13;
            this.f74435l = i14;
        }
    }

    public final void l(Object obj) {
        f();
        a aVar = this.f74425b;
        aVar.getClass();
        if (obj instanceof i2.m) {
            aVar.f74422a.F1(i0.f74451c);
        }
    }
}
