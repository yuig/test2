package xs;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f135702a;

    public c(zy.e0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f135702a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f135702a, ((c) obj).f135702a);
    }

    public final int hashCode() {
        return this.f135702a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsEffectRequest(inner="), this.f135702a, ")");
    }
}
