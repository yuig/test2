package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f88212a;

    public l(ll1.d inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f88212a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f88212a, ((l) obj).f88212a);
    }

    public final int hashCode() {
        return this.f88212a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedLifecycleEvent(inner="), this.f88212a, ")");
    }
}
