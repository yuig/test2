package ee1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f58782a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58784c;

    public b(int i13, int i14, int i15) {
        this.f58782a = i13;
        this.f58783b = i14;
        this.f58784c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f58782a == bVar.f58782a && this.f58783b == bVar.f58783b && this.f58784c == bVar.f58784c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f58784c) + ep.b.b(this.f58783b, Integer.hashCode(this.f58782a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShoppingFilterEmptyState(iconResId=");
        sb3.append(this.f58782a);
        sb3.append(", titleResId=");
        sb3.append(this.f58783b);
        sb3.append(", messageResId=");
        return a.a.n(sb3, this.f58784c, ")");
    }
}
