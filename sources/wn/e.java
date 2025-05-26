package wn;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f130435a;

    /* renamed from: b, reason: collision with root package name */
    public final long f130436b;

    /* renamed from: c, reason: collision with root package name */
    public final long f130437c;

    /* renamed from: d, reason: collision with root package name */
    public final String f130438d;

    public e(long j13, long j14, String str, String str2) {
        this.f130435a = str;
        this.f130436b = j13;
        this.f130437c = j14;
        this.f130438d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f130436b == eVar.f130436b && this.f130437c == eVar.f130437c && this.f130435a.equals(eVar.f130435a)) {
            return this.f130438d.equals(eVar.f130438d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f130435a.hashCode() * 31;
        long j13 = this.f130436b;
        int i13 = (hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f130437c;
        return this.f130438d.hashCode() + ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InternalAccessToken{accessToken='#####', expiresInMillis=");
        sb3.append(this.f130436b);
        sb3.append(", issuedClientTimeMillis=");
        return a.a.o(sb3, this.f130437c, ", refreshToken='#####'}");
    }
}
