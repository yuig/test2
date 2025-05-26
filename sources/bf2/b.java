package bf2;

/* loaded from: classes2.dex */
public final class b implements d, se2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22747c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile d f22748a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f22749b = f22747c;

    public b(d dVar) {
        this.f22748a = dVar;
    }

    public static se2.a a(d dVar) {
        if (dVar instanceof se2.a) {
            return (se2.a) dVar;
        }
        dVar.getClass();
        return new b(dVar);
    }

    public static d b(d dVar) {
        dVar.getClass();
        return dVar instanceof b ? dVar : new b(dVar);
    }

    @Override // wk2.a
    public final Object get() {
        Object obj = this.f22749b;
        Object obj2 = f22747c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f22749b;
                    if (obj == obj2) {
                        obj = this.f22748a.get();
                        Object obj3 = this.f22749b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f22749b = obj;
                        this.f22748a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
