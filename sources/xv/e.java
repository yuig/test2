package xv;

import ads_mobile_sdk.nh;
import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r;
import ew.m;
import h32.i0;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.c0;
import yk1.n;

/* loaded from: classes3.dex */
public final class e extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final m f135995a;

    /* renamed from: b, reason: collision with root package name */
    public final dw.b f135996b;

    /* renamed from: c, reason: collision with root package name */
    public final tb0.h f135997c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f135998d;

    /* renamed from: e, reason: collision with root package name */
    public int f135999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f136000f;

    /* renamed from: g, reason: collision with root package name */
    public int f136001g;

    /* renamed from: h, reason: collision with root package name */
    public c0 f136002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m adsGmaManager, dw.b analytics, tb0.h crashReporting, es.a adFormats) {
        super(0);
        Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f135995a = adsGmaManager;
        this.f135996b = analytics;
        this.f135997c = crashReporting;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        String i13;
        r n03;
        r n04;
        String l13;
        r n05;
        r n06;
        r n07;
        k view = (k) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        this.f136000f = true;
        i iVar = (i) view;
        this.f136001g = iVar.e();
        f30 f30Var = this.f135998d;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        float A0 = bs1.c.A0(f30Var);
        if (this.f135998d == null) {
            Intrinsics.r("pin");
            throw null;
        }
        ((f) iVar).f136011f = A0 / bs1.c.C0(r3);
        f30 f30Var2 = this.f135998d;
        if (f30Var2 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String id3 = f30Var2.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        ew.j jVar = (ew.j) this.f135995a;
        if (jVar.a(id3) != null) {
            f30 f30Var3 = this.f135998d;
            if (f30Var3 == null) {
                Intrinsics.r("pin");
                throw null;
            }
            String id4 = f30Var3.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
            nh adView = jVar.a(id4);
            if (adView == null || !this.f136000f) {
                return;
            }
            ((f) ((k) getView())).getClass();
            Intrinsics.checkNotNullParameter(adView, "adView");
            return;
        }
        f30 f30Var4 = this.f135998d;
        if (f30Var4 == null) {
            Intrinsics.r("pin");
            throw null;
        }
        com.pinterest.api.model.g t33 = f30Var4.t3();
        String i14 = (t33 == null || (n07 = t33.n0()) == null) ? null : n07.i();
        if (i14 == null || i14.length() == 0) {
            return;
        }
        com.pinterest.api.model.g t34 = f30Var4.t3();
        String adUnitId = (t34 == null || (n06 = t34.n0()) == null) ? null : u2.p(n06);
        if (adUnitId == null || adUnitId.length() == 0) {
            return;
        }
        Context context = ((f) ((k) getView())).getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        a onAdLoaded = new a(1, this, e.class, "onAdLoaded", "onAdLoaded(Lcom/google/android/libraries/ads/mobile/sdk/banner/BannerAd;)V", 0);
        b onAdLoadSuccessCallback = new b(2, this, e.class, "onAdLoadSuccess", "onAdLoadSuccess(JLcom/pinterest/schemas/event/Context;)V", 0);
        c onAdFailedToLoad = new c(3, this, e.class, "onAdLoadFailure", "onAdLoadFailure(Ljava/lang/String;JLcom/pinterest/schemas/event/Context;)V", 0);
        d onAdClicked = new d(this, 0);
        d onAdImpression = new d(this, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(onAdLoaded, "onAdLoaded");
        Intrinsics.checkNotNullParameter(onAdLoadSuccessCallback, "onAdLoadSuccessCallback");
        Intrinsics.checkNotNullParameter(onAdFailedToLoad, "onAdFailedToLoad");
        Intrinsics.checkNotNullParameter(onAdClicked, "onAdClicked");
        Intrinsics.checkNotNullParameter(onAdImpression, "onAdImpression");
        if (jVar.d() && ((kw.a) jVar.f60321g).a()) {
            com.pinterest.api.model.g t35 = f30Var4.t3();
            if (t35 == null || (n04 = t35.n0()) == null || (l13 = n04.l()) == null || !StringsKt.E(l13, "application/gzip", false)) {
                com.pinterest.api.model.g t36 = f30Var4.t3();
                i13 = (t36 == null || (n03 = t36.n0()) == null) ? null : n03.i();
            } else {
                com.pinterest.api.model.g t37 = f30Var4.t3();
                String i15 = (t37 == null || (n05 = t37.n0()) == null) ? null : n05.i();
                jVar.f60325k.getClass();
                i13 = mw.a.a(i15);
            }
            i0 p13 = jVar.f60323i.f63033a.p();
            if (p13 == null) {
                p13 = new i0(null, null, null, null, null, null);
            }
            kotlin.jvm.internal.j.z(jVar.f60322h, jVar.f60334t, null, new ew.f(jVar, context, p13, adUnitId, i13, onAdLoadSuccessCallback, onAdFailedToLoad, onAdClicked, onAdImpression, f30Var4, onAdLoaded, null), 2);
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        this.f136000f = false;
        ((k) getView()).getClass();
        super.onUnbind();
    }
}
