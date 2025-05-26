package i1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class q implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f70872a;

    public q(x xVar) {
        this.f70872a = xVar;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.c1 c1Var;
        q3.c1 c1Var2;
        int i13;
        q3.q0 s03;
        int size = list.size();
        q3.c1[] c1VarArr = new q3.c1[size];
        int size2 = list.size();
        long j14 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            c1Var = null;
            if (i15 >= size2) {
                break;
            }
            q3.o0 o0Var = (q3.o0) list.get(i15);
            Object a13 = o0Var.a();
            t tVar = a13 instanceof t ? (t) a13 : null;
            if (tVar != null && ((Boolean) tVar.f70899b.getValue()).booleanValue()) {
                q3.c1 Q = o0Var.Q(j13);
                long d2 = lb.l0.d(Q.f102178a, Q.f102179b);
                Unit unit = Unit.f80348a;
                c1VarArr[i15] = Q;
                j14 = d2;
            }
            i15++;
        }
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            q3.o0 o0Var2 = (q3.o0) list.get(i16);
            if (c1VarArr[i16] == null) {
                c1VarArr[i16] = o0Var2.Q(j13);
            }
        }
        if (r0Var.K()) {
            i13 = (int) (j14 >> 32);
        } else {
            if (size == 0) {
                c1Var2 = null;
            } else {
                c1Var2 = c1VarArr[0];
                Intrinsics.checkNotNullParameter(c1VarArr, "<this>");
                int i17 = size - 1;
                if (i17 != 0) {
                    int i18 = c1Var2 != null ? c1Var2.f102178a : 0;
                    ql2.k it = new IntRange(1, i17, 1).iterator();
                    while (it.f104109c) {
                        q3.c1 c1Var3 = c1VarArr[it.b()];
                        int i19 = c1Var3 != null ? c1Var3.f102178a : 0;
                        if (i18 < i19) {
                            c1Var2 = c1Var3;
                            i18 = i19;
                        }
                    }
                }
            }
            i13 = c1Var2 != null ? c1Var2.f102178a : 0;
        }
        if (r0Var.K()) {
            i14 = (int) (4294967295L & j14);
        } else {
            if (size != 0) {
                c1Var = c1VarArr[0];
                Intrinsics.checkNotNullParameter(c1VarArr, "<this>");
                int i23 = size - 1;
                if (i23 != 0) {
                    int i24 = c1Var != null ? c1Var.f102179b : 0;
                    ql2.k it2 = new IntRange(1, i23, 1).iterator();
                    while (it2.f104109c) {
                        q3.c1 c1Var4 = c1VarArr[it2.b()];
                        int i25 = c1Var4 != null ? c1Var4.f102179b : 0;
                        if (i24 < i25) {
                            c1Var = c1Var4;
                            i24 = i25;
                        }
                    }
                }
            }
            if (c1Var != null) {
                i14 = c1Var.f102179b;
            }
        }
        if (!r0Var.K()) {
            this.f70872a.f70928c.setValue(new n4.j(lb.l0.d(i13, i14)));
        }
        s03 = r0Var.s0(i13, i14, kotlin.collections.z0.d(), new p(c1VarArr, this, i13, i14));
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
