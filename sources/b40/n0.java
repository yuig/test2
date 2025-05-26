package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f21728a;

    public n0(m0 m0Var) {
        this.f21728a = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f21728a, ((n0) obj).f21728a);
    }

    public final int hashCode() {
        m0 m0Var = this.f21728a;
        if (m0Var == null) {
            return 0;
        }
        return m0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3HideNewsHubPinMutation=" + this.f21728a + ")";
    }
}
