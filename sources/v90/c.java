package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.d f124871a;

    public c(ta0.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124871a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f124871a, ((c) obj).f124871a);
    }

    public final int hashCode() {
        return this.f124871a.hashCode();
    }

    public final String toString() {
        return "AddCutoutToCollageEvent(event=" + this.f124871a + ")";
    }
}
