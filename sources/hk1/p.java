package hk1;

import kotlin.jvm.internal.Intrinsics;
import zy.f0;
import zy.k0;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f69363a;

    public p(f0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f69363a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f69363a, ((p) obj).f69363a);
    }

    public final int hashCode() {
        return this.f69363a.hashCode();
    }

    public final k0 j() {
        return this.f69363a;
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffectRequest(effect="), this.f69363a, ")");
    }
}
