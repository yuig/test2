package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f90785a;

    public r(zy.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f90785a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f90785a, ((r) obj).f90785a);
    }

    public final int hashCode() {
        return this.f90785a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsSideEffect(effect="), this.f90785a, ")");
    }
}
