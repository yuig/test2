package j41;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f74639a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74640b;

    public a(int i13, int i14) {
        this.f74639a = i13;
        this.f74640b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f74639a == aVar.f74639a && this.f74640b == aVar.f74640b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74640b) + (Integer.hashCode(this.f74639a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoverMediaDimensions(width=");
        sb3.append(this.f74639a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f74640b, ")");
    }
}
