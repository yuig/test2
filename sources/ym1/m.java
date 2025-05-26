package ym1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class m extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f139438b;

    public m(int i13) {
        super(i13, 4);
        this.f139438b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f139438b == ((m) obj).f139438b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f139438b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f139438b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Dismiss(id="), this.f139438b, ")");
    }
}
