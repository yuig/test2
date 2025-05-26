package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class p extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135393b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135394c;

    public p(int i13, boolean z13) {
        super(i13, 3);
        this.f135393b = i13;
        this.f135394c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f135393b == pVar.f135393b && this.f135394c == pVar.f135394c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135394c) + (Integer.hashCode(this.f135393b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135393b;
    }

    public final String toString() {
        return "DismissButtonClick(id=" + this.f135393b + ", isChecked=" + this.f135394c + ")";
    }
}
