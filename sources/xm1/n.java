package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class n extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135390b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135391c;

    public n(int i13, boolean z13) {
        super(i13, 3);
        this.f135390b = i13;
        this.f135391c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f135390b == nVar.f135390b && this.f135391c == nVar.f135391c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135391c) + (Integer.hashCode(this.f135390b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135390b;
    }

    public final String toString() {
        return "CheckBoxClick(id=" + this.f135390b + ", isChecked=" + this.f135391c + ")";
    }
}
