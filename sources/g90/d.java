package g90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f64520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64521b;

    public d(e0 swipeType, String str) {
        Intrinsics.checkNotNullParameter(swipeType, "swipeType");
        this.f64520a = swipeType;
        this.f64521b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f64520a == dVar.f64520a && Intrinsics.d(this.f64521b, dVar.f64521b);
    }

    public final int hashCode() {
        int hashCode = this.f64520a.hashCode() * 31;
        String str = this.f64521b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CutoutSwipe(swipeType=" + this.f64520a + ", cutoutPinId=" + this.f64521b + ")";
    }
}
