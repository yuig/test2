package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements z {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.w f124965a;

    public v(sa0.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124965a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f124965a, ((v) obj).f124965a);
    }

    public final int hashCode() {
        return this.f124965a.hashCode();
    }

    public final String toString() {
        return "RepinCutoutEvent(event=" + this.f124965a + ")";
    }
}
