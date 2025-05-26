package eu1;

import u50.o;

/* loaded from: classes4.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f60179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60181c;

    public b(int i13, int i14, int i15) {
        this.f60179a = i13;
        this.f60180b = i14;
        this.f60181c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60179a == bVar.f60179a && this.f60180b == bVar.f60180b && this.f60181c == bVar.f60181c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60181c) + ep.b.b(this.f60180b, Integer.hashCode(this.f60179a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavDemoOneDisplayState(title=");
        sb3.append(this.f60179a);
        sb3.append(", description=");
        sb3.append(this.f60180b);
        sb3.append(", buttonLabel=");
        return a.a.n(sb3, this.f60181c, ")");
    }
}
