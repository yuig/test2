package sp0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f114875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f114876b;

    public a(int i13, int i14) {
        this.f114875a = i13;
        this.f114876b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f114875a == aVar.f114875a && this.f114876b == aVar.f114876b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114876b) + (Integer.hashCode(this.f114875a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Dimensions(width=");
        sb3.append(this.f114875a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f114876b, ")");
    }
}
