package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f138205a;

    public n(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f138205a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f138205a, ((n) obj).f138205a);
    }

    public final int hashCode() {
        return this.f138205a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f138205a, ")");
    }
}
