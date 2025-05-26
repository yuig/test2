package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nu implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8991a;

    public nu(a.o8 o8Var) {
        this.f8991a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ed2 safeBrowsingManager = (ed2) this.f8991a.get();
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        return new gt(safeBrowsingManager);
    }
}
