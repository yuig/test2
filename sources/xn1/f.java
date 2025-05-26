package xn1;

/* loaded from: classes5.dex */
public final class f extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135447b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135448c;

    public f(int i13, boolean z13) {
        super(i13);
        this.f135447b = i13;
        this.f135448c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f135447b == fVar.f135447b && this.f135448c == fVar.f135448c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135448c) + (Integer.hashCode(this.f135447b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135447b;
    }

    public final String toString() {
        return "FocusChanged(id=" + this.f135447b + ", hasFocus=" + this.f135448c + ")";
    }
}
