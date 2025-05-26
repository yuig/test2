package y0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f136330d = new f(0, 0, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final f f136331e = new f(1, 3, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final f f136332f = new f(6, 7, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final f f136333g = new f(6, 6, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f136334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f136336c;

    public f(int i13, int i14, int i15) {
        this.f136334a = i13;
        this.f136335b = i14;
        this.f136336c = i15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f136334a == fVar.f136334a && this.f136335b == fVar.f136335b && this.f136336c == fVar.f136336c;
    }

    public final int hashCode() {
        return ((((this.f136334a ^ 1000003) * 1000003) ^ this.f136335b) * 1000003) ^ this.f136336c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb3.append(this.f136334a);
        sb3.append(", transfer=");
        sb3.append(this.f136335b);
        sb3.append(", range=");
        return a.a.n(sb3, this.f136336c, "}");
    }
}
