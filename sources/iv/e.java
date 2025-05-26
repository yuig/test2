package iv;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73726a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73727b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73728c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f73729d;

    public /* synthetic */ e(boolean z13, int i13) {
        this((i13 & 1) != 0 ? false : z13, false, false, (i13 & 8) != 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f73726a == eVar.f73726a && this.f73727b == eVar.f73727b && this.f73728c == eVar.f73728c && this.f73729d == eVar.f73729d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f73729d) + ep.b.e(this.f73728c, ep.b.e(this.f73727b, Boolean.hashCode(this.f73726a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CustomImageProcessingParams(shouldScaleImagesToFitAndCenter=");
        sb3.append(this.f73726a);
        sb3.append(", shouldConstrainImageDimensions=");
        sb3.append(this.f73727b);
        sb3.append(", shouldScaleImagesToFitAndCenterTablet=");
        sb3.append(this.f73728c);
        sb3.append(", shouldUseCloseUpRedesign=");
        return a.a.r(sb3, this.f73729d, ")");
    }

    public e(boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f73726a = z13;
        this.f73727b = z14;
        this.f73728c = z15;
        this.f73729d = z16;
    }
}
