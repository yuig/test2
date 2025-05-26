package do1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class t extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f55697b;

    public t(int i13) {
        super(i13, 8);
        this.f55697b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f55697b == ((t) obj).f55697b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55697b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f55697b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("NoActionTouch(id="), this.f55697b, ")");
    }
}
