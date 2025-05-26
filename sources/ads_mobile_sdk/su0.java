package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class su0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11242a;

    public su0(a.o8 o8Var) {
        this.f11242a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        yl2 singleAdSourceTestingGmsgHandler = (yl2) this.f11242a.get();
        Intrinsics.checkNotNullParameter(singleAdSourceTestingGmsgHandler, "singleAdSourceTestingGmsgHandler");
        return new ou0(singleAdSourceTestingGmsgHandler);
    }
}
