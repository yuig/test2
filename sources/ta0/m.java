package ta0;

/* loaded from: classes5.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f116889a;

    public m(int i13) {
        this.f116889a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f116889a == ((m) obj).f116889a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116889a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DownloadFailed(userMessage="), this.f116889a, ")");
    }
}
