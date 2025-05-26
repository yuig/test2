package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gc0 implements a.t5 {

    /* renamed from: a, reason: collision with root package name */
    public final oh0 f5505a;

    public gc0(oh0 flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f5505a = flags;
    }

    @Override // a.t5
    public final ol0 a() {
        return ol0.EXPERIMENT_IDS;
    }

    @Override // a.t5
    public final Object c(bl2.c cVar) {
        return new pk0(new fc0((String) this.f5505a.a("gads:sdk_core_constants:experiment_id", "", oh0.f9294r)));
    }
}
