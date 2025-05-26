package y01;

/* loaded from: classes5.dex */
public final class j0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136421a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136422b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136423c;

    public j0(boolean z13, boolean z14, boolean z15) {
        this.f136421a = z13;
        this.f136422b = z14;
        this.f136423c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f136421a == j0Var.f136421a && this.f136422b == j0Var.f136422b && this.f136423c == j0Var.f136423c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136423c) + ep.b.e(this.f136422b, Boolean.hashCode(this.f136421a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnActivate(isResumed=");
        sb3.append(this.f136421a);
        sb3.append(", isReadExternalStoragePermissionGranted=");
        sb3.append(this.f136422b);
        sb3.append(", isGalleryPermissionGranted=");
        return a.a.r(sb3, this.f136423c, ")");
    }
}
