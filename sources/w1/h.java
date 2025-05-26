package w1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class h implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f127272a = new h();

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((q3.o0) list.get(i13)).Q(j13));
        }
        s03 = r0Var.s0(n4.a.h(j13), n4.a.g(j13), kotlin.collections.z0.d(), new g(arrayList, 0));
        return s03;
    }
}
