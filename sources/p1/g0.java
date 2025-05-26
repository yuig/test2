package p1;

/* loaded from: classes2.dex */
public final class g0 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f98510a;

    /* renamed from: b, reason: collision with root package name */
    public final float f98511b;

    /* renamed from: c, reason: collision with root package name */
    public final float f98512c;

    /* renamed from: d, reason: collision with root package name */
    public final float f98513d;

    public g0(float f13, float f14, float f15, float f16) {
        this.f98510a = f13;
        this.f98511b = f14;
        this.f98512c = f15;
        this.f98513d = f16;
    }

    @Override // p1.m1
    public final int a(n4.b bVar, n4.k kVar) {
        return bVar.R(this.f98512c);
    }

    @Override // p1.m1
    public final int b(n4.b bVar) {
        return bVar.R(this.f98511b);
    }

    @Override // p1.m1
    public final int c(n4.b bVar) {
        return bVar.R(this.f98513d);
    }

    @Override // p1.m1
    public final int d(n4.b bVar, n4.k kVar) {
        return bVar.R(this.f98510a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return n4.e.a(this.f98510a, g0Var.f98510a) && n4.e.a(this.f98511b, g0Var.f98511b) && n4.e.a(this.f98512c, g0Var.f98512c) && n4.e.a(this.f98513d, g0Var.f98513d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f98513d) + a.a.a(this.f98512c, a.a.a(this.f98511b, Float.hashCode(this.f98510a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) n4.e.b(this.f98510a)) + ", top=" + ((Object) n4.e.b(this.f98511b)) + ", right=" + ((Object) n4.e.b(this.f98512c)) + ", bottom=" + ((Object) n4.e.b(this.f98513d)) + ')';
    }
}
