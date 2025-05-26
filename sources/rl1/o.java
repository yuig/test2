package rl1;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f108642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108644c;

    public /* synthetic */ o(int i13, int i14) {
        this(true, -1, (i14 & 4) != 0 ? l.f108625b : i13);
    }

    public static o a(o oVar, int i13, int i14, int i15) {
        boolean z13 = oVar.f108642a;
        if ((i15 & 4) != 0) {
            i14 = oVar.f108644c;
        }
        oVar.getClass();
        return new o(z13, i13, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f108642a == oVar.f108642a && this.f108643b == oVar.f108643b && this.f108644c == oVar.f108644c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108644c) + ep.b.b(this.f108643b, Boolean.hashCode(this.f108642a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BorderViewModel(border=");
        sb3.append(this.f108642a);
        sb3.append(", borderWidth=");
        sb3.append(this.f108643b);
        sb3.append(", borderColor=");
        return a.a.n(sb3, this.f108644c, ")");
    }

    public o(boolean z13, int i13, int i14) {
        this.f108642a = z13;
        this.f108643b = i13;
        this.f108644c = i14;
    }
}
