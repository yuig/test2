package mn1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class b extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f87795b;

    public b(int i13) {
        super(i13, 7);
        this.f87795b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f87795b == ((b) obj).f87795b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87795b);
    }

    @Override // gm1.c
    public final int j() {
        return this.f87795b;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("TextClick(id="), this.f87795b, ")");
    }
}
