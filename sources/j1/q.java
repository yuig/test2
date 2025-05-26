package j1;

/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f74199a;

    /* renamed from: b, reason: collision with root package name */
    public float f74200b;

    public q(float f13, float f14) {
        this.f74199a = f13;
        this.f74200b = f14;
    }

    @Override // j1.t
    public final float a(int i13) {
        if (i13 == 0) {
            return this.f74199a;
        }
        if (i13 != 1) {
            return 0.0f;
        }
        return this.f74200b;
    }

    @Override // j1.t
    public final int b() {
        return 2;
    }

    @Override // j1.t
    public final t c() {
        return new q(0.0f, 0.0f);
    }

    @Override // j1.t
    public final void d() {
        this.f74199a = 0.0f;
        this.f74200b = 0.0f;
    }

    @Override // j1.t
    public final void e(int i13, float f13) {
        if (i13 == 0) {
            this.f74199a = f13;
        } else {
            if (i13 != 1) {
                return;
            }
            this.f74200b = f13;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.f74199a == this.f74199a && qVar.f74200b == this.f74200b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74200b) + (Float.hashCode(this.f74199a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f74199a + ", v2 = " + this.f74200b;
    }
}
