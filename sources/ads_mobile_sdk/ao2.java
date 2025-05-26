package ads_mobile_sdk;

import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ao2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2459a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f2460b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f2461c;

    public ao2(a.o8 o8Var, xv0 xv0Var, a.o8 o8Var2) {
        this.f2459a = o8Var;
        this.f2460b = xv0Var;
        this.f2461c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        File file = (File) this.f2459a.get();
        ExecutorService executorService = (ExecutorService) this.f2460b.get();
        bt2 bt2Var = (bt2) this.f2461c.get();
        byte[] defaultBytes = new byte[0];
        Intrinsics.checkNotNullParameter(defaultBytes, "defaultBytes");
        return new v50(file, new p50(defaultBytes), new b6.a(new a.yb(bt2Var, 2)), executorService);
    }
}
