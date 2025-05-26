package vm2;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import tm2.r0;
import tm2.s0;
import tm2.y0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f126248a;

    public i(y0 typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = typeTable.f118559c;
        if ((typeTable.f118558b & 1) == 1) {
            int h10 = typeTable.h();
            List list2 = typeTable.f118559c;
            Intrinsics.checkNotNullExpressionValue(list2, "getTypeList(...)");
            List list3 = list2;
            ArrayList arrayList = new ArrayList(g0.q(list3, 10));
            int i13 = 0;
            for (Object obj : list3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    f0.p();
                    throw null;
                }
                s0 s0Var = (s0) obj;
                if (i13 >= h10) {
                    r0 c13 = s0Var.c();
                    c13.m(true);
                    s0Var = c13.a();
                }
                arrayList.add(s0Var);
                i13 = i14;
            }
            list = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(list, "run(...)");
        this.f126248a = list;
    }

    public final s0 a(int i13) {
        return (s0) this.f126248a.get(i13);
    }
}
