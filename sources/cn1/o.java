package cn1;

/* loaded from: classes5.dex */
public final class o extends v {

    /* renamed from: b, reason: collision with root package name */
    public final int f28228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28229c;

    public o(int i13, boolean z13) {
        super(i13);
        this.f28228b = i13;
        this.f28229c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f28228b == oVar.f28228b && this.f28229c == oVar.f28229c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28229c) + (Integer.hashCode(this.f28228b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f28228b;
    }

    public final String toString() {
        return "FocusChanged(id=" + this.f28228b + ", hasFocus=" + this.f28229c + ")";
    }
}
