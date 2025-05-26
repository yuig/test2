package xe0;

import d7.g;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f134648a;

    /* renamed from: b, reason: collision with root package name */
    public final float f134649b;

    /* renamed from: c, reason: collision with root package name */
    public final float f134650c;

    /* renamed from: d, reason: collision with root package name */
    public final float f134651d;

    public a(float f13, float f14, float f15, float f16) {
        this.f134648a = f13;
        this.f134649b = f14;
        this.f134650c = f15;
        this.f134651d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f134648a, aVar.f134648a) == 0 && Float.compare(this.f134649b, aVar.f134649b) == 0 && Float.compare(this.f134650c, aVar.f134650c) == 0 && Float.compare(this.f134651d, aVar.f134651d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f134651d) + a.a.a(this.f134650c, a.a.a(this.f134649b, Float.hashCode(this.f134648a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageCornerRadii(topLeftCornerRadius=");
        sb3.append(this.f134648a);
        sb3.append(", topRightCornerRadius=");
        sb3.append(this.f134649b);
        sb3.append(", bottomLeftCornerRadius=");
        sb3.append(this.f134650c);
        sb3.append(", bottomRightCornerRadius=");
        return g.i(sb3, this.f134651d, ")");
    }
}
