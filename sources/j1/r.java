package j1;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f74214a;

    /* renamed from: b, reason: collision with root package name */
    public float f74215b;

    /* renamed from: c, reason: collision with root package name */
    public float f74216c;

    public r(float f13, float f14, float f15) {
        this.f74214a = f13;
        this.f74215b = f14;
        this.f74216c = f15;
    }

    @Override // j1.t
    public final float a(int i13) {
        if (i13 == 0) {
            return this.f74214a;
        }
        if (i13 == 1) {
            return this.f74215b;
        }
        if (i13 != 2) {
            return 0.0f;
        }
        return this.f74216c;
    }

    @Override // j1.t
    public final int b() {
        return 3;
    }

    @Override // j1.t
    public final t c() {
        return new r(0.0f, 0.0f, 0.0f);
    }

    @Override // j1.t
    public final void d() {
        this.f74214a = 0.0f;
        this.f74215b = 0.0f;
        this.f74216c = 0.0f;
    }

    @Override // j1.t
    public final void e(int i13, float f13) {
        if (i13 == 0) {
            this.f74214a = f13;
        } else if (i13 == 1) {
            this.f74215b = f13;
        } else {
            if (i13 != 2) {
                return;
            }
            this.f74216c = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f74214a == this.f74214a && rVar.f74215b == this.f74215b && rVar.f74216c == this.f74216c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74216c) + a.a.a(this.f74215b, Float.hashCode(this.f74214a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f74214a + ", v2 = " + this.f74215b + ", v3 = " + this.f74216c;
    }
}
