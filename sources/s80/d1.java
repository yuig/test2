package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f111492a;

    public d1(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111492a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.d(this.f111492a, ((d1) obj).f111492a);
    }

    public final int hashCode() {
        return this.f111492a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f111492a, ")");
    }
}
