package bf2;

/* loaded from: classes2.dex */
public final class e implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22751c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile d f22752a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f22753b;

    public static d a(d dVar) {
        if ((dVar instanceof e) || (dVar instanceof b)) {
            return dVar;
        }
        e eVar = new e();
        eVar.f22753b = f22751c;
        eVar.f22752a = dVar;
        return eVar;
    }

    @Override // wk2.a
    public final Object get() {
        Object obj = this.f22753b;
        if (obj != f22751c) {
            return obj;
        }
        d dVar = this.f22752a;
        if (dVar == null) {
            return this.f22753b;
        }
        Object obj2 = dVar.get();
        this.f22753b = obj2;
        this.f22752a = null;
        return obj2;
    }
}
