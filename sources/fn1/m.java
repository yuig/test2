package fn1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class m extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f62710b;

    public m(int i13) {
        super(i13, 6);
        this.f62710b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f62710b == ((m) obj).f62710b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62710b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f62710b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("DropDownClick(id="), this.f62710b, ")");
    }
}
