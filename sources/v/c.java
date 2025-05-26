package v;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f123374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123376c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f123377d;

    public c(int i13, int i14, boolean z13, boolean z14) {
        this.f123374a = i13;
        this.f123375b = i14;
        this.f123376c = z13;
        this.f123377d = z14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f123374a == cVar.f123374a && this.f123375b == cVar.f123375b && this.f123376c == cVar.f123376c && this.f123377d == cVar.f123377d;
    }

    public final int hashCode() {
        return ((((((this.f123374a ^ 1000003) * 1000003) ^ this.f123375b) * 1000003) ^ (this.f123376c ? 1231 : 1237)) * 1000003) ^ (this.f123377d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeatureSettings{cameraMode=");
        sb3.append(this.f123374a);
        sb3.append(", requiredMaxBitDepth=");
        sb3.append(this.f123375b);
        sb3.append(", previewStabilizationOn=");
        sb3.append(this.f123376c);
        sb3.append(", ultraHdrOn=");
        return a.a.r(sb3, this.f123377d, "}");
    }
}
