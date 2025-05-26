package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final x62.s f124960a;

    public s0(x62.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124960a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f124960a, ((s0) obj).f124960a);
    }

    public final int hashCode() {
        return this.f124960a.hashCode();
    }

    public final String toString() {
        return "HandleRefineMaskViewEvent(event=" + this.f124960a + ")";
    }
}
