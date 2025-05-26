package es;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f60016b;

    public w(boolean z13, boolean z14) {
        this.f60015a = z13;
        this.f60016b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f60015a == wVar.f60015a && this.f60016b == wVar.f60016b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60016b) + (Boolean.hashCode(this.f60015a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinRepFrameworkTitleExperimentState(shouldTruncateOrganic=");
        sb3.append(this.f60015a);
        sb3.append(", shouldTruncateAds=");
        return a.a.r(sb3, this.f60016b, ")");
    }
}
