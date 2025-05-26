package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f82478a;

    public x(zy.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82478a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f82478a, ((x) obj).f82478a);
    }

    public final int hashCode() {
        return this.f82478a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(event=" + this.f82478a + ")";
    }
}
