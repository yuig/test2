package ig;

import im.e;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f72238a;

    /* renamed from: b, reason: collision with root package name */
    public final c f72239b;

    public a(e eVar, c cVar) {
        this.f72238a = eVar;
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f72239b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return this.f72238a.equals(aVar.f72238a) && this.f72239b.equals(aVar.f72239b);
    }

    public final int hashCode() {
        return this.f72239b.hashCode() ^ (((1000003 * 1000003) ^ this.f72238a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f72238a + ", priority=" + this.f72239b + "}";
    }
}
