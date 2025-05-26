package y1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import b2.t0;
import i2.y3;
import s3.q1;
import w1.l1;

/* loaded from: classes2.dex */
public final class z extends u2.p implements s3.l, s3.s, b0 {

    /* renamed from: n, reason: collision with root package name */
    public c0 f136610n;

    /* renamed from: o, reason: collision with root package name */
    public l1 f136611o;

    /* renamed from: p, reason: collision with root package name */
    public t0 f136612p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f136613q = bs1.c.u1(null, y3.f71400a);

    public z(c0 c0Var, l1 l1Var, t0 t0Var) {
        this.f136610n = c0Var;
        this.f136611o = l1Var;
        this.f136612p = t0Var;
    }

    @Override // u2.p
    public final void D0() {
        c0 c0Var = this.f136610n;
        if (c0Var.f136540a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
        }
        c0Var.f136540a = this;
    }

    @Override // s3.s
    public final void E(q1 q1Var) {
        this.f136613q.setValue(q1Var);
    }

    @Override // u2.p
    public final void E0() {
        this.f136610n.i(this);
    }
}
