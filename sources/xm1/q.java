package xm1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class q extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f135395b;

    public q(int i13) {
        super(i13, 3);
        this.f135395b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f135395b == ((q) obj).f135395b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135395b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f135395b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Displayed(id="), this.f135395b, ")");
    }
}
