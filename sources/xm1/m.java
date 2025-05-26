package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class m extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135388b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f135389c;

    public m(int i13, boolean z13) {
        super(i13, 3);
        this.f135388b = i13;
        this.f135389c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f135388b == mVar.f135388b && this.f135389c == mVar.f135389c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135389c) + (Integer.hashCode(this.f135388b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135388b;
    }

    public final String toString() {
        return "CancelButtonClick(id=" + this.f135388b + ", isChecked=" + this.f135389c + ")";
    }
}
