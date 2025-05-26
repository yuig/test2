package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f61478a;

    public e(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f61478a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f61478a, ((e) obj).f61478a);
    }

    public final int hashCode() {
        return this.f61478a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f61478a, ")");
    }
}
