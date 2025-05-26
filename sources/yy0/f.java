package yy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ll1.d f140449a;

    public f(ll1.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f140449a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f140449a, ((f) obj).f140449a);
    }

    public final int hashCode() {
        return this.f140449a.hashCode();
    }

    public final String toString() {
        return jq.b.h(new StringBuilder("LifecycleLoggingEvent(event="), this.f140449a, ")");
    }
}
