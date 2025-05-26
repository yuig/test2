package a7;

import a.cb;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final f f987g = new f(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f988a;

    /* renamed from: b, reason: collision with root package name */
    public final int f989b;

    /* renamed from: c, reason: collision with root package name */
    public final int f990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f991d;

    /* renamed from: e, reason: collision with root package name */
    public final int f992e;

    /* renamed from: f, reason: collision with root package name */
    public h1.b f993f;

    static {
        cb.s(0, 1, 2, 3, 4);
    }

    public f(int i13, int i14, int i15, int i16, int i17) {
        this.f988a = i13;
        this.f989b = i14;
        this.f990c = i15;
        this.f991d = i16;
        this.f992e = i17;
    }

    public final h1.b a() {
        if (this.f993f == null) {
            this.f993f = new h1.b(this, 0);
        }
        return this.f993f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f988a == fVar.f988a && this.f989b == fVar.f989b && this.f990c == fVar.f990c && this.f991d == fVar.f991d && this.f992e == fVar.f992e;
    }

    public final int hashCode() {
        return ((((((((527 + this.f988a) * 31) + this.f989b) * 31) + this.f990c) * 31) + this.f991d) * 31) + this.f992e;
    }
}
