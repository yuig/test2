package e82;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57848c;

    public g(boolean z13, boolean z14, boolean z15) {
        this.f57846a = z13;
        this.f57847b = z14;
        this.f57848c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f57846a == gVar.f57846a && this.f57847b == gVar.f57847b && this.f57848c == gVar.f57848c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57848c) + ep.b.e(this.f57847b, Boolean.hashCode(this.f57846a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConnectionStatus(isConnected=");
        sb3.append(this.f57846a);
        sb3.append(", isEnabled=");
        sb3.append(this.f57847b);
        sb3.append(", isAutoOrgEnabled=");
        return a.a.r(sb3, this.f57848c, ")");
    }
}
