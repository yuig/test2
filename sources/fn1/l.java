package fn1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class l extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f62709b;

    public l(int i13) {
        super(i13, 6);
        this.f62709b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f62709b == ((l) obj).f62709b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62709b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f62709b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Dismiss(id="), this.f62709b, ")");
    }
}
