package l0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f81191a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81192b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.i f81193c;

    public a(int i13, int i14, r4.i iVar) {
        this.f81191a = i13;
        this.f81192b = i14;
        this.f81193c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f81191a == aVar.f81191a && this.f81192b == aVar.f81192b && this.f81193c.equals(aVar.f81193c);
    }

    public final int hashCode() {
        return ((((this.f81191a ^ 1000003) * 1000003) ^ this.f81192b) * 1000003) ^ this.f81193c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f81191a + ", rotationDegrees=" + this.f81192b + ", completer=" + this.f81193c + "}";
    }
}
