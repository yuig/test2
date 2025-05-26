package pd;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements nd.h {

    /* renamed from: b, reason: collision with root package name */
    public final nd.h f99655b;

    /* renamed from: c, reason: collision with root package name */
    public final nd.h f99656c;

    public f(nd.h hVar, nd.h hVar2) {
        this.f99655b = hVar;
        this.f99656c = hVar2;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        this.f99655b.a(messageDigest);
        this.f99656c.a(messageDigest);
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f99655b.equals(fVar.f99655b) && this.f99656c.equals(fVar.f99656c);
    }

    @Override // nd.h
    public final int hashCode() {
        return this.f99656c.hashCode() + (this.f99655b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f99655b + ", signature=" + this.f99656c + '}';
    }
}
