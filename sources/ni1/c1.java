package ni1;

/* loaded from: classes2.dex */
public final class c1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90623a;

    public c1(boolean z13) {
        this.f90623a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.f90623a == ((c1) obj).f90623a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90623a);
    }

    public final boolean j() {
        return this.f90623a;
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateAudioIndicatorVisibility(show="), this.f90623a, ")");
    }
}
