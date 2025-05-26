package ca1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f27198a;

    public e(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f27198a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f27198a, ((e) obj).f27198a);
    }

    public final int hashCode() {
        return this.f27198a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleEvent(event="), this.f27198a, ")");
    }
}
