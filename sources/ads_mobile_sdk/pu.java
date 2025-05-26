package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9814a;

    public pu(a.o8 o8Var) {
        this.f9814a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        xz2 webViewInputEventStore = (xz2) this.f9814a.get();
        Intrinsics.checkNotNullParameter(webViewInputEventStore, "webViewInputEventStore");
        return new lt(webViewInputEventStore);
    }
}
