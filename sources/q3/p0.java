package q3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface p0 {
    q0 a(r0 r0Var, List list, long j13);

    default int b(s3.q1 q1Var, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new o((r) list.get(i14), t.Min, u.Height));
        }
        return a(new w(q1Var, q1Var.f110898l.f110831s), arrayList, bs1.c.b(i13, 0, 13)).i();
    }

    default int d(s3.q1 q1Var, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new o((r) list.get(i14), t.Max, u.Width));
        }
        return a(new w(q1Var, q1Var.f110898l.f110831s), arrayList, bs1.c.b(0, i13, 7)).j();
    }

    default int e(s3.q1 q1Var, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new o((r) list.get(i14), t.Min, u.Width));
        }
        return a(new w(q1Var, q1Var.f110898l.f110831s), arrayList, bs1.c.b(0, i13, 7)).j();
    }

    default int h(s3.q1 q1Var, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new o((r) list.get(i14), t.Max, u.Height));
        }
        return a(new w(q1Var, q1Var.f110898l.f110831s), arrayList, bs1.c.b(i13, 0, 13)).i();
    }
}
