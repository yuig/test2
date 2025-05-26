package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final y62.k f124949a;

    public o(y62.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f124949a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f124949a, ((o) obj).f124949a);
    }

    public final int hashCode() {
        return this.f124949a.hashCode();
    }

    public final String toString() {
        return "OnSelectMaskViewEvent(event=" + this.f124949a + ")";
    }
}
