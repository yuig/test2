package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final x31.g f128091a;

    public v(x31.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128091a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f128091a, ((v) obj).f128091a);
    }

    public final int hashCode() {
        return this.f128091a.hashCode();
    }

    public final String toString() {
        return "WrappedFilterBarEvent(event=" + this.f128091a + ")";
    }
}
