package ads_mobile_sdk;

import ao2.j0;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zj1 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f14800a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f14801b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f14802c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f14803d;

    public zj1(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, a.o8 o8Var4) {
        this.f14800a = o8Var;
        this.f14801b = o8Var2;
        this.f14802c = o8Var3;
        this.f14803d = o8Var4;
    }

    @Override // a.v7
    public final Object get() {
        sb2 rootTraceCreator = (sb2) this.f14800a.get();
        cm0 gmaUtil = (cm0) this.f14801b.get();
        j0 backgroundScope = (j0) this.f14802c.get();
        oh0 flags = (oh0) this.f14803d.get();
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new a.kg(rootTraceCreator, c3.d(), gmaUtil, backgroundScope, flags);
    }
}
