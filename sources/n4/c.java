package n4;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f89169a;

    /* renamed from: b, reason: collision with root package name */
    public final float f89170b;

    public c(float f13, float f14) {
        this.f89169a = f13;
        this.f89170b = f14;
    }

    @Override // n4.b
    public final float b() {
        return this.f89169a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f89169a, cVar.f89169a) == 0 && Float.compare(this.f89170b, cVar.f89170b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89170b) + (Float.hashCode(this.f89169a) * 31);
    }

    @Override // n4.b
    public final float j0() {
        return this.f89170b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DensityImpl(density=");
        sb3.append(this.f89169a);
        sb3.append(", fontScale=");
        return d7.g.h(sb3, this.f89170b, ')');
    }
}
