package ads_mobile_sdk;

import a.c9;
import a.m4;
import a.w0;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zh implements a.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final wi.k f14772a;

    /* renamed from: b, reason: collision with root package name */
    public final vi.d f14773b;

    /* renamed from: c, reason: collision with root package name */
    public final p82 f14774c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f14775d;

    /* renamed from: e, reason: collision with root package name */
    public final x f14776e;

    /* renamed from: f, reason: collision with root package name */
    public final h80 f14777f;

    /* renamed from: g, reason: collision with root package name */
    public final a.v7 f14778g;

    public zh(wi.k baseRequest, vi.d bannerRequest, p82 requestConfigurationWrapper, Context context, x activityTracker, h80 delegatingThirdPartyEventEmitter, a.o8 bannerAdComponentProvider) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(bannerAdComponentProvider, "bannerAdComponentProvider");
        this.f14772a = baseRequest;
        this.f14773b = bannerRequest;
        this.f14774c = requestConfigurationWrapper;
        this.f14775d = context;
        this.f14776e = activityTracker;
        this.f14777f = delegatingThirdPartyEventEmitter;
        this.f14778g = bannerAdComponentProvider;
    }

    @Override // a.w6
    public final void a(cf2 transaction, r0 config, w0 w0Var, mo2 listener) {
        gq1 adapter = (gq1) w0Var;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(listener, "listener");
        vi.a k13 = this.f14773b.k();
        if (k13 == null) {
            listener.a(new AdError(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request."));
            return;
        }
        Context c13 = this.f14776e.c();
        if (c13 == null) {
            c13 = this.f14775d;
        }
        adapter.a(c13, k13, this.f14772a, this.f14774c.a(), config.f10359c, listener, this.f14777f);
    }

    @Override // a.w6
    public final void a(m4 m4Var) {
        g50 adComponent = (g50) m4Var;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        ((c9) adComponent.D.get()).getClass();
    }

    @Override // a.w6
    public final a.n3 a(cf2 transaction, r0 config, Object obj) {
        gq1 adapter = (gq1) obj;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        f50 f50Var = (f50) this.f14778g.get();
        View view = adapter.f5663b;
        if (view != null) {
            f50Var.getClass();
            f50Var.f5061n = view;
            return f50Var;
        }
        Intrinsics.r("view");
        throw null;
    }
}
