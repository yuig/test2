package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.i f72528a;

    public d(sk0.i innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f72528a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f72528a, ((d) obj).f72528a);
    }

    public final int hashCode() {
        return this.f72528a.hashCode();
    }

    public final String toString() {
        return "WrappedFloatingToolbarEvent(innerEvent=" + this.f72528a + ")";
    }
}
