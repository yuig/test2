package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final tc0.y f121771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121772b;

    public e(int i13, tc0.y displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f121771a = displayState;
        this.f121772b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f121771a, eVar.f121771a) && this.f121772b == eVar.f121772b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121772b) + (this.f121771a.hashCode() * 31);
    }

    public final String toString() {
        return "BannerOverlayPageDisplayState(displayState=" + this.f121771a + ", title=" + this.f121772b + ")";
    }
}
