package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f68244a;

    public e(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f68244a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f68244a, ((e) obj).f68244a);
    }

    public final int hashCode() {
        return this.f68244a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("ListEvent(event="), this.f68244a, ")");
    }
}
