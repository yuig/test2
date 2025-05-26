package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f54148a;

    public g0(zy.e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f54148a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f54148a, ((g0) obj).f54148a);
    }

    public final int hashCode() {
        return this.f54148a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("HandshakeWrappedPinalyticsEffectRequest(inner="), this.f54148a, ")");
    }
}
