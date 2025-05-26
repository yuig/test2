package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final h42.d f136502a;

    public x0(h42.d wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f136502a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f136502a, ((x0) obj).f136502a);
    }

    public final int hashCode() {
        return this.f136502a.hashCode();
    }

    public final String toString() {
        return "WrappedScreenPagerEvent(wrapped=" + this.f136502a + ")";
    }
}
