package v72;

import kotlin.jvm.internal.Intrinsics;
import ni1.z1;

/* loaded from: classes4.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f124446a;

    public o(z1 pinRepEvent) {
        Intrinsics.checkNotNullParameter(pinRepEvent, "pinRepEvent");
        this.f124446a = pinRepEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f124446a, ((o) obj).f124446a);
    }

    public final int hashCode() {
        return this.f124446a.hashCode();
    }

    public final String toString() {
        return "WrappedPinRepEvent(pinRepEvent=" + this.f124446a + ")";
    }
}
