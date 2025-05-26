package b2;

import java.util.ArrayList;
import java.util.List;
import q3.c1;

/* loaded from: classes2.dex */
public final class m0 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f21179a = new m0();

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(((q3.o0) list.get(i13)).Q(j13));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i14 = 0; i14 < size2; i14++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((c1) arrayList.get(i14)).f102178a));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i15 = 0; i15 < size3; i15++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((c1) arrayList.get(i15)).f102179b));
        }
        s03 = r0Var.s0(intValue, num.intValue(), kotlin.collections.z0.d(), new w1.g(arrayList, 1));
        return s03;
    }
}
