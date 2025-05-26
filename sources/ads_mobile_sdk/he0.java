package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class he0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f5938a;

    public he0(a.o8 o8Var) {
        this.f5938a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        a.r1 backButtonGmsgHandler = (a.r1) this.f5938a.get();
        Intrinsics.checkNotNullParameter(backButtonGmsgHandler, "backButtonGmsgHandler");
        return new pt(backButtonGmsgHandler);
    }
}
