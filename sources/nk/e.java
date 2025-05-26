package nk;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f91077c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile g f91078a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f91079b;

    public static g b(f fVar) {
        if (fVar instanceof e) {
            return fVar;
        }
        e eVar = new e();
        eVar.f91079b = f91077c;
        eVar.f91078a = fVar;
        return eVar;
    }

    @Override // nk.g
    public final Object a() {
        Object obj = this.f91079b;
        Object obj2 = f91077c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f91079b;
                    if (obj == obj2) {
                        obj = this.f91078a.a();
                        Object obj3 = this.f91079b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f91079b = obj;
                        this.f91078a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
