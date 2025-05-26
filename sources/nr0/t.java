package nr0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.b0;
import df.j1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import pk.h1;
import so.na;
import so.oa;
import so.sa;
import yk1.v;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final wk2.a f91884a;

    public t(na viewBindersLoader) {
        Intrinsics.checkNotNullParameter(viewBindersLoader, "viewBindersLoader");
        this.f91884a = viewBindersLoader;
    }

    public final LinkedHashMap a(uk1.d presenterPinalytics, nx.a analyticsContextProvider, wa2.i pinFeatureConfig, qa2.n gridFeatureConfig, v viewResources) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        tc2.a aVar = (tc2.a) this.f91884a.get();
        String trafficSource = pinFeatureConfig.f128792q0;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(analyticsContextProvider, "analyticsContextProvider");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        pd.s sVar = (pd.s) aVar.f117365a;
        sVar.getClass();
        presenterPinalytics.getClass();
        sVar.f99748b = presenterPinalytics;
        sVar.f99749c = analyticsContextProvider;
        sVar.f99750d = pinFeatureConfig;
        gridFeatureConfig.getClass();
        sVar.f99751e = gridFeatureConfig;
        viewResources.getClass();
        sVar.f99752f = viewResources;
        trafficSource.getClass();
        sVar.f99753g = trafficSource;
        dl2.b.G(uk1.d.class, (uk1.d) sVar.f99748b);
        dl2.b.G(nx.a.class, (nx.a) sVar.f99749c);
        dl2.b.G(wa2.i.class, (wa2.i) sVar.f99750d);
        dl2.b.G(qa2.n.class, (qa2.n) sVar.f99751e);
        dl2.b.G(v.class, (v) sVar.f99752f);
        dl2.b.G(String.class, (String) sVar.f99753g);
        sa saVar = (sa) ((tc2.c) j1.b0(tc2.c.class, new sa((oa) sVar.f99747a, (uk1.d) sVar.f99748b, (wa2.i) sVar.f99750d, (qa2.n) sVar.f99751e, (v) sVar.f99752f, (String) sVar.f99753g)));
        saVar.getClass();
        b0 b13 = h1.b(68);
        b13.e(64, saVar.f114604g);
        b13.e(20, saVar.f114606i);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL), saVar.f114609l);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD), saVar.f114611n);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_INLINE_AD_FULL_SPAN), saVar.f114611n);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE), saVar.f114612o);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_IMAGE_FULL_SPAN), saVar.f114612o);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO), saVar.f114613p);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_APP_INSTALL_VIDEO_FULL_SPAN), saVar.f114613p);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE), saVar.f114614q);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_IMAGE_FULL_SPAN), saVar.f114614q);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO), saVar.f114615r);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN), saVar.f114615r);
        b13.e(27, saVar.f114616s);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_ARTICLE_CAROUSEL), saVar.f114618u);
        b13.e(15, saVar.f114619v);
        b13.e(43, saVar.f114620w);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE), saVar.f114621x);
        b13.e(65, saVar.f114622y);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SIMPLE_ACTION_STORY), saVar.f114623z);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER), saVar.A);
        b13.e(255, saVar.B);
        b13.e(40, saVar.C);
        b13.e(41, saVar.C);
        b13.e(44, saVar.E);
        b13.e(16, saVar.F);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN), saVar.G);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE), saVar.G);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_CAROUSEL), saVar.I);
        b13.e(1, saVar.f114597J);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE), saVar.f114597J);
        b13.e(2, saVar.f114597J);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE), saVar.f114597J);
        b13.e(3, saVar.K);
        b13.e(8, saVar.K);
        b13.e(4, saVar.K);
        b13.e(9, saVar.K);
        b13.e(6, saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_VIDEO_AD_EXCLUDE), saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS), saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS_AD_EXCLUDE), saVar.K);
        b13.e(12, saVar.K);
        b13.e(10, saVar.K);
        b13.e(11, saVar.K);
        b13.e(5, saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_VIDEO_AD_EXCLUDE), saVar.K);
        b13.e(7, saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO), saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PROMOTED_PIN_VIDEO_AD_EXCLUDE), saVar.K);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_PIN_WEBVIEW_AD), saVar.K);
        b13.e(13, saVar.L);
        b13.e(14, saVar.L);
        b13.e(24, saVar.M);
        b13.e(89, saVar.N);
        b13.e(90, saVar.N);
        b13.e(42, saVar.O);
        b13.e(32, saVar.P);
        b13.e(33, saVar.P);
        b13.e(28, saVar.P);
        b13.e(29, saVar.P);
        b13.e(30, saVar.P);
        b13.e(31, saVar.P);
        b13.e(35, saVar.P);
        b13.e(36, saVar.P);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL), saVar.R);
        b13.e(19, saVar.T);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE), saVar.U);
        b13.e(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_DOUBLE), saVar.U);
        linkedHashMap.putAll(b13.a());
        return linkedHashMap;
    }

    public final LinkedHashMap b(uk1.d presenterPinalytics, wa2.i pinFeatureConfig, qa2.n gridFeatureConfig, v viewResources) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        return a(presenterPinalytics, new s(presenterPinalytics), pinFeatureConfig, gridFeatureConfig, viewResources);
    }
}
