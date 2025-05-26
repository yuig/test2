package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ls1.n f83894a;

    public r(ls1.n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83894a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f83894a, ((r) obj).f83894a);
    }

    public final int hashCode() {
        return this.f83894a.hashCode();
    }

    public final String toString() {
        return "PinMovementCompleted(event=" + this.f83894a + ")";
    }
}
