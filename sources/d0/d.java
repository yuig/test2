package d0;

import c0.e0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l0.b f53504a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f53505b;

    public d(l0.b bVar, e0 e0Var) {
        if (bVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f53504a = bVar;
        this.f53505b = e0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f53504a.equals(dVar.f53504a) && this.f53505b.equals(dVar.f53505b);
    }

    public final int hashCode() {
        return ((this.f53504a.hashCode() ^ 1000003) * 1000003) ^ this.f53505b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f53504a + ", outputFileOptions=" + this.f53505b + "}";
    }
}
