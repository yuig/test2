package ads_mobile_sdk;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class e4 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f4596a;

    public e4(a.o8 o8Var) {
        this.f4596a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        com.google.common.util.concurrent.d0 j13 = df.j1.j1((ExecutorService) this.f4596a.get());
        kh2.a1.p(j13);
        return j13;
    }
}
