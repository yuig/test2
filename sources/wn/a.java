package wn;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f130428a;

    /* renamed from: b, reason: collision with root package name */
    public final long f130429b;

    /* renamed from: c, reason: collision with root package name */
    public final List f130430c;

    public a(long j13, String str, List list) {
        this.f130428a = str;
        this.f130429b = j13;
        this.f130430c = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f130429b == aVar.f130429b && this.f130428a.equals(aVar.f130428a)) {
            return this.f130430c.equals(aVar.f130430c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f130428a.hashCode() * 31;
        long j13 = this.f130429b;
        return this.f130430c.hashCode() + ((hashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AccessTokenVerificationResult{channelId='");
        sb3.append(this.f130428a);
        sb3.append("', expiresInMillis=");
        sb3.append(this.f130429b);
        sb3.append(", scopes=");
        return d7.g.k(sb3, this.f130430c, '}');
    }
}
