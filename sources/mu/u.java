package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f88244a;

    public u(zy.k0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f88244a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f88244a, ((u) obj).f88244a);
    }

    public final int hashCode() {
        return this.f88244a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffectRequest(inner="), this.f88244a, ")");
    }
}
