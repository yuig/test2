package o62;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final f f92982f = new f(-1);

    /* renamed from: a, reason: collision with root package name */
    public final int f92983a;

    /* renamed from: b, reason: collision with root package name */
    public int f92984b;

    /* renamed from: c, reason: collision with root package name */
    public int f92985c;

    /* renamed from: d, reason: collision with root package name */
    public float f92986d;

    /* renamed from: e, reason: collision with root package name */
    public float f92987e = -1.0f;

    public f(int i13) {
        this.f92983a = i13;
        this.f92984b = i13;
        this.f92985c = i13;
        this.f92986d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f92983a == ((f) obj).f92983a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92983a);
    }

    public final String toString() {
        int i13 = this.f92984b;
        int i14 = this.f92985c;
        StringBuilder sb3 = new StringBuilder("ZIndexState(itemIndex=");
        a.a.z(sb3, this.f92983a, ", currentIndex=", i13, ", previousIndex=");
        return a.a.n(sb3, i14, ")");
    }
}
