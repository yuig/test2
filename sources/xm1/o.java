package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class o extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135392b;

    public o(int i13) {
        super(i13, 3);
        this.f135392b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f135392b == ((o) obj).f135392b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135392b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135392b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Dismiss(id="), this.f135392b, ")");
    }
}
