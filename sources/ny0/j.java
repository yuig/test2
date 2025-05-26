package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f92598a;

    public j(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f92598a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f92598a, ((j) obj).f92598a);
    }

    public final int hashCode() {
        return this.f92598a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f92598a, ")");
    }
}
