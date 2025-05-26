package hn1;

/* loaded from: classes5.dex */
public final class r extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69663c;

    public r(boolean z13) {
        super(Integer.MIN_VALUE);
        this.f69662b = z13;
        this.f69663c = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f69662b == rVar.f69662b && this.f69663c == rVar.f69663c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69663c) + (Boolean.hashCode(this.f69662b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f69663c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContentScrolled(shouldAddHeaderElevation=");
        sb3.append(this.f69662b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f69663c, ")");
    }
}
