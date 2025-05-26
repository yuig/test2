package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final m62.b1 f138190a;

    public i0(m62.b1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f138190a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f138190a, ((i0) obj).f138190a);
    }

    public final int hashCode() {
        return this.f138190a.hashCode();
    }

    public final String toString() {
        return "HandleViewEvent(event=" + this.f138190a + ")";
    }
}
