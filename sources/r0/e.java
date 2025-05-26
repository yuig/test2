package r0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m f105509a;

    /* renamed from: b, reason: collision with root package name */
    public final a f105510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105511c;

    public e(m mVar, a aVar, int i13) {
        this.f105509a = mVar;
        this.f105510b = aVar;
        this.f105511c = i13;
    }

    public static androidx.appcompat.app.d a() {
        androidx.appcompat.app.d dVar = new androidx.appcompat.app.d(7);
        dVar.f15968d = -1;
        dVar.f15967c = a.a().c();
        dVar.f15966b = m.a().a();
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f105509a.equals(eVar.f105509a) && this.f105510b.equals(eVar.f105510b) && this.f105511c == eVar.f105511c;
    }

    public final int hashCode() {
        return ((((this.f105509a.hashCode() ^ 1000003) * 1000003) ^ this.f105510b.hashCode()) * 1000003) ^ this.f105511c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MediaSpec{videoSpec=");
        sb3.append(this.f105509a);
        sb3.append(", audioSpec=");
        sb3.append(this.f105510b);
        sb3.append(", outputFormat=");
        return a.a.n(sb3, this.f105511c, "}");
    }
}
