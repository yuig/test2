package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f92600a;

    public k(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f92600a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f92600a, ((k) obj).f92600a);
    }

    public final int hashCode() {
        return this.f92600a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f92600a, ")");
    }
}
