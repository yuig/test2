package s80;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111564b;

    public h(boolean z13, boolean z14) {
        this.f111563a = z13;
        this.f111564b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f111563a == hVar.f111563a && this.f111564b == hVar.f111564b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111564b) + (Boolean.hashCode(this.f111563a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CanvasDisplayState(showOverlayTint=");
        sb3.append(this.f111563a);
        sb3.append(", showBorderInDarkMode=");
        return a.a.r(sb3, this.f111564b, ")");
    }
}
