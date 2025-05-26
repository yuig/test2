package p1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements q3.p0, a1 {

    /* renamed from: a, reason: collision with root package name */
    public final j f98617a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.c f98618b;

    public y(j jVar, u2.c cVar) {
        this.f98617a = jVar;
        this.f98618b = cVar;
    }

    @Override // q3.p0
    public final q3.q0 a(q3.r0 r0Var, List list, long j13) {
        return androidx.compose.foundation.layout.b.i(this, n4.a.i(j13), n4.a.j(j13), n4.a.g(j13), n4.a.h(j13), r0Var.R(this.f98617a.a()), r0Var, list, new q3.c1[list.size()], list.size());
    }

    @Override // q3.p0
    public final int b(s3.q1 q1Var, List list, int i13) {
        return d.c(i13, q1Var.R(this.f98617a.a()), list);
    }

    @Override // p1.a1
    public final long c(boolean z13, int i13, int i14, int i15) {
        if (!z13) {
            return bs1.c.a(0, i15, i13, i14);
        }
        int min = Math.min(i13, 262142);
        int min2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int g13 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
        return bs1.c.a(Math.min(g13, 0), i15 != Integer.MAX_VALUE ? Math.min(g13, i15) : Integer.MAX_VALUE, min, min2);
    }

    @Override // q3.p0
    public final int d(s3.q1 q1Var, List list, int i13) {
        return d.b(i13, q1Var.R(this.f98617a.a()), list);
    }

    @Override // q3.p0
    public final int e(s3.q1 q1Var, List list, int i13) {
        return d.d(i13, q1Var.R(this.f98617a.a()), list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f98617a, yVar.f98617a) && Intrinsics.d(this.f98618b, yVar.f98618b);
    }

    @Override // p1.a1
    public final void f(int i13, int[] iArr, int[] iArr2, q3.r0 r0Var) {
        this.f98617a.b(r0Var, i13, iArr, iArr2);
    }

    @Override // p1.a1
    public final q3.q0 g(q3.c1[] c1VarArr, q3.r0 r0Var, int[] iArr, int i13, int i14) {
        q3.q0 s03;
        s03 = r0Var.s0(i14, i13, kotlin.collections.z0.d(), new r(c1VarArr, this, i14, r0Var, iArr));
        return s03;
    }

    @Override // q3.p0
    public final int h(s3.q1 q1Var, List list, int i13) {
        return d.a(i13, q1Var.R(this.f98617a.a()), list);
    }

    public final int hashCode() {
        return this.f98618b.hashCode() + (this.f98617a.hashCode() * 31);
    }

    @Override // p1.a1
    public final int i(q3.c1 c1Var) {
        return c1Var.f102179b;
    }

    @Override // p1.a1
    public final int j(q3.c1 c1Var) {
        return c1Var.f102178a;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f98617a + ", horizontalAlignment=" + this.f98618b + ')';
    }
}
