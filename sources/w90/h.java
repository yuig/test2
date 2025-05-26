package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f128545a;

    public h(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128545a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f128545a, ((h) obj).f128545a);
    }

    public final int hashCode() {
        return this.f128545a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f128545a, ")");
    }
}
