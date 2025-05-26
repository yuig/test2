package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f128535a;

    public g(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128535a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f128535a, ((g) obj).f128535a);
    }

    public final int hashCode() {
        return this.f128535a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f128535a, ")");
    }
}
