package xv;

import a11.n;
import android.content.Context;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import dl1.s;
import dq0.p;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.f0;
import m60.u;
import m60.w;
import nx.d0;
import nx.d1;
import so.f6;
import so.fa;
import so.oa;
import so.qa;
import so.t8;
import t3.s1;
import uj2.q;
import w01.y;
import x02.i2;
import x02.x2;
import yk1.m;
import yk1.v;

/* loaded from: classes3.dex */
public final class g extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136003a = 9;

    /* renamed from: b, reason: collision with root package name */
    public final Object f136004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f136005c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f136006d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f136007e;

    public g(vh vhVar, uk1.d presenterPinalytics, d1 trackingParamAttacher, f0 impressionDebugUtils) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(impressionDebugUtils, "impressionDebugUtils");
        this.f136004b = vhVar;
        this.f136005c = presenterPinalytics;
        this.f136006d = trackingParamAttacher;
        this.f136007e = impressionDebugUtils;
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0707, code lost:
    
        if (r1.compareTo(r8.f56138r) > 0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05ca, code lost:
    
        if (r3 == null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x045b, code lost:
    
        if ((r16 - (r7 != null ? r7.getTime() : 0)) > 1200000) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04eb  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, tf0.a] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v43, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v47, types: [ae1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53, types: [ch1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v62, types: [hi1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r1v78, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r2v15, types: [g21.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, so.wd] */
    /* JADX WARN: Type inference failed for: r2v38, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r3v73, types: [yk1.m] */
    @Override // vq0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yk1.n r39, java.lang.Object r40, final int r41) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xv.g.c(yk1.n, java.lang.Object, int):void");
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f136003a;
        Object obj = this.f136007e;
        Object obj2 = this.f136006d;
        Object obj3 = this.f136005c;
        Object obj4 = this.f136004b;
        switch (i13) {
            case 0:
                return new e((ew.m) obj4, (dw.b) obj3, (tb0.h) obj2, (es.a) obj);
            case 1:
                return new sf0.b((uk1.d) obj4, (q) obj3, (a11.e) obj2, (d1) obj);
            case 2:
                uk1.d dVar = (uk1.d) obj4;
                w wVar = u.f85943a;
                Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                return new aj0.b(dVar, wVar, (i2) obj3, (x2) obj, (l) obj2);
            case 3:
                w wVar2 = u.f85943a;
                Intrinsics.checkNotNullExpressionValue(wVar2, "getInstance(...)");
                Context context = kb0.a.f79058b;
                return new aj0.e((uk1.d) obj4, wVar2, (i2) obj3, ((oa) ((so1.b) ep.b.g(so1.b.class))).G2(), (l) obj2, (c91.f) obj);
            case 4:
            case 5:
            case 11:
            default:
                return null;
            case 6:
                return new px0.j((d0) obj4, (nu1.a) obj3, (w12.b) obj2, (uo.a) obj);
            case 7:
                return ((f6) ((y) obj2)).a((i2) obj, (d0) obj4, (uk1.e) obj3);
            case 8:
                return i21.c.a((i21.c) obj, null, new h21.f(null, 0, 15), new np0.e((i2) obj2), (String) obj3, null, (uk1.d) obj4, null, null, 0, 0, 4049);
            case 9:
                vw0.a aVar = new vw0.a((vh) obj4, (uk1.d) obj3, u.f85943a, (zs1.a) obj, (d1) obj2);
                aVar.f126802i = false;
                return aVar;
            case 10:
                uk1.d presenterPinalytics = (uk1.d) obj4;
                q networkStateStream = (q) obj3;
                Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
                Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
                ae1.h hVar = new ae1.h(presenterPinalytics, networkStateStream);
                hVar.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new ac1.j(24));
                return hVar;
            case 12:
                return new ug1.b((uk1.d) obj4, (q) obj3, (nu1.a) obj2, (w) obj);
            case 13:
                return new dh1.e((w) obj, (uk1.d) obj4, (x2) obj2, (q) obj3);
            case 14:
                f0 f0Var = new f0();
                t8 t8Var = ((qa) obj).f114075a;
                w wVar3 = (w) t8Var.f114636b.f113885r0.get();
                oa oaVar = t8Var.f114636b;
                return new ii1.b((v) obj2, (uk1.d) obj4, (HashMap) obj3, f0Var, wVar3, (fa) oaVar.f113704gc.get(), (a11.d) oaVar.f113668ec.get(), (d1) oaVar.f113730i2.get(), (gz1.b) oaVar.C1.get(), (ur.a) oaVar.Kb.get());
            case 15:
                return new ii1.e((uk1.d) obj4, (q) obj3, (v) obj2, (qa) obj);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f136003a;
        switch (i14) {
            case 0:
                f30 model = (f30) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                kj kjVar = model2.f42855m;
                if (kjVar != null && (r5 = kjVar.a()) != null) {
                    break;
                }
                break;
            case 2:
                xk model3 = (xk) obj;
                switch (i14) {
                    case 2:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model3, "model");
                        break;
                }
            case 3:
                xk model4 = (xk) obj;
                switch (i14) {
                    case 2:
                        Intrinsics.checkNotNullParameter(model4, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model4, "model");
                        break;
                }
            case 4:
                Intrinsics.checkNotNullParameter((mv) obj, "model");
                break;
            case 5:
                z40.d0 model5 = (z40.d0) obj;
                Intrinsics.checkNotNullParameter(model5, "model");
                Intrinsics.checkNotNullParameter(model5, "<this>");
                String R0 = dl2.b.R0(model5.l());
                break;
            case 6:
                Intrinsics.checkNotNullParameter((qx) obj, "model");
                break;
            case 7:
                Intrinsics.checkNotNullParameter((u01.c) obj, "model");
                break;
            case 8:
                i(i13, (s) obj);
                break;
            case 9:
                Intrinsics.checkNotNullParameter((h21.d) obj, "model");
                break;
            case 10:
                Intrinsics.checkNotNullParameter((zd1.d) obj, "model");
                break;
            case 11:
                ue1.f model6 = (ue1.f) obj;
                Intrinsics.checkNotNullParameter(model6, "model");
                break;
            case 12:
                i(i13, (s) obj);
                break;
            case 13:
                Intrinsics.checkNotNullParameter((zv0) obj, "model");
                break;
            case 14:
                f30 model7 = (f30) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model7, "model");
                        break;
                }
            default:
                i(i13, (s) obj);
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, zi0.a] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r6v7, types: [yk1.m] */
    public final void h(zi0.a view, xk article) {
        switch (this.f136003a) {
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(article, "model");
                View view2 = view instanceof View ? (View) view : null;
                if (view2 != null) {
                    ?? j13 = s1.j(view2);
                    r2 = j13 instanceof aj0.b ? j13 : null;
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(article, "article");
                    r2.f15417h = article;
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(article, "model");
                View view3 = view instanceof View ? (View) view : null;
                if (view3 != null) {
                    ?? j14 = s1.j(view3);
                    r2 = (aj0.e) (j14 instanceof aj0.e ? j14 : null);
                }
                if (r2 != null) {
                    Intrinsics.checkNotNullParameter(article, "article");
                    r2.f15417h = article;
                    break;
                }
                break;
        }
    }

    public final String i(int i13, s model) {
        switch (this.f136003a) {
            case 8:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                Intrinsics.checkNotNullParameter(model, "model");
                break;
        }
        return null;
    }

    public g(ew.m adsGmaManager, dw.b adsGmaAnalytics, tb0.h crashReporting, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adsGmaManager, "adsGmaManager");
        Intrinsics.checkNotNullParameter(adsGmaAnalytics, "adsGmaAnalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f136004b = adsGmaManager;
        this.f136005c = adsGmaAnalytics;
        this.f136006d = crashReporting;
        this.f136007e = adFormats;
    }

    public g(String convoId, d0 pinalytics, q networkStateStream, p presenter) {
        Intrinsics.checkNotNullParameter(convoId, "convoId");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        this.f136004b = convoId;
        this.f136005c = pinalytics;
        this.f136006d = networkStateStream;
        this.f136007e = presenter;
    }

    public g(Function1 clickHandler, we1.w longClickHandler, wy0 wy0Var, pb0.d fuzzyDateFormatter) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(longClickHandler, "longClickHandler");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f136004b = clickHandler;
        this.f136005c = longClickHandler;
        this.f136006d = wy0Var;
        this.f136007e = fuzzyDateFormatter;
    }

    public g(w eventManager, uk1.d pinalytics, x2 userRepository, q networkStateStream) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f136004b = pinalytics;
        this.f136005c = networkStateStream;
        this.f136006d = userRepository;
        this.f136007e = eventManager;
    }

    public g(d0 pinalytics, nu1.a inAppNavigator, w12.b newsHubService, uo.a graphQLNewsHubDataSource) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(newsHubService, "newsHubService");
        Intrinsics.checkNotNullParameter(graphQLNewsHubDataSource, "graphQLNewsHubDataSource");
        this.f136004b = pinalytics;
        this.f136005c = inAppNavigator;
        this.f136006d = newsHubService;
        this.f136007e = graphQLNewsHubDataSource;
    }

    public g(d0 pinalytics, uk1.e presenterPinalyticsFactory, y presenterFactory, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f136004b = pinalytics;
        this.f136005c = presenterPinalyticsFactory;
        this.f136006d = presenterFactory;
        this.f136007e = pinRepository;
    }

    public g(d0 pinalytics, x2 userRepository, xj2.b disposables, String conversationId) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        this.f136004b = pinalytics;
        this.f136005c = userRepository;
        this.f136006d = disposables;
        this.f136007e = conversationId;
    }

    public g(uk1.d pinalytics, String trafficSource, i2 pinRepository, i21.c pinCarouselPresenterFactory) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinCarouselPresenterFactory, "pinCarouselPresenterFactory");
        this.f136004b = pinalytics;
        this.f136005c = trafficSource;
        this.f136006d = pinRepository;
        this.f136007e = pinCarouselPresenterFactory;
    }

    public g(uk1.d pinalytics, HashMap auxData, v viewResources, qa videoCarouselItemPresenterFactory) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(videoCarouselItemPresenterFactory, "videoCarouselItemPresenterFactory");
        this.f136004b = pinalytics;
        this.f136005c = auxData;
        this.f136006d = viewResources;
        this.f136007e = videoCarouselItemPresenterFactory;
    }

    public g(uk1.d pinalytics, q networkStateStream, n clickthroughHelper, d1 trackingParamAttacher) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f136004b = pinalytics;
        this.f136005c = networkStateStream;
        this.f136006d = clickthroughHelper;
        this.f136007e = trackingParamAttacher;
    }

    public g(uk1.d presenterPinalytics, q networkStateStream, ae1.b colorFilterItemUpdateListener, de1.u getRules) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(colorFilterItemUpdateListener, "colorFilterItemUpdateListener");
        Intrinsics.checkNotNullParameter(getRules, "getRules");
        this.f136004b = presenterPinalytics;
        this.f136005c = networkStateStream;
        this.f136006d = colorFilterItemUpdateListener;
        this.f136007e = getRules;
    }

    public g(uk1.d presenterPinalytics, q networkStateStream, nu1.a inAppNavigator, w eventManager) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f136004b = presenterPinalytics;
        this.f136005c = networkStateStream;
        this.f136006d = inAppNavigator;
        this.f136007e = eventManager;
    }

    public g(uk1.d presenterPinalytics, q networkStateStream, v viewResources, qa videoCarouselItemPresenterFactory) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(videoCarouselItemPresenterFactory, "videoCarouselItemPresenterFactory");
        this.f136004b = presenterPinalytics;
        this.f136005c = networkStateStream;
        this.f136006d = viewResources;
        this.f136007e = videoCarouselItemPresenterFactory;
    }

    public g(uk1.d presenterPinalytics, i2 pinRepository, l uriNavigator, c91.f fVar) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        this.f136004b = presenterPinalytics;
        this.f136005c = pinRepository;
        this.f136006d = uriNavigator;
        this.f136007e = fVar;
    }

    public g(uk1.d presenterPinalytics, i2 pinRepository, l uriNavigator, x2 userRepository) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f136004b = presenterPinalytics;
        this.f136005c = pinRepository;
        this.f136006d = uriNavigator;
        this.f136007e = userRepository;
    }
}
