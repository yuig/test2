package jb2;

import nm1.d1;

/* loaded from: classes4.dex */
public final class i extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f75371b;

    public i(int i13) {
        super(i13, 9);
        this.f75371b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f75371b == ((i) obj).f75371b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75371b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f75371b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f75371b, ")");
    }
}
