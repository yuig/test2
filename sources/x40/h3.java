package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h3 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f132468a;

    public h3(f3 f3Var) {
        this.f132468a = f3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3) && Intrinsics.d(this.f132468a, ((h3) obj).f132468a);
    }

    public final int hashCode() {
        f3 f3Var = this.f132468a;
        if (f3Var == null) {
            return 0;
        }
        return f3Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.f132468a + ")";
    }
}
