package ag;

/* loaded from: classes3.dex */
public final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    public static final f f15083d;

    /* renamed from: b, reason: collision with root package name */
    public double f15084b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f15085c = 0.0d;

    static {
        f a13 = f.a(64, new c());
        f15083d = a13;
        a13.f15096f = 0.5f;
    }

    public static c b(double d2, double d13) {
        c cVar = (c) f15083d.b();
        cVar.f15084b = d2;
        cVar.f15085c = d13;
        return cVar;
    }

    public static void c(c cVar) {
        f15083d.c(cVar);
    }

    @Override // ag.e
    public final e a() {
        return new c();
    }

    public final String toString() {
        return "MPPointD, x: " + this.f15084b + ", y: " + this.f15085c;
    }
}
