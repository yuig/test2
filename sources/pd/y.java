package pd;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements nd.h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f99792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f99793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99794d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f99795e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f99796f;

    /* renamed from: g, reason: collision with root package name */
    public final nd.h f99797g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f99798h;

    /* renamed from: i, reason: collision with root package name */
    public final nd.l f99799i;

    /* renamed from: j, reason: collision with root package name */
    public int f99800j;

    public y(Object obj, nd.h hVar, int i13, int i14, he.d dVar, Class cls, Class cls2, nd.l lVar) {
        d7.b.p(obj, "Argument must not be null");
        this.f99792b = obj;
        d7.b.p(hVar, "Signature must not be null");
        this.f99797g = hVar;
        this.f99793c = i13;
        this.f99794d = i14;
        d7.b.p(dVar, "Argument must not be null");
        this.f99798h = dVar;
        d7.b.p(cls, "Resource class must not be null");
        this.f99795e = cls;
        d7.b.p(cls2, "Transcode class must not be null");
        this.f99796f = cls2;
        d7.b.p(lVar, "Argument must not be null");
        this.f99799i = lVar;
    }

    @Override // nd.h
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // nd.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f99792b.equals(yVar.f99792b) && this.f99797g.equals(yVar.f99797g) && this.f99794d == yVar.f99794d && this.f99793c == yVar.f99793c && this.f99798h.equals(yVar.f99798h) && this.f99795e.equals(yVar.f99795e) && this.f99796f.equals(yVar.f99796f) && this.f99799i.equals(yVar.f99799i);
    }

    @Override // nd.h
    public final int hashCode() {
        if (this.f99800j == 0) {
            int hashCode = this.f99792b.hashCode();
            this.f99800j = hashCode;
            int hashCode2 = ((((this.f99797g.hashCode() + (hashCode * 31)) * 31) + this.f99793c) * 31) + this.f99794d;
            this.f99800j = hashCode2;
            int hashCode3 = this.f99798h.hashCode() + (hashCode2 * 31);
            this.f99800j = hashCode3;
            int hashCode4 = this.f99795e.hashCode() + (hashCode3 * 31);
            this.f99800j = hashCode4;
            int hashCode5 = this.f99796f.hashCode() + (hashCode4 * 31);
            this.f99800j = hashCode5;
            this.f99800j = this.f99799i.f90422b.hashCode() + (hashCode5 * 31);
        }
        return this.f99800j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f99792b + ", width=" + this.f99793c + ", height=" + this.f99794d + ", resourceClass=" + this.f99795e + ", transcodeClass=" + this.f99796f + ", signature=" + this.f99797g + ", hashCode=" + this.f99800j + ", transformations=" + this.f99798h + ", options=" + this.f99799i + '}';
    }
}
