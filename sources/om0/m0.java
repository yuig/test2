package om0;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f96538a;

    /* renamed from: b, reason: collision with root package name */
    public final float f96539b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96540c;

    /* renamed from: d, reason: collision with root package name */
    public final float f96541d;

    /* renamed from: e, reason: collision with root package name */
    public final long f96542e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96543f;

    public m0(float f13, float f14, long j13, float f15, long j14, long j15) {
        this.f96538a = f13;
        this.f96539b = f14;
        this.f96540c = j13;
        this.f96541d = f15;
        this.f96542e = j14;
        this.f96543f = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Float.compare(this.f96538a, m0Var.f96538a) == 0 && n4.e.a(this.f96539b, m0Var.f96539b) && b3.w.c(this.f96540c, m0Var.f96540c) && n4.e.a(this.f96541d, m0Var.f96541d) && b3.w.c(this.f96542e, m0Var.f96542e) && b3.w.c(this.f96543f, m0Var.f96543f);
    }

    public final int hashCode() {
        int a13 = a.a.a(this.f96539b, Float.hashCode(this.f96538a) * 31, 31);
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Long.hashCode(this.f96543f) + a.a.c(this.f96542e, a.a.a(this.f96541d, a.a.c(this.f96540c, a13, 31), 31), 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f96539b);
        String i13 = b3.w.i(this.f96540c);
        String b14 = n4.e.b(this.f96541d);
        String i14 = b3.w.i(this.f96542e);
        String i15 = b3.w.i(this.f96543f);
        StringBuilder sb3 = new StringBuilder("PreviewImageStyle(aspectRatio=");
        sb3.append(this.f96538a);
        sb3.append(", borderWidth=");
        sb3.append(b13);
        sb3.append(", borderColor=");
        a.a.B(sb3, i13, ", cornerRadius=", b14, ", placeholderColor=");
        return a.a.q(sb3, i14, ", washColor=", i15, ")");
    }
}
