package wm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class i0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f130304b;

    public i0(int i13) {
        super(i13, 2);
        this.f130304b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f130304b == ((i0) obj).f130304b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130304b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f130304b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f130304b, ")");
    }
}
