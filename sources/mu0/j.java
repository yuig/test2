package mu0;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.drafts.view.StorageStateView;
import com.pinterest.feature.video.view.IdeaPinVideoExportLoadingView;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import dl1.l;
import h32.f1;
import h32.u0;
import i92.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kh2.n;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import m60.w;
import nx.d0;
import nx.f0;
import sq0.c0;
import wk1.q;
import xk2.m;
import yk1.v;

/* loaded from: classes5.dex */
public final class j extends q implements pw0.i, gg1.b, lg1.e {

    /* renamed from: a, reason: collision with root package name */
    public final iu0.e f88304a;

    /* renamed from: b, reason: collision with root package name */
    public final wf1.b f88305b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f88306c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f88307d;

    /* renamed from: e, reason: collision with root package name */
    public final w f88308e;

    /* renamed from: f, reason: collision with root package name */
    public final b60.b f88309f;

    /* renamed from: g, reason: collision with root package name */
    public final de0.d f88310g;

    /* renamed from: h, reason: collision with root package name */
    public final ag1.b f88311h;

    /* renamed from: i, reason: collision with root package name */
    public final ag1.h f88312i;

    /* renamed from: j, reason: collision with root package name */
    public final g70.h f88313j;

    /* renamed from: k, reason: collision with root package name */
    public final gd0.g f88314k;

    /* renamed from: l, reason: collision with root package name */
    public ln0 f88315l;

