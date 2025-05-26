package x02;

/* loaded from: classes4.dex */
public abstract class t1 extends dl1.m {

    /* renamed from: c, reason: collision with root package name */
    public final int f131491c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131492d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131493e;

    public t1(int i13) {
        this.f131491c = i13;
        this.f131492d = 0;
        this.f131493e = "";
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t1) {
                t1 t1Var = (t1) obj;
                if (this.f131491c != t1Var.f131491c || this.f131492d != t1Var.f131492d || !this.f131493e.equals(t1Var.f131493e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f131493e.hashCode() + ((((527 + this.f131491c) * 31) + this.f131492d) * 31);
    }

    public t1(int i13, String str) {
        this.f131491c = i13;
        this.f131492d = 1;
        this.f131493e = str;
    }
}
