package ta0;

/* loaded from: classes5.dex */
public final class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f116922a;

    public y(int i13) {
        this.f116922a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f116922a == ((y) obj).f116922a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116922a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DuplicateFailed(userMessage="), this.f116922a, ")");
    }
}
