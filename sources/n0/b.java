package n0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f88732d;

    public b(String str, String str2, String str3, String str4) {
        this.f88729a = str;
        this.f88730b = str2;
        this.f88731c = str3;
        this.f88732d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f88729a.equals(bVar.f88729a) && this.f88730b.equals(bVar.f88730b) && this.f88731c.equals(bVar.f88731c) && this.f88732d.equals(bVar.f88732d);
    }

    public final int hashCode() {
        return ((((((this.f88729a.hashCode() ^ 1000003) * 1000003) ^ this.f88730b.hashCode()) * 1000003) ^ this.f88731c.hashCode()) * 1000003) ^ this.f88732d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb3.append(this.f88729a);
        sb3.append(", eglVersion=");
        sb3.append(this.f88730b);
        sb3.append(", glExtensions=");
        sb3.append(this.f88731c);
        sb3.append(", eglExtensions=");
        return a.a.p(sb3, this.f88732d, "}");
    }
}
