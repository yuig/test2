package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class l6 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7691a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f7692b;

    public l6(a.o8 o8Var, a.o8 o8Var2) {
        this.f7691a = o8Var;
        this.f7692b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new k6((Optional) this.f7692b.get(), (j0) this.f7691a.get());
    }
}
