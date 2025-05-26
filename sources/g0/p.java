package g0;

/* loaded from: classes2.dex */
public final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    public static final p f63216b = new p(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f63217a;

    public p(Object obj) {
        this.f63217a = obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f63217a;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f63217a + "]]";
    }
}
