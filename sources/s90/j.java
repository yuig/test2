package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.w f111978a;

    public j(sa0.w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111978a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f111978a, ((j) obj).f111978a);
    }

    public final int hashCode() {
        return this.f111978a.hashCode();
    }

    public final String toString() {
        return "RepinCutoutEvent(event=" + this.f111978a + ")";
    }
}
