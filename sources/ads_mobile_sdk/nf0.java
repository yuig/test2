package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class nf0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8764a;

    public nf0(a.o8 o8Var) {
        this.f8764a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        c2 adMetadataGmsgHandler = (c2) this.f8764a.get();
        Intrinsics.checkNotNullParameter(adMetadataGmsgHandler, "adMetadataGmsgHandler");
        return new pt(adMetadataGmsgHandler);
    }
}
