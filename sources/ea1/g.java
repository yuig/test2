package ea1;

/* loaded from: classes5.dex */
public final class g implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58052a;

    public g(boolean z13) {
        this.f58052a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f58052a == ((g) obj).f58052a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58052a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("AutoPublishToggled(isEnabled="), this.f58052a, ")");
    }
}
