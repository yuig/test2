package s80;

/* loaded from: classes5.dex */
public final class b1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111470a;

    public b1(boolean z13) {
        this.f111470a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && this.f111470a == ((b1) obj).f111470a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111470a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("InitialDraftLoadFailed(isRemix="), this.f111470a, ")");
    }
}
