package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f22381a;

    public l(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f22381a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f22381a, ((l) obj).f22381a);
    }

    public final int hashCode() {
        return this.f22381a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f22381a, ")");
    }
}
