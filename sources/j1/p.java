package j1;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f74189a;

    public p(float f13) {
        this.f74189a = f13;
    }

    @Override // j1.t
    public final float a(int i13) {
        if (i13 == 0) {
            return this.f74189a;
        }
        return 0.0f;
    }

    @Override // j1.t
    public final int b() {
        return 1;
    }

    @Override // j1.t
    public final t c() {
        return new p(0.0f);
    }

    @Override // j1.t
    public final void d() {
        this.f74189a = 0.0f;
    }

    @Override // j1.t
    public final void e(int i13, float f13) {
        if (i13 == 0) {
            this.f74189a = f13;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && ((p) obj).f74189a == this.f74189a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f74189a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f74189a;
    }
}
