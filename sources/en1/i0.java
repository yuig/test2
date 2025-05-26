package en1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class i0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f59675b;

    public i0(int i13) {
        super(i13, 5);
        this.f59675b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f59675b == ((i0) obj).f59675b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59675b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f59675b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("Click(id="), this.f59675b, ")");
    }
}
