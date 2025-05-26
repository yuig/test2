package dy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f56572a;

    public g(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f56572a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f56572a, ((g) obj).f56572a);
    }

    public final int hashCode() {
        return this.f56572a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f56572a, ")");
    }
}
