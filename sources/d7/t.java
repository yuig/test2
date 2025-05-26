package d7;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f53885a;

    /* renamed from: b, reason: collision with root package name */
    public a7.o f53886b = new a7.o(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f53887c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f53888d;

    public t(Object obj) {
        this.f53885a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return this.f53885a.equals(((t) obj).f53885a);
    }

    public final int hashCode() {
        return this.f53885a.hashCode();
    }
}
