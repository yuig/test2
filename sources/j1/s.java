package j1;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f74221a;

    /* renamed from: b, reason: collision with root package name */
    public float f74222b;

    /* renamed from: c, reason: collision with root package name */
    public float f74223c;

    /* renamed from: d, reason: collision with root package name */
    public float f74224d;

    public s(float f13, float f14, float f15, float f16) {
        this.f74221a = f13;
        this.f74222b = f14;
        this.f74223c = f15;
        this.f74224d = f16;
    }

    @Override // j1.t
    public final float a(int i13) {
        if (i13 == 0) {
            return this.f74221a;
        }
        if (i13 == 1) {
            return this.f74222b;
        }
        if (i13 == 2) {
            return this.f74223c;
        }
        if (i13 != 3) {
            return 0.0f;
        }
        return this.f74224d;
    }

    @Override // j1.t
    public final int b() {
        return 4;
    }

    @Override // j1.t
    public final t c() {
        return new s(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // j1.t
    public final void d() {
        this.f74221a = 0.0f;
        this.f74222b = 0.0f;
        this.f74223c = 0.0f;
        this.f74224d = 0.0f;
    }

    @Override // j1.t
    public final void e(int i13, float f13) {
        if (i13 == 0) {
            this.f74221a = f13;
            return;
        }
        if (i13 == 1) {
            this.f74222b = f13;
        } else if (i13 == 2) {
            this.f74223c = f13;
        } else {
            if (i13 != 3) {
                return;
            }
            this.f74224d = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f74221a == this.f74221a && sVar.f74222b == this.f74222b && sVar.f74223c == this.f74223c && sVar.f74224d == this.f74224d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74224d) + a.a.a(this.f74223c, a.a.a(this.f74222b, Float.hashCode(this.f74221a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f74221a + ", v2 = " + this.f74222b + ", v3 = " + this.f74223c + ", v4 = " + this.f74224d;
    }
}
