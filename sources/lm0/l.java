package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements y {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.i f83877a;

    public l(sk0.i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f83877a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f83877a, ((l) obj).f83877a);
    }

    public final int hashCode() {
        return this.f83877a.hashCode();
    }

    public final String toString() {
        return "BoardToolsEvent(event=" + this.f83877a + ")";
    }
}
