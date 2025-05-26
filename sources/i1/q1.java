package i1;

/* loaded from: classes2.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f70881a;

    /* renamed from: b, reason: collision with root package name */
    public final float f70882b;

    /* renamed from: c, reason: collision with root package name */
    public final long f70883c;

    public q1(long j13, float f13, float f14) {
        this.f70881a = f13;
        this.f70882b = f14;
        this.f70883c = j13;
    }

    public final float a(long j13) {
        long j14 = this.f70883c;
        return Math.signum(this.f70881a) * this.f70882b * b.b(j14 > 0 ? j13 / j14 : 1.0f).f70711a;
    }

    public final float b(long j13) {
        long j14 = this.f70883c;
        return (((Math.signum(this.f70881a) * b.b(j14 > 0 ? j13 / j14 : 1.0f).f70712b) * this.f70882b) / j14) * 1000.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Float.compare(this.f70881a, q1Var.f70881a) == 0 && Float.compare(this.f70882b, q1Var.f70882b) == 0 && this.f70883c == q1Var.f70883c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f70883c) + a.a.a(this.f70882b, Float.hashCode(this.f70881a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f70881a + ", distance=" + this.f70882b + ", duration=" + this.f70883c + ')';
    }
}
