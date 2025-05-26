package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.d f128524a;

    public c(ta0.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f128524a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f128524a, ((c) obj).f128524a);
    }

    public final int hashCode() {
        return this.f128524a.hashCode();
    }

    public final String toString() {
        return "AddPinToCollageEvent(event=" + this.f128524a + ")";
    }
}