    /* renamed from: m, reason: collision with root package name */
    public final lg1.h f88316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lu0.a presenterPinalytics, iu0.e navigator, wf1.b draftStorageState, Context context, f0 pinalyticsFactory, uj2.q networkStateStream, w eventManager, b60.b activeUserManager, de0.d draftDataProvider, pb0.d fuzzyDateFormatter, s1 experiments, ag1.b ideaPinComposeDataManager, ag1.h ideaPinSessionDataManager, tb0.h crashReporting, v viewResources, g70.h boardNavigator) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(draftStorageState, "draftStorageState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f88304a = navigator;
        this.f88305b = draftStorageState;
        this.f88306c = context;
        this.f88307d = pinalyticsFactory;
        this.f88308e = eventManager;
        this.f88309f = activeUserManager;
        this.f88310g = draftDataProvider;
        this.f88311h = ideaPinComposeDataManager;
        this.f88312i = ideaPinSessionDataManager;
        this.f88313j = boardNavigator;
        d0 pinalytics = getPinalytics();
        String uid = com.bumptech.glide.d.Q(activeUserManager).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f88314k = new gd0.g(this, pinalytics, fuzzyDateFormatter, draftDataProvider, uid, experiments, viewResources);
        this.f88316m = new lg1.h(getPinalytics(), crashReporting, (Handler) m.b(g.f88297i).getValue(), this);
    }

    public static final void t3(j jVar) {
        ag1.b bVar = jVar.f88311h;
        ((l) bVar.f15128a).S(bVar.f15136i).s().o(new rf1.v(19, new ag1.a(bVar, 0)), new rf1.v(20, new ag1.a(bVar, 1)));
        ln0 ln0Var = jVar.f88315l;
        iu0.e eVar = jVar.f88304a;
        if ((ln0Var == null || !ln0Var.H()) && !hf0.b.q()) {
            nu0.i iVar = (nu0.i) eVar;
            iVar.getClass();
            iVar.M1(iVar.U8(d2.m(), ml1.b.NO_TRANSITION.getValue()));
            return;
        }
        ln0 ln0Var2 = jVar.f88315l;
        if (ln0Var2 != null) {
            bVar.f15133f = ln0Var2.getPageData();
            bVar.f(ln0Var2.getMetadata());
        }
        nu0.i iVar2 = (nu0.i) eVar;
        ag1.h hVar = iVar2.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        hVar.d(nu0.h.f92329i, false);
        iVar2.M1(iVar2.U8(d2.n(), ml1.b.DEFAULT_TRANSITION.getValue()));
    }

    public static NavigationImpl u3(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NavigationImpl z03 = Navigation.z0(d2.b(), url);
        z03.Y1("com.pinterest.EXTRA_FORCE_WEBVIEW", true);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    @Override // lg1.e
    public final void D0(boolean z13) {
        vn0 a13;
        String str;
        if (z13) {
            int i13 = 0;
            h hVar = new h(this, i13);
            h hVar2 = new h(this, 1);
            ln0 ln0Var = this.f88315l;
            if (ln0Var == null) {
                return;
            }
            LinkedHashMap linkedHashMap = this.f88316m.f83267e;
            tp pageData = ln0Var.getPageData();
            if (pageData != null) {
                vn0.f42926f.getClass();
                vn0 vn0Var = new vn0(q0.f80391a, 0, 0L, 0, 0L);
                if (pageData.getMediaList().y()) {
                    bo0 e13 = pageData.getMediaList().e();
                    if (e13.x()) {
                        a13 = vn0Var;
                    } else {
                        d30 photoItem = e13.getPhotoItem();
                        Intrinsics.f(photoItem);
                        k01 k01Var = (k01) linkedHashMap.get(photoItem.e());
                        xk2.w Z = k01Var != null ? ig1.b.Z(this.f88306c, (float) ln0Var.getMetadata().getCanvasAspectRatio().d(), ((Number) k01Var.f39240c.f135234a).intValue(), ((Number) k01Var.f39240c.f135235b).intValue()) : new xk2.w(null, null, null);
                        a13 = vn0.a(pageData.getMediaList(), e0.b(bo0.a(e13, k01Var, 0L, 5000L, (Matrix) Z.f135235b, (Matrix) Z.f135236c, 0.0f, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO)), 0, 0L, 0, 5000L, 14);
                        i13 = 1;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (bo0 bo0Var : pageData.getMediaList().getItems()) {
                        d30 photoItem2 = bo0Var.getPhotoItem();
                        k01 videoItem = bo0Var.getVideoItem();
                        if (photoItem2 == null || (videoItem != null && videoItem.f39242e == 10000000)) {
                            arrayList.add(bo0Var);
                        } else {
                            arrayList.add(bo0.a(bo0Var, (k01) linkedHashMap.get(photoItem2.e()), 0L, 0L, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_PIN_CLUSTER));
                            i13 = 1;
                        }
                    }
                    a13 = vn0.a(pageData.getMediaList(), arrayList, 0, 0L, 0, 0L, 30);
                }
                if (i13 != 0) {
                    str = null;
                    pageData = tp.e(pageData, null, null, a13, null, null, null, null, null, null, null, null, null, 4091);
                } else {
                    str = null;
                }
                wy0 f13 = ((b60.d) this.f88309f).f();
                String uid = f13 != null ? f13.getUid() : str;
                if (uid == null) {
                    uid = "";
                }
                xj2.c o13 = this.f88310g.d(ln0.a(ln0Var, null, pageData, null, null, null, null, false, null, null, null, null, 16379), uid).r(tk2.e.f118017c).l(wj2.c.a()).o(new a(1, new com.pinterest.feature.ideaPinCreation.closeup.view.d0(2, hVar)), new a(2, new com.pinterest.feature.ideaPinCreation.closeup.view.d0(3, hVar2)));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                addDisposable(o13);
            }
        }
    }

    @Override // gg1.b
    public final void E6(hg1.d optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        int i13 = b.f88283b[optionType.ordinal()];
        iu0.e eVar = this.f88304a;
        switch (i13) {
            case 1:
                wy0 f13 = ((b60.d) this.f88309f).f();
                String G2 = f13 != null ? f13.G2() : null;
                gg1.b.f64972so.getClass();
                String str = (String) gg1.a.f64971b.get(G2);
                if (str == null) {
                    str = "768145348882884282";
                }
                g70.h.b(this.f88313j, str, new d(this, 3));
                break;
            case 2:
                ((nu0.i) eVar).V8(u3("https://help.pinterest.com/guide/guide-to-creating-pins"));
                break;
            case 3:
                ((nu0.i) eVar).V8(u3("https://business.pinterest.com/creative-best-practices/"));
                break;
            case 4:
                ((nu0.i) eVar).V8(u3("https://business.pinterest.com/creators/"));
                break;
            case 5:
                ((nu0.i) eVar).V8(u3("https://business.pinterest.com/creator-code/"));
                break;
            case 6:
                nu0.i iVar = (nu0.i) ((iu0.a) getView());
                iVar.getClass();
                iVar.M1(iVar.U8(d2.e(), ml1.b.NO_TRANSITION.getValue()));
                break;
            case 7:
                ((nu0.i) eVar).V8(u3("https://help.pinterest.com/business/article/pinterest-analytics"));
                break;
        }
    }

    @Override // gg1.b
    public final void M2(hg1.b optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        int i13 = b.f88284c[optionType.ordinal()];
        if (i13 == 1) {
            this.f88308e.d(new jc0.v(new yf1.b((xf1.a) null, 3), false, 0L, 30));
        } else {
            if (i13 != 2) {
                return;
            }
            ((nu0.i) this.f88304a).V8(u3("https://help.pinterest.com"));
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f88314k);
    }

    @Override // pw0.i
    public final void i0() {
        this.f88316m.a();
        ((nu0.i) ((iu0.a) getView())).W8(false);
    }

    @Override // lg1.e
    public final boolean m1() {
        return !hf0.b.q();
    }

    public final void v3(n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof iu0.b) {
            getPinalytics().X(u0.CLOSE_BUTTON);
            ((nu0.i) this.f88304a).D5();
            return;
        }
        boolean z13 = action instanceof iu0.c;
        w wVar = this.f88308e;
        if (z13) {
            getPinalytics().X(u0.STORY_PIN_QUESTION_BUTTON);
            wVar.d(new jc0.v(new rv0.a(this, this.f88307d), false, 0L, 30));
        } else if (action instanceof iu0.d) {
            wVar.d(new jc0.v(new yf1.b((xf1.a) null, 3), false, 0L, 30));
        }
    }

    @Override // lg1.e
    public final void w(boolean z13, String error, d30 mediaItem) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.f88316m.a();
        if (isBound()) {
            ((nu0.i) ((iu0.a) getView())).W8(false);
            iu0.a aVar = (iu0.a) getView();
            int i13 = z13 ? dq1.f.story_pin_creation_error_no_space_left : dq1.f.image_to_video_conversion_error;
            k kVar = ((nu0.i) aVar).B0;
            if (kVar != null) {
                kVar.k(i13);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] */
    public final void r3(iu0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        xj2.c F = this.f88314k.m().F(new au0.h(29, new d(this, 1)), new a(0, e.f88290k), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
        int[] iArr = b.f88282a;
        wf1.b storageState = this.f88305b;
        int i13 = iArr[storageState.ordinal()];
        if (i13 == 1) {
            d0.v(getPinalytics(), f1.STORY_PIN_MULTI_DRAFTS_APPROACH_LIMIT, null, false, 12);
        } else if (i13 == 2) {
            d0.v(getPinalytics(), f1.STORY_PIN_MULTI_DRAFTS_REACH_LIMIT, null, false, 12);
        }
        nu0.i iVar = (nu0.i) ((iu0.a) getView());
        iVar.getClass();
        Intrinsics.checkNotNullParameter(storageState, "storageState");
        StorageStateView storageStateView = iVar.E0;
        if (storageStateView == null) {
            Intrinsics.r("storageStateView");
            throw null;
        }
        storageStateView.L(storageState);
        Intrinsics.checkNotNullParameter(this, "listener");
        IdeaPinVideoExportLoadingView ideaPinVideoExportLoadingView = ((nu0.i) view).J0;
        if (ideaPinVideoExportLoadingView != null) {
            ideaPinVideoExportLoadingView.L(this);
        } else {
            Intrinsics.r("videoExportLoadingView");
            throw null;
        }
    }
}
