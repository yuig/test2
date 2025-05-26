package ads_mobile_sdk;

import java.util.List;

/* loaded from: classes2.dex */
public final class pf2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f9667c = true;

    /* renamed from: a, reason: collision with root package name */
    public final List f9668a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9669b = a.l9.f(0);

    public pf2(int i13) {
        this.f9668a = a.l9.f(i13);
    }

    public final pf2 a(a.o8 o8Var) {
        if (!f9667c && o8Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        this.f9668a.add(o8Var);
        return this;
    }

    public final qf2 a() {
        boolean z13 = f9667c;
        if (!z13 && a.l9.d(this.f9668a)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (z13 || !a.l9.d(this.f9669b)) {
            return new qf2(this.f9668a, this.f9669b);
        }
        throw new AssertionError("Codegen error?  Duplicates in the provider list");
    }
}
