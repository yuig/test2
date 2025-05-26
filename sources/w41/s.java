package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f128075a;

    public s(o82.g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128075a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f128075a, ((s) obj).f128075a);
    }

    public final int hashCode() {
        return this.f128075a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("PinCollection(event="), this.f128075a, ")");
    }
}
