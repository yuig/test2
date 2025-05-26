package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final k51.s f61033a;

    public x(k51.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f61033a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f61033a, ((x) obj).f61033a);
    }

    public final int hashCode() {
        return this.f61033a.hashCode();
    }

    public final String toString() {
        return "WrappedViewOptionsEvent(event=" + this.f61033a + ")";
    }
}
