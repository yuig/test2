package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f83892a;

    public q(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83892a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f83892a, ((q) obj).f83892a);
    }

    public final int hashCode() {
        return this.f83892a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f83892a, ")");
    }
}
