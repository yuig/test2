package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f99185a;

    public f(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f99185a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f99185a, ((f) obj).f99185a);
    }

    public final int hashCode() {
        return this.f99185a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f99185a, ")");
    }
}
