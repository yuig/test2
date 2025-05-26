package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class am2 implements a.o8 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2439c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile a.o8 f2440a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2441b = f2439c;

    public am2(a.ca caVar) {
        this.f2440a = caVar;
    }

    public static a.o8 a(a.ca caVar) {
        return ((caVar instanceof am2) || (caVar instanceof u90)) ? caVar : new am2(caVar);
    }

    @Override // a.v7
    public final Object get() {
        Object obj = this.f2441b;
        if (obj != f2439c) {
            return obj;
        }
        a.o8 o8Var = this.f2440a;
        if (o8Var == null) {
            return this.f2441b;
        }
        Object obj2 = o8Var.get();
        this.f2441b = obj2;
        this.f2440a = null;
        return obj2;
    }
}
