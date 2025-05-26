package nx;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f92404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92405b;

    public j(int i13, int i14) {
        this.f92404a = i13;
        this.f92405b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f92404a == jVar.f92404a && this.f92405b == jVar.f92405b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92405b) + (Integer.hashCode(this.f92404a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ScreenSize(width=");
        sb3.append(this.f92404a);
        sb3.append(", height=");
        return a.a.n(sb3, this.f92405b, ")");
    }
}
