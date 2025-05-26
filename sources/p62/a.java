package p62;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f98924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98926c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98927d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f98928e = 0;

    public a(int i13, int i14, int i15) {
        this.f98924a = i13;
        this.f98925b = i14;
        this.f98926c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f98924a == aVar.f98924a && this.f98925b == aVar.f98925b && this.f98926c == aVar.f98926c && this.f98927d == aVar.f98927d && this.f98928e == aVar.f98928e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98928e) + ep.b.b(this.f98927d, ep.b.b(this.f98926c, ep.b.b(this.f98925b, Integer.hashCode(this.f98924a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionSpec(id=");
        sb3.append(this.f98924a);
        sb3.append(", textResId=");
        sb3.append(this.f98925b);
        sb3.append(", iconResId=");
        sb3.append(this.f98926c);
        sb3.append(", selectedTextResId=");
        sb3.append(this.f98927d);
        sb3.append(", selectedIconResId=");
        return a.a.n(sb3, this.f98928e, ")");
    }
}
