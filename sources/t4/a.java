package t4;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: s, reason: collision with root package name */
    public static final double[] f116324s = new double[91];

    /* renamed from: a, reason: collision with root package name */
    public double[] f116325a;

    /* renamed from: b, reason: collision with root package name */
    public double f116326b;

    /* renamed from: c, reason: collision with root package name */
    public double f116327c;

    /* renamed from: d, reason: collision with root package name */
    public double f116328d;

    /* renamed from: e, reason: collision with root package name */
    public double f116329e;

    /* renamed from: f, reason: collision with root package name */
    public double f116330f;

    /* renamed from: g, reason: collision with root package name */
    public double f116331g;

    /* renamed from: h, reason: collision with root package name */
    public double f116332h;

    /* renamed from: i, reason: collision with root package name */
    public double f116333i;

    /* renamed from: j, reason: collision with root package name */
    public double f116334j;

    /* renamed from: k, reason: collision with root package name */
    public double f116335k;

    /* renamed from: l, reason: collision with root package name */
    public double f116336l;

    /* renamed from: m, reason: collision with root package name */
    public double f116337m;

    /* renamed from: n, reason: collision with root package name */
    public double f116338n;

    /* renamed from: o, reason: collision with root package name */
    public double f116339o;

    /* renamed from: p, reason: collision with root package name */
    public double f116340p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f116341q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f116342r;

    public final double a() {
        double d2 = this.f116334j * this.f116340p;
        double hypot = this.f116338n / Math.hypot(d2, (-this.f116335k) * this.f116339o);
        if (this.f116341q) {
            d2 = -d2;
        }
        return d2 * hypot;
    }

    public final double b() {
        double d2 = this.f116334j * this.f116340p;
        double d13 = (-this.f116335k) * this.f116339o;
        double hypot = this.f116338n / Math.hypot(d2, d13);
        return this.f116341q ? (-d13) * hypot : d13 * hypot;
    }

    public final double c(double d2) {
        double d13 = (d2 - this.f116327c) * this.f116333i;
        double d14 = this.f116330f;
        double d15 = this.f116329e;
        return ((d14 - d15) * d13) + d15;
    }

    public final double d(double d2) {
        double d13 = (d2 - this.f116327c) * this.f116333i;
        double d14 = this.f116332h;
        double d15 = this.f116331g;
        return ((d14 - d15) * d13) + d15;
    }

    public final double e() {
        return (this.f116334j * this.f116339o) + this.f116336l;
    }

    public final double f() {
        return (this.f116335k * this.f116340p) + this.f116337m;
    }

    public final void g(double d2) {
        double d13 = (this.f116341q ? this.f116328d - d2 : d2 - this.f116327c) * this.f116333i;
        double d14 = 0.0d;
        if (d13 > 0.0d) {
            d14 = 1.0d;
            if (d13 < 1.0d) {
                double[] dArr = this.f116325a;
                double length = d13 * (dArr.length - 1);
                int i13 = (int) length;
                double d15 = dArr[i13];
                d14 = ((dArr[i13 + 1] - d15) * (length - i13)) + d15;
            }
        }
        double d16 = d14 * 1.5707963267948966d;
        this.f116339o = Math.sin(d16);
        this.f116340p = Math.cos(d16);
    }
}
