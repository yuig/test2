package vn0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.i f126254a;

    public b(sk0.i innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f126254a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f126254a, ((b) obj).f126254a);
    }

    public final int hashCode() {
        return this.f126254a.hashCode();
    }

    public final String toString() {
        return "WrappedFloatingToolbarEvent(innerEvent=" + this.f126254a + ")";
    }
}
