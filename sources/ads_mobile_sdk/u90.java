package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class u90 implements a.o8, a.n5 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11887c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f11888d = true;

    /* renamed from: a, reason: collision with root package name */
    public volatile a.o8 f11889a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11890b = f11887c;

    public u90(a.o8 o8Var) {
        if (!f11888d && o8Var == null) {
            throw new AssertionError();
        }
        this.f11889a = o8Var;
    }

    public static a.n5 a(a.o8 o8Var) {
        if (o8Var instanceof a.n5) {
            return (a.n5) o8Var;
        }
        o8Var.getClass();
        return new u90(o8Var);
    }

    @Override // a.v7
    public final Object get() {
        Object obj = this.f11890b;
        Object obj2 = f11887c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f11890b;
                    if (obj == obj2) {
                        obj = this.f11889a.get();
                        Object obj3 = this.f11890b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f11890b = obj;
                        this.f11889a = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return obj;
    }
}
