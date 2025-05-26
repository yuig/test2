package nj2;

/* loaded from: classes4.dex */
public final class a extends p {

    /* renamed from: b, reason: collision with root package name */
    public final int f90977b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90978c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90979d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90981f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90982g;

    public a(int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f90977b = i13;
        this.f90978c = i14;
        this.f90979d = i15;
        this.f90980e = i16;
        this.f90981f = i17;
        this.f90982g = i18;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f90977b == ((a) pVar).f90977b) {
            a aVar = (a) pVar;
            if (this.f90978c == aVar.f90978c && this.f90979d == aVar.f90979d && this.f90980e == aVar.f90980e && this.f90981f == aVar.f90981f && this.f90982g == aVar.f90982g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f90977b ^ 1000003) * 1000003) ^ this.f90978c) * 1000003) ^ this.f90979d) * 1000003) ^ this.f90980e) * 1000003) ^ this.f90981f) * 1000003) ^ this.f90982g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanLimitsValue{maxNumberOfAttributes=");
        sb3.append(this.f90977b);
        sb3.append(", maxNumberOfEvents=");
        sb3.append(this.f90978c);
        sb3.append(", maxNumberOfLinks=");
        sb3.append(this.f90979d);
        sb3.append(", maxNumberOfAttributesPerEvent=");
        sb3.append(this.f90980e);
        sb3.append(", maxNumberOfAttributesPerLink=");
        sb3.append(this.f90981f);
        sb3.append(", maxAttributeValueLength=");
        return a.a.n(sb3, this.f90982g, "}");
    }
}
