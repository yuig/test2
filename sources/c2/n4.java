package c2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class n4 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n4 f25009a = new n4();

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i13 = 0;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            q3.c1 Q = ((q3.o0) list.get(i17)).Q(j13);
            arrayList.add(Q);
            q3.q qVar = q3.d.f102183a;
            if (Q.i(qVar) != Integer.MIN_VALUE && (i14 == Integer.MIN_VALUE || Q.i(qVar) < i14)) {
                i14 = Q.i(qVar);
            }
            q3.q qVar2 = q3.d.f102184b;
            if (Q.i(qVar2) != Integer.MIN_VALUE && (i15 == Integer.MIN_VALUE || Q.i(qVar2) > i15)) {
                i15 = Q.i(qVar2);
            }
            i16 = Math.max(i16, Q.f102179b);
        }
        int max = Math.max(r0Var.R((i14 == i15 || !(i14 != Integer.MIN_VALUE && i15 != Integer.MIN_VALUE)) ? o4.f25046e : o4.f25047f), i16);
        s03 = r0Var.s0(n4.a.h(j13), max, kotlin.collections.z0.d(), new m4(arrayList, max, i13));
        return s03;
    }
}
