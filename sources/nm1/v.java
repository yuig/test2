package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final cn1.e f91495a;

    public v(cn1.e animatedIconState) {
        Intrinsics.checkNotNullParameter(animatedIconState, "animatedIconState");
        this.f91495a = animatedIconState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f91495a, ((v) obj).f91495a);
    }

    public final int hashCode() {
        return this.f91495a.hashCode();
    }

    public final String toString() {
        return "Animated(animatedIconState=" + this.f91495a + ")";
    }
}
