package ads_mobile_sdk;

import a.hb;
import a.j4;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g00 extends yr0 implements j4, hb {

    /* renamed from: d, reason: collision with root package name */
    public final e00 f5342d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f5343e;

    /* renamed from: f, reason: collision with root package name */
    public final oh0 f5344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(e00 customTabsConnection, j0 backgroundScope, oh0 flags) {
        super((il0) null, false, 5);
        Intrinsics.checkNotNullParameter(customTabsConnection, "customTabsConnection");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f5342d = customTabsConnection;
        this.f5343e = backgroundScope;
        this.f5344f = flags;
    }

    @Override // a.hb
    public final Object a(cf2 cf2Var, r0 r0Var, wi.b0 b0Var, bl2.c cVar) {
        if (((Boolean) this.f5344f.a("gads:cct_v2_prewarm_on_ad_loaded:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            c();
        }
        return Unit.f80348a;
    }

    @Override // a.j4
    public final Unit b() {
        if (((Boolean) this.f5344f.a("gads:cct_v2_prewarm_on_signal_generated:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            c();
        }
        return Unit.f80348a;
    }

    public final void c() {
        j0 j0Var = this.f5343e;
        f00 block = new f00(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        if (((Boolean) this.f5344f.a("gads:cct_v2_prewarm_at_init:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
            c();
        }
        return new pk0(Unit.f80348a);
    }
}
