package ml0;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final float f87448a;

    /* renamed from: b, reason: collision with root package name */
    public final float f87449b;

    /* renamed from: c, reason: collision with root package name */
    public final float f87450c;

    /* renamed from: d, reason: collision with root package name */
    public final float f87451d;

    public f(float f13, float f14, float f15, float f16) {
        this.f87448a = f13;
        this.f87449b = f14;
        this.f87450c = f15;
        this.f87451d = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f87448a, fVar.f87448a) == 0 && Float.compare(this.f87449b, fVar.f87449b) == 0 && Float.compare(this.f87450c, fVar.f87450c) == 0 && Float.compare(this.f87451d, fVar.f87451d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f87451d) + a.a.a(this.f87450c, a.a.a(this.f87449b, Float.hashCode(this.f87448a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DoneClicked(cropX=");
        sb3.append(this.f87448a);
        sb3.append(", cropY=");
        sb3.append(this.f87449b);
        sb3.append(", height=");
        sb3.append(this.f87450c);
        sb3.append(", width=");
        return d7.g.i(sb3, this.f87451d, ")");
    }
}
