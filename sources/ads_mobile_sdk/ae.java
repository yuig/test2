package ads_mobile_sdk;

import a.rd;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ae implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f2373a;

    public ae(a.o8 o8Var) {
        this.f2373a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        rd appOpenAdRenderer = (rd) this.f2373a.get();
        Intrinsics.checkNotNullParameter(appOpenAdRenderer, "appOpenAdRenderer");
        kh2.a1.p(appOpenAdRenderer);
        return appOpenAdRenderer;
    }
}
