package qd;

/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final dc.a f103542a;

    /* renamed from: b, reason: collision with root package name */
    public int f103543b;

    /* renamed from: c, reason: collision with root package name */
    public Class f103544c;

    public h(dc.a aVar) {
        this.f103542a = aVar;
    }

    @Override // qd.l
    public final void a() {
        this.f103542a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f103543b == hVar.f103543b && this.f103544c == hVar.f103544c;
    }

    public final int hashCode() {
        int i13 = this.f103543b * 31;
        Class cls = this.f103544c;
        return i13 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f103543b + "array=" + this.f103544c + '}';
    }
}
