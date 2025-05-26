package x02;

/* loaded from: classes4.dex */
public final class r2 extends t2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f131478f;

    public r2(String str) {
        super(3);
        this.f131478f = str;
    }

    @Override // x02.t1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.f131478f.equals(((r2) obj).f131478f);
    }

    @Override // x02.t1
    public final int hashCode() {
        return this.f131478f.hashCode() + (super.hashCode() * 31);
    }

    public r2(String str, int i13) {
        super(3, str);
        this.f131478f = "";
    }
}
