package x62;

/* loaded from: classes4.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final int f133995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133996b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133997c;

    public r(int i13, int i14, boolean z13) {
        this.f133995a = i13;
        this.f133996b = i14;
        this.f133997c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f133995a == rVar.f133995a && this.f133996b == rVar.f133996b && this.f133997c == rVar.f133997c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133997c) + ep.b.b(this.f133996b, Integer.hashCode(this.f133995a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditingHistoryChanged(historySize=");
        sb3.append(this.f133995a);
        sb3.append(", redoSize=");
        sb3.append(this.f133996b);
        sb3.append(", isMaskInverted=");
        return a.a.r(sb3, this.f133997c, ")");
    }
}
