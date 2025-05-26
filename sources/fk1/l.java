package fk1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes2.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f62356a;

    public l(e0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f62356a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f62356a, ((l) obj).f62356a);
    }

    public final int hashCode() {
        return this.f62356a.hashCode();
    }

    public final k0 j() {
        return this.f62356a;
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(effect="), this.f62356a, ")");
    }
}
