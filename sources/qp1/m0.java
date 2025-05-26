package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f104811a;

    public m0(zy.e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f104811a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f104811a, ((m0) obj).f104811a);
    }

    public final int hashCode() {
        return this.f104811a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("HandshakeWrappedPinalyticsEffectRequest(inner="), this.f104811a, ")");
    }
}
