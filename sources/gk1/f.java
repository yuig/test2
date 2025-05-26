package gk1;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65227a;

    public f(boolean z13) {
        this.f65227a = z13;
    }

    public final boolean a() {
        return this.f65227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f65227a == ((f) obj).f65227a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65227a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("NotifyListenerOfUserGeneratedMuteChange(isMuted="), this.f65227a, ")");
    }
}
