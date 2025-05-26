package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.d f111965a;

    public c(ta0.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111965a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f111965a, ((c) obj).f111965a);
    }

    public final int hashCode() {
        return this.f111965a.hashCode();
    }

    public final String toString() {
        return "AddCutoutToCollageEvent(event=" + this.f111965a + ")";
    }
}
