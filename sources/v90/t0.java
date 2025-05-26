package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final y62.k f124962a;

    public t0(y62.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124962a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f124962a, ((t0) obj).f124962a);
    }

    public final int hashCode() {
        return this.f124962a.hashCode();
    }

    public final String toString() {
        return "HandleSelectMaskViewEvent(event=" + this.f124962a + ")";
    }
}
