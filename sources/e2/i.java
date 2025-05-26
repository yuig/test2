package e2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f56865a;

    /* renamed from: b, reason: collision with root package name */
    public final float f56866b;

    /* renamed from: c, reason: collision with root package name */
    public final float f56867c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56868d;

    public i(float f13, float f14, float f15, float f16) {
        this.f56865a = f13;
        this.f56866b = f14;
        this.f56867c = f15;
        this.f56868d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f56865a == iVar.f56865a && this.f56866b == iVar.f56866b && this.f56867c == iVar.f56867c && this.f56868d == iVar.f56868d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f56868d) + a.a.a(this.f56867c, a.a.a(this.f56866b, Float.hashCode(this.f56865a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb3.append(this.f56865a);
        sb3.append(", focusedAlpha=");
        sb3.append(this.f56866b);
        sb3.append(", hoveredAlpha=");
        sb3.append(this.f56867c);
        sb3.append(", pressedAlpha=");
        return d7.g.h(sb3, this.f56868d, ')');
    }
}
