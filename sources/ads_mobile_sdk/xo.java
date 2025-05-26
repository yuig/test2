package ads_mobile_sdk;

import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xo implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f13737a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f13738b;

    public xo(a.o8 o8Var, e40 e40Var) {
        this.f13737a = o8Var;
        this.f13738b = e40Var;
    }

    @Override // a.v7
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.f13737a.get();
        Optional internalRequestTraceMeta = (Optional) this.f13738b.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        return new ss2((o52) m2.T0(publisherRequestTraceMeta, new o52()), (v01) m2.T0(internalRequestTraceMeta, new v01()), new k72(), new g5());
    }
}
