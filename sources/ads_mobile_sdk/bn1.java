package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class bn1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f3536b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f3537c;

    public bn1(a.o8 o8Var, e40 e40Var, a.o8 o8Var2) {
        this.f3535a = o8Var;
        this.f3536b = e40Var;
        this.f3537c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new an1((ub1) this.f3535a.get(), (Optional) this.f3536b.get(), (j0) this.f3537c.get());
    }
}
