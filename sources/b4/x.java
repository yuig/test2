package b4;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f21675c = new x(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21677b;

    public x() {
        this.f21676a = false;
        this.f21677b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f21676a == xVar.f21676a && this.f21677b == xVar.f21677b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21677b) + (Boolean.hashCode(this.f21676a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f21676a + ", emojiSupportMatch=" + ((Object) k.a(this.f21677b)) + ')';
    }

    public x(int i13, boolean z13) {
        this.f21676a = z13;
        this.f21677b = i13;
    }
}
