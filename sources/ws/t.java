package ws;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final xs.d f131072a;

    public t(xs.d bottomSheetEffect) {
        Intrinsics.checkNotNullParameter(bottomSheetEffect, "bottomSheetEffect");
        this.f131072a = bottomSheetEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f131072a, ((t) obj).f131072a);
    }

    public final int hashCode() {
        return this.f131072a.hashCode();
    }

    public final String toString() {
        return "WrappedBottomSheetEffectRequest(bottomSheetEffect=" + this.f131072a + ")";
    }
}
