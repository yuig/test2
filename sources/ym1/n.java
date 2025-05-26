package ym1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class n extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f139439b;

    public n(int i13) {
        super(i13, 4);
        this.f139439b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f139439b == ((n) obj).f139439b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139439b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f139439b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("EndClick(id="), this.f139439b, ")");
    }
}
