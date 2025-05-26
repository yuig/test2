package mi1;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87213a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87214b;

    public b(boolean z13, boolean z14) {
        this.f87213a = z13;
        this.f87214b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87213a == bVar.f87213a && this.f87214b == bVar.f87214b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87214b) + (Boolean.hashCode(this.f87213a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GridCleanupExperimentState(shouldRemoveElement=");
        sb3.append(this.f87213a);
        sb3.append(", shouldActivateExperiment=");
        return a.a.r(sb3, this.f87214b, ")");
    }
}
