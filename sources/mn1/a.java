package mn1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class a extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f87794b;

    public a(int i13) {
        super(i13, 7);
        this.f87794b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f87794b == ((a) obj).f87794b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87794b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f87794b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("IconClick(id="), this.f87794b, ")");
    }
}
