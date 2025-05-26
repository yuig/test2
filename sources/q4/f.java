package q4;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.collections.z0;
import q3.c1;
import q3.o0;
import q3.p0;
import q3.q0;
import q3.r0;

/* loaded from: classes3.dex */
public final class f implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f102323b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f102324c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102325a;

    public /* synthetic */ f(int i13) {
        this.f102325a = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // q3.p0
    public final q0 a(r0 r0Var, List list, long j13) {
        Object obj;
        q0 s03;
        q0 s04;
        q0 s05;
        int i13;
        q0 s06;
        int i14 = 0;
        int i15 = 1;
        switch (this.f102325a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                    arrayList.add(((o0) list.get(i16)).Q(j13));
                }
                c1 c1Var = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i17 = ((c1) obj).f102178a;
                    int i18 = f0.i(arrayList);
                    if (1 <= i18) {
                        int i19 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i19);
                            int i23 = ((c1) obj2).f102178a;
                            if (i17 < i23) {
                                obj = obj2;
                                i17 = i23;
                            }
                            if (i19 != i18) {
                                i19++;
                            }
                        }
                    }
                }
                c1 c1Var2 = (c1) obj;
                int j14 = c1Var2 != null ? c1Var2.f102178a : n4.a.j(j13);
                if (!arrayList.isEmpty()) {
                    ?? r13 = arrayList.get(0);
                    int i24 = ((c1) r13).f102179b;
                    int i25 = f0.i(arrayList);
                    boolean z13 = r13;
                    if (1 <= i25) {
                        while (true) {
                            Object obj3 = arrayList.get(i15);
                            int i26 = ((c1) obj3).f102179b;
                            r13 = z13;
                            if (i24 < i26) {
                                r13 = obj3;
                                i24 = i26;
                            }
                            if (i15 != i25) {
                                i15++;
                                z13 = r13;
                            }
                        }
                    }
                    c1Var = r13;
                }
                c1 c1Var3 = c1Var;
                s03 = r0Var.s0(j14, c1Var3 != null ? c1Var3.f102179b : n4.a.i(j13), z0.d(), new w1.g(arrayList, 3));
                return s03;
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    s04 = r0Var.s0(0, 0, z0.d(), c.f102314n);
                    return s04;
                }
                if (size2 == 1) {
                    c1 Q = ((o0) list.get(0)).Q(j13);
                    s05 = r0Var.s0(Q.f102178a, Q.f102179b, z0.d(), new i1.a0(Q, 8));
                    return s05;
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    arrayList2.add(((o0) list.get(i27)).Q(j13));
                }
                int i28 = f0.i(arrayList2);
                if (i28 >= 0) {
                    int i29 = 0;
                    i13 = 0;
                    while (true) {
                        c1 c1Var4 = (c1) arrayList2.get(i14);
                        i29 = Math.max(i29, c1Var4.f102178a);
                        i13 = Math.max(i13, c1Var4.f102179b);
                        if (i14 != i28) {
                            i14++;
                        } else {
                            i14 = i29;
                        }
                    }
                } else {
                    i13 = 0;
                }
                s06 = r0Var.s0(i14, i13, z0.d(), new w1.g(arrayList2, 4));
                return s06;
        }
    }
}
