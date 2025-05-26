package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class uu0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12193a;

    public uu0(a.o8 o8Var) {
        this.f12193a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        vv0 inspectorStorageGmsgHandler = (vv0) this.f12193a.get();
        Intrinsics.checkNotNullParameter(inspectorStorageGmsgHandler, "inspectorStorageGmsgHandler");
        return new ou0(inspectorStorageGmsgHandler);
    }
}
