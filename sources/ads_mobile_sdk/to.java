package ads_mobile_sdk;

import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class to implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11611a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11612b;

    /* renamed from: c, reason: collision with root package name */
    public final a.o8 f11613c;

    /* renamed from: d, reason: collision with root package name */
    public final a.o8 f11614d;

    public to(a.o8 o8Var, a.o8 o8Var2, a.o8 o8Var3, e40 e40Var) {
        this.f11611a = o8Var;
        this.f11612b = o8Var2;
        this.f11613c = o8Var3;
        this.f11614d = e40Var;
    }

    @Override // a.v7
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.f11611a.get();
        Optional internalRequestTraceMeta = (Optional) this.f11612b.get();
        Optional renderTraceMeta = (Optional) this.f11613c.get();
        Optional adTraceMeta = (Optional) this.f11614d.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        Intrinsics.checkNotNullParameter(renderTraceMeta, "renderTraceMeta");
        Intrinsics.checkNotNullParameter(adTraceMeta, "adTraceMeta");
        return new ss2((o52) m2.T0(publisherRequestTraceMeta, new o52()), (v01) m2.T0(internalRequestTraceMeta, new v01()), (k72) m2.T0(renderTraceMeta, new k72()), (g5) m2.T0(adTraceMeta, new g5()));
    }
}
