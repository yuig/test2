package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f124899a;

    public h(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124899a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f124899a, ((h) obj).f124899a);
    }

    public final int hashCode() {
        return this.f124899a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f124899a, ")");
    }
}
