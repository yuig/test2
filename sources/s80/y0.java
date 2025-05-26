package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final t80.h f111852a;

    public y0(t80.h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111852a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f111852a, ((y0) obj).f111852a);
    }

    public final int hashCode() {
        return this.f111852a.hashCode();
    }

    public final String toString() {
        return "CarouselEvent(event=" + this.f111852a + ")";
    }
}
