package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f82457a;

    public p(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82457a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f82457a, ((p) obj).f82457a);
    }

    public final int hashCode() {
        return this.f82457a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f82457a, ")");
    }
}
