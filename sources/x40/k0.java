package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f132627a;

    public k0(j0 j0Var) {
        this.f132627a = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f132627a, ((k0) obj).f132627a);
    }

    public final int hashCode() {
        j0 j0Var = this.f132627a;
        if (j0Var == null) {
            return 0;
        }
        return j0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3AddThreadMessageMutation=" + this.f132627a + ")";
    }
}
