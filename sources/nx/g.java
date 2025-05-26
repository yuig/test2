package nx;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f92395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92396b;

    public g(int i13, int i14) {
        this.f92395a = i13;
        this.f92396b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f92395a == gVar.f92395a && this.f92396b == gVar.f92396b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92396b) + (Integer.hashCode(this.f92395a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClickPosition(x=");
        sb3.append(this.f92395a);
        sb3.append(", y=");
        return a.a.n(sb3, this.f92396b, ")");
    }
}
