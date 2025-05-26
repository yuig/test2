package a7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f1147e;

    /* renamed from: a, reason: collision with root package name */
    public final int f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1150c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1151d;

    static {
        m mVar = new m();
        bf.b.i(mVar.f1144b <= mVar.f1145c);
        f1147e = new n(mVar);
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
        d7.n0.Q(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(m mVar) {
        this.f1148a = mVar.f1143a;
        this.f1149b = mVar.f1144b;
        this.f1150c = mVar.f1145c;
        this.f1151d = (String) mVar.f1146d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1148a == nVar.f1148a && this.f1149b == nVar.f1149b && this.f1150c == nVar.f1150c && Objects.equals(this.f1151d, nVar.f1151d);
    }

    public final int hashCode() {
        int i13 = (((((527 + this.f1148a) * 31) + this.f1149b) * 31) + this.f1150c) * 31;
        String str = this.f1151d;
        return i13 + (str == null ? 0 : str.hashCode());
    }
}
