package p1;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f98595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98596b;

    public t(u2.e eVar, boolean z13) {
        this.f98595a = eVar;
        this.f98596b = z13;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        int max;
        int max2;
        q3.c1 c1Var;
        q3.q0 s04;
        q3.q0 s05;
        if (list.isEmpty()) {
            s05 = r0Var.s0(n4.a.j(j13), n4.a.i(j13), kotlin.collections.z0.d(), o.f98561k);
            return s05;
        }
        long a13 = this.f98596b ? j13 : n4.a.a(j13, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            q3.o0 o0Var = (q3.o0) list.get(0);
            Object a14 = o0Var.a();
            n nVar = a14 instanceof n ? (n) a14 : null;
            if (nVar == null || !nVar.f98558o) {
                q3.c1 Q = o0Var.Q(a13);
                max = Math.max(n4.a.j(j13), Q.f102178a);
                max2 = Math.max(n4.a.i(j13), Q.f102179b);
                c1Var = Q;
            } else {
                int j14 = n4.a.j(j13);
                int i13 = n4.a.i(j13);
                int j15 = n4.a.j(j13);
                int i14 = n4.a.i(j13);
                if (j15 < 0 || i14 < 0) {
                    kh2.n.i0("width(" + j15 + ") and height(" + i14 + ") must be >= 0");
                    throw null;
                }
                max = j14;
                max2 = i13;
                c1Var = o0Var.Q(bs1.c.N(j15, j15, i14, i14));
            }
            s04 = r0Var.s0(max, max2, kotlin.collections.z0.d(), new r(c1Var, o0Var, r0Var, max, max2, this));
            return s04;
        }
        q3.c1[] c1VarArr = new q3.c1[list.size()];
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = n4.a.j(j13);
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f80426a = n4.a.i(j13);
        int size = list.size();
        boolean z13 = false;
        for (int i15 = 0; i15 < size; i15++) {
            q3.o0 o0Var2 = (q3.o0) list.get(i15);
            Object a15 = o0Var2.a();
            n nVar2 = a15 instanceof n ? (n) a15 : null;
            if (nVar2 == null || !nVar2.f98558o) {
                q3.c1 Q2 = o0Var2.Q(a13);
                c1VarArr[i15] = Q2;
                h0Var.f80426a = Math.max(h0Var.f80426a, Q2.f102178a);
                h0Var2.f80426a = Math.max(h0Var2.f80426a, Q2.f102179b);
            } else {
                z13 = true;
            }
        }
        if (z13) {
            int i16 = h0Var.f80426a;
            int i17 = i16 != Integer.MAX_VALUE ? i16 : 0;
            int i18 = h0Var2.f80426a;
            long a16 = bs1.c.a(i17, i16, i18 != Integer.MAX_VALUE ? i18 : 0, i18);
            int size2 = list.size();
            for (int i19 = 0; i19 < size2; i19++) {
                q3.o0 o0Var3 = (q3.o0) list.get(i19);
                Object a17 = o0Var3.a();
                n nVar3 = a17 instanceof n ? (n) a17 : null;
                if (nVar3 != null && nVar3.f98558o) {
                    c1VarArr[i19] = o0Var3.Q(a16);
                }
            }
        }
        s03 = r0Var.s0(h0Var.f80426a, h0Var2.f80426a, kotlin.collections.z0.d(), new s(c1VarArr, list, r0Var, h0Var, h0Var2, this));
        return s03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f98595a, tVar.f98595a) && this.f98596b == tVar.f98596b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98596b) + (this.f98595a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb3.append(this.f98595a);
        sb3.append(", propagateMinConstraints=");
        return cb.m(sb3, this.f98596b, ')');
    }
}
