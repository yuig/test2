package ar1;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20411a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20412b;

    public b(boolean z13, boolean z14) {
        this.f20411a = z13;
        this.f20412b = z14;
    }

    public final boolean a() {
        return this.f20411a;
    }

    public final boolean b() {
        return this.f20412b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20411a == bVar.f20411a && this.f20412b == bVar.f20412b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20412b) + (Boolean.hashCode(this.f20411a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConsentChecks(consentOptIn=");
        sb3.append(this.f20411a);
        sb3.append(", marketingOptOut=");
        return a.a.r(sb3, this.f20412b, ")");
    }
}
