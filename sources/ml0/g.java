package ml0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f87453a;

    public g(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f87453a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f87453a, ((g) obj).f87453a);
    }

    public final int hashCode() {
        return this.f87453a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f87453a, ")");
    }
}
