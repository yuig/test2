package ads_mobile_sdk;

import ao2.j0;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j31 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f6664a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f6665b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f6666c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f6667d;

    public j31(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4) {
        this.f6664a = o8Var;
        this.f6665b = o8Var2;
        this.f6666c = o8Var3;
        this.f6667d = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        sb2 rootTraceCreator = (sb2) this.f6664a.get();
        cm0 gmaUtil = (cm0) this.f6665b.get();
        j0 backgroundScope = (j0) this.f6666c.get();
        oh0 flags = (oh0) this.f6667d.get();
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new a.j5(rootTraceCreator, c3.d(), gmaUtil, backgroundScope, flags);
    }
}
