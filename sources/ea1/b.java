package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f58034a;

    public b(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f58034a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f58034a, ((b) obj).f58034a);
    }

    public final int hashCode() {
        return this.f58034a.hashCode();
    }

    public final String toString() {
        return "AlertFeatureEvent(event=" + this.f58034a + ")";
    }
}
