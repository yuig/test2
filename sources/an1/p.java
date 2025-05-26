package an1;

/* loaded from: classes5.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    public final int f15757b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15758c;

    public p(int i13, int i14) {
        super(i13);
        this.f15757b = i13;
        this.f15758c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f15757b == pVar.f15757b && this.f15758c == pVar.f15758c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15758c) + (Integer.hashCode(this.f15757b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f15757b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OptionSelected(id=");
        sb3.append(this.f15757b);
        sb3.append(", optionSelectedIndex=");
        return a.a.n(sb3, this.f15758c, ")");
    }
}
