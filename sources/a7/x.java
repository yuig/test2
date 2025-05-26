package a7;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final long f1235a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1237c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1238d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1239e;

    static {
        new x(new w());
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
        d7.n0.Q(3);
        d7.n0.Q(4);
        d7.n0.Q(5);
        d7.n0.Q(6);
    }

    public x(w wVar) {
        long j13 = wVar.f1230a;
        int i13 = d7.n0.f53866a;
        long j14 = wVar.f1231b;
        this.f1235a = j13;
        this.f1236b = j14;
        this.f1237c = wVar.f1232c;
        this.f1238d = wVar.f1233d;
        this.f1239e = wVar.f1234e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f1235a == xVar.f1235a && this.f1236b == xVar.f1236b && this.f1237c == xVar.f1237c && this.f1238d == xVar.f1238d && this.f1239e == xVar.f1239e;
    }

    public final int hashCode() {
        long j13 = this.f1235a;
        int i13 = ((int) (j13 ^ (j13 >>> 32))) * 31;
        long j14 = this.f1236b;
        return ((((((i13 + ((int) ((j14 >>> 32) ^ j14))) * 31) + (this.f1237c ? 1 : 0)) * 31) + (this.f1238d ? 1 : 0)) * 31) + (this.f1239e ? 1 : 0);
    }
}
