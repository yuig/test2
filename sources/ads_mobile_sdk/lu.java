package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class lu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f7963a;

    public lu(q70 q70Var) {
        this.f7963a = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        n1 adEventEmitter = (n1) this.f7963a.get();
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        return new at(adEventEmitter);
    }
}
