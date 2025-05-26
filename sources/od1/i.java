package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f94131a;

    public i(ll1.d innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f94131a = innerEvent;
    }

    @Override // od1.k
    public final u50.s d() {
        return this.f94131a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f94131a, ((i) obj).f94131a);
    }

    public final int hashCode() {
        return this.f94131a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("WrappedLifecycleEvent(innerEvent="), this.f94131a, ")");
    }
}
