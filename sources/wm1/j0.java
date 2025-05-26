package wm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class j0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f130306b;

    public j0(int i13) {
        super(i13, 2);
        this.f130306b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f130306b == ((j0) obj).f130306b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130306b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130306b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f130306b, ")");
    }
}
