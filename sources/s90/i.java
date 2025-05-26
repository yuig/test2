package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f111975a;

    public i(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111975a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f111975a, ((i) obj).f111975a);
    }

    public final int hashCode() {
        return this.f111975a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f111975a, ")");
    }
}
