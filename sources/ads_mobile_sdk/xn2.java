package ads_mobile_sdk;

import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xn2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13734a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13735b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f13736c;

    public xn2(a.o8 o8Var, xv0 xv0Var, a.o8 o8Var2) {
        this.f13734a = o8Var;
        this.f13735b = xv0Var;
        this.f13736c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        File file = (File) this.f13734a.get();
        ExecutorService executorService = (ExecutorService) this.f13735b.get();
        bt2 bt2Var = (bt2) this.f13736c.get();
        byte[] defaultBytes = new byte[0];
        Intrinsics.checkNotNullParameter(defaultBytes, "defaultBytes");
        return new v50(file, new p50(defaultBytes), new b6.a(new a.yb(bt2Var, 1)), executorService);
    }
}
