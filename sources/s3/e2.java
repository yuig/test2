package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e2 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final q3.q0 f110771a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f110772b;

    public e2(q3.q0 q0Var, z0 z0Var) {
        this.f110771a = q0Var;
        this.f110772b = z0Var;
    }

    @Override // s3.b2
    public final boolean X() {
        return this.f110772b.B0().h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return Intrinsics.d(this.f110771a, e2Var.f110771a) && Intrinsics.d(this.f110772b, e2Var.f110772b);
    }

    public final int hashCode() {
        return this.f110772b.hashCode() + (this.f110771a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f110771a + ", placeable=" + this.f110772b + ')';
    }
}
