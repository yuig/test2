package ql1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class i extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f104088b;

    public i(int i13) {
        super(i13, 0);
        this.f104088b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f104088b == ((i) obj).f104088b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104088b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f104088b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f104088b, ")");
    }
}
