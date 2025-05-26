package i51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final x31.g f71602a;

    public q(x31.g filterBarEvent) {
        Intrinsics.checkNotNullParameter(filterBarEvent, "filterBarEvent");
        this.f71602a = filterBarEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f71602a, ((q) obj).f71602a);
    }

    public final int hashCode() {
        return this.f71602a.hashCode();
    }

    public final String toString() {
        return "WrappedFilterBarEvent(filterBarEvent=" + this.f71602a + ")";
    }
}
