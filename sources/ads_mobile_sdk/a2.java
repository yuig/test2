package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2203a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f2204b;

    public a2(a.o8 o8Var, v81 v81Var) {
        this.f2203a = o8Var;
        this.f2204b = v81Var;
    }

    @Override // a.v7
    public final Object get() {
        return new a.rg((j0) this.f2203a.get(), (Map) this.f2204b.get());
    }
}
