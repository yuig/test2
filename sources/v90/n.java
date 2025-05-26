package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements u {

    /* renamed from: a, reason: collision with root package name */
    public final x62.s f124947a;

    public n(x62.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124947a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f124947a, ((n) obj).f124947a);
    }

    public final int hashCode() {
        return this.f124947a.hashCode();
    }

    public final String toString() {
        return "OnRefineMaskViewEvent(event=" + this.f124947a + ")";
    }
}
