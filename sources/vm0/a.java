package vm0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f126198a;

    /* renamed from: b, reason: collision with root package name */
    public final float f126199b;

    /* renamed from: c, reason: collision with root package name */
    public final long f126200c;

    /* renamed from: d, reason: collision with root package name */
    public final long f126201d;

    public a(float f13, float f14, long j13, long j14) {
        this.f126198a = f13;
        this.f126199b = f14;
        this.f126200c = j13;
        this.f126201d = j14;
    }

    public static a a(float f13) {
        return new a(0.0f, f13, 300L, 400L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f126198a, aVar.f126198a) == 0 && Float.compare(this.f126199b, aVar.f126199b) == 0 && this.f126200c == aVar.f126200c && this.f126201d == aVar.f126201d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126201d) + a.a.c(this.f126200c, a.a.a(this.f126199b, Float.hashCode(this.f126198a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardToolsAnimationSpec(offsetWhenShown=");
        sb3.append(this.f126198a);
        sb3.append(", offsetWhenHidden=");
        sb3.append(this.f126199b);
        sb3.append(", duration=");
        sb3.append(this.f126200c);
        sb3.append(", autoDisplayDelay=");
        return a.a.o(sb3, this.f126201d, ")");
    }
}
