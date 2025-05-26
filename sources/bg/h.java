package bg;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final l f22772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22773b;

    public h(l lVar, String str) {
        this.f22772a = lVar;
        this.f22773b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f22772a.equals(hVar.f22772a) && this.f22773b.equals(hVar.f22773b);
    }

    public final int hashCode() {
        return this.f22773b.hashCode() + (this.f22772a.hashCode() * 31);
    }
}
