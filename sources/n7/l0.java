package n7;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f89477a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89478b;

    public l0(b bVar, int i13) {
        this.f89477a = bVar;
        this.f89478b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f89478b != l0Var.f89478b) {
            return false;
        }
        return this.f89477a.equals(l0Var.f89477a);
    }

    public final int hashCode() {
        return (this.f89477a.hashCode() * 31) + this.f89478b;
    }
}
