package kk;

/* loaded from: classes.dex */
public final class n implements o, m {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f79885c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile o f79886a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f79887b = f79885c;

    public n(o oVar) {
        this.f79886a = oVar;
    }

    public static m a(o oVar) {
        return oVar instanceof m ? (m) oVar : new n(oVar);
    }

    public static o b(o oVar) {
        return oVar instanceof n ? oVar : new n(oVar);
    }

    @Override // kk.o
    public final Object zza() {
        Object obj = this.f79887b;
        Object obj2 = f79885c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f79887b;
                    if (obj == obj2) {
                        obj = this.f79886a.zza();
                        Object obj3 = this.f79887b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f79887b = obj;
                        this.f79886a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
