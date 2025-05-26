package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9095a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f9096b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f9097c;

    public o1(a.o8 o8Var, v81 v81Var, xv0 xv0Var) {
        this.f9095a = o8Var;
        this.f9096b = v81Var;
        this.f9097c = xv0Var;
    }

    @Override // a.v7
    public final Object get() {
        return new n1((j0) this.f9095a.get(), (Map) this.f9096b.get(), (r0) this.f9097c.get());
    }
}
