package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f82464a;

    public s(zb0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82464a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f82464a, ((s) obj).f82464a);
    }

    public final int hashCode() {
        return this.f82464a.hashCode();
    }

    public final String toString() {
        return "RetrievalFeedAlertEvent(event=" + this.f82464a + ")";
    }
}
