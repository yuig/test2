package n7;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f89466a;

    /* renamed from: b, reason: collision with root package name */
    public final Exception f89467b;

    public j0(b bVar, Exception exc) {
        this.f89466a = bVar;
        this.f89467b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f89466a.equals(j0Var.f89466a)) {
            return this.f89467b.equals(j0Var.f89467b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f89467b.hashCode() + (this.f89466a.hashCode() * 31);
    }
}
