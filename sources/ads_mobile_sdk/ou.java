package ads_mobile_sdk;

import a.c9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ou implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f9439a;

    public ou(a.o8 o8Var) {
        this.f9439a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        c9 viewabilityMonitor = (c9) this.f9439a.get();
        Intrinsics.checkNotNullParameter(viewabilityMonitor, "viewabilityMonitor");
        return new ht(viewabilityMonitor);
    }
}
