package n11;

import hf0.b;
import wa2.s;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f88921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88923c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88924d;

    public a(int i13) {
        int i14 = s.f128899l0;
        this.f88921a = 0;
        this.f88922b = i13;
        this.f88923c = b.f69002b;
        this.f88924d = i14;
    }

    public final int a() {
        return this.f88922b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f88921a == aVar.f88921a && this.f88922b == aVar.f88922b && this.f88923c == aVar.f88923c && this.f88924d == aVar.f88924d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88924d) + ep.b.b(this.f88923c, ep.b.b(this.f88922b, Integer.hashCode(this.f88921a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreviewParams(desiredWidth=");
        sb3.append(this.f88921a);
        sb3.append(", desiredHeight=");
        sb3.append(this.f88922b);
        sb3.append(", maxWidth=");
        sb3.append(this.f88923c);
        sb3.append(", maxHeight=");
        return a.a.n(sb3, this.f88924d, ")");
    }
}
