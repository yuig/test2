package wt1;

/* loaded from: classes4.dex */
public final class t extends tl1.i {

    /* renamed from: b, reason: collision with root package name */
    public final int f131128b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131129c;

    public t(int i13, int i14) {
        super(i14 - i13);
        this.f131128b = i13;
        this.f131129c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f131128b == tVar.f131128b && this.f131129c == tVar.f131129c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131129c) + (Integer.hashCode(this.f131128b) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Payload(startIndex=");
        sb3.append(this.f131128b);
        sb3.append(", endIndex=");
        return a.a.n(sb3, this.f131129c, ")");
    }
}
