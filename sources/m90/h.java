package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f86656a;

    public h(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f86656a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f86656a, ((h) obj).f86656a);
    }

    public final int hashCode() {
        return this.f86656a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f86656a, ")");
    }
}
