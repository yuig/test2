package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class de1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4247a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f4248b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f4249c;

    public de1(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3) {
        this.f4247a = o8Var;
        this.f4248b = o8Var2;
        this.f4249c = o8Var3;
    }

    @Override // a.v7
    public final Object get() {
        return new ce1((ub1) this.f4247a.get(), (Optional) this.f4248b.get(), (j0) this.f4249c.get());
    }
}
