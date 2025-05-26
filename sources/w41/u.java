package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f31.y f128089a;

    public u(f31.y event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128089a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f128089a, ((u) obj).f128089a);
    }

    public final int hashCode() {
        return this.f128089a.hashCode();
    }

    public final String toString() {
        return "SearchBarEvent(event=" + this.f128089a + ")";
    }
}
