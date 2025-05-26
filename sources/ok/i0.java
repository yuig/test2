package ok;

/* loaded from: classes.dex */
public final class i0 implements g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final m7.t f95430d = new m7.t(2);

    /* renamed from: a, reason: collision with root package name */
    public final Object f95431a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile g0 f95432b;

    /* renamed from: c, reason: collision with root package name */
    public Object f95433c;

    public i0(g0 g0Var) {
        this.f95432b = g0Var;
    }

    @Override // ok.g0
    public final Object get() {
        g0 g0Var = this.f95432b;
        m7.t tVar = f95430d;
        if (g0Var != tVar) {
            synchronized (this.f95431a) {
                try {
                    if (this.f95432b != tVar) {
                        Object obj = this.f95432b.get();
                        this.f95433c = obj;
                        this.f95432b = tVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f95433c;
    }

    public final String toString() {
        Object obj = this.f95432b;
        StringBuilder sb3 = new StringBuilder("Suppliers.memoize(");
        if (obj == f95430d) {
            obj = "<supplier that returned " + this.f95433c + ">";
        }
        sb3.append(obj);
        sb3.append(")");
        return sb3.toString();
    }
}
