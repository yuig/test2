package o7;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f93089d = new f().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93090a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93091b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93092c;

    public g(f fVar) {
        this.f93090a = fVar.f93046a;
        this.f93091b = fVar.f93047b;
        this.f93092c = fVar.f93048c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f93090a == gVar.f93090a && this.f93091b == gVar.f93091b && this.f93092c == gVar.f93092c;
    }

    public final int hashCode() {
        return ((this.f93090a ? 1 : 0) << 2) + ((this.f93091b ? 1 : 0) << 1) + (this.f93092c ? 1 : 0);
    }
}
