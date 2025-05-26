package jh0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76207a;

    /* renamed from: b, reason: collision with root package name */
    public final ym1.e f76208b;

    public b(boolean z13, ym1.e eVar) {
        this.f76207a = z13;
        this.f76208b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f76207a == bVar.f76207a && this.f76208b == bVar.f76208b;
    }

    public final int hashCode() {
        int e13 = ep.b.e(false, ep.b.e(this.f76207a, ep.b.e(true, Boolean.hashCode(true) * 31, 31), 31), 31);
        ym1.e eVar = this.f76208b;
        return e13 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "PopoverExperienceConfig(dismissOnOutsideTouch=true, completeOnAnchorTouch=true, dismissOnAnchorScroll=" + this.f76207a + ", dismissOnContainerBoundsHit=false, caretPositionOverride=" + this.f76208b + ")";
    }
}
