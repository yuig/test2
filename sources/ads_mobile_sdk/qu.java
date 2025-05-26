package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10283a;

    public qu(a.o8 o8Var) {
        this.f10283a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        p03 webviewFirebaseAnalyticsEventsHandler = (p03) this.f10283a.get();
        Intrinsics.checkNotNullParameter(webviewFirebaseAnalyticsEventsHandler, "webviewFirebaseAnalyticsEventsHandler");
        return new ot(webviewFirebaseAnalyticsEventsHandler);
    }
}
