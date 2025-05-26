package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f99183a;

    public e(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f99183a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f99183a, ((e) obj).f99183a);
    }

    public final int hashCode() {
        return this.f99183a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f99183a, ")");
    }
}
