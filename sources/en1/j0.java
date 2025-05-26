package en1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class j0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f59677b;

    public j0(int i13) {
        super(i13, 5);
        this.f59677b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && this.f59677b == ((j0) obj).f59677b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59677b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f59677b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LongClick(id="), this.f59677b, ")");
    }
}
