package m4;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f85806c = new p(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f85807a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85808b;

    public p(float f13, float f14) {
        this.f85807a = f13;
        this.f85808b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f85807a == pVar.f85807a && this.f85808b == pVar.f85808b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85808b) + (Float.hashCode(this.f85807a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb3.append(this.f85807a);
        sb3.append(", skewX=");
        return d7.g.h(sb3, this.f85808b, ')');
    }
}
