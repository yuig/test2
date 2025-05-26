package a7;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f959a;

    /* renamed from: b, reason: collision with root package name */
    public final long f960b;

    /* renamed from: c, reason: collision with root package name */
    public final long f961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f962d;

    /* renamed from: e, reason: collision with root package name */
    public final float f963e;

    static {
        new b0().a();
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
        d7.n0.Q(3);
        d7.n0.Q(4);
    }

    public c0(b0 b0Var) {
        long j13 = b0Var.f953a;
        long j14 = b0Var.f954b;
        long j15 = b0Var.f955c;
        float f13 = b0Var.f956d;
        float f14 = b0Var.f957e;
        this.f959a = j13;
        this.f960b = j14;
        this.f961c = j15;
        this.f962d = f13;
        this.f963e = f14;
    }

    public final b0 a() {
        b0 b0Var = new b0();
        b0Var.f953a = this.f959a;
        b0Var.f954b = this.f960b;
        b0Var.f955c = this.f961c;
        b0Var.f956d = this.f962d;
        b0Var.f957e = this.f963e;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f959a == c0Var.f959a && this.f960b == c0Var.f960b && this.f961c == c0Var.f961c && this.f962d == c0Var.f962d && this.f963e == c0Var.f963e;
    }

    public final int hashCode() {
        long j13 = this.f959a;
        long j14 = this.f960b;
        int i13 = ((((int) (j13 ^ (j13 >>> 32))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f961c;
        int i14 = (i13 + ((int) ((j15 >>> 32) ^ j15))) * 31;
        float f13 = this.f962d;
        int floatToIntBits = (i14 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
        float f14 = this.f963e;
        return floatToIntBits + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0);
    }
}
