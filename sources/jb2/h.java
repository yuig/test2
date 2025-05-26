package jb2;

import nm1.d1;

/* loaded from: classes4.dex */
public final class h extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f75370b;

    public h(int i13) {
        super(i13, 9);
        this.f75370b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f75370b == ((h) obj).f75370b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75370b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f75370b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f75370b, ")");
    }
}
