package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tu0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11697a;

    public tu0(a.o8 o8Var) {
        this.f11697a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ag2 shareSheetGmsgHandler = (ag2) this.f11697a.get();
        Intrinsics.checkNotNullParameter(shareSheetGmsgHandler, "shareSheetGmsgHandler");
        return new ou0(shareSheetGmsgHandler);
    }
}
