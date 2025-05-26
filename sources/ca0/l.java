package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements u {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f27141a;

    public l(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27141a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f27141a, ((l) obj).f27141a);
    }

    public final int hashCode() {
        return this.f27141a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f27141a, ")");
    }
}
