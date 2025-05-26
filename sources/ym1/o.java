package ym1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class o extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f139440b;

    public o(int i13) {
        super(i13, 4);
        this.f139440b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f139440b == ((o) obj).f139440b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139440b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f139440b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("NextClick(id="), this.f139440b, ")");
    }
}
