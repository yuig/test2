package a6;

/* loaded from: classes.dex */
public final class b extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f795b;

    public b(Object obj, int i13) {
        this.f794a = obj;
        this.f795b = i13;
    }

    public final void a() {
        Object obj = this.f794a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f795b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
