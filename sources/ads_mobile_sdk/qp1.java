package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qp1 extends yp0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f10217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(long j13, String userAgent, jp executor) {
        super(executor, new pp1(userAgent));
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f10217d = j13;
    }

    @Override // ads_mobile_sdk.yp0
    public final long a() {
        return this.f10217d;
    }
}
