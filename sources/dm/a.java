package dm;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f55301a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55302b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55303c;

    public a(String str, long j13, long j14) {
        this.f55301a = str;
        this.f55302b = j13;
        this.f55303c = j14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f55301a.equals(aVar.f55301a) && this.f55302b == aVar.f55302b && this.f55303c == aVar.f55303c;
    }

    public final int hashCode() {
        int hashCode = (this.f55301a.hashCode() ^ 1000003) * 1000003;
        long j13 = this.f55302b;
        long j14 = this.f55303c;
        return ((hashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InstallationTokenResult{token=");
        sb3.append(this.f55301a);
        sb3.append(", tokenExpirationTimestamp=");
        sb3.append(this.f55302b);
        sb3.append(", tokenCreationTimestamp=");
        return a.a.o(sb3, this.f55303c, "}");
    }
}
