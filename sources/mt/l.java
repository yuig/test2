package mt;

import kotlin.jvm.internal.Intrinsics;
import nt.u0;

/* loaded from: classes3.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f88114a;

    public l(u0 bottomSheetEffect) {
        Intrinsics.checkNotNullParameter(bottomSheetEffect, "bottomSheetEffect");
        this.f88114a = bottomSheetEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f88114a, ((l) obj).f88114a);
    }

    public final int hashCode() {
        return this.f88114a.hashCode();
    }

    public final String toString() {
        return "WrappedBottomSheetEffectRequest(bottomSheetEffect=" + this.f88114a + ")";
    }
}
