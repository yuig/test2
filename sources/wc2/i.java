package wc2;

import kotlin.jvm.internal.Intrinsics;
import ni1.z1;

/* loaded from: classes4.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f129138a;

    public i(z1 pinRepEvent) {
        Intrinsics.checkNotNullParameter(pinRepEvent, "pinRepEvent");
        this.f129138a = pinRepEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f129138a, ((i) obj).f129138a);
    }

    public final int hashCode() {
        return this.f129138a.hashCode();
    }

    public final String toString() {
        return "WrappedPinRepEvent(pinRepEvent=" + this.f129138a + ")";
    }
}
