package on2;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f96782a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96783b;

    public p(Object obj, boolean z13) {
        this.f96782a = obj;
        this.f96783b = z13;
    }

    public static p c(Object obj) {
        return new p(obj, false);
    }

    public final Object a() {
        return this.f96782a;
    }

    public final boolean b() {
        return this.f96783b;
    }

    public final String toString() {
        return this.f96783b ? "FALL_THROUGH" : String.valueOf(this.f96782a);
    }
}
