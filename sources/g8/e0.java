package g8;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f64233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f64235c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64236d;

    /* renamed from: e, reason: collision with root package name */
    public final int f64237e;

    public e0(long j13, Object obj) {
        this(-1, -1, -1, j13, obj);
    }

    public final e0 a(Object obj) {
        if (this.f64233a.equals(obj)) {
            return this;
        }
        long j13 = this.f64236d;
        return new e0(this.f64234b, this.f64235c, this.f64237e, j13, obj);
    }

    public final boolean b() {
        return this.f64234b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f64233a.equals(e0Var.f64233a) && this.f64234b == e0Var.f64234b && this.f64235c == e0Var.f64235c && this.f64236d == e0Var.f64236d && this.f64237e == e0Var.f64237e;
    }

    public final int hashCode() {
        return ((((((((this.f64233a.hashCode() + 527) * 31) + this.f64234b) * 31) + this.f64235c) * 31) + ((int) this.f64236d)) * 31) + this.f64237e;
    }

    public e0(Object obj) {
        this(-1L, obj);
    }

    public e0(Object obj, int i13, int i14, long j13) {
        this(i13, i14, -1, j13, obj);
    }

    public e0(Object obj, long j13, int i13) {
        this(-1, -1, i13, j13, obj);
    }

    public e0(int i13, int i14, int i15, long j13, Object obj) {
        this.f64233a = obj;
        this.f64234b = i13;
        this.f64235c = i14;
        this.f64236d = j13;
        this.f64237e = i15;
    }
}
