package an1;

/* loaded from: classes5.dex */
public final class j extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f15739b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15740c;

    public j(int i13, boolean z13) {
        super(i13);
        this.f15739b = i13;
        this.f15740c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15739b == jVar.f15739b && this.f15740c == jVar.f15740c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15740c) + (Integer.hashCode(this.f15739b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f15739b;
    }

    public final String toString() {
        return "Click(id=" + this.f15739b + ", isChecked=" + this.f15740c + ")";
    }
}
