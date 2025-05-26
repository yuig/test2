package s80;

/* loaded from: classes5.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111786a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111787b;

    public s(boolean z13, boolean z14) {
        this.f111786a = z13;
        this.f111787b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f111786a == sVar.f111786a && this.f111787b == sVar.f111787b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111787b) + (Boolean.hashCode(this.f111786a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HistoryUpdated(canUndo=");
        sb3.append(this.f111786a);
        sb3.append(", canRedo=");
        return a.a.r(sb3, this.f111787b, ")");
    }
}
