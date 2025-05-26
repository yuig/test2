package k61;

import android.view.View;
import androidx.recyclerview.widget.y2;
import c71.b0;
import c71.z;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fj;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.k0;
import com.pinterest.repository.TypedId;
import dl1.s;
import ew.l;
import ew.n;
import h61.h;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import k81.k;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.g3;
import lh0.z3;
import m60.w;
import nx.d0;
import nx.f0;
import oa2.p;
import oa2.r;
import sq0.m;
import uj2.q;
import x02.i2;
import x02.x2;
import xk2.v;
import z32.e1;
import z32.m0;
import z32.r2;
import zd1.e0;
import zy.q0;

/* loaded from: classes5.dex */
public final class h extends com.pinterest.framework.multisection.datasource.pagedlist.c implements mz.g {
    public String L;
    public final Function0 M;
    public final boolean N;
    public final uk1.d O;
    public final w P;
    public final g3 Q;
    public final dz0.d R;
    public final z S;
    public final l T;
    public final ds.a U;
    public final e0 V;
    public final Function0 W;
    public final y61.a X;
    public final g70.h Y;
    public final s92.i Z;

    /* renamed from: a0, reason: collision with root package name */
    public b0 f78408a0;

    /* renamed from: b0, reason: collision with root package name */
    public b0 f78409b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f78410c0;

    /* renamed from: d0, reason: collision with root package name */
    public final g1.g f78411d0;

    /* renamed from: e0, reason: collision with root package name */
    public wk1.d f78412e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f78413f0;

