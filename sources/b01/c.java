package b01;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.z;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.datasource.RelatedModulesModelFilter;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubber;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.feature.search.visual.collage.view.CollageInteractiveFrameLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.components.users.LegoUserRep;
import com.pinterest.ui.imageview.WebImageView;
import do2.t2;
import do2.u2;
import ey.k3;
import ey.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.g0;
import m60.w;
import nx.d0;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;
import pc.f0;
import pc.u;
import pc.v;
import so.n6;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20723i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20724j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f20725k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13, Object obj, Object obj2) {
        super(0);
        this.f20723i = i13;
        this.f20724j = obj;
        this.f20725k = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        sq0.f fVar;
        wk1.c cVar;
        nr0.m mVar;
        uk1.d presenterPinalytics;
        wk1.c cVar2;
        wk1.c cVar3;
        wk1.c cVar4;
        w wVar;
        g0 g0Var;
        tb0.h hVar;
        p01.n nVar;
        p01.f fVar2;
        wu1.b bVar;
        wu1.b eventListenerFactory;
        oc.c c13;
        int i13 = this.f20723i;
        Object obj = this.f20725k;
        Object obj2 = this.f20724j;
        switch (i13) {
            case 0:
                m47invoke();
                return Unit.f80348a;
            case 1:
                m47invoke();
                return Unit.f80348a;
            case 2:
                if (((RelatedPinsFiltersCarouselView) obj2).f46962c != null) {
                    return Integer.valueOf(hf0.b.j((Context) obj));
                }
                Intrinsics.r("deviceInfoProvider");
                throw null;
            case 3:
                PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) obj2;
                str = pinCloseupPresenter.pinUid;
                fVar = pinCloseupPresenter.imagePrefetcher;
                cVar = pinCloseupPresenter.parameters;
                sq0.m mVar2 = cVar.f130139j;
                mVar = pinCloseupPresenter.dynamicGridViewBinderDelegateFactory;
                presenterPinalytics = pinCloseupPresenter.getPresenterPinalytics();
                cVar2 = pinCloseupPresenter.parameters;
                wa2.i iVar = cVar2.f130131b.f103320a;
                cVar3 = pinCloseupPresenter.parameters;
                qa2.n nVar2 = cVar3.f130131b;
                cVar4 = pinCloseupPresenter.parameters;
                nr0.l a13 = ((n6) mVar).a(presenterPinalytics, iVar, nVar2, cVar4.f130137h);
                wVar = pinCloseupPresenter.eventManager;
                ol1.d dVar = new ol1.d(wVar);
                g0Var = pinCloseupPresenter.pageSizeProvider;
                RelatedModulesModelFilter relatedModulesModelFilter = new RelatedModulesModelFilter(pinCloseupPresenter);
                hVar = pinCloseupPresenter.crashReporting;
                nVar = pinCloseupPresenter.relatedPinsFilteringDataManager;
                fVar2 = pinCloseupPresenter.oneBarFilteringDataManager;
                return new com.pinterest.feature.pin.closeup.datasource.c(str, fVar, mVar2, a13, dVar, g0Var, pinCloseupPresenter, relatedModulesModelFilter, hVar, nVar, (mc.i) obj, fVar2);
            case 4:
                m47invoke();
                return Unit.f80348a;
            case 5:
                m47invoke();
                return Unit.f80348a;
            case 6:
                m47invoke();
                return Unit.f80348a;
            case 7:
                ThumbnailScrubber thumbnailScrubber = (ThumbnailScrubber) obj2;
                int dimensionPixelSize = thumbnailScrubber.getResources().getDimensionPixelSize(uy1.a.pin_thumbnail_picker_scrubber_width);
                int dimensionPixelSize2 = thumbnailScrubber.getResources().getDimensionPixelSize(uy1.a.pin_thumbnail_picker_scrubber_height);
                float dimensionPixelOffset = thumbnailScrubber.getResources().getDimensionPixelOffset(eo1.c.legacy_image_corner_radius);
                WebImageView webImageView = new WebImageView((Context) obj);
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                webImageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2, 8388611));
                thumbnailScrubber.addView(webImageView);
                return webImageView;
            case 8:
                m47invoke();
                return Unit.f80348a;
            case 9:
                j21.f fVar3 = (j21.f) obj2;
                Context context = fVar3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new q21.d(context, (d0) obj, fVar3.f74500c, fVar3.f74501d, fVar3.f74502e, null, null, null, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
            case 10:
                Context context2 = (Context) obj2;
                ll.j jVar = ((UserProfileHeader) obj).f47528n;
                if (jVar != null) {
                    return new y31.q(context2, jVar);
                }
                Intrinsics.r("pincodesUtil");
                throw null;
            case 11:
                m47invoke();
                return Unit.f80348a;
            case 12:
                m47invoke();
                return Unit.f80348a;
            case 13:
                LegoUserRep legoUserRep = new LegoUserRep((Context) obj2);
                g41.m mVar3 = (g41.m) obj;
                legoUserRep.y1(ze0.a.List);
                legoUserRep.t0(false);
                boolean b13 = mVar3.getActiveUserManager().b(mVar3.U8());
                GestaltIconButton gestaltIconButton = legoUserRep.f52366z;
                if (b13) {
                    com.bumptech.glide.c.u1(gestaltIconButton);
                } else {
                    com.bumptech.glide.c.d0(gestaltIconButton);
                }
                return legoUserRep;
            case 14:
                m47invoke();
                return Unit.f80348a;
            case 15:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
                ((j41.o) obj).getClass();
                Intrinsics.g(null, "null cannot be cast to non-null type android.view.View");
                throw null;
            case 16:
                m47invoke();
                return Unit.f80348a;
            case 17:
                m47invoke();
                return Unit.f80348a;
            case 18:
                m47invoke();
                return Unit.f80348a;
            case 19:
                m47invoke();
                return Unit.f80348a;
            case 20:
                m47invoke();
                return Unit.f80348a;
            case 21:
                return new u51.f((Context) obj, new u51.h(1, (u51.i) obj2, u51.i.class, "handleSelected", "handleSelected(Lcom/pinterest/feature/reporting/model/ReportReasonItem;)V", 0));
            case 22:
                c61.i iVar2 = (c61.i) obj2;
                Context requireContext = iVar2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                wg1.j jVar2 = new wg1.j(requireContext, (uk1.d) ((xk2.k) obj).getValue(), new c61.b(iVar2, 12), new gv0.b(iVar2, 18));
                if (iVar2.f26568c1) {
                    jVar2.i();
                }
                return jVar2;
            case 23:
                c71.m mVar4 = (c71.m) obj2;
                oc.c cVar5 = mVar4.f26795i;
                tb0.p productArea = tb0.p.SEARCH_RESULTS_PROFILES_TAB;
                String parentMetricName = q1.USERS.getSpanName();
                c71.l condition = c71.l.f26774j;
                Intrinsics.checkNotNullParameter(cVar5, "<this>");
                Intrinsics.checkNotNullParameter(productArea, "productArea");
                Intrinsics.checkNotNullParameter(parentMetricName, "parentMetricName");
                Intrinsics.checkNotNullParameter(condition, "condition");
                mz.c cVar6 = new mz.c(productArea, 2);
                dd.a aVar = cVar5.f94016a;
                f10.d dVar2 = aVar instanceof f10.d ? (f10.d) aVar : null;
                if (dVar2 == null) {
                    c13 = (oc.c) cVar6.invoke("PinterestHttpNetworkTransport");
                } else {
                    ed.m httpNetworkTransport = dVar2.f60774a;
                    ed.m mVar5 = httpNetworkTransport instanceof ed.m ? httpNetworkTransport : null;
                    if (mVar5 == null) {
                        c13 = (oc.c) cVar6.invoke("HttpNetworkTransport");
                    } else {
                        ed.c httpEngine = mVar5.f58492b;
                        f10.c cVar7 = httpEngine instanceof f10.c ? (f10.c) httpEngine : null;
                        if (cVar7 == null) {
                            c13 = (oc.c) cVar6.invoke("PinterestHttpEngine");
                        } else {
                            t2 a14 = u2.a(Boolean.FALSE);
                            k3 perfLogger = dVar2.f60775b;
                            d10.c cVar8 = new d10.c(perfLogger, parentMetricName, a14);
                            EventListener.Factory factory = new e10.b(productArea, a14);
                            f10.b bVar2 = (f10.b) cVar7.f60772a;
                            OkHttpClient.Builder builder = bVar2.f60771a.newBuilder();
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            EventListener.Factory eventListenerFactory2 = bVar2.f60771a.eventListenerFactory();
                            Intrinsics.checkNotNullParameter(eventListenerFactory2, "<this>");
                            Intrinsics.checkNotNullParameter(factory, "factory");
                            boolean z13 = eventListenerFactory2 instanceof wu1.b;
                            if (z13 && (factory instanceof wu1.b)) {
                                eventListenerFactory = new wu1.b(CollectionsKt.l0(((wu1.b) factory).f131150a, ((wu1.b) eventListenerFactory2).f131150a));
                            } else {
                                if (z13) {
                                    bVar = new wu1.b(CollectionsKt.l0(Util.l(factory), ((wu1.b) eventListenerFactory2).f131150a));
                                } else if (factory instanceof wu1.b) {
                                    eventListenerFactory = new wu1.b(CollectionsKt.l0(((wu1.b) factory).f131150a, Util.l(eventListenerFactory2)));
                                } else {
                                    bVar = new wu1.b(CollectionsKt.l0(Util.l(factory), Util.l(eventListenerFactory2)));
                                }
                                eventListenerFactory = bVar;
                            }
                            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
                            builder.getClass();
                            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
                            builder.f95678e = eventListenerFactory;
                            f10.c httpEngine2 = new f10.c(new f10.b(new OkHttpClient(builder)));
                            ArrayList arrayList = new ArrayList();
                            Intrinsics.checkNotNullParameter(httpEngine, "httpEngine");
                            List interceptors = mVar5.f58493c;
                            Intrinsics.checkNotNullParameter(interceptors, "interceptors");
                            arrayList.clear();
                            arrayList.addAll(interceptors);
                            qc.h httpRequestComposer = mVar5.f58491a;
                            Intrinsics.checkNotNullParameter(httpRequestComposer, "httpRequestComposer");
                            Intrinsics.checkNotNullParameter(httpEngine2, "httpEngine");
                            if (httpRequestComposer == null) {
                                throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'".toString());
                            }
                            ed.m httpNetworkTransport2 = new ed.m(httpRequestComposer, httpEngine2, arrayList, true);
                            Intrinsics.checkNotNullParameter(httpNetworkTransport, "httpNetworkTransport");
                            Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
                            Intrinsics.checkNotNullParameter(httpNetworkTransport2, "httpNetworkTransport");
                            f10.d networkTransport = new f10.d(httpNetworkTransport2, perfLogger);
                            oc.b bVar3 = cVar5.f94026k;
                            bVar3.getClass();
                            oc.b bVar4 = new oc.b();
                            v customScalarAdapters = bVar3.f93995c.a();
                            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                            u uVar = bVar4.f93995c;
                            uVar.f99604a.clear();
                            Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                            uVar.f99604a.putAll(customScalarAdapters.f99609c);
                            ArrayList interceptors2 = bVar3.f93997e;
                            Intrinsics.checkNotNullParameter(interceptors2, "interceptors");
                            ArrayList arrayList2 = bVar4.f93996d;
                            arrayList2.clear();
                            k0.u(interceptors2, arrayList2);
                            bVar4.f93999g = bVar3.f93999g;
                            f0 executionContext = bVar3.f94000h;
                            Intrinsics.checkNotNullParameter(executionContext, "executionContext");
                            Intrinsics.checkNotNullParameter(executionContext, "<set-?>");
                            bVar4.f94000h = executionContext;
                            bVar4.f94010r = bVar3.f94010r;
                            bVar4.f94011s = bVar3.f94011s;
                            bVar4.f94012t = bVar3.f94012t;
                            bVar4.f94013u = bVar3.f94013u;
                            bVar4.f94014v = bVar3.f94014v;
                            bVar4.f94015w = bVar3.f94015w;
                            dd.a networkTransport2 = bVar3.f93993a;
                            if (networkTransport2 != null) {
                                Intrinsics.checkNotNullParameter(networkTransport2, "networkTransport");
                                bVar4.f93993a = networkTransport2;
                            }
                            String httpServerUrl = bVar3.f94001i;
                            if (httpServerUrl != null) {
                                Intrinsics.checkNotNullParameter(httpServerUrl, "httpServerUrl");
                                bVar4.f94001i = httpServerUrl;
                            }
                            ed.c httpEngine3 = bVar3.f94002j;
                            if (httpEngine3 != null) {
                                Intrinsics.checkNotNullParameter(httpEngine3, "httpEngine");
                                bVar4.f94002j = httpEngine3;
                            }
                            Boolean bool = bVar3.f94006n;
                            if (bool != null) {
                                bVar4.f94006n = bool;
                            }
                            Iterator it = bVar3.f93998f.iterator();
                            while (it.hasNext()) {
                                ed.e httpInterceptor = (ed.e) it.next();
                                Intrinsics.checkNotNullParameter(httpInterceptor, "httpInterceptor");
                                bVar4.f93998f.add(httpInterceptor);
                            }
                            dd.a subscriptionNetworkTransport = bVar3.f93994b;
                            if (subscriptionNetworkTransport != null) {
                                Intrinsics.checkNotNullParameter(subscriptionNetworkTransport, "subscriptionNetworkTransport");
                                bVar4.f93994b = subscriptionNetworkTransport;
                            }
                            String webSocketServerUrl = bVar3.f94003k;
                            if (webSocketServerUrl != null) {
                                Intrinsics.checkNotNullParameter(webSocketServerUrl, "webSocketServerUrl");
                                bVar4.f94003k = webSocketServerUrl;
                            }
                            Function1 webSocketServerUrl2 = bVar3.f94009q;
                            if (webSocketServerUrl2 != null) {
                                Intrinsics.checkNotNullParameter(webSocketServerUrl2, "webSocketServerUrl");
                                bVar4.f94009q = webSocketServerUrl2;
                            }
                            fd.j webSocketEngine = bVar3.f94007o;
                            if (webSocketEngine != null) {
                                Intrinsics.checkNotNullParameter(webSocketEngine, "webSocketEngine");
                                bVar4.f94007o = webSocketEngine;
                            }
                            kl2.l webSocketReopenWhen = bVar3.f94008p;
                            if (webSocketReopenWhen != null) {
                                Intrinsics.checkNotNullParameter(webSocketReopenWhen, "webSocketReopenWhen");
                                bVar4.f94008p = webSocketReopenWhen;
                            }
                            Long l13 = bVar3.f94004l;
                            if (l13 != null) {
                                bVar4.f94004l = Long.valueOf(l13.longValue());
                            }
                            fd.f wsProtocolFactory = bVar3.f94005m;
                            if (wsProtocolFactory != null) {
                                Intrinsics.checkNotNullParameter(wsProtocolFactory, "wsProtocolFactory");
                                bVar4.f94005m = wsProtocolFactory;
                            }
                            ArrayList interceptors3 = CollectionsKt.l0(cVar5.f94019d, kotlin.collections.f0.l(cVar8));
                            Intrinsics.checkNotNullParameter(interceptors3, "interceptors");
                            arrayList2.clear();
                            k0.u(interceptors3, arrayList2);
                            Intrinsics.checkNotNullParameter(networkTransport, "networkTransport");
                            bVar4.f93993a = networkTransport;
                            c13 = bVar4.c();
                        }
                    }
                }
                oc.c cVar9 = c13;
                c71.c cVar10 = new c71.c(mVar4, mVar4.f26797k);
                c71.l lVar = c71.l.f26775k;
                c71.e eVar = new c71.e(mVar4, 11);
                dl2.b.y(1, eVar);
                c71.e eVar2 = new c71.e(mVar4, 12);
                dl2.b.y(1, eVar2);
                c71.k w33 = c71.m.w3(mVar4);
                y11.c cVar11 = new y11.c(22, mVar4, (uj2.q) obj);
                com.pinterest.framework.multisection.datasource.pagedlist.s sVar = new com.pinterest.framework.multisection.datasource.pagedlist.s(cVar9, new gv0.b(cVar10, 20), lVar, eVar, eVar2, mVar4.f26807u, w33, null, 8064);
                cVar11.invoke(sVar);
                return new com.pinterest.framework.multisection.datasource.pagedlist.g(sVar, cVar10, mVar4.f26808v.f26730b, mVar4.A);
            case 24:
                SearchGridMultiSectionFragment searchGridMultiSectionFragment = (SearchGridMultiSectionFragment) obj;
                z viewLifecycleOwner = searchGridMultiSectionFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new com.pinterest.feature.search.results.view.g0((Context) obj2, searchGridMultiSectionFragment, bf.b.S(viewLifecycleOwner));
            case 25:
                return new q5.j((Context) obj2, new c1.a((CollageInteractiveFrameLayout) obj, 5));
            case 26:
                m47invoke();
                return Unit.f80348a;
            case 27:
                x81.f0 f0Var = (x81.f0) obj2;
                d71.e eVar3 = (d71.e) obj;
                g71.f fVar4 = f0Var.f134204f2;
                if (fVar4 != null && x81.f0.t9(fVar4, f0Var.g8())) {
                    f0Var.f134204f2 = null;
                }
                g71.f fVar5 = f0Var.f134204f2;
                if (fVar5 != null) {
                    return fVar5;
                }
                g71.f fVar6 = new g71.f(f0Var.getContext(), d71.b.VIRTUAL_TRY_ON, null);
                f0Var.f134204f2 = fVar6;
                fVar6.g(eVar3);
                return fVar6;
            case 28:
                m47invoke();
                return Unit.f80348a;
            default:
                m47invoke();
                return Unit.f80348a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c9, code lost:
    
        if (r3.intValue() > 0) goto L64;
     */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m47invoke() {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b01.c.m47invoke():void");
    }
}
