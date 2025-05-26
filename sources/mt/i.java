package mt;

import kotlin.jvm.internal.Intrinsics;
import nt.h0;

/* loaded from: classes3.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f88112a;

    public i(h0 inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f88112a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f88112a, ((i) obj).f88112a);
    }

    public final int hashCode() {
        return this.f88112a.hashCode();
    }

    public final String toString() {
        return "WrappedBottomSheetEvent(inner=" + this.f88112a + ")";
    }
}
