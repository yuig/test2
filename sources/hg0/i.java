package hg0;

import ao2.j0;
import h32.f1;
import h32.g0;
import h32.i0;
import i92.k;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import rg0.m;
import rg0.n;
import xk2.v;
import xk2.w;

/* loaded from: classes5.dex */
public final class i extends l82.b implements nx.a {

    /* renamed from: c, reason: collision with root package name */
    public final x10.d f69074c;

    /* renamed from: d, reason: collision with root package name */
    public final k f69075d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f69076e;

    /* renamed from: f, reason: collision with root package name */
    public final v f69077f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f69078g;

    /* renamed from: h, reason: collision with root package name */
    public n f69079h;

    /* renamed from: i, reason: collision with root package name */
    public m f69080i;

    /* renamed from: j, reason: collision with root package name */
    public final xj2.b f69081j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x10.d settingsApi, k toastUtils, f0 pinalyticsFactory, j0 coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f69074c = settingsApi;
        this.f69075d = toastUtils;
        this.f69076e = pinalyticsFactory;
        this.f69077f = xk2.m.b(new tc0.c(this, 26));
        this.f69081j = new xj2.b();
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(null, null, null, g0.EU_PERSONALIZED_ADS_PROMPT, null, null);
    }

    public final void h(pe.i event) {
        w wVar;
        w wVar2;
        Intrinsics.checkNotNullParameter(event, "event");
        i0 generateLoggingContext = generateLoggingContext();
        if (Intrinsics.d(event, c.f69063a)) {
            wVar2 = new w(com.bumptech.glide.d.z0(generateLoggingContext, g.f69067j), f1.VIEW, null);
        } else if (Intrinsics.d(event, d.f69064a)) {
            wVar2 = new w(com.bumptech.glide.d.z0(generateLoggingContext, g.f69068k), f1.VIEW, null);
        } else if (Intrinsics.d(event, e.f69065a)) {
            wVar2 = new w(com.bumptech.glide.d.z0(generateLoggingContext, g.f69069l), f1.SWIPE_LEFT, null);
        } else if (Intrinsics.d(event, f.f69066a)) {
            wVar2 = new w(com.bumptech.glide.d.z0(generateLoggingContext, g.f69070m), f1.SWIPE_RIGHT, null);
        } else {
            if (Intrinsics.d(event, a.f69061a)) {
                f1 f1Var = f1.COMPLETE_EU_PROMPT;
                HashMap hashMap = new HashMap();
                hashMap.put("is_use_pinterest_activity_data", String.valueOf(this.f69078g));
                Unit unit = Unit.f80348a;
                wVar = new w(generateLoggingContext, f1Var, hashMap);
            } else {
                if (!Intrinsics.d(event, b.f69062a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f1 f1Var2 = f1.DISMISS_EU_PROMPT;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("is_use_pinterest_activity_data", String.valueOf(this.f69078g));
                Unit unit2 = Unit.f80348a;
                wVar = new w(generateLoggingContext, f1Var2, hashMap2);
            }
            wVar2 = wVar;
        }
        ((d0) this.f69077f.getValue()).U((i0) wVar2.f135234a, (f1) wVar2.f135235b, null, null, (HashMap) wVar2.f135236c, false);
    }
}
