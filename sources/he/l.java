package he;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Class f68955a;

    /* renamed from: b, reason: collision with root package name */
    public Class f68956b;

    /* renamed from: c, reason: collision with root package name */
    public Class f68957c;

    public l(Class cls, Class cls2, Class cls3) {
        this.f68955a = cls;
        this.f68956b = cls2;
        this.f68957c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f68955a.equals(lVar.f68955a) && this.f68956b.equals(lVar.f68956b) && n.b(this.f68957c, lVar.f68957c);
    }

    public final int hashCode() {
        int hashCode = (this.f68956b.hashCode() + (this.f68955a.hashCode() * 31)) * 31;
        Class cls = this.f68957c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f68955a + ", second=" + this.f68956b + '}';
    }
}
