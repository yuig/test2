package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements y {

    /* renamed from: a, reason: collision with root package name */
    public final x31.g f82438a;

    public n(x31.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82438a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f82438a, ((n) obj).f82438a);
    }

    public final int hashCode() {
        return this.f82438a.hashCode();
    }

    public final String toString() {
        return "FilterEvent(event=" + this.f82438a + ")";
    }
}
