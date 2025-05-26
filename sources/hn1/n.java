package hn1;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f69658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69660c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69661d;

    public n(int i13, int i14, int i15, int i16) {
        this.f69658a = i13;
        this.f69659b = i14;
        this.f69660c = i15;
        this.f69661d = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f69658a == nVar.f69658a && this.f69659b == nVar.f69659b && this.f69660c == nVar.f69660c && this.f69661d == nVar.f69661d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69661d) + ep.b.b(this.f69660c, ep.b.b(this.f69659b, Integer.hashCode(this.f69658a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Padding(top=");
        sb3.append(this.f69658a);
        sb3.append(", start=");
        sb3.append(this.f69659b);
        sb3.append(", end=");
        sb3.append(this.f69660c);
        sb3.append(", bottom=");
        return a.a.n(sb3, this.f69661d, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ n() {
        /*
            r2 = this;
            int r0 = eo1.c.space_300
            int r1 = eo1.c.space_200
            r2.<init>(r0, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hn1.n.<init>():void");
    }
}
