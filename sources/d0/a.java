package d0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l0.b f53483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53484b;

    public a(l0.b bVar, int i13) {
        if (bVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f53483a = bVar;
        this.f53484b = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f53483a.equals(aVar.f53483a) && this.f53484b == aVar.f53484b;
    }

    public final int hashCode() {
        return ((this.f53483a.hashCode() ^ 1000003) * 1000003) ^ this.f53484b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{packet=");
        sb3.append(this.f53483a);
        sb3.append(", jpegQuality=");
        return a.a.n(sb3, this.f53484b, "}");
    }
}
