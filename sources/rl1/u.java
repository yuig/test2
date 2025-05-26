package rl1;

/* loaded from: classes2.dex */
public final class u extends y {

    /* renamed from: b, reason: collision with root package name */
    public final int f108661b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108662c;

    public u(int i13, boolean z13) {
        super(i13);
        this.f108661b = i13;
        this.f108662c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f108661b == uVar.f108661b && this.f108662c == uVar.f108662c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108662c) + (Integer.hashCode(this.f108661b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f108661b;
    }

    public final String toString() {
        return "BitmapObtained(id=" + this.f108661b + ", isFromCache=" + this.f108662c + ")";
    }
}
