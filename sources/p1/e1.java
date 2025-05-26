package p1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e1 implements q3.p0, a1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f98503a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.d f98504b;

    public e1(h hVar, u2.h hVar2) {
        this.f98503a = hVar;
        this.f98504b = hVar2;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        return androidx.compose.foundation.layout.b.i(this, n4.a.j(j13), n4.a.i(j13), n4.a.h(j13), n4.a.g(j13), r0Var.R(this.f98503a.a()), r0Var, list, new q3.c1[list.size()], list.size());
    }

    @Override // q3.p0
    public final int b(s3.q1 q1Var, List list, int i13) {
        int R = q1Var.R(this.f98503a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * R, i13);
        int size = list.size();
        int i14 = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            q3.r rVar = (q3.r) list.get(i15);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            if (h10 == 0.0f) {
                int min2 = Math.min(rVar.P(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - min);
                min += min2;
                i14 = Math.max(i14, rVar.D(min2));
            } else if (h10 > 0.0f) {
                f13 += h10;
            }
        }
        int round = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - min, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            q3.r rVar2 = (q3.r) list.get(i16);
            float h13 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar2));
            if (h13 > 0.0f) {
                i14 = Math.max(i14, rVar2.D(round != Integer.MAX_VALUE ? Math.round(round * h13) : Integer.MAX_VALUE));
            }
        }
        return i14;
    }

    @Override // p1.a1
    public final long c(boolean z13, int i13, int i14, int i15) {
        if (!z13) {
            return bs1.c.a(i13, i14, 0, i15);
        }
        int min = Math.min(i13, 262142);
        int min2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int g13 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
        return bs1.c.a(min, min2, Math.min(g13, 0), i15 != Integer.MAX_VALUE ? Math.min(g13, i15) : Integer.MAX_VALUE);
    }

    @Override // q3.p0
    public final int d(s3.q1 q1Var, List list, int i13) {
        int R = q1Var.R(this.f98503a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            q3.r rVar = (q3.r) list.get(i16);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            int P = rVar.P(i13);
            if (h10 == 0.0f) {
                i15 += P;
            } else if (h10 > 0.0f) {
                f13 += h10;
                i14 = Math.max(i14, Math.round(P / h10));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i14 * f13) + i15;
    }

    @Override // q3.p0
    public final int e(s3.q1 q1Var, List list, int i13) {
        int R = q1Var.R(this.f98503a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            q3.r rVar = (q3.r) list.get(i16);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            int N = rVar.N(i13);
            if (h10 == 0.0f) {
                i15 += N;
            } else if (h10 > 0.0f) {
                f13 += h10;
                i14 = Math.max(i14, Math.round(N / h10));
            }
        }
        return ((list.size() - 1) * R) + Math.round(i14 * f13) + i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f98503a, e1Var.f98503a) && Intrinsics.d(this.f98504b, e1Var.f98504b);
    }

    @Override // p1.a1
    public final void f(int i13, int[] iArr, int[] iArr2, q3.r0 r0Var) {
        this.f98503a.c(r0Var, i13, iArr, r0Var.getLayoutDirection(), iArr2);
    }

    @Override // p1.a1
    public final q3.q0 g(q3.c1[] c1VarArr, q3.r0 r0Var, int[] iArr, int i13, int i14) {
        q3.q0 s03;
        s03 = r0Var.s0(i13, i14, kotlin.collections.z0.d(), new d1(c1VarArr, this, i14, iArr));
        return s03;
    }

    @Override // q3.p0
    public final int h(s3.q1 q1Var, List list, int i13) {
        int R = q1Var.R(this.f98503a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * R, i13);
        int size = list.size();
        int i14 = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            q3.r rVar = (q3.r) list.get(i15);
            float h10 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar));
            if (h10 == 0.0f) {
                int min2 = Math.min(rVar.P(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - min);
                min += min2;
                i14 = Math.max(i14, rVar.d(min2));
            } else if (h10 > 0.0f) {
                f13 += h10;
            }
        }
        int round = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - min, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            q3.r rVar2 = (q3.r) list.get(i16);
            float h13 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.g(rVar2));
            if (h13 > 0.0f) {
                i14 = Math.max(i14, rVar2.d(round != Integer.MAX_VALUE ? Math.round(round * h13) : Integer.MAX_VALUE));
            }
        }
        return i14;
    }

    public final int hashCode() {
        return this.f98504b.hashCode() + (this.f98503a.hashCode() * 31);
    }

    @Override // p1.a1
    public final int i(q3.c1 c1Var) {
        return c1Var.f102178a;
    }

    @Override // p1.a1
    public final int j(q3.c1 c1Var) {
        return c1Var.f102179b;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f98503a + ", verticalAlignment=" + this.f98504b + ')';
    }
}
