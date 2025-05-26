package ng;

/* loaded from: classes.dex */
public final class a implements wk2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f90517c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile wk2.a f90518a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f90519b;

    public static wk2.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f90519b = f90517c;
        aVar.f90518a = bVar;
        return aVar;
    }

    @Override // wk2.a
    public final Object get() {
        Object obj = this.f90519b;
        Object obj2 = f90517c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f90519b;
                    if (obj == obj2) {
                        obj = this.f90518a.get();
                        Object obj3 = this.f90519b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f90519b = obj;
                        this.f90518a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
