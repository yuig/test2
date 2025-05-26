package g90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f64526a;

    public f(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f64526a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f64526a, ((f) obj).f64526a);
    }

    public final int hashCode() {
        return this.f64526a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f64526a, ")");
    }
}
