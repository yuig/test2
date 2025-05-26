package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f82455a;

    public o(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82455a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f82455a, ((o) obj).f82455a);
    }

    public final int hashCode() {
        return this.f82455a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f82455a, ")");
    }
}
