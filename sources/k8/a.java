package k8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f78476a;

    /* renamed from: b, reason: collision with root package name */
    public final long f78477b;

    public a(long j13, long j14) {
        this.f78476a = j13;
        this.f78477b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f78476a == aVar.f78476a && this.f78477b == aVar.f78477b;
    }

    public final int hashCode() {
        return (((int) this.f78476a) * 31) + ((int) this.f78477b);
    }
}
