package ads_mobile_sdk;

import a.f2;

/* loaded from: classes2.dex */
public final class kl2 implements com.google.common.util.concurrent.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll2 f7385a;

    public kl2(ll2 ll2Var) {
        this.f7385a = ll2Var;
    }

    @Override // com.google.common.util.concurrent.m
    public final com.google.common.util.concurrent.c0 apply(Object obj) {
        f2 f2Var = (f2) obj;
        if (f2Var != null) {
            return new com.google.common.util.concurrent.y(f2Var);
        }
        this.f7385a.f7880d.b(xb0.EVENT_ID_INIT_FALLBACK_TO_DEFAULT_COLLECTOR);
        return this.f7385a.a(r4.ADSHIELD_VERSION_1);
    }
}
