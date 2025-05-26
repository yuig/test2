package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class of0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9239a;

    public of0(a.o8 o8Var) {
        this.f9239a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ba2 rewardGmsgHandler = (ba2) this.f9239a.get();
        Intrinsics.checkNotNullParameter(rewardGmsgHandler, "rewardGmsgHandler");
        return new pt(rewardGmsgHandler);
    }
}
