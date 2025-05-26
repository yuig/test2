package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f68257a;

    public g(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f68257a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f68257a, ((g) obj).f68257a);
    }

    public final int hashCode() {
        return this.f68257a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LoggingEvent(event="), this.f68257a, ")");
    }
}
