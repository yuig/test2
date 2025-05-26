package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f58139a;

    public u(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58139a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f58139a, ((u) obj).f58139a);
    }

    public final int hashCode() {
        return this.f58139a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f58139a, ")");
    }
}
