package ads_mobile_sdk;

import ao2.j0;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class j03 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6596a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6597b;

    public j03(a.o8 o8Var, a.o8 o8Var2) {
        this.f6596a = o8Var;
        this.f6597b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        return new i03((Optional) this.f6596a.get(), (j0) this.f6597b.get());
    }
}
