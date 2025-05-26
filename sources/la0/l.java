package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements y {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.b0 f82421a;

    public l(ta0.b0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f82421a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f82421a, ((l) obj).f82421a);
    }

    public final int hashCode() {
        return this.f82421a.hashCode();
    }

    public final String toString() {
        return "DuplicateEvent(event=" + this.f82421a + ")";
    }
}
