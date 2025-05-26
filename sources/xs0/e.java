package xs0;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f135785a;

    public e(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f135785a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f135785a, ((e) obj).f135785a);
    }

    public final int hashCode() {
        return this.f135785a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(effect="), this.f135785a, ")");
    }
}
