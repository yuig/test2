package w1;

import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class n1 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127411a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f127412b;

    public /* synthetic */ n1(Object obj, int i13) {
        this.f127411a = i13;
        this.f127412b = obj;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.q0 s03;
        q3.q0 s04;
        switch (this.f127411a) {
            case 0:
                s03 = r0Var.s0(n4.a.h(j13), n4.a.g(j13), kotlin.collections.z0.d(), new j1.x0(12, list, this));
                return s03;
            default:
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    q3.o0 o0Var = (q3.o0) list.get(i13);
                    if (androidx.compose.ui.layout.a.a(o0Var) == f2.l.THUMB) {
                        q3.c1 Q = o0Var.Q(j13);
                        int size2 = list.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            q3.o0 o0Var2 = (q3.o0) list.get(i14);
                            if (androidx.compose.ui.layout.a.a(o0Var2) == f2.l.TRACK) {
                                q3.c1 Q2 = o0Var2.Q(n4.a.a(bs1.c.w1(-Q.f102178a, 0, j13), 0, 0, 0, 0, 11));
                                int i15 = Q.f102178a + Q2.f102178a;
                                int max = Math.max(Q2.f102179b, Q.f102179b);
                                f2.e0 e0Var = (f2.e0) this.f127412b;
                                e0Var.f60842i.i(Q2.f102179b);
                                e0Var.f60840g.i(i15);
                                s04 = r0Var.s0(i15, max, kotlin.collections.z0.d(), new f2.x(Q2, Q.f102178a / 2, (max - Q2.f102179b) / 2, Q, ml2.c.c(e0Var.c() * Q2.f102178a), (max - Q.f102179b) / 2));
                                return s04;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
