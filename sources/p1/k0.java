package p1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 implements q3.a0, r3.d, r3.g {

    /* renamed from: b, reason: collision with root package name */
    public final m1 f98538b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f98539c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f98540d;

    public k0(m1 m1Var) {
        this.f98538b = m1Var;
        y3 y3Var = y3.f71400a;
        this.f98539c = bs1.c.u1(m1Var, y3Var);
        this.f98540d = bs1.c.u1(m1Var, y3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k0) {
            return Intrinsics.d(((k0) obj).f98538b, this.f98538b);
        }
        return false;
    }

    @Override // r3.d
    public final void g(r3.h hVar) {
        m1 m1Var = (m1) hVar.c(o1.f98564a);
        m1 m1Var2 = this.f98538b;
        this.f98539c.setValue(new e0(m1Var2, m1Var));
        this.f98540d.setValue(new k1(m1Var, m1Var2));
    }

    @Override // r3.g
    public final r3.i getKey() {
        return o1.f98564a;
    }

    @Override // r3.g
    public final Object getValue() {
        return (m1) this.f98540d.getValue();
    }

    public final int hashCode() {
        return this.f98538b.hashCode();
    }

    @Override // q3.a0
    public final q3.q0 i(q3.r0 r0Var, q3.o0 o0Var, long j13) {
        q3.q0 s03;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f98539c;
        int d2 = ((m1) parcelableSnapshotMutableState.getValue()).d(r0Var, r0Var.getLayoutDirection());
        int b13 = ((m1) parcelableSnapshotMutableState.getValue()).b(r0Var);
        int a13 = ((m1) parcelableSnapshotMutableState.getValue()).a(r0Var, r0Var.getLayoutDirection()) + d2;
        int c13 = ((m1) parcelableSnapshotMutableState.getValue()).c(r0Var) + b13;
        q3.c1 Q = o0Var.Q(bs1.c.w1(-a13, -c13, j13));
        s03 = r0Var.s0(bs1.c.J(Q.f102178a + a13, j13), bs1.c.I(Q.f102179b + c13, j13), kotlin.collections.z0.d(), new j0(Q, d2, b13, 0));
        return s03;
    }
}
