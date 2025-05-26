package x02;

/* loaded from: classes4.dex */
public final class s2 extends t2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f131485f;

    public s2(String str) {
        super(1);
        this.f131485f = str;
    }

    @Override // x02.t1
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            if (this.f131485f.equals(((s2) obj).f131485f)) {
                return true;
            }
        }
        return false;
    }

    @Override // x02.t1
    public final int hashCode() {
        return this.f131485f.hashCode() + (super.hashCode() * 31);
    }

    public s2(String str, int i13) {
        super(1, str);
        this.f131485f = "";
    }
}
