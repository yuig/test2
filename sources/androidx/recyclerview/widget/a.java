package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f19313a;

    /* renamed from: b, reason: collision with root package name */
    public int f19314b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19315c;

    /* renamed from: d, reason: collision with root package name */
    public int f19316d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i13 = this.f19313a;
        if (i13 != aVar.f19313a) {
            return false;
        }
        if (i13 == 8 && Math.abs(this.f19316d - this.f19314b) == 1 && this.f19316d == aVar.f19314b && this.f19314b == aVar.f19316d) {
            return true;
        }
        if (this.f19316d != aVar.f19316d || this.f19314b != aVar.f19314b) {
            return false;
        }
        Object obj2 = this.f19315c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f19315c)) {
                return false;
            }
        } else if (aVar.f19315c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f19313a * 31) + this.f19314b) * 31) + this.f19316d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("[");
        int i13 = this.f19313a;
        sb3.append(i13 != 1 ? i13 != 2 ? i13 != 4 ? i13 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb3.append(",s:");
        sb3.append(this.f19314b);
        sb3.append("c:");
        sb3.append(this.f19316d);
        sb3.append(",p:");
        sb3.append(this.f19315c);
        sb3.append("]");
        return sb3.toString();
    }
}
