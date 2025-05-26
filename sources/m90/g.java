package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f86651a;

    public g(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f86651a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f86651a, ((g) obj).f86651a);
    }

    public final int hashCode() {
        return this.f86651a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f86651a, ")");
    }
}
