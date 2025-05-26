package s80;

/* loaded from: classes5.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111572a;

    /* renamed from: b, reason: collision with root package name */
    public final float f111573b;

    /* renamed from: c, reason: collision with root package name */
    public final float f111574c;

    public i(float f13, float f14, boolean z13) {
        this.f111572a = z13;
        this.f111573b = f13;
        this.f111574c = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f111572a == iVar.f111572a && Float.compare(this.f111573b, iVar.f111573b) == 0 && Float.compare(this.f111574c, iVar.f111574c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111574c) + a.a.a(this.f111573b, Boolean.hashCode(this.f111572a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClipboardPopupDisplayState(isVisible=");
        sb3.append(this.f111572a);
        sb3.append(", locationX=");
        sb3.append(this.f111573b);
        sb3.append(", locationY=");
        return d7.g.i(sb3, this.f111574c, ")");
    }
}