    /* renamed from: g0, reason: collision with root package name */
    public final v f78414g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(final b0 searchParams, String lastSearchQuery, Function0 hasEarlierPins, final boolean z13, uk1.d presenterPinalytics, q networkStateStream, w eventManager, g3 experiments, wa2.i pinFeatureConfig, yk1.v viewResources, nr0.l viewBinderDelegate, sq0.f imagePreFetcher, m mVar, ol1.d feedbackObservable, ku1.l uriNavigator, nu1.a inAppNavigator, c91.f onDemandModuleController, i2 pinRepository, x2 userRepository, k remoteRequestListener, dz0.d oneTapUtils, z oneTapFeedViewListener, pb0.d fuzzyDateFormatter, b60.b activeUserManager, p legoUserRepPresenterFactory, cz.e anketManager, f0 pinalyticsFactory, ni0.e adsCarouselPresenterFactory, l adsGmaHeaderManager, ds.a adNetwork, q0 unscopedPinalyticsSEPFactory, e0 e0Var, ee1.f emptyStateFilterRemovalButtonListener, d0 pinalytics, c71.v oneBarModules, y61.a searchIntentTracker, g70.h boardNavigator) {
        super(ph.a.e(searchParams), viewBinderDelegate, imagePreFetcher, mVar, feedbackObservable, null, new lk1.a() { // from class: com.pinterest.feature.search.results.datasource.SearchGridPagedList$2
            @Override // lk1.a
            public final boolean b(s model) {
                Intrinsics.checkNotNullParameter(model, "model");
                return (!z13 || (model instanceof f30) || searchParams.f26728a == h.USERS) ? false : true;
            }
        }, null, remoteRequestListener, 0L, null, 7072);
        Intrinsics.checkNotNullParameter(searchParams, "searchParams");
        Intrinsics.checkNotNullParameter(lastSearchQuery, "lastSearchQuery");
        Intrinsics.checkNotNullParameter(hasEarlierPins, "hasEarlierPins");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(imagePreFetcher, "imagePreFetcher");
        Intrinsics.checkNotNullParameter(feedbackObservable, "feedbackObservable");
        Intrinsics.checkNotNullParameter(uriNavigator, "uriNavigator");
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(onDemandModuleController, "onDemandModuleController");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(remoteRequestListener, "remoteRequestListener");
        Intrinsics.checkNotNullParameter(oneTapUtils, "oneTapUtils");
        Intrinsics.checkNotNullParameter(oneTapFeedViewListener, "oneTapFeedViewListener");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(legoUserRepPresenterFactory, "legoUserRepPresenterFactory");
        Intrinsics.checkNotNullParameter(anketManager, "anketManager");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(adsCarouselPresenterFactory, "adsCarouselPresenterFactory");
        Intrinsics.checkNotNullParameter(adsGmaHeaderManager, "adsGmaHeaderManager");
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(emptyStateFilterRemovalButtonListener, "emptyStateFilterRemovalButtonListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(oneBarModules, "oneBarModules");
        Intrinsics.checkNotNullParameter(searchIntentTracker, "searchIntentTracker");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.L = lastSearchQuery;
        this.M = hasEarlierPins;
        this.N = z13;
        this.O = presenterPinalytics;
        this.P = eventManager;
        this.Q = experiments;
        this.R = oneTapUtils;
        this.S = oneTapFeedViewListener;
        this.T = adsGmaHeaderManager;
        this.U = adNetwork;
        this.V = e0Var;
        this.W = oneBarModules;
        this.X = searchIntentTracker;
        this.Y = boardNavigator;
        this.Z = s92.i.SEARCH_FEED_RENDER;
        this.f78409b0 = searchParams;
        this.f78410c0 = true;
        this.f78411d0 = new g1.g(0);
        o0(searchParams);
        c(new int[]{45, 46, 47}, new rk1.g(presenterPinalytics, r.f93954c, legoUserRepPresenterFactory));
        o(21, new ni0.f(onDemandModuleController, presenterPinalytics, inAppNavigator));
        o(RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN, new yi0.a(presenterPinalytics, userRepository));
        o(22, new d91.g(presenterPinalytics, onDemandModuleController, false, inAppNavigator));
        o(23, new d91.g(presenterPinalytics, onDemandModuleController, true, inAppNavigator));
        o(56, new ni0.f(fuzzyDateFormatter, experiments, boardNavigator));
        o(57, new sz0.a(20));
        oneTapUtils.getClass();
        Intrinsics.checkNotNullParameter(this, "delegateDataSource");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        dz0.a aVar = new dz0.a(oneTapUtils.f56660c);
        c(new int[]{RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN}, new ez0.b(pinFeatureConfig, aVar, 1));
        o(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL, new ez0.b(pinFeatureConfig, aVar, 0));
        c(new int[]{RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY, RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE}, new ke1.e(presenterPinalytics, networkStateStream, false, eventManager, viewResources, new c(this, 0), ke1.b.SEARCH, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN));
        o(26, new aj0.d(presenterPinalytics, networkStateStream, pinRepository, uriNavigator, onDemandModuleController, userRepository));
        o(RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER, new yo0.a(presenterPinalytics, networkStateStream, userRepository, (String) null, (i1.h) null, onDemandModuleController, RecyclerViewTypes.VIEW_TYPE_MESSAGES_HEADER));
        wy0 f13 = ((b60.d) activeUserManager).f();
        ka2.a aVar2 = experiments.c() ? ka2.a.f78935q : new ka2.a(null, false, false, null, true, false, true, true, null, false, false, false, false, false, 57135);
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        o(RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL, new yo0.a(new d(this, 0), new e(this, 0), f13, fuzzyDateFormatter, new ka2.c(d0Var, (gx0.b) null, 6), aVar2, RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL));
        o(61, new h90.m(searchParams.f26738j, 18, 0));
        o(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, new cg0.c(8, presenterPinalytics, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL, new ni0.f(networkStateStream, adsCarouselPresenterFactory, presenterPinalytics));
        o(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN, new mz.f(anketManager, networkStateStream, presenterPinalytics, this));
        o(RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW, new mz.f(anketManager, networkStateStream, presenterPinalytics, this));
        o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID, new cg0.c(6, presenterPinalytics, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD, new ef1.a(presenterPinalytics, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL, new cg0.c(7, presenterPinalytics, networkStateStream));
        o(RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF, new aj0.d(presenterPinalytics, networkStateStream, viewResources, emptyStateFilterRemovalButtonListener, pinalytics, e0Var));
        W(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, new xs0.l(unscopedPinalyticsSEPFactory), new e(this, 1));
        this.f78414g0 = xk2.m.b(new c(this, 2));
    }

    public static byte[] g0(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        Writer outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, UTF_8);
        BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
        try {
            bufferedWriter.write(str);
            bufferedWriter.close();
            Unit unit = Unit.f80348a;
            dl2.b.J(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }

    public static void m0(qz.f0 f0Var, String str, String str2) {
        if ((str2 != null && kotlin.text.z.j(str2)) || str2 == null || str2.length() == 0) {
            return;
        }
        f0Var.e(str, str2);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.h0, nr0.a
    public final gb2.l[] E(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Object[] E = super.E(uid);
        Object obj = this.f78411d0.get(uid);
        if (obj != null) {
            if (E == null) {
                E = new gb2.l[]{obj};
            } else if (!c0.y(E, obj)) {
                E = kotlin.collections.z.t(E, obj);
            }
        }
        return (gb2.l[]) E;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final s92.i L() {
        return this.Z;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(kotlin.jvm.internal.r requestState) {
        qz.f0 f0Var;
        qz.f0 f0Var2;
        qz.f0 f0Var3;
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        if ((requestState instanceof k0) && (f0Var2 = this.f49121k) != null && f0Var2.b("link_header") && (f0Var3 = this.f49121k) != null) {
            f0Var3.h("link_header");
        }
        ew.c cVar = (ew.c) this.T;
        if (cVar.f60290g) {
            cVar.c(n.SEARCH, this.f49120j);
        }
        g3 g3Var = this.Q;
        g3Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) g3Var.f83374a;
        if ((g1Var.o("android_ad_connection_type", "enabled", z3Var) || g1Var.l("android_ad_connection_type")) && (f0Var = this.f49121k) != null) {
            f0Var.c(((ds.d) this.U).a(), "connection_type");
        }
        return super.M(requestState);
    }

    @Override // mz.g
    public final y2 M1(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        wk1.d dVar = this.f78412e0;
        if (dVar != null) {
            return dVar.x(view);
        }
        return null;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final boolean O() {
        return true;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void Z() {
        super.Z();
        this.f78413f0 = false;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        y61.a aVar = this.X;
        int i13 = aVar.f137911b + 1;
        aVar.f137911b = i13;
        aVar.f137910a.d(new qg0.b(i13));
        super.b0(i0(j0(k0(itemsToSet))), z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean f(int i13) {
        return i13 == 56 || i13 == 57 || this.E.f(i13);
    }

    public final boolean f0(Set set) {
        List<s> d2 = d();
        if ((d2 instanceof Collection) && d2.isEmpty()) {
            return false;
        }
        for (s sVar : d2) {
            if ((sVar instanceof b71.c) && set.contains(((b71.c) sVar).f22090b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        Integer num;
        Integer num2;
        s item = getItem(i13);
        boolean z13 = item instanceof f30;
        nr0.k kVar = this.E;
        if (z13) {
            int itemViewType = kVar.getItemViewType(i13);
            if (!((Boolean) this.f78414g0.getValue()).booleanValue()) {
                return itemViewType;
            }
            this.R.getClass();
            v vVar = dz0.d.f56657d;
            return (!((Map) vVar.getValue()).containsKey(Integer.valueOf(itemViewType)) || (num2 = (Integer) ((Map) vVar.getValue()).get(Integer.valueOf(itemViewType))) == null) ? itemViewType : num2.intValue();
        }
        if (item instanceof v7) {
            return RecyclerViewTypes.VIEW_TYPE_SEARCH_BOARD_CELL;
        }
        if (item instanceof b71.c) {
            return ((b71.c) item).f22090b == b71.b.SEARCH_YOUR_BOARDS ? 56 : 57;
        }
        if (!(item instanceof vh)) {
            if (!(item instanceof wy0)) {
                return item instanceof ee1.i ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF : kVar.getItemViewType(i13);
            }
            Map F2 = ((wy0) item).F2();
            return (F2 == null || F2.isEmpty()) ? 46 : 47;
        }
        s item2 = getItem(i13);
        Intrinsics.g(item2, "null cannot be cast to non-null type com.pinterest.api.model.DynamicStory");
        vh vhVar = (vh) item2;
        HashMap E = kh2.d.E(vhVar);
        E.put("grid_index", String.valueOf(i13));
        E.put("entered_query", this.f78409b0.f26730b);
        E.put("rs", this.f78409b0.f26739k);
        if (vhVar.t0()) {
            return 21;
        }
        if (vhVar.l0()) {
            return RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN;
        }
        if (vhVar.u0()) {
            kh khVar = vhVar.f42858p;
            if (khVar == null || (num = khVar.l()) == null) {
                num = 1;
            }
            return num.intValue() == 2 ? 23 : 22;
        }
        if (vhVar.r0()) {
            m0 m0Var = vhVar.f42868z;
            r6 = m0Var != null ? f.f78406b[m0Var.ordinal()] : -1;
            if (r6 != 1) {
                return r6 != 2 ? kVar.getItemViewType(i13) : RecyclerViewTypes.VIEW_TYPE_VTO_BUBBLE_CONTAINER;
            }
        } else {
            if (!vhVar.q0()) {
                if (vhVar.b0()) {
                    return RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY;
                }
                if (kotlin.text.z.i(vhVar.q(), "shop_article_story", true)) {
                    return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BUBBLES_PACKAGE_GRID_MODULE;
                }
                if (vhVar.Z() || vhVar.a0() || vhVar.m0()) {
                    return 61;
                }
                if (vhVar.f42868z == m0.TODAY_ARTICLE_SECTION) {
                    return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION;
                }
                if (vhVar.F()) {
                    return RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL;
                }
                if (vhVar.G()) {
                    kh khVar2 = vhVar.f42858p;
                    Integer l13 = khVar2 != null ? khVar2.l() : null;
                    return (l13 != null && l13.intValue() == 1) ? RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW : RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN;
                }
                if (!vhVar.e0()) {
                    return vhVar.f42868z == m0.SEE_IT_STYLED_MODULE ? RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE : kVar.getItemViewType(i13);
                }
                int size = kg.a.i0(vhVar).f138879a.size();
                g3 g3Var = this.Q;
                if (size >= 4 && g3Var.o("enabled_frontend_v_two")) {
                    r6 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_CARD;
                } else if (size >= 6 && g3Var.o("enabled_frontend_v_one")) {
                    r6 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_GRID;
                } else if (size >= 4 && (g3Var.o("enabled_frontend_v_five") || g3Var.o("employees"))) {
                    r6 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIT_THUMBNAIL;
                }
                return r6;
            }
            m0 m0Var2 = vhVar.f42868z;
            r6 = m0Var2 != null ? f.f78406b[m0Var2.ordinal()] : -1;
            if (r6 != 1) {
                if (r6 != 3) {
                    return kVar.getItemViewType(i13);
                }
                return 24;
            }
        }
        return 26;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:0|1|(2:3|(33:5|(1:7)|8|(1:10)(1:90)|11|(1:13)(1:89)|14|(4:(1:19)|20|(1:22)|(1:24))|25|(1:27)|28|(1:30)(1:82)|31|(1:33)(2:79|(1:81))|34|(1:36)|37|(1:39)(1:78)|40|41|42|(1:50)|51|(1:55)|56|(1:58)|59|(3:61|(2:64|62)|65)|66|(1:70)|71|(1:73)|74))|91|(1:93)(1:95)|94|(0)|8|(0)(0)|11|(0)(0)|14|(30:16|(0)|20|(0)|(0)|25|(0)|28|(0)(0)|31|(0)(0)|34|(0)|37|(0)(0)|40|41|42|(4:44|46|48|50)|51|(2:53|55)|56|(0)|59|(0)|66|(2:68|70)|71|(0)|74)|84|(0)|20|(0)|(0)|25|(0)|28|(0)(0)|31|(0)(0)|34|(0)|37|(0)(0)|40|41|42|(0)|51|(0)|56|(0)|59|(0)|66|(0)|71|(0)|74) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        r7.toString();
        r2.e("fields", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qz.f0 h0(c71.b0 r22) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k61.h.h0(c71.b0):qz.f0");
    }

    @Override // wt1.b
    public final boolean i() {
        return this.f78410c0;
    }

    public final ArrayList i0(ArrayList arrayList) {
        Object obj;
        e0 e0Var;
        boolean z13 = (arrayList.isEmpty() ^ true) || (d().isEmpty() ^ true);
        ArrayList H0 = CollectionsKt.H0(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s sVar = (s) obj;
            vh vhVar = sVar instanceof vh ? (vh) sVar : null;
            if (Intrinsics.d(vhVar != null ? vhVar.q() : null, "inclusive_fallback_related_searches")) {
                break;
            }
        }
        if (obj == null && (e0Var = this.V) != null && !t0() && !this.f78413f0 && z13 && e0Var.f141708c.size() > 0) {
            H0.add(new ee1.i((List) this.W.invoke(), null, 2, null));
            this.f78413f0 = true;
        }
        return H0;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, vq0.f
    public final void i2() {
        Unit unit;
        b0 b0Var = this.f78408a0;
        if (b0Var != null) {
            B(M(new com.pinterest.framework.multisection.datasource.pagedlist.m0()).prepare(new Object[]{ph.a.e(b0Var), h0(b0Var), new TypedId[0], this.f49111a, 0L}), new y11.c(20, this, b0Var), new d(this, 1), new d(this, 2));
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.i2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        if (t0() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList j0(java.util.ArrayList r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = kotlin.collections.CollectionsKt.H0(r11)
            boolean r1 = r11.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
        Lc:
            r11 = r3
            goto L23
        Le:
            java.util.Iterator r11 = r11.iterator()
        L12:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r11.next()
            dl1.s r1 = (dl1.s) r1
            boolean r1 = r1 instanceof com.pinterest.api.model.f30
            if (r1 == 0) goto L12
            r11 = r2
        L23:
            java.util.List r1 = r10.d()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L37
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L37
            goto L4c
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r1.next()
            dl1.s r4 = (dl1.s) r4
            boolean r4 = r4 instanceof com.pinterest.api.model.f30
            if (r4 == 0) goto L3b
            goto L55
        L4c:
            if (r11 != 0) goto L55
            boolean r1 = r10.t0()
            if (r1 != 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            c71.b0 r1 = r10.f78409b0
            h61.h r1 = r1.f26728a
            h61.h r4 = h61.h.MY_PINS
            if (r1 != r4) goto L80
            boolean r1 = r10.N
            if (r1 != 0) goto L80
            b71.b r1 = b71.b.SEARCH_YOUR_BOARDS
            java.util.Set r4 = kotlin.collections.g1.b(r1)
            boolean r4 = r10.f0(r4)
            if (r4 != 0) goto L80
            b71.c r11 = new b71.c
            c71.b0 r4 = r10.f78409b0
            java.lang.String r4 = r4.f26730b
            k61.g r5 = new k61.g
            r5.<init>(r2)
            r11.<init>(r4, r1, r5)
            r0.add(r3, r11)
            goto Lbf
        L80:
            c71.b0 r1 = r10.f78409b0
            boolean r1 = r1.f26742n
            if (r1 == 0) goto Lbf
            if (r11 == 0) goto Lbf
            kotlin.jvm.functions.Function0 r11 = r10.M
            java.lang.Object r11 = r11.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9a
            b71.b r11 = b71.b.SEARCH_MORE_IDEAS_FOR_EXISTING_SEARCH_RESULTS
        L98:
            r6 = r11
            goto L9d
        L9a:
            b71.b r11 = b71.b.SEARCH_MORE_IDEAS_FOR_EMPTY_SEARCH_RESULTS
            goto L98
        L9d:
            b71.b r11 = b71.b.SEARCH_MORE_IDEAS_FOR_EXISTING_SEARCH_RESULTS
            b71.b r1 = b71.b.SEARCH_MORE_IDEAS_FOR_EMPTY_SEARCH_RESULTS
            b71.b[] r11 = new b71.b[]{r11, r1}
            java.util.Set r11 = kotlin.collections.h1.f(r11)
            boolean r11 = r10.f0(r11)
            if (r11 != 0) goto Lbf
            b71.c r11 = new b71.c
            c71.b0 r1 = r10.f78409b0
            java.lang.String r5 = r1.f26730b
            r9 = 0
            r7 = 0
            r8 = 4
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.add(r3, r11)
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k61.h.j0(java.util.ArrayList):java.util.ArrayList");
    }

    public final ArrayList k0(List list) {
        String str;
        ArrayList H0 = CollectionsKt.H0(list);
        s sVar = (s) CollectionsKt.U(0, d());
        int i13 = 1;
        boolean z13 = (sVar instanceof vh) && ((vh) sVar).f42868z == m0.STRUCTURED_FEED_HEADER;
        v b13 = xk2.m.b(new c(this, i13));
        String str2 = this.f78409b0.P;
        if (str2 != null && !kotlin.text.z.j(str2) && (str = this.f78409b0.Q) != null && !kotlin.text.z.j(str) && !z13 && !((Boolean) b13.getValue()).booleanValue()) {
            vh vhVar = new vh(UUID.randomUUID().toString());
            vhVar.S0("story");
            vhVar.M0("guided_search_results_header");
            vhVar.f42868z = m0.STRUCTURED_FEED_HEADER;
            vhVar.f42855m = new kj(this.f78409b0.P);
            vhVar.R = new kj(this.f78409b0.Q);
            kh khVar = new kh();
            r2 r2Var = r2.NONE;
            khVar.r(new fj(Integer.valueOf(r2Var.getValue()), null, Integer.valueOf(e1.MEDIUM.getValue()), Integer.valueOf(r2Var.getValue()), null, Integer.valueOf(r2Var.getValue()), null, null, null, null, null, null, null));
            vhVar.f42858p = khVar;
            Unit unit = Unit.f80348a;
            H0.add(0, vhVar);
        }
        return H0;
    }

    @Override // mz.g
    public final mz.b l0() {
        return new mz.b(this.L, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(c71.b0 r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k61.h.o0(c71.b0):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void w(List itemsToAppend, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        ArrayList H0 = CollectionsKt.H0(j0(k0(itemsToAppend)));
        List d2 = d();
        if (!(d2 instanceof Collection) || !d2.isEmpty()) {
            Iterator it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if ((sVar instanceof vh) && ((vh) sVar).G()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = H0.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        s sVar2 = (s) next;
                        if (!(sVar2 instanceof vh) || !((vh) sVar2).G()) {
                            arrayList.add(next);
                        }
                    }
                    H0 = arrayList;
                }
            }
        }
        super.w(i0(H0), z13);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        return this.L;
    }
}
