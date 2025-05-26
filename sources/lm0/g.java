package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements y {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.e0 f83866a;

    public g(pm0.e0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83866a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f83866a, ((g) obj).f83866a);
    }

    public final int hashCode() {
        return this.f83866a.hashCode();
    }

    public final String toString() {
        return "BoardLoadEvent(event=" + this.f83866a + ")";
    }
}
