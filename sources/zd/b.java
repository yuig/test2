package zd;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f141656a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f141657b;

    /* renamed from: c, reason: collision with root package name */
    public final a f141658c;

    public b(Class cls, Class cls2, a aVar) {
        this.f141656a = cls;
        this.f141657b = cls2;
        this.f141658c = aVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.f141656a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f141657b);
    }
}
