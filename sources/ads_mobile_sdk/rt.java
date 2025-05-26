package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rt implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10775a;

    public rt(a.o8 o8Var) {
        this.f10775a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        ed appEventGmsgHandler = (ed) this.f10775a.get();
        Intrinsics.checkNotNullParameter(appEventGmsgHandler, "appEventGmsgHandler");
        return new pt(appEventGmsgHandler);
    }
}
