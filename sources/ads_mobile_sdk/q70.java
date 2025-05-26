package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class q70 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public a.o8 f9970a;

    public static void a(a.o8 o8Var, a.o8 o8Var2) {
        q70 q70Var = (q70) o8Var;
        if (q70Var.f9970a != null) {
            throw new IllegalStateException();
        }
        q70Var.f9970a = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        a.o8 o8Var = this.f9970a;
        if (o8Var != null) {
            return o8Var.get();
        }
        throw new IllegalStateException();
    }
}
