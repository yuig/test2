package ro0;

import a11.y;
import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.k2;
import com.pinterest.screens.l2;
import ey.e5;
import is1.k0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a2;
import ls1.h;
import m60.b0;
import m60.r0;
import m60.w;
import u22.l;
import uj2.q;
import x02.i2;
import yk1.n;
import z70.m;

/* loaded from: classes5.dex */
public final class g extends f {
    public final /* synthetic */ int F = 1;
    public final m G;

    public g(po0.a aVar, qo0.b bVar, q qVar, b60.b bVar2, w wVar, qb0.e eVar, x10.b bVar3, k0 k0Var, so0.a aVar2, zf0.f fVar, a2 a2Var, m mVar, i2 i2Var, b0 b0Var, j80.b bVar4, y yVar, r rVar, gp1.d dVar, nx.b0 b0Var2, es.a aVar3) {
        super(aVar, bVar, qVar, bVar2, wVar, eVar, bVar3, aVar2, fVar, a2Var, mVar, i2Var, b0Var, bVar4, k0Var, yVar, rVar, dVar, b0Var2, aVar3);
        this.G = mVar;
    }

    @Override // ro0.e
    public final void D3() {
        int i13 = this.F;
        w wVar = this.f108958s;
        po0.a aVar = this.f108951l;
        switch (i13) {
            case 0:
                super.D3();
                d7.g.s(Navigation.z0((ScreenLocation) l2.f51065a.getValue(), aVar.f100875b), wVar);
                break;
            default:
                super.D3();
                d7.g.s(Navigation.z0((ScreenLocation) k2.f51025a.getValue(), aVar.f100875b), wVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I3(po0.e view) {
        f30 f30Var;
        f30 f30Var2;
        int i13 = this.F;
        w wVar = this.f108958s;
        m mVar = this.G;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                w3(view);
                if (!mVar.f141009i.f141017a && (f30Var = this.f108942c) != null) {
                    String uid = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                    wVar.f(new h(uid, System.currentTimeMillis() * 1000000));
                }
                Context context = ((InAppBrowserFragment) view).getContext();
                ((to0.g) view).a8(context != null ? rm1.q.CANCEL.drawableRes(context, dl2.b.f1(context)) : sm1.b.ic_cancel_gestalt, eo1.b.color_white_0, Integer.valueOf(r0.default_pds_icon_size));
                break;
            default:
                w3(view);
                if (!mVar.f141009i.f141017a && (f30Var2 = this.f108942c) != null) {
                    wVar.f(new h(f30Var2.getUid(), System.currentTimeMillis() * 1000000));
                    break;
                }
                break;
        }
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(n nVar) {
        switch (this.F) {
            case 0:
                I3((po0.e) nVar);
                break;
            default:
                I3((po0.e) nVar);
                break;
        }
    }

    @Override // ro0.e, yk1.p, yk1.b
    public final void onUnbind() {
        int i13 = this.F;
        w wVar = this.f108958s;
        m mVar = this.G;
        switch (i13) {
            case 0:
                if (!mVar.f141009i.f141017a) {
                    new e5(1).i();
                    f30 f30Var = this.f108942c;
                    if (f30Var != null) {
                        String uid = f30Var.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        wVar.f(new ls1.g(uid, System.currentTimeMillis() * 1000000));
                    }
                }
                super.onUnbind();
                break;
            default:
                if (!mVar.f141009i.f141017a) {
                    f30 f30Var2 = this.f108942c;
                    new e5(1).i();
                    if (f30Var2 != null) {
                        wVar.f(new ls1.g(f30Var2.getUid(), System.currentTimeMillis() * 1000000));
                        String str = this.f108954o;
                        if (str != null && l.DIRECT_TO_DESTINATION.value() == Integer.parseInt(str)) {
                            wVar.f(new ls1.f(f30Var2.getUid(), System.currentTimeMillis() * 1000000));
                        }
                    }
                }
                super.onUnbind();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(po0.a args, qo0.b pinalytics, q networkStateStream, b60.b activeUserManager, w eventManager, qb0.e networkUtils, x10.b pinApiService, so0.a createWebSessionRequest, zf0.f educationHelper, a2 experiments, m chromeTabHelper, i2 pinRepository, b0 appBackgroundDetector, j80.b carouselUtil, k0 webViewManager, y urlInfoHelper, r prefsManagerUser, gp1.d cookieSessionManager, nx.b0 pinAuxHelper, es.a adFormats) {
        super(args, pinalytics, networkStateStream, activeUserManager, eventManager, networkUtils, pinApiService, createWebSessionRequest, educationHelper, experiments, chromeTabHelper, pinRepository, appBackgroundDetector, carouselUtil, webViewManager, urlInfoHelper, prefsManagerUser, cookieSessionManager, pinAuxHelper, adFormats);
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(createWebSessionRequest, "createWebSessionRequest");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(chromeTabHelper, "chromeTabHelper");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(appBackgroundDetector, "appBackgroundDetector");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        Intrinsics.checkNotNullParameter(urlInfoHelper, "urlInfoHelper");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(cookieSessionManager, "cookieSessionManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.G = chromeTabHelper;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(yk1.r rVar) {
        switch (this.F) {
            case 0:
                I3((po0.e) rVar);
                break;
            default:
                I3((po0.e) rVar);
                break;
        }
    }
}
