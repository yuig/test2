package c2;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j0 implements q3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f24853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24854b;

    public j0(Function2 function2, float f13) {
        this.f24853a = function2;
        this.f24854b = f13;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        q3.c1 c1Var;
        q3.q0 s03;
        q3.q0 s04;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            q3.o0 o0Var = (q3.o0) list.get(i14);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var), "icon")) {
                q3.c1 Q = o0Var.Q(j13);
                Function2 function2 = this.f24853a;
                if (function2 != null) {
                    int size2 = list.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        q3.o0 o0Var2 = (q3.o0) list.get(i15);
                        if (Intrinsics.d(androidx.compose.ui.layout.a.a(o0Var2), "label")) {
                            c1Var = o0Var2.Q(n4.a.a(j13, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                c1Var = null;
                q3.c1 c1Var2 = c1Var;
                if (function2 == null) {
                    int I = bs1.c.I(r0Var.R(o0.f25033b), j13);
                    s04 = r0Var.s0(Q.f102178a, I, kotlin.collections.z0.d(), new m0(Q, (I - Q.f102179b) / 2, i13));
                    return s04;
                }
                Intrinsics.f(c1Var2);
                int R = r0Var.R(o0.f25035d) - c1Var2.i(q3.d.f102183a);
                int i16 = Q.f102179b + c1Var2.f102179b + R;
                int I2 = bs1.c.I(Math.max(i16, r0Var.R(o0.f25033b)), j13);
                int i17 = (I2 - i16) / 2;
                int i18 = i17 < 0 ? 0 : i17;
                int i19 = Q.f102179b;
                int i23 = (I2 - i19) / 2;
                int i24 = i18 + i19 + R;
                int max = Math.max(c1Var2.f102178a, Q.f102178a);
                int i25 = (max - c1Var2.f102178a) / 2;
                int i26 = (max - Q.f102178a) / 2;
                float f13 = this.f24854b;
                s03 = r0Var.s0(max, I2, kotlin.collections.z0.d(), new n0(f13, c1Var2, i25, i24, ml2.c.c((1 - f13) * (i23 - i18)), Q, i26, i18));
                return s03;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
