package mc2;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f86942a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86943b;

    public j(int i13, int i14) {
        this.f86942a = i13;
        this.f86943b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f86942a == jVar.f86942a && this.f86943b == jVar.f86943b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86943b) + (Integer.hashCode(this.f86942a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrackWidth(trackGroupIndex=");
        sb3.append(this.f86942a);
        sb3.append(", width=");
        return a.a.n(sb3, this.f86943b, ")");
    }
}
