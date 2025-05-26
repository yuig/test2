package ads_mobile_sdk;

import a.q2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zp0 extends yp0 {

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f14849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(oh0 flags, jp executor, q2 userAgentProvider) {
        super(executor, userAgentProvider);
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.f14849d = flags;
    }

    @Override // ads_mobile_sdk.yp0
    public final long a() {
        oh0 oh0Var = this.f14849d;
        oh0Var.getClass();
        zn2.a aVar = zn2.b.f142311b;
        return oh0Var.a(dl2.b.P2(20, zn2.d.SECONDS), "gads:http_url_connection_factory:timeout_millis");
    }
}
