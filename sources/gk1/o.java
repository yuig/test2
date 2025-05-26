package gk1;

/* loaded from: classes2.dex */
public final class o implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65246a;

    public o(boolean z13) {
        this.f65246a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f65246a == ((o) obj).f65246a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65246a);
    }

    public final boolean j() {
        return this.f65246a;
    }

    public final String toString() {
        return a.a.r(new StringBuilder("AudioIndicatorMuteStateChanged(isMuted="), this.f65246a, ")");
    }
}
