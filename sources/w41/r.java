package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements x {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f128071a;

    public r(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128071a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f128071a, ((r) obj).f128071a);
    }

    public final int hashCode() {
        return this.f128071a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f128071a, ")");
    }
}
