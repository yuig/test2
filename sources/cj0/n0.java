package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f27847a;

    public n0(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27847a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f27847a, ((n0) obj).f27847a);
    }

    public final int hashCode() {
        return this.f27847a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f27847a, ")");
    }
}
