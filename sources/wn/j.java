package wn;

import a.cb;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f130457a;

    /* renamed from: b, reason: collision with root package name */
    public final long f130458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f130459c;

    /* renamed from: d, reason: collision with root package name */
    public final List f130460d;

    public j(String str, long j13, String str2, List list) {
        this.f130457a = str;
        this.f130458b = j13;
        this.f130459c = str2;
        this.f130460d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f130458b == jVar.f130458b && this.f130457a.equals(jVar.f130457a) && this.f130459c.equals(jVar.f130459c)) {
            return this.f130460d.equals(jVar.f130460d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f130457a.hashCode() * 31;
        long j13 = this.f130458b;
        return this.f130460d.hashCode() + cb.d(this.f130459c, (hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RefreshTokenResult{accessToken='#####', expiresInMillis=");
        sb3.append(this.f130458b);
        sb3.append(", refreshToken='#####', scopes=");
        return d7.g.k(sb3, this.f130460d, '}');
    }
}
