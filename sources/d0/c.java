package d0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l0.b f53502a;

    /* renamed from: b, reason: collision with root package name */
    public final int f53503b;

    public c(l0.b bVar, int i13) {
        if (bVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f53502a = bVar;
        this.f53503b = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f53502a.equals(cVar.f53502a) && this.f53503b == cVar.f53503b;
    }

    public final int hashCode() {
        return ((this.f53502a.hashCode() ^ 1000003) * 1000003) ^ this.f53503b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{packet=");
        sb3.append(this.f53502a);
        sb3.append(", jpegQuality=");
        return a.a.n(sb3, this.f53503b, "}");
    }
}
