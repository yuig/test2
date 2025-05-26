package ads_mobile_sdk;

import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n52 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f8681a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f8682b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f8683c;

    public n52(xv0 xv0Var, xv0 xv0Var2, xv0 xv0Var3) {
        this.f8681a = xv0Var;
        this.f8682b = xv0Var2;
        this.f8683c = xv0Var3;
    }

    @Override // a.v7
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.f8681a.get();
        Optional internalRequestTraceMeta = (Optional) this.f8682b.get();
        Optional renderTraceMeta = (Optional) this.f8683c.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        return new ss2((o52) m2.T0(publisherRequestTraceMeta, new o52()), (v01) m2.T0(internalRequestTraceMeta, new v01()), (k72) m2.T0(renderTraceMeta, new k72()), new g5());
    }
}
