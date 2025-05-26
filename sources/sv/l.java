package sv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f115305a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115306b;

    public l(int i13, String str) {
        this.f115305a = i13;
        this.f115306b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f115305a == lVar.f115305a && Intrinsics.d(this.f115306b, lVar.f115306b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f115305a) * 31;
        String str = this.f115306b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CutoutSwipe(newCarouselPosition=" + this.f115305a + ", newCutoutPinId=" + this.f115306b + ")";
    }
}
