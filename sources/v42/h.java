package v42;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final om1.c f124146a;

    /* renamed from: b, reason: collision with root package name */
    public final om1.c f124147b;

    public h(om1.c selectedPinIcon, om1.c unselectedPinIcon) {
        Intrinsics.checkNotNullParameter(selectedPinIcon, "selectedPinIcon");
        Intrinsics.checkNotNullParameter(unselectedPinIcon, "unselectedPinIcon");
        this.f124146a = selectedPinIcon;
        this.f124147b = unselectedPinIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f124146a, hVar.f124146a) && Intrinsics.d(this.f124147b, hVar.f124147b);
    }

    public final int hashCode() {
        return this.f124147b.hashCode() + (this.f124146a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomIcons(selectedPinIcon=" + this.f124146a + ", unselectedPinIcon=" + this.f124147b + ")";
    }
}
