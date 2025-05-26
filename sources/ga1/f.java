package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f64621a;

    public f(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f64621a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f64621a, ((f) obj).f64621a);
    }

    public final int hashCode() {
        return this.f64621a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f64621a, ")");
    }
}
