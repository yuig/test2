package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class l extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135386b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135387c;

    public l(int i13, boolean z13) {
        super(i13, 3);
        this.f135386b = i13;
        this.f135387c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f135386b == lVar.f135386b && this.f135387c == lVar.f135387c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135387c) + (Integer.hashCode(this.f135386b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135386b;
    }

    public final String toString() {
        return "ActionButtonClick(id=" + this.f135386b + ", isChecked=" + this.f135387c + ")";
    }
}
