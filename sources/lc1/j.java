package lc1;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f82883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82884b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82885c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f82886d;

    public j(int i13, int i14, boolean z13, int i15) {
        this.f82883a = i13;
        this.f82884b = i14;
        this.f82885c = i15;
        this.f82886d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f82883a == jVar.f82883a && this.f82884b == jVar.f82884b && this.f82885c == jVar.f82885c && this.f82886d == jVar.f82886d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82886d) + ep.b.b(this.f82885c, ep.b.b(this.f82884b, Integer.hashCode(this.f82883a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(titleResId=");
        sb3.append(this.f82883a);
        sb3.append(", optionTitleResId=");
        sb3.append(this.f82884b);
        sb3.append(", optionSubtitleResId=");
        sb3.append(this.f82885c);
        sb3.append(", selected=");
        return a.a.r(sb3, this.f82886d, ")");
    }
}
