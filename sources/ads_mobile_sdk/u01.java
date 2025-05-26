package ads_mobile_sdk;

import java.util.Optional;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f11782a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f11783b;

    public u01(a.o8 o8Var, a.o8 o8Var2) {
        this.f11782a = o8Var;
        this.f11783b = o8Var2;
    }

    @Override // a.v7
    public final Object get() {
        Optional publisherRequestTraceMeta = (Optional) this.f11782a.get();
        Optional internalRequestTraceMeta = (Optional) this.f11783b.get();
        Intrinsics.checkNotNullParameter(publisherRequestTraceMeta, "publisherRequestTraceMeta");
        Intrinsics.checkNotNullParameter(internalRequestTraceMeta, "internalRequestTraceMeta");
        return new ss2((o52) m2.T0(publisherRequestTraceMeta, new o52()), (v01) m2.T0(internalRequestTraceMeta, new v01()), new k72(), new g5());
    }
}
