package r52;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes4.dex */
public final class j implements o {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f106288a;

    public j(g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f106288a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f106288a, ((j) obj).f106288a);
    }

    public final int hashCode() {
        return this.f106288a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f106288a, ")");
    }
}
