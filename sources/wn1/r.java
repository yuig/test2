package wn1;

/* loaded from: classes5.dex */
public final class r extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130579b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130580c;

    public r(int i13, boolean z13) {
        super(i13);
        this.f130579b = i13;
        this.f130580c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f130579b == rVar.f130579b && this.f130580c == rVar.f130580c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130580c) + (Integer.hashCode(this.f130579b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130579b;
    }

    public final String toString() {
        return "FocusChanged(id=" + this.f130579b + ", hasFocus=" + this.f130580c + ")";
    }
}
