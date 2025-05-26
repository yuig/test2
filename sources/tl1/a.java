package tl1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f118071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118072b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118073c;

    public a(int i13, int i14) {
        this(-1, (i14 & 2) != 0 ? g.f118090a : i13, -1);
    }

    public static a a(a aVar, int i13) {
        int i14 = aVar.f118072b;
        int i15 = aVar.f118073c;
        aVar.getClass();
        return new a(i13, i14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f118071a == aVar.f118071a && this.f118072b == aVar.f118072b && this.f118073c == aVar.f118073c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f118073c) + ep.b.b(this.f118072b, Integer.hashCode(this.f118071a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AvatarChipViewModel(size=");
        sb3.append(this.f118071a);
        sb3.append(", borderColorResId=");
        sb3.append(this.f118072b);
        sb3.append(", borderWidth=");
        return a.a.n(sb3, this.f118073c, ")");
    }

    public a(int i13, int i14, int i15) {
        this.f118071a = i13;
        this.f118072b = i14;
        this.f118073c = i15;
    }
}
