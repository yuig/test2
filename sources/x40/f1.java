package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f132369a;

    public f1(d1 d1Var) {
        this.f132369a = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f132369a, ((f1) obj).f132369a);
    }

    public final int hashCode() {
        d1 d1Var = this.f132369a;
        if (d1Var == null) {
            return 0;
        }
        return d1Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f132369a + ")";
    }
}
