package a;

import ads_mobile_sdk.oh0;
import ads_mobile_sdk.ts2;
import ads_mobile_sdk.y72;
import ads_mobile_sdk.yp0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yd extends y72 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(o8 consentManagerProvider, yp0 httpClient, oh0 flags) {
        super(consentManagerProvider, httpClient, flags);
        Intrinsics.checkNotNullParameter(consentManagerProvider, "consentManagerProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
    }

    @Override // ads_mobile_sdk.y72
    public final long a() {
        oh0 oh0Var = this.f14127c;
        oh0Var.getClass();
        zn2.a aVar = zn2.b.f142311b;
        return oh0Var.a(dl2.b.P2(5, zn2.d.MINUTES), "gads:cui_monitoring_interval_ms");
    }

    @Override // ads_mobile_sdk.y72
    public final Object a(bl2.c cVar) {
        Object O = dl2.b.O(new ts2(this, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }
}
