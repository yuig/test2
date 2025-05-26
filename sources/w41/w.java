package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final k51.s f128092a;

    public w(k51.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128092a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f128092a, ((w) obj).f128092a);
    }

    public final int hashCode() {
        return this.f128092a.hashCode();
    }

    public final String toString() {
        return "WrappedViewOptionsEvent(event=" + this.f128092a + ")";
    }
}
