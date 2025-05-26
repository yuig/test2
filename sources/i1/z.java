package i1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f70943a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70944b;

    public z(n0 n0Var) {
        this.f70943a = n0Var;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        Object obj;
        q3.q0 s03;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(((q3.o0) list.get(i14)).Q(j13));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i15 = ((q3.c1) obj).f102178a;
            int i16 = kotlin.collections.f0.i(arrayList);
            if (1 <= i16) {
                int i17 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i17);
                    int i18 = ((q3.c1) obj3).f102178a;
                    if (i15 < i18) {
                        obj = obj3;
                        i15 = i18;
                    }
                    if (i17 == i16) {
                        break;
                    }
                    i17++;
                }
            }
        }
        q3.c1 c1Var = (q3.c1) obj;
        int i19 = c1Var != null ? c1Var.f102178a : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i23 = ((q3.c1) obj2).f102179b;
            int i24 = kotlin.collections.f0.i(arrayList);
            if (1 <= i24) {
                int i25 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i25);
                    int i26 = ((q3.c1) obj4).f102179b;
                    if (i23 < i26) {
                        obj2 = obj4;
                        i23 = i26;
                    }
                    if (i25 == i24) {
                        break;
                    }
                    i25++;
                }
            }
        }
        q3.c1 c1Var2 = (q3.c1) obj2;
        int i27 = c1Var2 != null ? c1Var2.f102179b : 0;
        boolean K = r0Var.K();
        n0 n0Var = this.f70943a;
        if (K) {
            this.f70944b = true;
            n0Var.f70853a.setValue(new n4.j(lb.l0.d(i19, i27)));
        } else if (!this.f70944b) {
            n0Var.f70853a.setValue(new n4.j(lb.l0.d(i19, i27)));
        }
        s03 = r0Var.s0(i19, i27, kotlin.collections.z0.d(), new y(arrayList, i13));
        return s03;
    }

    @Override // q3.p0
    public final int b(s3.q1 q1Var, List list, int i13) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((q3.r) list.get(0)).D(i13));
            int i14 = kotlin.collections.f0.i(list);
            int i15 = 1;
            if (1 <= i14) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((q3.r) list.get(i15)).D(i13));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // q3.p0
    public final int d(s3.q1 q1Var, List list, int i13) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((q3.r) list.get(0)).P(i13));
            int i14 = kotlin.collections.f0.i(list);
            int i15 = 1;
            if (1 <= i14) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((q3.r) list.get(i15)).P(i13));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // q3.p0
    public final int e(s3.q1 q1Var, List list, int i13) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((q3.r) list.get(0)).N(i13));
            int i14 = kotlin.collections.f0.i(list);
            int i15 = 1;
            if (1 <= i14) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((q3.r) list.get(i15)).N(i13));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // q3.p0
    public final int h(s3.q1 q1Var, List list, int i13) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((q3.r) list.get(0)).d(i13));
            int i14 = kotlin.collections.f0.i(list);
            int i15 = 1;
            if (1 <= i14) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((q3.r) list.get(i15)).d(i13));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
