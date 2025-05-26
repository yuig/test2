package ig;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f72240a;

    public b(String str) {
        this.f72240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f72240a.equals(((b) obj).f72240a);
    }

    public final int hashCode() {
        return this.f72240a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Encoding{name=\""), this.f72240a, "\"}");
    }
}
