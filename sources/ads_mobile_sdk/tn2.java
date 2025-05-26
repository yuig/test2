package ads_mobile_sdk;

import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tn2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11608a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11609b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f11610c;

    public tn2(a.o8 o8Var, xv0 xv0Var, a.o8 o8Var2) {
        this.f11608a = o8Var;
        this.f11609b = xv0Var;
        this.f11610c = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        File file = (File) this.f11608a.get();
        ExecutorService executorService = (ExecutorService) this.f11609b.get();
        bt2 bt2Var = (bt2) this.f11610c.get();
        x12 defaultProto = x12.s();
        Intrinsics.checkNotNullParameter(defaultProto, "defaultProto");
        return new v50(file, new q50(defaultProto), new b6.a(new a.yb(bt2Var, 0)), executorService);
    }
}
