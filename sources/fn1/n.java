package fn1;

import nm1.d1;

/* loaded from: classes5.dex */
public final class n extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f62711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62712c;

    public n(int i13, int i14) {
        super(i13, 6);
        this.f62711b = i13;
        this.f62712c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f62711b == nVar.f62711b && this.f62712c == nVar.f62712c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62712c) + (Integer.hashCode(this.f62711b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f62711b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemClick(id=");
        sb3.append(this.f62711b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f62712c, ")");
    }
}
