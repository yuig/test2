package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mm2 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8292a;

    public mm2(a.o8 o8Var) {
        this.f8292a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        i92 resetPaidGmsgHandler = (i92) this.f8292a.get();
        Intrinsics.checkNotNullParameter(resetPaidGmsgHandler, "resetPaidGmsgHandler");
        return new hm2(resetPaidGmsgHandler);
    }
}
