package x02;

/* loaded from: classes4.dex */
public final class q2 extends t2 {

    /* renamed from: f, reason: collision with root package name */
    public final String f131470f;

    public q2(String str) {
        super(2);
        this.f131470f = str;
    }

    @Override // x02.t1
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            if (this.f131470f.equals(((q2) obj).f131470f)) {
                return true;
            }
        }
        return false;
    }

    @Override // x02.t1
    public final int hashCode() {
        return this.f131470f.hashCode() + (super.hashCode() * 31);
    }

    public q2(String str, int i13) {
        super(2, str);
        this.f131470f = "";
    }
}
