package km;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80159b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f80158a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f80159b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f80158a.equals(aVar.f80158a) && this.f80159b.equals(aVar.f80159b);
    }

    public final int hashCode() {
        return ((this.f80158a.hashCode() ^ 1000003) * 1000003) ^ this.f80159b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LibraryVersion{libraryName=");
        sb3.append(this.f80158a);
        sb3.append(", version=");
        return a.a.p(sb3, this.f80159b, "}");
    }
}
