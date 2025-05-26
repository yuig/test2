package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cc0 extends y72 {

    /* renamed from: k, reason: collision with root package name */
    public long f3861k;

    /* renamed from: l, reason: collision with root package name */
    public long f3862l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(a.o8 consentManagerProvider, yp0 httpClient, oh0 flags) {
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
        return oh0Var.a(dl2.b.P2(5, zn2.d.MINUTES), "gads:exception_monitoring_interval_ms");
    }

    @Override // ads_mobile_sdk.y72
    public final Object a(bl2.c cVar) {
        Object O = dl2.b.O(new bc0(this, null), cVar);
        return O == cl2.a.COROUTINE_SUSPENDED ? O : Unit.f80348a;
    }
}
