package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f57953a;

    public f(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f57953a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f57953a, ((f) obj).f57953a);
    }

    public final int hashCode() {
        return this.f57953a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LoggingEvent(event="), this.f57953a, ")");
    }
}
