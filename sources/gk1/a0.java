package gk1;

/* loaded from: classes2.dex */
public final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65213a;

    public a0(boolean z13) {
        this.f65213a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f65213a == ((a0) obj).f65213a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65213a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateAudioIndicatorVisibility(show="), this.f65213a, ")");
    }
}
