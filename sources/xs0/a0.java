package xs0;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class a0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f135779a;

    public a0(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f135779a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f135779a, ((a0) obj).f135779a);
    }

    public final int hashCode() {
        return this.f135779a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("WrappedPinalyticsSideEffect(effect="), this.f135779a, ")");
    }
}
