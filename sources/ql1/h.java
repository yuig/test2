package ql1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class h extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f104087b;

    public h(int i13) {
        super(i13, 0);
        this.f104087b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f104087b == ((h) obj).f104087b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104087b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f104087b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f104087b, ")");
    }
}
