package q3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 extends s3.h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f102221b = new i1("Undefined intrinsics block and it is required");

    @Override // q3.p0
    public final q0 a(r0 r0Var, List list, long j13) {
        q0 s03;
        q0 s04;
        q0 s05;
        if (list.isEmpty()) {
            s05 = r0Var.s0(n4.a.j(j13), n4.a.i(j13), kotlin.collections.z0.d(), h1.f102216i);
            return s05;
        }
        if (list.size() == 1) {
            c1 Q = ((o0) list.get(0)).Q(j13);
            s04 = r0Var.s0(bs1.c.J(Q.f102178a, j13), bs1.c.I(Q.f102179b, j13), kotlin.collections.z0.d(), new i1.i0(Q, 5));
            return s04;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((o0) list.get(i13)).Q(j13));
        }
        int size2 = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size2; i16++) {
            c1 c1Var = (c1) arrayList.get(i16);
            i14 = Math.max(c1Var.f102178a, i14);
            i15 = Math.max(c1Var.f102179b, i15);
        }
        s03 = r0Var.s0(bs1.c.J(i14, j13), bs1.c.I(i15, j13), kotlin.collections.z0.d(), new w1.g(arrayList, 2));
        return s03;
    }
}
