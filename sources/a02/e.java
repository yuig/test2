package a02;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.appcompat.app.n;
import ao2.j0;
import com.google.gson.reflect.TypeToken;
import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.activity.library.modal.PinEditModalViewProviderImpl;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.DynamicFeed;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.UserFeed;
import com.pinterest.api.model.cb0;
import com.pinterest.api.model.cn;
import com.pinterest.api.model.cv;
import com.pinterest.api.model.deserializer.BoardDeserializer;
import com.pinterest.api.model.deserializer.BoardToolDeserializerAdapter;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.api.model.deserializer.NestedBoardSectionNameRecommendationDeserializer;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.eq;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ga;
import com.pinterest.api.model.gv;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.i10;
import com.pinterest.api.model.ia0;
import com.pinterest.api.model.k8;
import com.pinterest.api.model.kb0;
import com.pinterest.api.model.kv;
import com.pinterest.api.model.la;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.m10;
import com.pinterest.api.model.qz;
import com.pinterest.api.model.tu;
import com.pinterest.api.model.uz;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.y40;
import com.pinterest.api.model.yc0;
import com.pinterest.api.model.yy;
import com.pinterest.database.PinterestDatabase;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.results.view.SearchGridMultiSectionFragment;
import com.pinterest.feature.search.typeahead.model.SearchTypeaheadItemFeed;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import com.pinterest.screens.w1;
import cp1.p;
import df.j1;
import dl1.t0;
import e21.v;
import ea1.v0;
import ev.h;
import fa0.t;
import h32.a4;
import h32.d4;
import i92.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import lh0.d3;
import lh0.n1;
import lh0.t2;
import lh0.z3;
import li1.m;
import m60.f0;
import m60.w;
import n60.o;
import oc0.q;
import okhttp3.Cache;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import pq2.c1;
import pq2.d1;
import q71.a1;
import q91.g1;
import q91.i0;
import q91.q0;
import q91.s0;
import q91.u0;
import q91.w0;
import rc0.b0;
import rc0.b1;
import rc0.c0;
import rc0.h0;
import rc0.k0;
import rc0.l0;
import rc0.m0;
import rc0.o0;
import rc0.p0;
import rc0.r0;
import rc0.s;
import rc0.x;
import ro2.u;
import t00.l;
import t3.f2;
import tc0.d0;
import tc0.e0;
import tc0.g0;
import tc0.j;
import tc0.n0;
import tc0.y;
import uc0.a2;
import uc0.c2;
import uc0.e1;
import uc0.e2;
import uc0.g2;
import uc0.k2;
import uc0.m1;
import uc0.m2;
import uc0.n2;
import uc0.o1;
import uc0.o2;
import uc0.q2;
import uc0.s1;
import uc0.u1;
import uc0.v2;
import uc0.x0;
import uc0.y1;
import vb0.i;
import vu1.a0;
import x02.i2;
import x02.j2;
import x02.q1;

/* loaded from: classes4.dex */
public abstract class e implements bf2.d {
    public static v A() {
        return new v();
    }

    public static a1 A0() {
        return new a1();
    }

    public static p00.b A1(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static uc0.h1 A2(android.content.Context r14, org.chromium.net.y r15) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r1 = "stateProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            uc0.h1 r15 = new uc0.h1
            int r0 = oc0.q.back
            int r1 = oc0.q.iconographyTitle
            h3.f r2 = ph.a.B()
            uc0.k1 r3 = new uc0.k1
            r3.<init>(r0, r1, r0, r2)
            java.lang.Class<sm1.b> r0 = sm1.b.class
            java.lang.reflect.Field[] r0 = r0.getFields()
            kotlin.jvm.internal.Intrinsics.f(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r2) goto La4
            r6 = r0[r5]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r9 = "ic_"
            boolean r7 = kotlin.text.z.p(r7, r9, r4)
            if (r7 == 0) goto L9b
            java.lang.String r7 = r6.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r10 = "_gestalt"
            boolean r7 = kotlin.text.z.h(r7, r10, r4)
            if (r7 == 0) goto L9b
            android.content.res.Resources r7 = r14.getResources()
            java.lang.String r11 = r6.getName()
            java.lang.String r12 = "drawable"
            java.lang.String r13 = r14.getPackageName()
            int r7 = r7.getIdentifier(r11, r12, r13)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "content_description_"
            r11.<init>(r12)
            java.lang.String r12 = r6.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)
            java.lang.String r9 = kotlin.text.StringsKt.R(r9, r12)
            r11.append(r9)
            android.content.res.Resources r9 = r14.getResources()
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "string"
            java.lang.String r13 = r14.getPackageName()
            int r9 = r9.getIdentifier(r11, r12, r13)
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            java.lang.String r6 = kotlin.text.StringsKt.S(r10, r6)
            uc0.g1 r8 = new uc0.g1
            r8.<init>(r6, r9, r7)
            goto L9c
        L9b:
            r8 = 0
        L9c:
            if (r8 == 0) goto La1
            r1.add(r8)
        La1:
            int r5 = r5 + 1
            goto L2d
        La4:
            r15.<init>(r3, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a02.e.A2(android.content.Context, org.chromium.net.y):uc0.h1");
    }

    public static p00.b A3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static rz.e A4() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vz0.class, "get(...)"), new sz.a(3));
        TypeToken typeToken = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, rz.f.f110230a);
        return eVar;
    }

    public static v0 B() {
        return new v0();
    }

    public static i0 B0() {
        return new i0();
    }

    public static String B1(Resources resources, String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(j2.api_host_placeholder_v3_with_route);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return j1.U(string, new Object[]{apiHost});
    }

    public static e12.d B2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        retrofit.a(rz.c.b(adapterFactory, null, null, false, 47));
        retrofit.b(converterFactory);
        retrofit.b(gsonConverterFactory);
        Object b13 = retrofit.d().b(e12.d.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        e12.d dVar = (e12.d) b13;
        dl2.b.I(dVar);
        return dVar;
    }

    public static p00.b B3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static d30.a B4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        d30.a aVar = (d30.a) o.h(retrofit, gsonConverterFactory, d30.a.class, "create(...)");
        dl2.b.I(aVar);
        return aVar;
    }

    public static h C() {
        return new h();
    }

    public static q0 C0() {
        return new q0();
    }

    public static m60.e C1(at1.d application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return application.a();
    }

    public static l20.b C2(c1 retrofit, rz.c adapterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        retrofit.a(adapterFactory);
        Object b13 = retrofit.d().b(l20.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        l20.b bVar = (l20.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static p00.b C3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static m C4(f0 f0Var, x10.d settingsApi, w eventManager, k toastUtils, zy.q0 unscopedPinalyticsSEPFactory, j0 applicationScope) {
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        return new m(settingsApi, eventManager, toastUtils, unscopedPinalyticsSEPFactory, applicationScope);
    }

    public static ez1.d D() {
        return new ez1.d();
    }

    public static s0 D0() {
        return new s0();
    }

    public static uc0.a D1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.a(q.component_attribution_title, new y(new j(q.component_attribution_subtitle, new n0(q.component_attribution_link_text, "")), kotlin.collections.f0.j(new g0("Non Sponsored", "Verified Pinner", "Verified Merchant", null, null, null, null, null, new rc0.d(stateProvider, 0), new rc0.d(stateProvider, 1), RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER), new g0(null, null, null, null, null, null, null, null, new rc0.d(stateProvider, 2), new rc0.d(stateProvider, 3), 255), new g0(null, null, null, null, null, null, null, null, new rc0.d(stateProvider, 4), new rc0.d(stateProvider, 5), 255), new g0("Sponsored", "Label icon", "No label icon", null, null, null, null, null, new rc0.d(stateProvider, 6), new rc0.d(stateProvider, 7), RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER))));
    }

    public static rz.e D2() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        return eVar;
    }

    public static p00.b D3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static Context D4(n activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity;
    }

    public static t E() {
        return new t();
    }

    public static u0 E0() {
        return new u0();
    }

    public static vy.o E1(OkHttpClient okHttpClient, a0 networkClient, d1 retrofit, z10.h oauthSigningInterceptor, p00.b converterFactory, rz.c adapterFactory, rq2.a gsonConverterFactory, String baseLoggingUrl, n1 experiments, z10.e compressionInterceptor, a0 cronetClient, z10.f compressionInterceptorV2) {
        vy.o oVar;
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(oauthSigningInterceptor, "oauthSigningInterceptor");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(baseLoggingUrl, "baseLoggingUrl");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(compressionInterceptor, "compressionInterceptor");
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(compressionInterceptorV2, "compressionInterceptorV2");
        if (experiments.e() || !cronetClient.b()) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.a(compressionInterceptor);
            newBuilder.a(oauthSigningInterceptor);
            OkHttpClient okHttpClient2 = new OkHttpClient(newBuilder);
            retrofit.getClass();
            c1 c1Var = new c1(retrofit);
            c1Var.f101001a = okHttpClient2;
            c1Var.c(baseLoggingUrl);
            c1Var.a(adapterFactory);
            c1Var.b(converterFactory);
            c1Var.b(gsonConverterFactory);
            Object b13 = c1Var.d().b(vy.o.class);
            Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
            oVar = (vy.o) b13;
        } else {
            OkHttpClient.Builder newBuilder2 = okHttpClient.newBuilder();
            newBuilder2.a(compressionInterceptorV2);
            newBuilder2.a(oauthSigningInterceptor);
            a0 a13 = cronetClient.a(new OkHttpClient(newBuilder2), null);
            retrofit.getClass();
            c1 c1Var2 = new c1(retrofit);
            c1Var2.f101001a = a13;
            c1Var2.c(baseLoggingUrl);
            c1Var2.a(adapterFactory);
            c1Var2.b(converterFactory);
            c1Var2.b(gsonConverterFactory);
            d1 d2 = c1Var2.d();
            Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
            Object b14 = d2.b(vy.o.class);
            Intrinsics.checkNotNullExpressionValue(b14, "create(...)");
            oVar = (vy.o) b14;
        }
        dl2.b.I(oVar);
        return oVar;
    }

    public static l20.a E2(rz.c adapterFactory, p00.b converterFactory, l noToastOnFailureRouterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(noToastOnFailureRouterFactory, "noToastOnFailureRouterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, noToastOnFailureRouterFactory, null, false, 61));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(l20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        l20.a aVar = (l20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static p00.b E3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static px.c E4(i iVar, i2 pinRepository, d20.a analyticsService, qx.c pinSaveToBoardListRequest, qx.a audienceInsightsRemoteRequest, DynamicStoryDeserializer dynamicStoryDeserializer) {
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(pinSaveToBoardListRequest, "pinSaveToBoardListRequest");
        Intrinsics.checkNotNullParameter(audienceInsightsRemoteRequest, "audienceInsightsRemoteRequest");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        return new px.c(pinRepository, analyticsService, pinSaveToBoardListRequest, audienceInsightsRemoteRequest, dynamicStoryDeserializer);
    }

    public static fz0.l F() {
        return new fz0.l();
    }

    public static w0 F0() {
        return new w0();
    }

    public static uc0.c F1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_badge_title;
        j jVar = new j(q.component_badge_subtitle, new n0(q.component_badge_link_text, "https://gestalt.pinterest.systems/android/badge"));
        u50.f0 h23 = bs1.c.h2("Info");
        ul1.f fVar = ul1.f.f122457e;
        g0 g0Var = new g0(null, "Info with default icon", "Info without icon", null, null, null, null, null, rc0.c1.d(h23, fVar, true), rc0.c1.d(bs1.c.h2("Info"), fVar, false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
        u50.f0 h24 = bs1.c.h2("Success");
        ul1.j jVar2 = ul1.j.f122461e;
        g0 g0Var2 = new g0(null, "Success with default icon", "Success without icon", null, null, null, null, null, rc0.c1.d(h24, jVar2, true), rc0.c1.d(bs1.c.h2("Success"), jVar2, false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
        u50.f0 h25 = bs1.c.h2("Warning");
        ul1.k kVar = ul1.k.f122462e;
        g0 g0Var3 = new g0(null, "Warning with default icon", "Warning without icon", null, null, null, null, null, rc0.c1.d(h25, kVar, true), rc0.c1.d(bs1.c.h2("Warning"), kVar, false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
        u50.f0 h26 = bs1.c.h2("Error");
        ul1.e eVar = ul1.e.f122456e;
        g0 g0Var4 = new g0(null, "Error with default icon", "Error without icon", null, null, null, null, null, rc0.c1.d(h26, eVar, true), rc0.c1.d(bs1.c.h2("Error"), eVar, false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP);
        u50.f0 h27 = bs1.c.h2("Recommendation");
        ul1.i iVar = ul1.i.f122460e;
        return new uc0.c(i13, new y(jVar, kotlin.collections.f0.j(g0Var, g0Var2, g0Var3, g0Var4, new g0(null, "Recommendation with default icon", "Recommendation without icon", null, null, null, null, null, rc0.c1.d(h27, iVar, true), rc0.c1.d(bs1.c.h2("Recommendation"), iVar, false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP), new g0(null, "Neutral with default icon", "Neutral without icon", null, null, null, null, null, rc0.c1.d(bs1.c.h2("Neutral"), new ul1.h(null), true), rc0.c1.d(bs1.c.h2("Neutral"), new ul1.h(null), false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP), new g0(null, "Light wash with default icon", "Light wash without icon", null, null, null, null, null, rc0.c1.d(bs1.c.h2("Light wash"), new ul1.g(null), true), rc0.c1.d(bs1.c.h2("Light wash"), new ul1.g(null), false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP), new g0(null, "Dark wash with default icon", "Dark wash without icon", null, null, null, null, null, rc0.c1.d(bs1.c.h2("Dark wash"), new ul1.d(null), true), rc0.c1.d(bs1.c.h2("Dark wash"), new ul1.d(null), false), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP), new g0(null, "Neutral with custom icon", "Light wash with custom icon", null, null, null, null, null, rc0.c1.d(bs1.c.h2("Neutral"), new ul1.h(rm1.q.LOCK), true), rc0.c1.d(bs1.c.h2("Light wash"), new ul1.g(rm1.q.LIGHTBULB), true), RecyclerViewTypes.VIEW_TYPE_CUTOUT_COLLAGE_PILL_REP), new g0(null, "Dark wash with custom icon", null, null, null, null, null, null, rc0.c1.d(bs1.c.h2("Dark wash"), new ul1.d(rm1.q.FLASHLIGHT), true), null, 765))));
    }

    public static m1 F2(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new m1(q.component_indicator_title, new y(new j(q.component_indicator_subtitle, new n0(q.component_indicator_link_text, "https://gestalt.pinterest.systems/web/indicator")), kotlin.collections.f0.j(new e0("Default", null, null, null, null, new rc0.d(stateProvider, 10), 30), new e0("With count value (single digit)", null, null, null, null, new rc0.d(stateProvider, 11), 30), new e0("With count value (double digit)", null, null, null, null, new rc0.d(stateProvider, 12), 30), new e0("With count value more than 99", null, null, null, null, new rc0.d(stateProvider, 13), 30))));
    }

    public static p00.b F3(rz.e registry, p00.c bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static void F4(c1 retrofitBuilder) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        dl2.b.I(retrofitBuilder);
    }

    public static g41.c G() {
        return new g41.c();
    }

    public static g1 G0() {
        return new g1();
    }

    public static uc0.e G1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.e(q.component_banner_overlay_title, new y(new j(q.component_banner_overlay_subtitle, new n0(q.component_banner_overlay_link_text, "https://gestalt.pinterest.systems/web/bannerupsell")), kotlin.collections.f0.j(new e0("Default", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, false, 255), 30), new e0("Minimal", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, true, 15), 30), new e0("Non-dismissable", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL), 30), new e0("With an Icon", null, null, null, null, rc0.c1.e(stateProvider, rm1.q.SPARKLE, null, null, false, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN), 30), new e0("With an Image", null, null, null, null, rc0.c1.e(stateProvider, null, "https://i.pinimg.com/736x/1f/d1/48/1fd148956f7608ed52f2a79793cd0b0e.jpg", null, false, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE), 30), new e0("With a Logo", null, null, null, null, rc0.c1.e(stateProvider, null, null, Boolean.TRUE, false, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER), 30), new e0("With Primary Button Only", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO), 30), new e0("With Secondary Button Only", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE), 30), new e0("Without CTAs", null, null, null, null, rc0.c1.e(stateProvider, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_EDUCATION_HEADER), 30))));
    }

    public static u G2(f0 f0Var) {
        f0Var.getClass();
        l72.a builderAction = l72.a.f81983m;
        ro2.b json = ro2.c.f108975d;
        Intrinsics.checkNotNullParameter(json, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Intrinsics.checkNotNullParameter(json, "json");
        ro2.i iVar = new ro2.i();
        ro2.k kVar = json.f108976a;
        iVar.f108993a = kVar.f109012a;
        iVar.f108994b = kVar.f109017f;
        iVar.f108995c = kVar.f109013b;
        iVar.f108996d = kVar.f109014c;
        iVar.f108997e = kVar.f109015d;
        boolean z13 = kVar.f109016e;
        iVar.f108998f = z13;
        String str = kVar.f109018g;
        iVar.f108999g = str;
        iVar.f109000h = kVar.f109019h;
        boolean z14 = kVar.f109020i;
        iVar.f109001i = z14;
        String str2 = kVar.f109021j;
        iVar.f109002j = str2;
        ro2.a aVar = kVar.f109026o;
        iVar.f109003k = aVar;
        iVar.f109004l = kVar.f109022k;
        iVar.f109005m = kVar.f109023l;
        iVar.f109006n = kVar.f109024m;
        iVar.f109007o = kVar.f109025n;
        iVar.f109008p = json.f108977b;
        builderAction.invoke(iVar);
        if (z14) {
            if (!Intrinsics.d(str2, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
            }
            if (aVar != ro2.a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.".toString());
            }
        }
        if (z13) {
            if (!Intrinsics.d(str, "    ")) {
                for (int i13 = 0; i13 < str.length(); i13++) {
                    char charAt = str.charAt(i13);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!Intrinsics.d(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        boolean z15 = iVar.f108995c;
        boolean z16 = iVar.f109000h;
        boolean z17 = iVar.f109007o;
        ro2.a aVar2 = iVar.f109003k;
        boolean z18 = iVar.f108993a;
        boolean z19 = iVar.f108996d;
        boolean z23 = iVar.f108997e;
        boolean z24 = iVar.f108998f;
        boolean z25 = iVar.f108994b;
        String str3 = iVar.f108999g;
        boolean z26 = iVar.f109001i;
        String str4 = iVar.f109002j;
        ro2.k configuration = new ro2.k(z18, z15, z19, z23, z24, z25, str3, z16, z26, str4, iVar.f109004l, iVar.f109005m, iVar.f109006n, z17, aVar2);
        to2.d module = iVar.f109008p;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(module, "module");
        u uVar = new u(configuration, module);
        if (!Intrinsics.d(module, to2.g.f118716a)) {
            module.a(new so2.a0(str4, z26));
        }
        return uVar;
    }

    public static p00.b G3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static ScreenLocation G4() {
        ScreenLocation a13 = w1.a();
        dl2.b.I(a13);
        return a13;
    }

    public static g41.e H() {
        return new g41.e();
    }

    public static qa1.e H0() {
        return new qa1.e();
    }

    public static p H1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        p pVar = (p) activity;
        dl2.b.I(pVar);
        return pVar;
    }

    public static void H2() {
        Intrinsics.checkNotNullExpressionValue(eb2.i.f58262a, "getInstance(...)");
    }

    public static p00.b H3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static fp.b H4() {
        fp.b bVar = fp.b.f62753b;
        dl2.b.I(bVar);
        return bVar;
    }

    public static g41.m I() {
        return new g41.m();
    }

    public static qp.k I0() {
        return new qp.k();
    }

    public static o5.c I1() {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(locale, "locale");
        o5.h hVar = o5.c.f92892d;
        o5.c cVar = TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? o5.c.f92896h : o5.c.f92895g;
        Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
        dl2.b.I(cVar);
        return cVar;
    }

    public static o1 I2(Context context, rc0.c1 stateProvider) {
        u2.n nVar;
        Enum r28;
        wm1.a0 a0Var;
        u2.n nVar2;
        int i13;
        wm1.n eVar;
        wm1.n nVar3;
        wm1.n hVar;
        wm1.n nVar4;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(context2, "context");
        int i14 = q.component_list_action_title;
        j jVar = new j(q.component_list_action_subtitle, new n0(q.component_list_action_link_text, "https://gestalt.pinterest.systems/android/listaction"));
        List d2 = z.d(wm1.a0.values());
        ArrayList arrayList = new ArrayList();
        int size = d2.size();
        int i15 = 0;
        while (true) {
            nVar = u2.n.f120041b;
            if (i15 >= size) {
                break;
            }
            Enum r53 = (Enum) d2.get(i15);
            arrayList.add(new e0("Indicator + " + ((Object) r.k(r53)), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, new p0(r53, 4), null, rc0.c1.j(stateProvider, true, rc0.c1.h((wm1.a0) r53, context2), null, new wm1.h(wm1.d.ARROW_FORWARD), 4), 20));
            i15++;
        }
        wm1.a0[] values = wm1.a0.values();
        ArrayList arrayList2 = new ArrayList(values.length);
        int length = values.length;
        int i16 = 0;
        while (i16 < length) {
            wm1.a0 a0Var2 = values[i16];
            String k13 = r.k(a0Var2);
            wm1.o[] values2 = wm1.o.values();
            ArrayList arrayList3 = new ArrayList();
            int i17 = 0;
            for (int length2 = values2.length; i17 < length2; length2 = length2) {
                arrayList3.add(values2[i17]);
                i17++;
            }
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i18 = 0;
            while (i18 < size2) {
                ArrayList arrayList5 = arrayList3;
                Enum r23 = (Enum) arrayList3.get(i18);
                int i19 = i18;
                String k14 = r.k(r23);
                int i23 = size2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(k13);
                String str = k13;
                sb3.append(" + ");
                sb3.append((Object) k14);
                String sb4 = sb3.toString();
                u2.q b13 = androidx.compose.foundation.layout.e.b(nVar, 1.0f);
                wm1.z h10 = rc0.c1.h(a0Var2, context2);
                switch (rc0.a.f107240b[((wm1.o) r23).ordinal()]) {
                    case 1:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        i13 = 7;
                        eVar = new wm1.e(bs1.c.p2("Button"), false, null, null, 30);
                        nVar3 = eVar;
                        wm1.a0 a0Var3 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var3, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var3;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 2:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        i13 = 7;
                        eVar = new wm1.g((em1.b) null, (em1.e) (0 == true ? 1 : 0), i13);
                        nVar3 = eVar;
                        wm1.a0 a0Var32 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var32, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var32;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 3:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        i13 = 7;
                        eVar = new wm1.k(false, false, 7);
                        nVar3 = eVar;
                        wm1.a0 a0Var322 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var322, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var322;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 4:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        hVar = new wm1.h(wm1.d.ARROW_FORWARD);
                        nVar3 = hVar;
                        i13 = 7;
                        wm1.a0 a0Var3222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var3222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var3222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 5:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        hVar = new wm1.l(bs1.c.p2("2 followers"), false);
                        nVar3 = hVar;
                        i13 = 7;
                        wm1.a0 a0Var32222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var32222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var32222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 6:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        hVar = new wm1.m(bs1.c.p2("2 followers"), wm1.d.ARROW_FORWARD, false);
                        nVar3 = hVar;
                        i13 = 7;
                        wm1.a0 a0Var322222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var322222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var322222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 7:
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        hVar = new wm1.f(wm1.b.DEFAULT, bs1.c.p2("Button"), (bm1.n) null, 12);
                        nVar3 = hVar;
                        i13 = 7;
                        wm1.a0 a0Var3222222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var3222222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var3222222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 8:
                        nVar4 = wm1.j.f130305c;
                        nVar3 = nVar4;
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        i13 = 7;
                        wm1.a0 a0Var32222222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var32222222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var32222222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    case 9:
                        nVar4 = wm1.i.f130303c;
                        nVar3 = nVar4;
                        r28 = r23;
                        a0Var = a0Var2;
                        nVar2 = nVar;
                        i13 = 7;
                        wm1.a0 a0Var322222222 = a0Var;
                        arrayList4.add(new e0(sb4, b13, null, new rc0.q0(r28, a0Var322222222, 0), null, rc0.c1.j(stateProvider, false, h10, null, nVar3, 5), 20));
                        i18 = i19 + 1;
                        a0Var2 = a0Var322222222;
                        nVar = nVar2;
                        arrayList3 = arrayList5;
                        size2 = i23;
                        k13 = str;
                        values = values;
                        length = length;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList2.add(arrayList4);
            i16++;
            nVar = nVar;
            values = values;
        }
        u2.n nVar5 = nVar;
        int i24 = 0;
        ArrayList l03 = CollectionsKt.l0(kotlin.collections.g0.r(arrayList2), arrayList);
        List d13 = z.d(wm1.a0.values());
        ArrayList arrayList6 = new ArrayList();
        int size3 = d13.size();
        int i25 = 0;
        while (i25 < size3) {
            Enum r43 = (Enum) d13.get(i25);
            String str2 = "Notification with optional title + " + ((Object) r.k(r43));
            u2.q b14 = androidx.compose.foundation.layout.e.b(nVar5, 1.0f);
            wm1.z h13 = rc0.c1.h((wm1.a0) r43, context2);
            u50.f0 p23 = bs1.c.p2("Optional title example");
            u50.f0 p24 = bs1.c.p2("Notification example");
            Date date = stateProvider.f107289a;
            Intrinsics.f(date);
            arrayList6.add(new e0(str2, b14, null, new p0(r43, 5), null, rc0.c1.j(stateProvider, false, h13, new wm1.r(p24, date, p23, false, 24), new wm1.h(wm1.d.ELLIPSIS), 1), 20));
            i25++;
            i24 = i24;
        }
        int i26 = i24;
        ArrayList l04 = CollectionsKt.l0(arrayList6, l03);
        List d14 = z.d(wm1.a0.values());
        ArrayList arrayList7 = new ArrayList();
        int size4 = d14.size();
        int i27 = i26;
        while (i27 < size4) {
            Enum r63 = (Enum) d14.get(i27);
            String str3 = "Notification + " + ((Object) r.k(r63));
            u2.q b15 = androidx.compose.foundation.layout.e.b(nVar5, 1.0f);
            wm1.z h14 = rc0.c1.h((wm1.a0) r63, context2);
            u50.f0 p25 = bs1.c.p2("A really long subtext here that wraps and expands the ListAction container");
            Date exampleDayDateDifference = stateProvider.f107290b;
            Intrinsics.checkNotNullExpressionValue(exampleDayDateDifference, "exampleDayDateDifference");
            arrayList7.add(new e0(str3, b15, null, new p0(r63, 6), null, rc0.c1.j(stateProvider, false, h14, new wm1.r(p25, exampleDayDateDifference, null, false, 28), new wm1.h(wm1.d.ELLIPSIS), 1), 20));
            i27++;
            d14 = d14;
        }
        ArrayList l05 = CollectionsKt.l0(arrayList7, l04);
        List d15 = z.d(wm1.a0.values());
        ArrayList arrayList8 = new ArrayList();
        int size5 = d15.size();
        int i28 = i26;
        while (i28 < size5) {
            Enum r64 = (Enum) d15.get(i28);
            String str4 = "Notification collapsed + " + ((Object) r.k(r64));
            u2.q b16 = androidx.compose.foundation.layout.e.b(nVar5, 1.0f);
            wm1.z h15 = rc0.c1.h((wm1.a0) r64, context2);
            u50.f0 p26 = bs1.c.p2("Subtext explaining context and it maybe ellipsis if need...");
            Date exampleDate = stateProvider.f107291c;
            Intrinsics.checkNotNullExpressionValue(exampleDate, "exampleDate");
            arrayList8.add(new e0(str4, b16, null, new p0(r64, 7), null, rc0.c1.j(stateProvider, false, h15, new wm1.r(p26, exampleDate, null, false, 28), new wm1.h(wm1.d.ELLIPSIS), 1), 20));
            i28++;
            context2 = context;
        }
        return new o1(i14, new y(jVar, CollectionsKt.l0(arrayList8, l05)));
    }

    public static p00.b I3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static androidx.fragment.app.w0 I4(n activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        androidx.fragment.app.w0 supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dl2.b.I(supportFragmentManager);
        return supportFragmentManager;
    }

    public static g41.p J() {
        return new g41.p();
    }

    public static qw1.a J0() {
        return new qw1.a();
    }

    public static rz.e J1(h12.b boardInviteFeedAdapter, f12.b boardInviteAdapter, k22.h userFeedAdapter) {
        Intrinsics.checkNotNullParameter(boardInviteFeedAdapter, "boardInviteFeedAdapter");
        Intrinsics.checkNotNullParameter(boardInviteAdapter, "boardInviteAdapter");
        Intrinsics.checkNotNullParameter(userFeedAdapter, "userFeedAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(BoardInviteFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, boardInviteFeedAdapter);
        TypeToken typeToken2 = new TypeToken(k8.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, boardInviteAdapter);
        TypeToken typeToken3 = new TypeToken(UserFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, userFeedAdapter);
        return eVar;
    }

    public static dl1.p J2(t0 stubLocalDataSource) {
        Intrinsics.checkNotNullParameter(stubLocalDataSource, "stubLocalDataSource");
        dl2.b.I(stubLocalDataSource);
        return stubLocalDataSource;
    }

    public static p00.b J3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static ScreenLocation J4() {
        ScreenLocation screenLocation = (ScreenLocation) w1.C.getValue();
        dl2.b.I(screenLocation);
        return screenLocation;
    }

    public static ga1.p K() {
        return new ga1.p();
    }

    public static r02.g K0() {
        return new r02.g();
    }

    public static f12.a K1(rz.c callAdapterFactory, p00.b converterFactory, c1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(callAdapterFactory, "callAdapterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(callAdapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        Object b13 = j13.d().b(f12.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        f12.a aVar = (f12.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static dl1.p K2(t0 localDataSource) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        dl2.b.I(localDataSource);
        return localDataSource;
    }

    public static p00.b K3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static void K4(d1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        dl2.b.I(retrofit);
    }

    public static gb1.h L() {
        return new gb1.h();
    }

    public static r02.j L0() {
        return new r02.j();
    }

    public static ScreenLocation L1() {
        ScreenLocation screenLocation = (ScreenLocation) w1.f51504p.getValue();
        dl2.b.I(screenLocation);
        return screenLocation;
    }

    public static n20.a L2(n20.b logService) {
        Intrinsics.checkNotNullParameter(logService, "logService");
        return new n20.a(logService);
    }

    public static p00.b L3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static m60.g0 L4(m60.g0 pageSizeProvider) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        dl2.b.I(pageSizeProvider);
        return pageSizeProvider;
    }

    public static gb1.q M() {
        return new gb1.q();
    }

    public static r02.r M0() {
        return new r02.r();
    }

    public static rz.e M1(vz.a boardFeedJsonDeserializableAdapter, BoardDeserializer boardDeserializer, b22.b pinFeedJsonDeserializableAdapter, q1 dynamicFeedJsonDeserializableAdapter, NestedBoardSectionNameRecommendationDeserializer nestedBoardSectionNameRecommendationDeserializer, BoardToolDeserializerAdapter boardToolDeserializerAdapter, a22.a pearInsightJsonDeserializableAdapter, o12.c modelListWithBookmarkDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(boardFeedJsonDeserializableAdapter, "boardFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(pinFeedJsonDeserializableAdapter, "pinFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(dynamicFeedJsonDeserializableAdapter, "dynamicFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(nestedBoardSectionNameRecommendationDeserializer, "nestedBoardSectionNameRecommendationDeserializer");
        Intrinsics.checkNotNullParameter(boardToolDeserializerAdapter, "boardToolDeserializerAdapter");
        Intrinsics.checkNotNullParameter(pearInsightJsonDeserializableAdapter, "pearInsightJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(modelListWithBookmarkDeserializableAdapter, "modelListWithBookmarkDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(BoardFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, boardFeedJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(v7.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, new e12.b(boardDeserializer, 0));
        TypeToken typeToken3 = new TypeToken(PinFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, pinFeedJsonDeserializableAdapter);
        TypeToken typeToken4 = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
        eVar.a(typeToken4, rz.f.f110230a);
        TypeToken typeToken5 = new TypeToken(DynamicFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
        eVar.a(typeToken5, dynamicFeedJsonDeserializableAdapter);
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(ga.class).f33847b).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, nestedBoardSectionNameRecommendationDeserializer);
        TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(la.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
        eVar.a(a14, boardToolDeserializerAdapter);
        TypeToken typeToken6 = new TypeToken(h20.class);
        Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
        eVar.a(typeToken6, pearInsightJsonDeserializableAdapter);
        TypeToken typeToken7 = new TypeToken(o12.b.class);
        Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
        eVar.a(typeToken7, modelListWithBookmarkDeserializableAdapter);
        return eVar;
    }

    public static n20.b M2(rz.c adapterFactory, p00.b converterFactory, c1 retrofitBuilder, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofitBuilder, adapterFactory, converterFactory);
        retrofitBuilder.b(aVar);
        retrofitBuilder.c("https://log.pinterest.com/");
        Object b13 = retrofitBuilder.d().b(n20.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        n20.b bVar = (n20.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static p00.b M3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static m60.g0 M4(m60.g0 pageSizeProvider) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        dl2.b.I(pageSizeProvider);
        return pageSizeProvider;
    }

    public static ho0.k N() {
        return new ho0.k();
    }

    public static r02.e0 N0() {
        return new r02.e0();
    }

    public static e12.d N1(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        e12.d dVar = (e12.d) o.h(retrofit, aVar, e12.d.class, "create(...)");
        dl2.b.I(dVar);
        return dVar;
    }

    public static at1.d N2(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return (at1.d) application;
    }

    public static p00.b N3(rz.e registry, p00.c bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static PinEditModalViewProviderImpl N4(vb0.e eVar) {
        eVar.getClass();
        try {
            Object newInstance = PinEditModalViewProviderImpl.class.newInstance();
            Intrinsics.g(newInstance, "null cannot be cast to non-null type com.pinterest.activity.library.modal.PinEditModalViewProvider");
            return (PinEditModalViewProviderImpl) newInstance;
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }

    public static ho0.m O() {
        return new ho0.m();
    }

    public static r02.s0 O0() {
        return new r02.s0();
    }

    public static bq.c O1() {
        bq.b bVar = bq.c.f23676d;
        bq.c cVar = bq.a.f23675a;
        Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
        dl2.b.I(cVar);
        return cVar;
    }

    public static p00.b O2(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static p00.b O3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static p00.b O4(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        Intrinsics.checkNotNullParameter(registry, "registry");
        return new p00.b(registry, bodyConverter, null);
    }

    public static hu0.e P() {
        return new hu0.e();
    }

    public static rx1.d P0() {
        return new rx1.d();
    }

    public static void P1() {
        Intrinsics.checkNotNullExpressionValue(jl0.a.f76935a, "getInstance(...)");
    }

    public static p00.b P2(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static p00.b P3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static d1 P4(u json, c1 retrofitBuilder) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        MediaType.f95651d.getClass();
        MediaType contentType = MediaType.Companion.a("application/json");
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        retrofitBuilder.b(new on.b(contentType, new on.d(json)));
        d1 d2 = retrofitBuilder.d();
        Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
        return d2;
    }

    public static hx1.f Q() {
        return new hx1.f();
    }

    public static rz0.c Q0() {
        return new rz0.c();
    }

    public static qz.k Q1(rz.c adapterFactory, p00.b converterFactory, l noToastOnFailureRouterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(noToastOnFailureRouterFactory, "noToastOnFailureRouterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, noToastOnFailureRouterFactory, null, false, 61));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(qz.k.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        qz.k kVar = (qz.k) b13;
        dl2.b.I(kVar);
        return kVar;
    }

    public static rz.e Q2() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        TypeToken typeToken = new TypeToken(tu.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, b00.a.f20719a);
        TypeToken a13 = TypeToken.a(Map.class, String.class, kv.class);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, b00.b.f20720a);
        return eVar;
    }

    public static p00.b Q3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static m72.a Q4(tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        return new m72.a(crashReporting);
    }

    public static hy0.d R() {
        return new hy0.d();
    }

    public static s41.f R0() {
        return new s41.f();
    }

    public static l12.b R1(d1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object b13 = retrofit.b(l12.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        l12.b bVar = (l12.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static rz.e R2() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        TypeToken typeToken = new TypeToken(gv.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, b00.c.f20721a);
        TypeToken typeToken2 = new TypeToken(cv.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, b00.d.f20722a);
        return eVar;
    }

    public static p00.b R3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static ScreenLocation R4() {
        ScreenLocation b13 = w1.b();
        dl2.b.I(b13);
        return b13;
    }

    public static ix1.f S() {
        return new ix1.f();
    }

    public static s61.e S0() {
        return new s61.e();
    }

    public static uc0.n S1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.n(q.component_buttongroup_title, new y(new j(q.component_buttongroup_description, new n0(q.component_buttongroup_link_text, "https://gestalt.pinterest.systems/android/buttongroup")), kotlin.collections.f0.j(new d0(q.small, rc0.e.f107297k), new d0(q.small_full_width, rc0.e.f107299m), new d0(q.small_two_buttons, rc0.e.f107301o), new d0(q.large, rc0.e.f107303q), new d0(q.large_full_width, rc0.e.f107305s), new d0(q.large_two_buttons, rc0.e.f107307u), new d0(q.vertical, rc0.e.f107309w), new d0(q.vertical_full_width, rc0.e.f107311y), new d0(q.rtl, kotlin.collections.e0.b(f2.f115989l.c(n4.k.Rtl)), rc0.e.A))));
    }

    public static o20.a S2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        o20.a aVar2 = (o20.a) o.h(retrofit, aVar, o20.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static et1.f S3(et1.w0 impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public static iz0.n T() {
        return new iz0.n();
    }

    public static sx1.b T0() {
        return new sx1.b();
    }

    public static uc0.p T1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.p(q.component_button_title, new y(new j(q.component_button_description, new n0(q.component_button_link_text, "https://gestalt.pinterest.systems/android/button")), kotlin.collections.f0.j(new tc0.f0(Integer.valueOf(q.component_button_primary_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.q.f107373i, c0.f107288i, 18), new e0(null, null, null, null, null, rc0.g0.f107318i, 31), new e0(null, null, null, null, null, h0.f107320i, 31), new tc0.f0(Integer.valueOf(q.component_button_secondary_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.i0.f107322i, rc0.j0.f107324i, 18), new e0(null, null, null, null, null, k0.f107326i, 31), new e0(null, null, null, null, null, l0.f107328i, 31), new tc0.f0(Integer.valueOf(q.component_button_tertiary_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, m0.f107329i, rc0.f.f107315i, 18), new e0(null, null, null, null, null, rc0.g.f107317i, 31), new e0(null, null, null, null, null, rc0.h.f107319i, 31), new tc0.f0(Integer.valueOf(q.component_button_selected_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.i.f107321i, rc0.j.f107323i, 18), new e0(null, null, null, null, null, rc0.k.f107325i, 31), new e0(null, null, null, null, null, rc0.l.f107327i, 31), new tc0.f0(Integer.valueOf(q.component_button_shopping_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.n.f107330i, rc0.o.f107350i, 18), new e0(null, null, null, null, null, rc0.p.f107370i, 31), new e0(null, null, null, null, null, rc0.r.f107375i, 31), new tc0.f0(Integer.valueOf(q.component_button_transparent_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, s.f107395i, rc0.t.f107415i, 18), new tc0.f0(Integer.valueOf(q.component_button_transparent_buttons), Integer.valueOf(q.start_icon), Integer.valueOf(q.end_icon), null, rc0.u.f107418i, rc0.v.f107438i, 18), new tc0.f0(Integer.valueOf(q.component_button_always_light_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.w.f107458i, x.f107478i, 18), new e0(null, null, null, null, null, rc0.y.f107483i, 31), new e0(null, null, null, null, null, rc0.z.f107489i, 31), new tc0.f0(Integer.valueOf(q.component_button_always_dark_buttons), Integer.valueOf(q.small), Integer.valueOf(q.large), null, b0.f107271i, rc0.d0.f107294i, 18), new e0(null, null, null, null, null, rc0.e0.f107314i, 31), new e0(null, null, null, null, null, rc0.f0.f107316i, 31))));
    }

    public static o20.b T2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        o20.b bVar = (o20.b) o.h(retrofit, aVar, o20.b.class, "create(...)");
        dl2.b.I(bVar);
        return bVar;
    }

    public static rz.e T3() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(lx0.class, "get(...)"), l00.b.f81296a);
        return eVar;
    }

    public static j51.e U() {
        return new j51.e();
    }

    public static t02.j U0() {
        return new t02.j();
    }

    public static uc0.r U1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.r(q.component_button_social_title, new y(new j(q.component_button_description, new n0(q.component_button_social_link_text, "https://gestalt.pinterest.systems/android/buttonSocial")), kotlin.collections.f0.j(new e0(null, null, null, null, null, rc0.a0.f107251s, 31), new e0(null, null, null, null, null, rc0.a0.f107253u, 31), new e0(null, null, null, null, null, rc0.a0.f107255w, 31), new e0(null, null, null, null, null, rc0.a0.f107257y, 31), new e0(null, null, null, null, null, rc0.a0.A, 31))));
    }

    public static uc0.q1 U2(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.q1(q.component_modal_alert_title, new y(new j(q.component_modal_alert_subtitle, new n0(q.component_modal_alert_link_text, "https://gestalt.pinterest.systems/web/modalalert")), kotlin.collections.f0.j(new e0("Default ModalAlert", null, null, null, r0.f107377j, r0.f107378k, 14), new e0("Without cancel button", null, null, null, r0.f107379l, r0.f107380m, 14), new e0("Vertical action buttons", null, null, null, r0.f107381n, r0.f107382o, 14), new e0("With dismiss icon", null, null, null, r0.f107383p, r0.f107384q, 14), new e0("With checkbox and dismiss icon", null, null, null, r0.f107385r, o0.I, 14), new e0("With warning icon, checkbox, and dismiss icon", null, null, null, o0.f107351J, o0.K, 14), new e0("With problem icon, checkbox, and dismiss icon", null, null, null, o0.L, o0.M, 14))));
    }

    public static s1 U3(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new s1(q.component_popover_title, new y(new j(q.component_popover_subtitle, new n0(q.component_popover_link_text, "https://gestalt.pinterest.systems/web/popovereducational")), kotlin.collections.f0.j(new d0(q.component_popover_with_dismiss_end_button, r0.f107387t), new d0(q.component_popover_with_dismiss_and_steps, r0.f107389v), new d0(q.component_popover_with_end_button_only, r0.f107391x), new d0(q.component_popover_with_dismiss_end_button_steps, r0.f107393z), new d0(q.component_popover_with_dismiss_end_button_long_text, r0.B), new d0(q.component_popover_with_custom_view, r0.C), new d0(q.component_popover_notification, r0.E), new d0(q.component_popover_notification_with_custom_view, r0.F))));
    }

    public static j51.d0 V() {
        return new j51.d0();
    }

    public static tj0.m V0() {
        return new tj0.m();
    }

    public static uc0.t V1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_callout_title;
        j jVar = new j(q.component_callout_subtitle, new n0(q.component_callout_link_text, "https://gestalt.pinterest.systems/web/bannercallout"));
        dm1.d[] values = dm1.d.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (dm1.d dVar : values) {
            arrayList.add(new e0(a.a.j("Variant: ", r.k(dVar)), null, null, null, null, new ra0.l0(dVar, 10), 30));
        }
        return new uc0.t(i13, new y(jVar, arrayList));
    }

    public static e12.e V2(d1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object b13 = retrofit.b(e12.e.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        e12.e eVar = (e12.e) b13;
        dl2.b.I(eVar);
        return eVar;
    }

    public static uk1.d V3(g11.a boardPickerPinalytics) {
        Intrinsics.checkNotNullParameter(boardPickerPinalytics, "boardPickerPinalytics");
        dl2.b.I(boardPickerPinalytics);
        return boardPickerPinalytics;
    }

    public static jy1.b W() {
        return new jy1.b();
    }

    public static to0.o W0() {
        return new to0.o();
    }

    public static rz.e W1(m12.a canvasOutpaintStyleJsonDeserializableAdapter, wr0.x canvasOutpaintResponseJsonDeserializableAdapter, sz.a canvasOutpaintImagesJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(canvasOutpaintStyleJsonDeserializableAdapter, "canvasOutpaintStyleJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(canvasOutpaintResponseJsonDeserializableAdapter, "canvasOutpaintResponseJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(canvasOutpaintImagesJsonDeserializableAdapter, "canvasOutpaintImagesJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(i10.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, canvasOutpaintStyleJsonDeserializableAdapter);
        TypeToken typeToken = new TypeToken(m10.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, canvasOutpaintResponseJsonDeserializableAdapter);
        TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(cn.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
        eVar.a(a14, canvasOutpaintImagesJsonDeserializableAdapter);
        return eVar;
    }

    public static w12.b W2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        w12.b bVar = (w12.b) o.h(retrofit, aVar, w12.b.class, "create(...)");
        dl2.b.I(bVar);
        return bVar;
    }

    public static uk1.d W3(jo1.a baseFragmentType, lb0.i viewParameterType, lb0.i uniqueScreenKey, uk1.e presenterPinalyticsFactory) {
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        Intrinsics.checkNotNullParameter(uniqueScreenKey, "uniqueScreenKey");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        uk1.d g13 = ((uk1.a) presenterPinalyticsFactory).g();
        switch (kf0.b.f79345a[baseFragmentType.ordinal()]) {
            case 1:
                g13.c(a4.FEED_HOME, d4.FEED, null);
                return g13;
            case 2:
                g13.c(a4.SEARCH_PINS, d4.SEARCH, (String) uniqueScreenKey.f82710a);
                return g13;
            case 3:
                g13.c(a4.FEED_FOLLOWING, d4.FEED, null);
                return g13;
            case 4:
                g13.c((a4) viewParameterType.f82710a, d4.PIN, null);
                return g13;
            case 5:
                g13.c((a4) viewParameterType.f82710a, d4.PINCH_TO_ZOOM, null);
                return g13;
            case 6:
                g13.c((a4) viewParameterType.f82710a, d4.BOARD, null);
                return g13;
            case 7:
                g13.c((a4) viewParameterType.f82710a, d4.BOARD_SECTION, null);
                return g13;
            case 8:
            case 9:
                g13.c((a4) viewParameterType.f82710a, d4.REPORT, null);
                return g13;
            case 10:
                g13.c((a4) viewParameterType.f82710a, d4.FEED, null);
                return g13;
            case 11:
                g13.c((a4) viewParameterType.f82710a, d4.SEARCH, null);
                return g13;
            default:
                g13.c((a4) viewParameterType.f82710a, d4.FEED, null);
                return g13;
        }
    }

    public static k91.c X() {
        return new k91.c();
    }

    public static tx0.o X0() {
        return new tx0.o();
    }

    public static g20.a X1(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        g20.a aVar2 = (g20.a) o.h(retrofit, aVar, g20.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static rz.e X2() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        TypeToken typeToken = new TypeToken(yy.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, t12.a.f115816a);
        return eVar;
    }

    public static void X3() {
        r41.k kVar = r41.k.f106176a;
    }

    public static k91.e Y() {
        return new k91.e();
    }

    public static u11.c Y0() {
        return new u11.c();
    }

    public static uc0.v Y1(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.v(q.component_checkbox_title, new y(new j(q.component_checkbox_description, new n0(q.component_checkbox_link_text, "https://gestalt.pinterest.systems/android/checkbox")), kotlin.collections.f0.j(new tc0.f0(Integer.valueOf(q.default_title), null, null, null, rc0.a0.G, rc0.a0.H, 30), new tc0.f0(Integer.valueOf(q.rtl), null, null, kotlin.collections.e0.b(f2.f115989l.c(n4.k.Rtl)), rc0.a0.I, rc0.a0.f107241J, 14), new tc0.f0(Integer.valueOf(q.disable_title), null, null, null, rc0.a0.K, rc0.a0.L, 30), new tc0.f0(Integer.valueOf(q.error_title), null, null, null, rc0.a0.M, rc0.n0.f107332j, 30), new e0(null, null, null, null, null, rc0.n0.f107333k, 31), new e0(null, null, null, null, null, rc0.a0.B, 31), new e0(null, null, null, null, null, rc0.a0.C, 31), new e0(null, null, null, null, null, rc0.a0.D, 31), new e0(null, null, null, null, null, rc0.a0.E, 31), new e0(null, null, null, null, null, rc0.a0.F, 31))));
    }

    public static r20.a Y2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        r20.a aVar2 = (r20.a) o.h(retrofit, aVar, r20.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static u1 Y3(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new u1(q.component_radio_group_title, new y(new j(q.component_radio_group_subtitle, new n0(q.component_radio_group_link_text, "https://gestalt.pinterest.systems/web/radiogroup")), kotlin.collections.f0.j(new e0("Default", null, null, null, null, rc0.c1.l(stateProvider, null, null, null, 0, 63), 30), new e0("With image", null, null, null, null, rc0.c1.l(stateProvider, null, null, kotlin.collections.f0.j(rc0.c1.k(stateProvider, null, 15), rc0.c1.k(stateProvider, bs1.c.h2("https://i.pinimg.com/150x150_RS/c5/07/79/c507796f9ac9146fdcb631ce879ad281.jpg"), 11)), 0, 55), 30), new e0("One option disabled", null, null, null, null, rc0.c1.l(stateProvider, bs1.c.j2(new String[0], q.component_radio_group_helper_text_option_disabled), null, kotlin.collections.f0.j(rc0.c1.k(stateProvider, null, 15), rc0.c1.k(stateProvider, null, 7), rc0.c1.k(stateProvider, null, 15)), 0, 53), 30), new e0("One option disabled and selected", null, null, null, null, rc0.c1.l(stateProvider, null, bs1.c.j2(new String[0], q.component_radio_group_error_message), kotlin.collections.f0.j(rc0.c1.k(stateProvider, null, 15), rc0.c1.k(stateProvider, null, 7), rc0.c1.k(stateProvider, null, 15)), 1, 35), 30))));
    }

    public static k91.g Z() {
        return new k91.g();
    }

    public static u31.f Z0() {
        return new u31.f();
    }

    public static z12.a Z1(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        z12.a aVar2 = (z12.a) o.h(retrofit, aVar, z12.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static qb0.a Z2() {
        return new qb0.a();
    }

    public static z12.e Z3(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        z12.e eVar = (z12.e) o.h(retrofit, aVar, z12.e.class, "create(...)");
        dl2.b.I(eVar);
        return eVar;
    }

    public static l82.a a() {
        return new l82.a();
    }

    public static k91.j a0() {
        return new k91.j();
    }

    public static u91.h a1() {
        return new u91.h();
    }

    public static rz.e a2(n12.a CollaboratorInviteFeedDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(CollaboratorInviteFeedDeserializableAdapter, "CollaboratorInviteFeedDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(CollaboratorInviteFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, CollaboratorInviteFeedDeserializableAdapter);
        return eVar;
    }

    public static void a3(rz.e registry, lv1.b useCaseListDeserializer, lv1.a useCaseFeedListDeserializer) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(useCaseListDeserializer, "useCaseListDeserializer");
        Intrinsics.checkNotNullParameter(useCaseFeedListDeserializer, "useCaseFeedListDeserializer");
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(qz.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        registry.a(a13, useCaseListDeserializer);
        TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(uz.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
        registry.a(a14, useCaseFeedListDeserializer);
    }

    public static rz.e a4(d22.a RepinActivityFeedDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(RepinActivityFeedDeserializableAdapter, "RepinActivityFeedDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(yc0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, RepinActivityFeedDeserializableAdapter);
        return eVar;
    }

    public static ae0.a b(PinterestDatabase pinterestDatabase) {
        Intrinsics.checkNotNullParameter(pinterestDatabase, "pinterestDatabase");
        ae0.a v13 = pinterestDatabase.v();
        dl2.b.I(v13);
        return v13;
    }

    public static kd1.k b0() {
        return new kd1.k();
    }

    public static v02.j b1() {
        return new v02.j();
    }

    public static h20.a b2(c1 retrofit, rz.c adapterFactory, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(gsonConverterFactory);
        Object b13 = retrofit.d().b(h20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        h20.a aVar = (h20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static kv1.a b3(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        kv1.a aVar2 = (kv1.a) o.h(retrofit, aVar, kv1.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static p00.d b4() {
        return new p00.d();
    }

    public static d c() {
        return new d();
    }

    public static ki0.c c0() {
        return new ki0.c();
    }

    public static v02.q c1() {
        return new v02.q();
    }

    public static uc0.y c2(Context context, org.chromium.net.y stateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getString(q.component_button_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getResources().getString(q.component_button_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        uc0.x xVar = new uc0.x(string, string2, new uc0.a0(qc0.e.f103496f));
        String string3 = context.getResources().getString(q.component_checkbox_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = context.getResources().getString(q.component_checkbox_subtitle);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        uc0.x xVar2 = new uc0.x(string3, string4, new uc0.a0(qc0.e.f103499i));
        String string5 = context.getResources().getString(q.component_icon_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = context.getResources().getString(q.component_icon_subtitle);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        uc0.x xVar3 = new uc0.x(string5, string6, new uc0.a0(qc0.d.f103490d));
        String string7 = context.getResources().getString(q.component_switch_title);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = context.getResources().getString(q.component_switch_subtitle);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        uc0.x xVar4 = new uc0.x(string7, string8, new uc0.a0(qc0.e.f103513w));
        String string9 = context.getResources().getString(q.component_text_title);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = context.getResources().getString(q.component_text_subtitle);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        uc0.x xVar5 = new uc0.x(string9, string10, new uc0.a0(qc0.e.f103516z));
        String string11 = context.getResources().getString(q.component_icon_button_title);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = context.getResources().getString(q.component_icon_button_subtitle);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        uc0.x xVar6 = new uc0.x(string11, string12, new uc0.a0(qc0.e.f103504n));
        String string13 = context.getResources().getString(q.component_buttongroup_title);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = context.getResources().getString(q.component_buttongroup_description);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        uc0.x xVar7 = new uc0.x(string13, string14, new uc0.a0(qc0.e.f103495e));
        String string15 = context.getResources().getString(q.component_text_field_title);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        String string16 = context.getResources().getString(q.component_text_field_subtitle);
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        uc0.x xVar8 = new uc0.x(string15, string16, new uc0.a0(qc0.e.A));
        String string17 = context.getResources().getString(q.component_text_area_title);
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        String string18 = context.getResources().getString(q.component_text_area_subtitle);
        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
        uc0.x xVar9 = new uc0.x(string17, string18, new uc0.a0(qc0.e.f103515y));
        String string19 = context.getResources().getString(q.component_search_field_title);
        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
        String string20 = context.getResources().getString(q.component_search_field_subtitle);
        Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
        uc0.x xVar10 = new uc0.x(string19, string20, new uc0.a0(qc0.e.f103510t));
        String string21 = context.getResources().getString(q.component_badge_title);
        Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
        String string22 = context.getResources().getString(q.component_badge_subtitle);
        Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
        uc0.x xVar11 = new uc0.x(string21, string22, new uc0.a0(qc0.e.f103493c));
        String string23 = context.getResources().getString(q.component_callout_title);
        Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
        String string24 = context.getResources().getString(q.component_callout_subtitle);
        Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
        uc0.x xVar12 = new uc0.x(string23, string24, new uc0.a0(qc0.e.f103498h));
        String string25 = context.getResources().getString(q.component_banner_overlay_title);
        Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
        String string26 = context.getResources().getString(q.component_banner_overlay_subtitle);
        Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
        uc0.x xVar13 = new uc0.x(string25, string26, new uc0.a0(qc0.e.f103494d));
        String string27 = context.getResources().getString(q.component_radio_group_title);
        Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
        String string28 = context.getResources().getString(q.component_radio_group_subtitle);
        Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
        uc0.x xVar14 = new uc0.x(string27, string28, new uc0.a0(qc0.e.f103509s));
        String string29 = context.getResources().getString(q.component_list_action_title);
        Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
        String string30 = context.getResources().getString(q.component_list_action_subtitle);
        Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
        uc0.x xVar15 = new uc0.x(string29, string30, new uc0.a0(qc0.e.f103506p));
        String string31 = context.getResources().getString(q.component_divider_title);
        Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
        String string32 = context.getResources().getString(q.component_divider_subtitle);
        Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
        uc0.x xVar16 = new uc0.x(string31, string32, new uc0.a0(qc0.e.f103500j));
        String string33 = context.getResources().getString(q.component_popover_title);
        Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
        String string34 = context.getResources().getString(q.component_popover_subtitle);
        Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
        uc0.x xVar17 = new uc0.x(string33, string34, new uc0.a0(qc0.e.f103508r));
        String string35 = context.getResources().getString(q.component_indicator_title);
        Intrinsics.checkNotNullExpressionValue(string35, "getString(...)");
        String string36 = context.getResources().getString(q.component_indicator_subtitle);
        Intrinsics.checkNotNullExpressionValue(string36, "getString(...)");
        uc0.x xVar18 = new uc0.x(string35, string36, new uc0.a0(qc0.e.f103505o));
        String string37 = context.getResources().getString(q.component_select_list_title);
        Intrinsics.checkNotNullExpressionValue(string37, "getString(...)");
        String string38 = context.getResources().getString(q.component_select_list_subtitle);
        Intrinsics.checkNotNullExpressionValue(string38, "getString(...)");
        uc0.x xVar19 = new uc0.x(string37, string38, new uc0.a0(qc0.e.f103511u));
        String string39 = context.getResources().getString(q.component_icon_button_floating_title);
        Intrinsics.checkNotNullExpressionValue(string39, "getString(...)");
        String string40 = context.getResources().getString(q.component_icon_button_floating_subtitle);
        Intrinsics.checkNotNullExpressionValue(string40, "getString(...)");
        uc0.x xVar20 = new uc0.x(string39, string40, new uc0.a0(qc0.e.f103503m));
        String string41 = context.getResources().getString(q.component_spinner_title);
        Intrinsics.checkNotNullExpressionValue(string41, "getString(...)");
        String string42 = context.getResources().getString(q.component_spinner_subtitle);
        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
        uc0.x xVar21 = new uc0.x(string41, string42, new uc0.a0(qc0.e.f103512v));
        String string43 = context.getResources().getString(q.component_tag_title);
        Intrinsics.checkNotNullExpressionValue(string43, "getString(...)");
        String string44 = context.getResources().getString(q.component_tag_subtitle);
        Intrinsics.checkNotNullExpressionValue(string44, "getString(...)");
        uc0.x xVar22 = new uc0.x(string43, string44, new uc0.a0(qc0.e.f103514x));
        String string45 = context.getResources().getString(q.component_button_social_title);
        Intrinsics.checkNotNullExpressionValue(string45, "getString(...)");
        String string46 = context.getResources().getString(q.component_button_social_subtitle);
        Intrinsics.checkNotNullExpressionValue(string46, "getString(...)");
        uc0.x xVar23 = new uc0.x(string45, string46, new uc0.a0(qc0.e.f103497g));
        String string47 = context.getResources().getString(q.component_modal_alert_title);
        Intrinsics.checkNotNullExpressionValue(string47, "getString(...)");
        String string48 = context.getResources().getString(q.component_modal_alert_subtitle);
        Intrinsics.checkNotNullExpressionValue(string48, "getString(...)");
        uc0.x xVar24 = new uc0.x(string47, string48, new uc0.a0(qc0.e.f103507q));
        String string49 = context.getResources().getString(q.component_header_bar_title);
        Intrinsics.checkNotNullExpressionValue(string49, "getString(...)");
        String string50 = context.getResources().getString(q.component_header_bar_subtitle);
        Intrinsics.checkNotNullExpressionValue(string50, "getString(...)");
        uc0.x xVar25 = new uc0.x(string49, string50, new uc0.a0(qc0.e.f103502l));
        String string51 = context.getResources().getString(q.component_attribution_title);
        Intrinsics.checkNotNullExpressionValue(string51, "getString(...)");
        String string52 = context.getResources().getString(q.component_attribution_subtitle);
        Intrinsics.checkNotNullExpressionValue(string52, "getString(...)");
        return new uc0.y(CollectionsKt.x0(kotlin.collections.f0.j(xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, xVar15, xVar16, xVar17, xVar18, xVar19, xVar20, xVar21, xVar22, xVar23, xVar24, xVar25, new uc0.x(string51, string52, new uc0.a0(qc0.e.f103492b))), new b4.f(11)));
    }

    public static OkHttpClient c3(OkHttpClient baseClient, lb0.g diskCache, cy.k networkMetricsCollector, tb.l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(networkMetricsCollector, "networkMetricsCollector");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        OkHttpClient.Builder newBuilder = baseClient.newBuilder();
        lb0.e eVar = lb0.e.CACHE_FOLDER_VIDEO;
        diskCache.getClass();
        File file = new File(lb0.g.d(eVar), "response_cache");
        if (!file.exists() || !file.isDirectory()) {
            file.delete();
            file.mkdirs();
        }
        Intrinsics.checkNotNullExpressionValue(file, "ensureDirectory(...)");
        newBuilder.f95684k = new Cache(file);
        newBuilder.a(g10.c.f63361a);
        if (telemetryPreferences.w()) {
            newBuilder.a(networkMetricsCollector.f53415f);
        }
        return new OkHttpClient(newBuilder);
    }

    public static d1 c4(c1 retrofitBuilder, p00.d bodyConverter, rz.c adapterFactory, rq2.a gsonConverterFactory, l12.a exploreArticleJsonDeserializableAdapter, y12.a paginatedModelFeedJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(exploreArticleJsonDeserializableAdapter, "exploreArticleJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(paginatedModelFeedJsonDeserializableAdapter, "paginatedModelFeedJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(xk.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, exploreArticleJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(qr0.e.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, paginatedModelFeedJsonDeserializableAdapter);
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        p00.b bVar = new p00.b(eVar, bodyConverter, null);
        retrofitBuilder.a(adapterFactory);
        retrofitBuilder.b(bVar);
        retrofitBuilder.b(gsonConverterFactory);
        d1 d2 = retrofitBuilder.d();
        Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
        return d2;
    }

    public static a41.r d() {
        return new a41.r();
    }

    public static l11.j d0() {
        return new l11.j();
    }

    public static v02.t d1() {
        return new v02.t();
    }

    public static et1.p d2(et1.h0 simpleProducerFactory) {
        Intrinsics.checkNotNullParameter(simpleProducerFactory, "simpleProducerFactory");
        return new et1.p(simpleProducerFactory, 2);
    }

    public static m60.g0 d3(m60.g0 pageSizeProvider) {
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        dl2.b.I(pageSizeProvider);
        return pageSizeProvider;
    }

    public static vr0.a d4() {
        vr0.c cVar = vr0.b.f126453a;
        Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
        dl2.b.I(cVar);
        return cVar;
    }

    public static a51.d e() {
        return new a51.d();
    }

    public static l61.d e0() {
        return new l61.d();
    }

    public static v91.m e1() {
        return new v91.m();
    }

    public static j20.a e2(c1 retrofit, rz.c adapterFactory, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(gsonConverterFactory);
        Object b13 = retrofit.d().b(j20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        j20.a aVar = (j20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static z12.b e3(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        z12.b bVar = (z12.b) o.h(retrofit, aVar, z12.b.class, "create(...)");
        dl2.b.I(bVar);
        return bVar;
    }

    public static n22.a e4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        n22.a aVar = (n22.a) o.h(retrofit, gsonConverterFactory, n22.a.class, "create(...)");
        dl2.b.I(aVar);
        return aVar;
    }

    public static aa1.q f() {
        return new aa1.q();
    }

    public static la1.p f0() {
        return new la1.p();
    }

    public static vz0.a f1() {
        return new vz0.a();
    }

    public static tb0.h f2() {
        tb0.h Y0 = pk.a0.Y0();
        dl2.b.I(Y0);
        return Y0;
    }

    public static rz.e f3(y12.a paginatedModelFeedDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(paginatedModelFeedDeserializableAdapter, "paginatedModelFeedDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(qr0.e.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, paginatedModelFeedDeserializableAdapter);
        return eVar;
    }

    public static uc0.w1 f4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_search_field_title;
        j jVar = new j(q.component_search_field_subtitle, new n0(q.component_search_field_link_text, "https://gestalt.pinterest.systems/android/searchfield"));
        u2.n nVar = u2.n.f120041b;
        return new uc0.w1(i13, new y(jVar, kotlin.collections.f0.j(new e0("Default", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107405r, rc0.s0.f107409v, 12), new e0("Default Two Trailing Icons", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107410w, rc0.s0.f107412y, 12), new e0("Trailing Animated Icon (Click the mic)", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107413z, rc0.s0.D, 12), new e0("Text entered", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.E, rc0.s0.G, 12), new e0("Leading Icon Button", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.H, r0.H, 12), new e0("Trailing Button", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, r0.I, r0.K, 12), new e0("End Action Icon Buttons", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, r0.L, rc0.s0.f107397j, 12), new e0("Error", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107398k, rc0.s0.f107400m, 12), new e0("Transparent", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107401n, rc0.s0.f107403p, 12), new e0("Two Trailing Icons", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.s0.f107404q, rc0.s0.f107408u, 12))));
    }

    public static ax1.e g() {
        return new ax1.e();
    }

    public static ly0.d g0() {
        return new ly0.d();
    }

    public static w41.n0 g1() {
        return new w41.n0();
    }

    public static Map g2(zp.f defaultCreatorRouter) {
        Intrinsics.checkNotNullParameter(defaultCreatorRouter, "defaultCreatorRouter");
        Map b13 = y0.b(new Pair(ou1.i.CREATOR, defaultCreatorRouter));
        dl2.b.I(b13);
        return b13;
    }

    public static rz.e g3(a22.a pearInsightJsonDeserializableAdapter, a22.b pearQuizJsonDeserializableAdapter, a22.c pearQuizOutputJsonDeserializableAdapter, a22.d pearQuizOutputSectionJsonDeserializableAdapter, PinDeserializer pinDeserializer, b22.e pinListWithBookmarkJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(pearInsightJsonDeserializableAdapter, "pearInsightJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(pearQuizJsonDeserializableAdapter, "pearQuizJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(pearQuizOutputJsonDeserializableAdapter, "pearQuizOutputJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(pearQuizOutputSectionJsonDeserializableAdapter, "pearQuizOutputSectionJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        Intrinsics.checkNotNullParameter(pinListWithBookmarkJsonDeserializableAdapter, "pinListWithBookmarkJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        TypeToken typeToken = new TypeToken(h20.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, pearInsightJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(ia0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, pearQuizJsonDeserializableAdapter);
        TypeToken typeToken3 = new TypeToken(cb0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, pearQuizOutputJsonDeserializableAdapter);
        TypeToken typeToken4 = new TypeToken(f30.class);
        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
        eVar.a(typeToken4, new e00.a(pinDeserializer));
        TypeToken typeToken5 = new TypeToken(b22.d.class);
        Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
        eVar.a(typeToken5, pinListWithBookmarkJsonDeserializableAdapter);
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(kb0.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, pearQuizOutputSectionJsonDeserializableAdapter);
        return eVar;
    }

    public static rz.e g4(vz.a boardFeedJsonDeserializableAdapter, b22.b pinFeedJsonDeserializableAdapter, j22.f searchTypeaheadItemFeedJsonDeserializableAdapter, q1 dynamicFeedJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(boardFeedJsonDeserializableAdapter, "boardFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(pinFeedJsonDeserializableAdapter, "pinFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(searchTypeaheadItemFeedJsonDeserializableAdapter, "searchTypeaheadItemFeedJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(dynamicFeedJsonDeserializableAdapter, "dynamicFeedJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(PinFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, pinFeedJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(BoardFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, boardFeedJsonDeserializableAdapter);
        TypeToken typeToken3 = new TypeToken(SearchTypeaheadItemFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, searchTypeaheadItemFeedJsonDeserializableAdapter);
        TypeToken typeToken4 = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
        eVar.a(typeToken4, rz.f.f110230a);
        TypeToken typeToken5 = new TypeToken(DynamicFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
        eVar.a(typeToken5, dynamicFeedJsonDeserializableAdapter);
        return eVar;
    }

    public static b01.l h() {
        return new b01.l();
    }

    public static m31.e h0() {
        return new m31.e();
    }

    public static x11.c h1() {
        return new x11.c();
    }

    public static tu1.d0 h2(uu1.b requestInfoListenerFactory, tu1.o0 linkHeaderPrefetcher, n1 experiments) {
        int i13;
        int i14;
        z3 z3Var;
        lh0.g1 g1Var;
        Intrinsics.checkNotNullParameter(requestInfoListenerFactory, "requestInfoListenerFactory");
        Intrinsics.checkNotNullParameter(linkHeaderPrefetcher, "linkHeaderPrefetcher");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        boolean z13 = true;
        if (experiments.b("morethreads")) {
            i13 = 8;
        } else {
            if (experiments.b("singlethread")) {
                i14 = 1;
                z3Var = lh0.a4.f83297a;
                g1Var = (lh0.g1) experiments.f83439a;
                if (!g1Var.o("android_cronet_disable_accept_encoding", "enabled", z3Var) && !g1Var.l("android_cronet_disable_accept_encoding")) {
                    z13 = false;
                }
                tu1.z zVar = new tu1.z();
                Intrinsics.checkNotNullExpressionValue(tu1.u0.f119457a, "defaultStrategy(...)");
                return new tu1.d0(zVar, requestInfoListenerFactory, i14, z13, linkHeaderPrefetcher);
            }
            i13 = 4;
        }
        i14 = i13;
        z3Var = lh0.a4.f83297a;
        g1Var = (lh0.g1) experiments.f83439a;
        if (!g1Var.o("android_cronet_disable_accept_encoding", "enabled", z3Var)) {
            z13 = false;
        }
        tu1.z zVar2 = new tu1.z();
        Intrinsics.checkNotNullExpressionValue(tu1.u0.f119457a, "defaultStrategy(...)");
        return new tu1.d0(zVar2, requestInfoListenerFactory, i14, z13, linkHeaderPrefetcher);
    }

    public static s20.a h3(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        s20.a aVar2 = (s20.a) o.h(retrofit, aVar, s20.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static j22.b h4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        j22.b bVar = (j22.b) o.h(retrofit, aVar, j22.b.class, "create(...)");
        dl2.b.I(bVar);
        return bVar;
    }

    public static b31.g i() {
        return new b31.g();
    }

    public static ms.e i0() {
        return new ms.e();
    }

    public static xa1.f i1() {
        return new xa1.f();
    }

    public static nb0.w i2(t2 preferencesExperiments) {
        Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
        return new nb0.w(preferencesExperiments, 1);
    }

    public static dl1.z i3(fl1.f policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        dl2.b.I(policy);
        return policy;
    }

    public static y1 i4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_select_list_title;
        j jVar = new j(q.component_select_list_subtitle, new n0(q.component_select_list_link_text, "https://gestalt.pinterest.systems/web/selectlist"));
        u2.n nVar = u2.n.f120041b;
        return new y1(i13, new y(jVar, kotlin.collections.f0.j(new e0("Default", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, new rc0.d(stateProvider, 15), 28), new e0("Item Selected", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, new rc0.d(stateProvider, 17), 28), new e0("Disabled", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, new rc0.d(stateProvider, 19), 28), new e0("Error", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, new rc0.d(stateProvider, 21), 28))));
    }

    public static b51.e j() {
        return new b51.e();
    }

    public static n61.b j0() {
        return new n61.b();
    }

    public static xa1.l j1() {
        return new xa1.l();
    }

    public static uc0.e0 j2(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.e0(q.component_divider_title, new y(new j(q.component_divider_subtitle, new n0(q.component_divider_link_text, "https://gestalt.pinterest.systems/web/divider")), kotlin.collections.f0.j(new e0("Default", null, null, null, null, new rc0.d(stateProvider, 8), 30), new e0("Vertical Orientation", null, null, null, null, new rc0.d(stateProvider, 9), 30))));
    }

    public static rz.e j3(b22.b pinFeedDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(pinFeedDeserializableAdapter, "pinFeedDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(PinFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, pinFeedDeserializableAdapter);
        return eVar;
    }

    public static ho2.c j4() {
        ho2.c e13 = dl2.b.e();
        return new ho2.c(e13.getCoroutineContext().plus(new ao2.i0("ShuffleScope")));
    }

    public static ba1.y k() {
        return new ba1.y();
    }

    public static n91.q k0() {
        return new n91.q();
    }

    public static xa1.t k1() {
        return new xa1.t();
    }

    public static as1.b k2() {
        as1.b a13 = as1.b.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        dl2.b.I(a13);
        return a13;
    }

    public static ScreenLocation k3() {
        ScreenLocation screenLocation = (ScreenLocation) w1.F.getValue();
        dl2.b.I(screenLocation);
        return screenLocation;
    }

    public static a2 k4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new a2(q.component_spinner_title, new y(new j(q.component_spinner_subtitle, new n0(q.component_spinner_link_text, "https://gestalt.pinterest.systems/web/spinner")), kotlin.collections.f0.j(new tc0.f0(Integer.valueOf(q.default_title), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.s0.f107396J, rc0.s0.L, 18), new tc0.f0(Integer.valueOf(q.grayscale), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.u0.f107420j, rc0.u0.f107422l, 18), new tc0.f0(Integer.valueOf(q.white), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.u0.f107424n, rc0.u0.f107426p, 18), new tc0.f0(Integer.valueOf(q.with_label), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.u0.f107428r, rc0.u0.f107430t, 18))));
    }

    public static bb1.z l() {
        return new bb1.z();
    }

    public static nw1.b l0() {
        return new nw1.b();
    }

    public static xy0.e l1() {
        return new xy0.e();
    }

    public static k20.a l2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(k20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        k20.a aVar = (k20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static rz.e l3() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(y40.class, "get(...)"), l00.a.f81295a);
        return eVar;
    }

    public static void l4(rz.e registry, v12.a musicMetadataListDeserializer) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(musicMetadataListDeserializer, "musicMetadataListDeserializer");
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(eq.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        registry.a(a13, musicMetadataListDeserializer);
    }

    public static c31.r m() {
        return new c31.r();
    }

    public static ny0.v m0() {
        return new ny0.v();
    }

    public static yq1.z m1() {
        return new yq1.z();
    }

    public static w m2() {
        w Z0 = pk.a0.Z0();
        dl2.b.I(Z0);
        return Z0;
    }

    public static z20.a m3(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(z20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        z20.a aVar = (z20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static g22.b m4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(g22.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        g22.b bVar = (g22.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static c61.i n() {
        return new c61.i();
    }

    public static nz0.d n0() {
        return new nz0.d();
    }

    public static yx1.j n1() {
        return new yx1.j();
    }

    public static oh0.h n2(rz.c adapterFactory, p00.b converterFactory, c1 retrofitBuilder, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofitBuilder, adapterFactory, converterFactory);
        oh0.h hVar = (oh0.h) o.h(retrofitBuilder, aVar, oh0.h.class, "create(...)");
        dl2.b.I(hVar);
        return hVar;
    }

    public static nx.d0 n3(uk1.d presenterPinalytics) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        nx.d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        dl2.b.I(d0Var);
        return d0Var;
    }

    public static h22.c n4(i2 pinRepository, h22.f storyPinService, h22.e storyPinRemoteManager, d3 repositoryExperiments) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(storyPinRemoteManager, "storyPinRemoteManager");
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        return new h22.c(pinRepository, storyPinService, storyPinRemoteManager, repositoryExperiments);
    }

    public static ca1.o o() {
        return new ca1.o();
    }

    public static o42.b o0() {
        return new o42.b();
    }

    public static yy0.n o1() {
        return new yy0.n();
    }

    public static uc0.l0 o2(org.chromium.net.y stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.l0(q.feedbackTitle, q.feedback_page_description, new uc0.j0(q.feedback_page_feedback_type_title, kotlin.collections.f0.j("Comments", "Suggestions", "Question")), new uc0.k0(q.feedback_page_placeholder_feedback), new uc0.i0(new uc0.k0(q.name), new uc0.k0(q.email)), q.submit);
    }

    public static z12.d o3(rz.c adapterFactory, p00.b converterFactory, t00.e boardRepositoryOnFailureRouterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(boardRepositoryOnFailureRouterFactory, "boardRepositoryOnFailureRouterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, boardRepositoryOnFailureRouterFactory, null, false, 61));
        j13.a(adapterFactory);
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(z12.d.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        z12.d dVar = (z12.d) b13;
        dl2.b.I(dVar);
        return dVar;
    }

    public static c2 o4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new c2(q.component_switch_title, new y(new j(q.component_switch_description, new n0(q.component_switch_link_text, "https://gestalt.pinterest.systems/android/switch")), kotlin.collections.f0.j(new tc0.f0(Integer.valueOf(q.default_title), Integer.valueOf(q.active_title), Integer.valueOf(q.inactive_title), null, rc0.u0.f107432v, rc0.u0.f107434x, 18), new tc0.f0(Integer.valueOf(q.disable_title), Integer.valueOf(q.active_title), Integer.valueOf(q.inactive_title), null, rc0.u0.f107436z, rc0.u0.B, 18), new d0(q.component_switch_with_label_title_left, rc0.u0.D), new d0(q.component_switch_with_label_title_right, rc0.u0.F), new d0(q.component_switch_with_subtext_title_left, rc0.u0.H), new d0(q.component_switch_with_subtext_title_right, rc0.u0.f107419J))));
    }

    public static com.pinterest.feature.search.results.goldstandard.viewpager.steps.a p() {
        return new com.pinterest.feature.search.results.goldstandard.viewpager.steps.a();
    }

    public static o61.c p0() {
        return new o61.c();
    }

    public static z51.e p1() {
        return new z51.e();
    }

    public static uj2.a0 p2() {
        uj2.a0 a13 = wj2.c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "mainThread(...)");
        return a13;
    }

    public static rz.e p3(c22.a pinnableImageFeedJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(pinnableImageFeedJsonDeserializableAdapter, "pinnableImageFeedJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(PinnableImageFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, pinnableImageFeedJsonDeserializableAdapter);
        return eVar;
    }

    public static e2 p4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new e2(q.component_tag_title, new y(new j(q.component_tag_subtitle, new n0(q.component_tag_link_text, "https://gestalt.pinterest.systems/web/Tag")), kotlin.collections.f0.j(new tc0.f0(Integer.valueOf(q.default_title), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.v0.f107440j, rc0.v0.f107442l, 18), new tc0.f0(Integer.valueOf(q.disable_title), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.v0.f107444n, rc0.v0.f107446p, 18), new tc0.f0(Integer.valueOf(q.selected), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.v0.f107448r, rc0.v0.f107450t, 18), new tc0.f0(Integer.valueOf(q.error_title), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.v0.f107452v, rc0.v0.f107454x, 18), new tc0.f0(Integer.valueOf(q.warning), Integer.valueOf(q.small), Integer.valueOf(q.large), null, rc0.v0.f107456z, rc0.u0.M, 18))));
    }

    public static GraphQLSearchGridFragment q() {
        return new GraphQLSearchGridFragment();
    }

    public static p11.c q0() {
        return new p11.c();
    }

    public static z91.m q1() {
        return new z91.m();
    }

    public static uj2.a0 q2() {
        uj2.a0 a0Var = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(a0Var, "io(...)");
        dl2.b.I(a0Var);
        return a0Var;
    }

    public static p00.b q3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static g2 q4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_text_area_title;
        j jVar = new j(q.component_text_area_subtitle, new n0(q.component_text_area_link_text, "https://gestalt.pinterest.systems/android/textarea"));
        u2.n nVar = u2.n.f120041b;
        return new g2(i13, new y(jVar, kotlin.collections.f0.j(new e0("Default", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.B, 28), new e0("Helper Text", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.D, 28), new e0("Disabled with text", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.F, 28), new e0("Disabled with hint", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.H, 28), new e0("Error", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.f107439J, 28), new e0("Success", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.v0.L, 28), new e0("Maximum length Warning", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107460j, 28), new e0("Maximum length Error", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107462l, 28), new e0("Limit input to maxLength", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107464n, 28))));
    }

    public static SearchGridMultiSectionFragment r() {
        return new SearchGridMultiSectionFragment();
    }

    public static p11.l r0() {
        return new p11.l();
    }

    public static zw1.c r1() {
        return new zw1.c();
    }

    public static as1.c r2(as1.b dynamicImageUtils) {
        Intrinsics.checkNotNullParameter(dynamicImageUtils, "dynamicImageUtils");
        return dynamicImageUtils;
    }

    public static void r3(rz.e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        TypeToken typeToken = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        registry.a(typeToken, rz.f.f110230a);
    }

    public static uc0.i2 r4(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i13 = q.component_text_field_title;
        j jVar = new j(q.component_text_field_subtitle, new n0(q.component_text_field_link_text, "https://gestalt.pinterest.systems/android/textfield"));
        u2.n nVar = u2.n.f120041b;
        return new uc0.i2(i13, new y(jVar, kotlin.collections.f0.j(new e0("Default", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107466p, 28), new e0("Disabled", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107468r, 28), new e0("Text Entered", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107470t, 28), new e0("Error", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107472v, 28), new e0("Success", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107474x, 28), new e0("Max Length", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107476z, 28), new e0("Max Length (Blocking input)", androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.B, 28))));
    }

    public static com.pinterest.feature.settings.notifications.v s() {
        return new com.pinterest.feature.settings.notifications.v();
    }

    public static p61.d s0() {
        return new p61.d();
    }

    public static zx0.f s1() {
        return new zx0.f();
    }

    public static pb0.d s2(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new pb0.d(resources);
    }

    public static rz.e s3() {
        rz.e eVar = new rz.e();
        eVar.a(o.f(vd0.c.class, "get(...)"), rz.f.f110230a);
        return eVar;
    }

    public static k2 s4(rc0.c1 stateProvider) {
        String str;
        Enum r13;
        b1 b1Var;
        vn1.g[] gVarArr;
        Enum r14;
        b1 b1Var2;
        int i13 = 1;
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        int i14 = q.component_text_title;
        j jVar = new j(q.component_text_subtitle, new n0(q.component_text_link_text, "https://gestalt.pinterest.systems/android/text"));
        u2.n nVar = u2.n.f120041b;
        List j13 = kotlin.collections.f0.j(new g0("Start / end icons", null, null, null, androidx.compose.foundation.layout.e.b(nVar, 1.0f), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.w0.H, rc0.w0.I, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER), new e0(null, androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, null, rc0.w0.f107459J, 28));
        Class<vn1.g> cls = vn1.g.class;
        String f13 = kotlin.jvm.internal.k0.f80436a.b(cls).f();
        List d2 = z.d(vn1.g.values());
        ArrayList arrayList = new ArrayList();
        int ceil = (int) Math.ceil(d2.size() / 2.0d);
        int i15 = 0;
        while (true) {
            b1 b1Var3 = null;
            if (i15 >= ceil) {
                break;
            }
            int i16 = i15 * 2;
            Enum r53 = (Enum) d2.get(i16);
            Enum r43 = (Enum) CollectionsKt.U(i16 + 1, d2);
            String str2 = i15 == 0 ? f13 : null;
            String k13 = r.k(r53);
            int i17 = i15;
            int i18 = ceil;
            ArrayList arrayList2 = arrayList;
            List list = d2;
            Class<vn1.g> cls2 = cls;
            List list2 = j13;
            b1 m13 = rc0.c1.m(stateProvider, null, null, (vn1.g) r53, null, null, 0, 59);
            String k14 = r43 != null ? r.k(r43) : null;
            if (r43 != null) {
                b1Var3 = rc0.c1.m(stateProvider, null, null, (vn1.g) r43, null, null, 0, 59);
            }
            arrayList2.add(new g0(str2, k13, k14, null, null, null, new p0(r53, 8), new p0(r43, 9), m13, b1Var3, 56));
            i15 = i17 + 1;
            arrayList = arrayList2;
            ceil = i18;
            d2 = list;
            cls = cls2;
            j13 = list2;
        }
        Class<vn1.g> cls3 = cls;
        ArrayList l03 = CollectionsKt.l0(arrayList, j13);
        String f14 = kotlin.jvm.internal.k0.f80436a.b(vn1.c.class).f();
        List d13 = z.d(vn1.c.values());
        ArrayList arrayList3 = new ArrayList();
        int ceil2 = (int) Math.ceil(d13.size() / 2.0d);
        int i19 = 0;
        while (i19 < ceil2) {
            int i23 = i19 * 2;
            Enum r83 = (Enum) d13.get(i23);
            Enum r73 = (Enum) CollectionsKt.U(i23 + i13, d13);
            String str3 = i19 == 0 ? f14 : null;
            int i24 = i19;
            int i25 = ceil2;
            String str4 = f14;
            ArrayList arrayList4 = arrayList3;
            arrayList4.add(new g0(str3, r.k(r83), r73 != null ? r.k(r73) : null, null, null, null, new p0(r83, 10), new p0(r73, 11), rc0.c1.m(stateProvider, null, (vn1.c) r83, null, null, null, 0, 61), r73 != null ? rc0.c1.m(stateProvider, null, (vn1.c) r73, null, null, null, 0, 61) : null, 56));
            i13 = 1;
            i19 = i24 + 1;
            arrayList3 = arrayList4;
            ceil2 = i25;
            f14 = str4;
        }
        ArrayList l04 = CollectionsKt.l0(arrayList3, l03);
        vn1.g[] values = vn1.g.values();
        ArrayList arrayList5 = new ArrayList(values.length);
        int length = values.length;
        int i26 = 0;
        while (i26 < length) {
            vn1.g variant = values[i26];
            String k15 = r.k(variant);
            vn1.e[] values2 = vn1.e.values();
            ArrayList arrayList6 = new ArrayList();
            for (vn1.e style : values2) {
                Intrinsics.checkNotNullParameter(variant, "variant");
                Intrinsics.checkNotNullParameter(style, "style");
                if ((style != vn1.e.BOLD && variant != vn1.g.BODY_100 && variant != vn1.g.BODY_200 && variant != vn1.g.BODY_300 && variant != vn1.g.BODY_400) || variant == vn1.g.BODY_100 || variant == vn1.g.BODY_200 || variant == vn1.g.BODY_300 || variant == vn1.g.BODY_400) {
                    arrayList6.add(style);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            int ceil3 = (int) Math.ceil(arrayList6.size() / 2.0d);
            int i27 = 0;
            while (i27 < ceil3) {
                int i28 = i27 * 2;
                Enum r44 = (Enum) arrayList6.get(i28);
                Enum r54 = (Enum) CollectionsKt.U(i28 + 1, arrayList6);
                String str5 = i27 == 0 ? k15 : null;
                String k16 = r.k(r44);
                int i29 = i27;
                int i33 = ceil3;
                ArrayList arrayList8 = arrayList7;
                ArrayList arrayList9 = arrayList6;
                vn1.g gVar = variant;
                int i34 = i26;
                b1 m14 = rc0.c1.m(stateProvider, null, null, variant, kotlin.collections.e0.b((vn1.e) r44), null, 0, 51);
                String k17 = r54 != null ? r.k(r54) : null;
                if (r54 != null) {
                    gVarArr = values;
                    r14 = r54;
                    b1Var2 = rc0.c1.m(stateProvider, null, null, gVar, kotlin.collections.e0.b((vn1.e) r54), null, 0, 51);
                } else {
                    gVarArr = values;
                    r14 = r54;
                    b1Var2 = null;
                }
                arrayList8.add(new g0(str5, k16, k17, null, null, null, new rc0.q0(r44, gVar, 1), new rc0.q0(r14, gVar, 2), m14, b1Var2, 56));
                arrayList7 = arrayList8;
                variant = gVar;
                ceil3 = i33;
                arrayList6 = arrayList9;
                values = gVarArr;
                i26 = i34;
                i27 = i29 + 1;
            }
            arrayList5.add(arrayList7);
            i26++;
            values = values;
        }
        ArrayList m03 = CollectionsKt.m0(new g0("Bold italic", null, null, null, androidx.compose.foundation.layout.e.b(nVar, 1.0f), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.w0.F, rc0.w0.G, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER), CollectionsKt.m0(new g0("Bold underlined", null, null, null, androidx.compose.foundation.layout.e.b(nVar, 1.0f), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.w0.D, rc0.w0.E, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER), CollectionsKt.m0(new g0("All styles combined", null, null, null, androidx.compose.foundation.layout.e.b(nVar, 1.0f), androidx.compose.foundation.layout.e.b(nVar, 1.0f), null, null, rc0.w0.K, rc0.w0.C, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER), CollectionsKt.l0(kotlin.collections.g0.r(arrayList5), l04))));
        String f15 = kotlin.jvm.internal.k0.f80436a.b(cls3).f();
        List d14 = z.d(vn1.g.values());
        ArrayList arrayList10 = new ArrayList();
        int ceil4 = (int) Math.ceil(d14.size() / 2.0d);
        int i35 = 0;
        while (i35 < ceil4) {
            int i36 = i35 * 2;
            Enum r102 = (Enum) d14.get(i36);
            Enum r93 = (Enum) CollectionsKt.U(i36 + 1, d14);
            String str6 = i35 == 0 ? f15 : null;
            String k18 = r.k(r102);
            rn1.b bVar = rn1.b.END;
            vn1.e eVar = vn1.e.ITALIC;
            vn1.e eVar2 = vn1.e.UNDERLINED;
            int i37 = i35;
            b1 m15 = rc0.c1.m(stateProvider, "Italic Underlined", null, (vn1.g) r102, kotlin.collections.f0.j(eVar, eVar2), bVar, 1, 2);
            String k19 = r93 != null ? r.k(r93) : null;
            if (r93 != null) {
                str = f15;
                r13 = r93;
                b1Var = rc0.c1.m(stateProvider, "Italic Underlined", null, (vn1.g) r93, kotlin.collections.f0.j(eVar, eVar2), bVar, 1, 2);
            } else {
                str = f15;
                r13 = r93;
                b1Var = null;
            }
            arrayList10.add(new g0(str6, k18, k19, null, null, null, new p0(r102, 12), new p0(r13, 13), m15, b1Var, 56));
            i35 = i37 + 1;
            f15 = str;
        }
        return new k2(i14, new y(jVar, CollectionsKt.l0(arrayList10, m03)));
    }

    public static com.pinterest.qrCodeLogin.z t() {
        return new com.pinterest.qrCodeLogin.z();
    }

    public static pc1.d t0() {
        return new pc1.d();
    }

    public static zx1.k t1() {
        return new zx1.k();
    }

    public static t12.b t2(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(t12.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        t12.b bVar = (t12.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static p00.b t3(rz.e registry, p00.d requestBodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(requestBodyConverter, "requestBodyConverter");
        return new p00.b(registry, requestBodyConverter, null);
    }

    public static q2 t4(org.chromium.net.y stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new q2(kotlin.collections.f0.j(new v2(q.background_color, kotlin.collections.f0.j(new m2("$color_background_default", eo1.b.color_background_default, "Background color that will match the current color scheme", "#ffffffff", "#ff111111"), new m2("$color_background_info_weak", eo1.b.color_background_info_weak, "Weak background color to indicate neutral information, can be used behind text", "#ffd7edff", "#ff003c96"), new m2("$color_background_warning_base", eo1.b.color_background_warning_base, "Background color to indicate warnings", "#ffbd5b00", "#fffdc900"), new m2("$color_background_warning_weak", eo1.b.color_background_warning_weak, "Weak background color to indicate warnings, can be used behind text", "#ffffe4c1", "#ff7c2d00"), new m2("$color_background_success_base", eo1.b.color_background_success_base, "Background color to indicate success", "#ff008753", "#ff6bec8c"), new m2("$color_background_success_weak", eo1.b.color_background_success_weak, "Weak background color to indicate success, can be used behind text", "#ffc3f9c2", "#ff00422c"), new m2("$color_background_recommendation_base", eo1.b.color_background_recommendation_base, "Background color to indicate recommendations", "#ff812ae7", "#ffb190ff"), new m2("$color_background_recommendation_weak", eo1.b.color_background_recommendation_weak, "Weak background color to indicate recommendations, can be used behind text", "#ffe9e4ff", "#ff550aa9"), new m2("$color_background_shopping", eo1.b.color_background_shopping, "Background color to indicate shopping-related features", "#ff0074e8", "#ff75bfff"), new m2("$color_background_primary_base", eo1.b.color_background_primary_base, "Primary background color", "#ffe60023", "#ffe60023"), new m2("$color_background_primary_strong", eo1.b.color_background_primary_strong, "Strong version of the primary background color, used for hover", "#ffb60000", "#ffb60000"), new m2("$color_background_primary_weak", eo1.b.color_background_primary_weak, "Weak version of the primary background color, used for hover", "#fff47171", "#fff47171"), new m2("$color_background_secondary_base", eo1.b.color_background_secondary_base, "Secondary background color", "#ffe9e9e9", "#ff767676"), new m2("$color_background_secondary_strong", eo1.b.color_background_secondary_strong, "Strong version of secondary background color, used for hover", "#ffa5a5a5", "#ffa5a5a5"), new m2("$color_background_secondary_weak", eo1.b.color_background_secondary_weak, "Weak version of secondary background color, used for hover", "#ffcdcdcd", "#ffcdcdcd"), new m2("$color_background_tertiary_base", eo1.b.color_background_tertiary_base, "Tertiary background color", "#ff767676", "#ffcdcdcd"), new m2("$color_background_tertiary_strong", eo1.b.color_background_tertiary_base, "Strong version of tertiary background color, used for hover", "#ff2b2b2b", "#ff2b2b2b"), new m2("$color_background_tertiary_weak", eo1.b.color_background_tertiary_weak, "Weak version of tertiary background color, used for hover", "#ffcdcdcd", "#ffcdcdcd"), new m2("$color_background_selected_base", eo1.b.color_background_selected_base, "Background color to indicate selected state, like a selected IconButton", "#ff111111", "#ffe9e9e9"), new m2("$color_background_selected_weak", eo1.b.color_background_selected_weak, "Weak version of the selected background color, used for hover", "#ff2b2b2b", "#ff2b2b2b"), new m2("$color_background_selected_strong", eo1.b.color_background_selected_strong, "Strong version of the selected background color, used for hover", "#ffa5a5a5", "#ffa5a5a5"), new m2("$color_background_inverse_base", eo1.b.color_background_inverse_base, "Background color for use on inverted backgrounds", "#ff111111", "#fff9f9f9"), new m2("$color_background_inverse_strong", eo1.b.color_background_inverse_strong, "Strong version of inverse background color, used for hover", "#ffe9e9e9", "#ffe9e9e9"), new m2("$color_background_brand", eo1.b.color_background_brand, "Background color to signify the Pinterest brand", "#ffe60023", "#ffe60023"), new m2("$color_background_education", eo1.b.color_background_education, "Background color to indicate educational moments or messages", "#ff0074e8", "#ff75bfff"), new m2("$color_background_wash_dark", eo1.b.color_background_wash_dark, "Background color to supply a dark wash over an item", "#cc000000", "#cc000000"), new m2("$color_background_wash_light", eo1.b.color_background_wash_light, "Background color to supply a light wash over an item", "#e6ffffff", "#e6ffffff"), new m2("$color_background_dark", eo1.b.color_background_dark, "Background color that will always be dark, no matter the color scheme", "#ff111111", "#ff111111"), new m2("$color_background_light", eo1.b.color_background_light, "Background color that will always be light, no matter the color scheme", "#ffffffff", "#ffffffff"), new m2("$color_background_elevation_accent", eo1.b.color_background_elevation_accent, "Background color used to accent containers when shadows are not an option", "#fff1f1f1", "#ff191919"), new m2("$color_background_elevation_floating", eo1.b.color_themed_background_elevation_floating, "Background color used for floating elements in dark mode (like Modal or Sheet)", "#ffffffff", "#ff2b2b2b"), new m2("$color_background_elevation_raised", eo1.b.sema_color_background_elevation, "Background color used for raised elements in dark mode, like sticky headers or navigation footers", "#00000000", "#ff4a4a4a"))), new v2(q.text_color, kotlin.collections.f0.j(new m2("$color_text_default", eo1.b.color_text_default, "Default text color", "#ff111111", "#ffffffff"), new m2("$color_text_subtle", eo1.b.color_text_subtle, "Secondary, subtle text color", "#ff5f5f5f", "#ffa5a5a5"), new m2("$color_text_success", eo1.b.color_text_success, "Text color to indicate success", "#ff005f3e", "#ff39d377"), new m2("$color_text_error", eo1.b.color_text_error, "Text color to indicate an error", "#ffcc0000", "#fff47171"), new m2("$color_text_warning", eo1.b.color_text_warning, "Text color to indicate a warning or caution", "#ffbd5b00", "#ffe18d00"), new m2("$color_text_inverse", eo1.b.color_text_inverse, "Text color to use on inverted backgrounds", "#ffffffff", "##ff111111"), new m2("$color_text_dark", eo1.b.color_text_dark, "Dark text color that won't change in dark mode", "#ff111111", "#ff111111"), new m2("$color_text_light", eo1.b.color_text_light, "Light text color that won't change in dark mode", "#ffffffff", "#ffffffff"), new m2("$color_text_shopping", eo1.b.color_text_shopping, "Text color to use for shopping surfaces", "#ff0074e8", "#ff75bfff"), new m2("$color_text_link", eo1.b.color_text_link, "Text color to use for links in documentation sites", "#ff004ba9", "#ff45a3fe"), new m2("$color_icon_default", eo1.b.color_icon_default, "Default color for icons", "#ff111111", "#ffffffff"), new m2("$color_icon_subtle", eo1.b.color_icon_subtle, "Subtle, secondary color for icons", "#ff5f5f5f", "#ffa5a5a5"), new m2("$color_icon_success", eo1.b.color_icon_success, "Icon color to indicate success", "#ff005f3e", "#ff39d377"), new m2("$color_icon_error", eo1.b.color_icon_error, "Icon color to indicate an error", "#ffcc0000", "#fff47171"), new m2("$color_icon_warning", eo1.b.color_icon_warning, "Icon color to indicate a warning or caution", "#ffbd5b00", "#ffe18d00"), new m2("$color_icon_info", eo1.b.color_icon_info, "Icon color to use for information", "#ff0074e8", "#ff75bfff"), new m2("$color_icon_recommendation", eo1.b.color_icon_recommendation, "Icon color to use for recommendations", "#ff812ae7", "#ffb190ff"), new m2("$color_icon_inverse", eo1.b.color_icon_inverse, "Icon color to use on inverted backgrounds", "#ffffffff", "#ff111111"), new m2("$color_icon_shopping", eo1.b.color_icon_shopping, "Icon color to use for shopping surfaces", "#ff0074e8", "#ff75bfff"), new m2("$color_icon_brand_primary", eo1.b.color_icon_brand_primary, "Icon color to use solely for representing the Pinterest brand", "#ffe60023", "#ffe60023"), new m2("$color_icon_light", eo1.b.color_icon_light, "Icon color that will always remain light", "#ffffffff", "#ffffffff"), new m2("$color_icon_dark", eo1.b.color_icon_dark, "Icon color that will always remain dark", "#ff111111", "#ff111111"))), new v2(q.font_size, kotlin.collections.f0.j(new n2("$font_size_100", "12sp", eo1.c.font_size_100), new n2("$font_size_200", "14sp", eo1.c.font_size_200), new n2("$font_size_300", "16sp", eo1.c.font_size_300), new n2("$font_size_400", "20sp", eo1.c.font_size_400), new n2("$font_size_500", "28sp", eo1.c.font_size_500), new n2("$font_size_600", "36sp", eo1.c.font_size_600))), new v2(q.border_color, kotlin.collections.f0.j(new m2("$color_border_container", eo1.b.color_border_container, "Used to delineate a larger container, like Card or TextArea", "#ffcdcdcd", "#ff4a4a4a"), new m2("$color_border_default", eo1.b.color_border_default, "Used to indicate specific UI element boundaries, like Checkbox or RadioButton", "#ff767676", "#ffcdcdcd"), new m2("$color_border_error", eo1.b.color_border_error, "Used to indicate an error on a contained element, like TextField or TextArea", "#ffcc0000", "#fff47171"))), new v2(q.opacity, kotlin.collections.f0.j(new o2("$opacity_0", "Transparent - When a transparent alpha value is needed (without a background)", "0", eo1.c.opacity_100), new o2("$opacity_100", "Pin wash - Permanent overlay used on Pin images to ensure a visual separation between the white background and any Pin images that have pure white peripheries", "0.04", eo1.c.opacity_100), new o2("$opacity_200", "Overlay wash to be used sparingly. Only use it in situations where a high-level of opacity is needed and if the 40% doesn't fit the design goal", "0.2", eo1.c.opacity_200), new o2("$opacity_300", "Overlay wash to supply a mid-range wash over an item (e.g. #FFFFFF media controls | #000000 wash behind modals, wash on images with text overlays)", "0.4", eo1.c.opacity_300), new o2("$opacity_400", "Overlay wash used on most surface's scrims. Used to supply a low-level of opacity over an element (e.g. #FFFFFF image overlay | #00000 Board cover overlay)", "0.8", eo1.c.opacity_400), new o2("$opacity_500", "Component wash applied on IconButton and other elements as needed (e.g. image overlays). In dark mode we recommend an inverse wash ($color-background-wash-light instead of $color-background-wash-dark)", "0.9", eo1.c.opacity_500))), new v2(q.vr_base_color, kotlin.collections.f0.j(new m2("$base_color_pinterest", eo1.b.base_color_pinterest_main_0_0_1_beta_7, "Base color Pinterest", "#ffe60023", "#ffe60023"), new m2("$base_color_gray_0", eo1.b.base_color_grayscale_0_main_0_0_1_beta_7, "Base color Gray shade 0", "#ffffffff", "#ffffffff"), new m2("$base_color_gray_25", eo1.b.base_color_grayscale_25_main_0_0_1_beta_7, "Base color Gray shade 25", "#fff0f0eb", "#fff0f0eb"), new m2("$base_color_gray_50", eo1.b.base_color_grayscale_50_main_0_0_1_beta_7, "Base color Gray shade 50", "#ffe0e0d9", "#ffe0e0d9"), new m2("$base_color_gray_100", eo1.b.base_color_grayscale_100_main_0_0_1_beta_7, "Base color Gray shade 100", "#ffd1d1c7", "#ffd1d1c7"), new m2("$base_color_gray_150", eo1.b.base_color_grayscale_150_main_0_0_1_beta_7, "Base color Gray shade 150", "#ffc2c2b6", "#ffc2c2b6"), new m2("$base_color_gray_200", eo1.b.base_color_grayscale_200_main_0_0_1_beta_7, "Base color Gray shade 200", "#ff949486", "#ff949486"), new m2("$base_color_gray_250", eo1.b.base_color_grayscale_250_main_0_0_1_beta_7, "Base color Gray shade 250", "#ff757569", "#ff757569"), new m2("$base_color_gray_300", eo1.b.base_color_grayscale_300_main_0_0_1_beta_7, "Base color Gray shade 300", "#ff57574c", "#ff57574c"), new m2("$base_color_gray_350", eo1.b.base_color_grayscale_350_main_0_0_1_beta_7, "Base color Gray shade 350", "#ff47473f", "#ff47473f"), new m2("$base_color_gray_400", eo1.b.base_color_grayscale_400_main_0_0_1_beta_7, "Base color Gray shade 400", "#ff363630", "#ff363630"), new m2("$base_color_gray_450", eo1.b.base_color_grayscale_450_main_0_0_1_beta_7, "Base color Gray shade 450", "#ff272721", "#ff272721"), new m2("$base_color_gray_500", eo1.b.base_color_grayscale_500_main_0_0_1_beta_7, "Base color Gray shade 500", "#ff000000", "#ff000000"), new m2("$base_color_red_50", eo1.b.base_color_red_50_main_0_0_1_beta_7, "Base color Red shade 50", "#ffffe7e5", "#ffffe7e5"), new m2("$base_color_red_100", eo1.b.base_color_red_100_main_0_0_1_beta_7, "Base color Red shade 100", "#ffffd3d1", "#ffffd3d1"), new m2("$base_color_red_200", eo1.b.base_color_red_200_main_0_0_1_beta_7, "Base color Red shade 200", "#ffff9494", "#ffff9494"), new m2("$base_color_red_300", eo1.b.base_color_red_300_main_0_0_1_beta_7, "Base color Red shade 300", "#ffe60023", "#ffe60023"), new m2("$base_color_red_400", eo1.b.base_color_red_400_main_0_0_1_beta_7, "Base color Red shade 400", "#ffb2001a", "#ffb2001a"), new m2("$base_color_red_500", eo1.b.base_color_red_500_main_0_0_1_beta_7, "Base color Red shade 500", "#ff8a0f0f", "#ff8a0f0f"), new m2("$base_color_red_600", eo1.b.base_color_red_600_main_0_0_1_beta_7, "Base color Red shade 600", "#ff750d0d", "#ff750d0d"), new m2("$base_color_red_700", eo1.b.base_color_red_700_main_0_0_1_beta_7, "Base color Red shade 700", "#ff660b0b", "#ff660b0b"), new m2("$base_color_purple_50", eo1.b.base_color_purple_50_main_0_0_1_beta_7, "Base color Purple shade 50", "#fffce5fc", "#fffce5fc"), new m2("$base_color_purple_100", eo1.b.base_color_purple_100_main_0_0_1_beta_7, "Base color Purple shade 100", "#fffcd8fc", "#fffcd8fc"), new m2("$base_color_purple_200", eo1.b.base_color_purple_200_main_0_0_1_beta_7, "Base color Purple shade 200", "#ffefadef", "#ffefadef"), new m2("$base_color_purple_300", eo1.b.base_color_purple_300_main_0_0_1_beta_7, "Base color Purple shade 300", "#ffc65dd0", "#ffc65dd0"), new m2("$base_color_purple_400", eo1.b.base_color_purple_400_main_0_0_1_beta_7, "Base color Purple shade 400", "#ff8f4696", "#ff8f4696"), new m2("$base_color_purple_500", eo1.b.base_color_purple_500_main_0_0_1_beta_7, "Base color Purple shade 500", "#ff6d4270", "#ff6d4270"), new m2("$base_color_purple_600", eo1.b.base_color_purple_600_main_0_0_1_beta_7, "Base color Purple shade 600", "#ff5b2a5e", "#ff5b2a5e"), new m2("$base_color_purple_700", eo1.b.base_color_purple_700_main_0_0_1_beta_7, "Base color Purple shade 700", "", ""), new m2("$base_color_blue_50", eo1.b.base_color_blue_50_main_0_0_1_beta_7, "Base color Blue shade 50", "#ffe3f8ff", "#ffe3f8ff"), new m2("$base_color_blue_100", eo1.b.base_color_blue_100_main_0_0_1_beta_7, "Base color Blue shade 100", "#ffc5eaf7", "#ffc5eaf7"), new m2("$base_color_blue_200", eo1.b.base_color_blue_200_main_0_0_1_beta_7, "Base color Blue shade 200", "#ff7cbede", "#ff7cbede"), new m2("$base_color_blue_300", eo1.b.base_color_blue_300_main_0_0_1_beta_7, "Base color Blue shade 300", "#ff2597d0", "#ff2597d0"), new m2("$base_color_blue_400", eo1.b.base_color_blue_400_main_0_0_1_beta_7, "Base color Blue shade 400", "#ff007db8", "#ff007db8"), new m2("$base_color_blue_500", eo1.b.base_color_blue_500_main_0_0_1_beta_7, "Base color Blue shade 500", "#ff215d82", "#ff215d82"), new m2("$base_color_blue_600", eo1.b.base_color_blue_600_main_0_0_1_beta_7, "Base color Blue shade 600", "#ff0e486b", "#ff0e486b"), new m2("$base_color_blue_700", eo1.b.base_color_blue_700_main_0_0_1_beta_7, "Base color Blue shade 700", "#ff023657", "#ff023657"), new m2("$base_color_green_50", eo1.b.base_color_green_50_main_0_0_1_beta_7, "Base color Green shade 50", "#fff0f7df", "#fff0f7df"), new m2("$base_color_green_100", eo1.b.base_color_green_100_main_0_0_1_beta_7, "Base color Green shade 100", "#ffd0e2a8", "#ffd0e2a8"), new m2("$base_color_green_200", eo1.b.base_color_green_200_main_0_0_1_beta_7, "Base color Green shade 200", "#ffa8bb63", "#ffa8bb63"), new m2("$base_color_green_300", eo1.b.base_color_green_300_main_0_0_1_beta_7, "Base color Green shade 300", "#ff83a343", "#ff83a343"), new m2("$base_color_green_400", eo1.b.base_color_green_400_main_0_0_1_beta_7, "Base color Green shade 400", "#ff517d3b", "#ff517d3b"), new m2("$base_color_green_500", eo1.b.base_color_green_500_main_0_0_1_beta_7, "Base color Green shade 500", "#ff265926", "#ff265926"), new m2("$base_color_green_600", eo1.b.base_color_green_600_main_0_0_1_beta_7, "Base color Green shade 600", "#ff184a18", "#ff184a18"), new m2("$base_color_green_700", eo1.b.base_color_green_700_main_0_0_1_beta_7, "Base color Green shade 700", "#ff073807", "#ff073807"), new m2("$base_color_orange_50", eo1.b.base_color_orange_50_main_0_0_1_beta_7, "Base color Orange shade 50", "#fffff3e3", "#fffff3e3"), new m2("$base_color_orange_100", eo1.b.base_color_orange_100_main_0_0_1_beta_7, "Base color Orange shade 100", "#fffde7c9", "#fffde7c9"), new m2("$base_color_orange_200", eo1.b.base_color_orange_200_main_0_0_1_beta_7, "Base color Orange shade 200", "#fffbc55b", "#fffbc55b"), new m2("$base_color_orange_300", eo1.b.base_color_orange_300_main_0_0_1_beta_7, "Base color Orange shade 300", "#fffea239", "#fffea239"), new m2("$base_color_orange_400", eo1.b.base_color_orange_400_main_0_0_1_beta_7, "Base color Orange shade 400", "#fff06d22", "#fff06d22"), new m2("$base_color_orange_500", eo1.b.base_color_orange_500_main_0_0_1_beta_7, "Base color Orange shade 500", "#ff9b4b1c", "#ff9b4b1c"), new m2("$base_color_orange_600", eo1.b.base_color_orange_600_main_0_0_1_beta_7, "Base color Orange shade 600", "#ff854018", "#ff854018"), new m2("$base_color_orange_700", eo1.b.base_color_orange_700_main_0_0_1_beta_7, "Base color Orange shade 700", "#ff592b10", "#ff592b10"), new m2("$base_color_transparent", eo1.b.base_color_transparent_main_0_0_1_beta_7, "Base color Transparent", "#00ffffff", "#00ffffff"))), new v2(q.calico_base_color, kotlin.collections.f0.j(new m2("$base_color_pinterest", eo1.b.base_color_pinterest_calico_0_0_1_beta_7, "Base color Pinterest", "#ffe60023", "#ffe60023"), new m2("$base_color_gray_0", eo1.b.base_color_grayscale_0_calico_0_0_1_beta_7, "Base color Gray shade 0", "#ffffffff", "#ffffffff"), new m2("$base_color_gray_25", eo1.b.base_color_grayscale_25_calico_0_0_1_beta_7, "Base color Gray shade 25", "#fffbfbf9", "#fffbfbf9"), new m2("$base_color_gray_50", eo1.b.base_color_grayscale_50_calico_0_0_1_beta_7, "Base color Gray shade 50", "#fff6f6f3", "#fff6f6f3"), new m2("$base_color_gray_100", eo1.b.base_color_grayscale_100_calico_0_0_1_beta_7, "Base color Gray shade 100", "#ffe5e5e0", "#ffe5e5e0"), new m2("$base_color_gray_150", eo1.b.base_color_grayscale_150_calico_0_0_1_beta_7, "Base color Gray shade 150", "#ffc8c8c1", "#ffc8c8c1"), new m2("$base_color_gray_200", eo1.b.base_color_grayscale_200_calico_0_0_1_beta_7, "Base color Gray shade 200", "#ff91918c", "#ff91918c"), new m2("$base_color_gray_250", eo1.b.base_color_grayscale_250_calico_0_0_1_beta_7, "Base color Gray shade 250", "#ff74746c", "#ff74746c"), new m2("$base_color_gray_300", eo1.b.base_color_grayscale_300_calico_0_0_1_beta_7, "Base color Gray shade 300", "#ff62625b", "#ff62625b"), new m2("$base_color_gray_350", eo1.b.base_color_grayscale_350_calico_0_0_1_beta_7, "Base color Gray shade 350", "#ff494943", "#ff494943"), new m2("$base_color_gray_400", eo1.b.base_color_grayscale_400_calico_0_0_1_beta_7, "Base color Gray shade 400", "#ff33332e", "#ff33332e"), new m2("$base_color_gray_450", eo1.b.base_color_grayscale_450_calico_0_0_1_beta_7, "Base color Gray shade 450", "#ff242421", "#ff242421"), new m2("$base_color_gray_500", eo1.b.base_color_grayscale_500_calico_0_0_1_beta_7, "Base color Gray shade 500", "#ff000000", "#ff000000"), new m2("$base_color_red_50", eo1.b.base_color_red_50_calico_0_0_1_beta_7, "Base color Red shade 50", "#ffffebeb", "#ffffebeb"), new m2("$base_color_red_100", eo1.b.base_color_red_100_calico_0_0_1_beta_7, "Base color Red shade 100", "#ffffd7d7", "#ffffd7d7"), new m2("$base_color_red_200", eo1.b.base_color_red_200_calico_0_0_1_beta_7, "Base color Red shade 200", "#ffff8f8f", "#ffff8f8f"), new m2("$base_color_red_300", eo1.b.base_color_red_300_calico_0_0_1_beta_7, "Base color Red shade 300", "#fff84f4f", "#fff84f4f"), new m2("$base_color_red_400", eo1.b.base_color_red_400_calico_0_0_1_beta_7, "Base color Red shade 400", "#ffdd0e0e", "#ffdd0e0e"), new m2("$base_color_red_500", eo1.b.base_color_red_500_calico_0_0_1_beta_7, "Base color Red shade 500", "#ffb60c0c", "#ffb60c0c"), new m2("$base_color_red_600", eo1.b.base_color_red_600_calico_0_0_1_beta_7, "Base color Red shade 600", "#ff900909", "#ff900909"), new m2("$base_color_red_700", eo1.b.base_color_red_700_calico_0_0_1_beta_7, "Base color Red shade 700", "#ff6b0000", "#ff6b0000"), new m2("$base_color_purple_50", eo1.b.base_color_purple_50_calico_0_0_1_beta_7, "Base color Purple shade 50", "#fffdebff", "#fffdebff"), new m2("$base_color_purple_100", eo1.b.base_color_purple_100_calico_0_0_1_beta_7, "Base color Purple shade 100", "#fffbdfff", "#fffbdfff"), new m2("$base_color_purple_200", eo1.b.base_color_purple_200_calico_0_0_1_beta_7, "Base color Purple shade 200", "#ffef9ff9", "#ffef9ff9"), new m2("$base_color_purple_300", eo1.b.base_color_purple_300_calico_0_0_1_beta_7, "Base color Purple shade 300", "#ffd271df", "#ffd271df"), new m2("$base_color_purple_400", eo1.b.base_color_purple_400_calico_0_0_1_beta_7, "Base color Purple shade 400", "#ffb331c4", "#ffb331c4"), new m2("$base_color_purple_500", eo1.b.base_color_purple_500_calico_0_0_1_beta_7, "Base color Purple shade 500", "#ff91289f", "#ff91289f"), new m2("$base_color_purple_600", eo1.b.base_color_purple_600_calico_0_0_1_beta_7, "Base color Purple shade 600", "#ff7a2286", "#ff7a2286"), new m2("$base_color_purple_700", eo1.b.base_color_purple_700_calico_0_0_1_beta_7, "Base color Purple shade 700", "#ff51005c", "#ff51005c"), new m2("$base_color_blue_50", eo1.b.base_color_blue_50_calico_0_0_1_beta_7, "Base color Blue shade 50", "#ffebeeff", "#ffebeeff"), new m2("$base_color_blue_100", eo1.b.base_color_blue_100_calico_0_0_1_beta_7, "Base color Blue shade 100", "#ffdbe1ff", "#ffdbe1ff"), new m2("$base_color_blue_200", eo1.b.base_color_blue_200_calico_0_0_1_beta_7, "Base color Blue shade 200", "#ff92a4ff", "#ff92a4ff"), new m2("$base_color_blue_300", eo1.b.base_color_blue_300_calico_0_0_1_beta_7, "Base color Blue shade 300", "#ff677eee", "#ff677eee"), new m2("$base_color_blue_400", eo1.b.base_color_blue_400_calico_0_0_1_beta_7, "Base color Blue shade 400", "#ff435ee5", "#ff435ee5"), new m2("$base_color_blue_500", eo1.b.base_color_blue_500_calico_0_0_1_beta_7, "Base color Blue shade 500", "#ff2b48d4", "#ff2b48d4"), new m2("$base_color_blue_600", eo1.b.base_color_blue_600_calico_0_0_1_beta_7, "Base color Blue shade 600", "#ff273eb0", "#ff273eb0"), new m2("$base_color_blue_700", eo1.b.base_color_blue_700_calico_0_0_1_beta_7, "Base color Blue shade 700", "#ff17287d", "#ff17287d"), new m2("$base_color_green_50", eo1.b.base_color_green_50_calico_0_0_1_beta_7, "Base color Green shade 50", "#ffe3f7ec", "#ffe3f7ec"), new m2("$base_color_green_100", eo1.b.base_color_green_100_calico_0_0_1_beta_7, "Base color Green shade 100", "#ffc7f0da", "#ffc7f0da"), new m2("$base_color_green_200", eo1.b.base_color_green_200_calico_0_0_1_beta_7, "Base color Green shade 200", "#ff83ddad", "#ff83ddad"), new m2("$base_color_green_300", eo1.b.base_color_green_300_calico_0_0_1_beta_7, "Base color Green shade 300", "#ff2db46c", "#ff2db46c"), new m2("$base_color_green_400", eo1.b.base_color_green_400_calico_0_0_1_beta_7, "Base color Green shade 400", "#ff068440", "#ff068440"), new m2("$base_color_green_500", eo1.b.base_color_green_500_calico_0_0_1_beta_7, "Base color Green shade 500", "#ff097239", "#ff097239"), new m2("$base_color_green_600", eo1.b.base_color_green_600_calico_0_0_1_beta_7, "Base color Green shade 600", "#ff07552b", "#ff07552b"), new m2("$base_color_green_700", eo1.b.base_color_green_700_calico_0_0_1_beta_7, "Base color Green shade 700", "#ff103c25", "#ff103c25"), new m2("$base_color_orange_50", eo1.b.base_color_orange_50_calico_0_0_1_beta_7, "Base color Orange shade 50", "#ffffede0", "#ffffede0"), new m2("$base_color_orange_100", eo1.b.base_color_orange_100_calico_0_0_1_beta_7, "Base color Orange shade 100", "#ffffe0cc", "#ffffe0cc"), new m2("$base_color_orange_200", eo1.b.base_color_orange_200_calico_0_0_1_beta_7, "Base color Orange shade 200", "#ffffb380", "#ffffb380"), new m2("$base_color_orange_300", eo1.b.base_color_orange_300_calico_0_0_1_beta_7, "Base color Orange shade 300", "#fffe9752", "#fffe9752"), new m2("$base_color_orange_400", eo1.b.base_color_orange_400_calico_0_0_1_beta_7, "Base color Orange shade 400", "#ffdb5b06", "#ffdb5b06"), new m2("$base_color_orange_500", eo1.b.base_color_orange_500_calico_0_0_1_beta_7, "Base color Orange shade 500", "#ffb24700", "#ffb24700"), new m2("$base_color_orange_600", eo1.b.base_color_orange_600_calico_0_0_1_beta_7, "Base color Orange shade 600", "#ff943b00", "#ff943b00"), new m2("$base_color_orange_700", eo1.b.base_color_orange_700_calico_0_0_1_beta_7, "Base color Orange shade 700", "#ff5c2500", "#ff5c2500"), new m2("$base_color_transparent", eo1.b.base_color_transparent_calico_0_0_1_beta_7, "Base color Transparent", "#00ffffff", "#00ffffff")))));
    }

    public static com.pinterest.schoolTeenPrompt.g u() {
        return new com.pinterest.schoolTeenPrompt.g();
    }

    public static pw1.d u0() {
        return new pw1.d();
    }

    public static z02.a u1(c1 retrofit, String adsApiHostHostOnlyUrl, p00.b converterFactory, rz.c adapterFactory, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adsApiHostHostOnlyUrl, "adsApiHostHostOnlyUrl");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        retrofit.c(adsApiHostHostOnlyUrl);
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        retrofit.b(gsonConverterFactory);
        Object b13 = retrofit.d().b(z02.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        z02.a aVar = (z02.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static void u2(nm.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        dl2.b.I(gson);
    }

    public static p00.b u3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static z20.c u4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofit, rz.c.b(adapterFactory, null, null, false, 47));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(z20.c.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        z20.c cVar = (z20.c) b13;
        dl2.b.I(cVar);
        return cVar;
    }

    public static cp.f v() {
        return new cp.f();
    }

    public static px1.f v0() {
        return new px1.f();
    }

    public static String v1(Resources resources, String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (!ff0.j.b()) {
            String string = resources.getString(j2.api_host_placeholder_base);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return j1.U(string, new Object[]{apiHost});
        }
        String string2 = resources.getString(j2.api_latest_host_uri);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = resources.getString(j2.api_host_placeholder_base);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return j1.U(string3, new Object[]{string2});
    }

    public static uc0.q0 v2(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.q0(q.component_header_bar_title, new y(new j(q.component_header_bar_description, null), kotlin.collections.f0.j(new e0("Title, with start and end action icons.", null, null, null, null, rc0.n0.f107345w, 30), new e0("Title, with transparent background, and start and end action icons.", null, null, null, null, rc0.n0.F, 30), new e0("Title, with start action icon.", null, null, null, null, rc0.n0.G, 30), new e0("Title, with end action icon.", null, null, null, null, rc0.n0.H, 30), new e0("No title, with start and end action icons.", null, null, null, null, rc0.n0.I, 30), new e0("Title and subtitle, with start and end action icons.", null, null, null, null, rc0.n0.f107331J, 30), new e0("Title, with two start and two end action icons.", null, null, null, null, rc0.n0.K, 30), new e0("Title, with start and end text buttons.", null, null, null, null, rc0.n0.L, 30), new e0("Title, with transparent background, and start and end text buttons.", null, null, null, null, rc0.n0.M, 30), new e0("Title, with start avatar and end icon buttons.", null, null, null, null, rc0.n0.f107335m, 30), new e0("Title, with transparent background, start avatar, and end icon buttons.", null, null, null, null, rc0.n0.f107336n, 30), new e0("Title, with start and end avatars.", null, null, null, null, rc0.n0.f107337o, 30), new e0("User, with end action icon.", null, null, null, null, rc0.n0.f107338p, 30), new e0("User, with two end action icons.", null, null, null, null, rc0.n0.f107339q, 30), new e0("User, with transparent background, and two end action icons.", null, null, null, null, rc0.n0.f107340r, 30), new e0("User, with no end action.", null, null, null, null, rc0.n0.f107341s, 30), new e0("Search, with single trailing icon, and no end actions", null, null, null, null, rc0.n0.f107342t, 30), new e0("Search, with double trailing icon, and no end actions", null, null, null, null, rc0.n0.f107343u, 30), new e0("Search, with single trailing icon, and two end actions", null, null, null, null, rc0.n0.f107344v, 30), new e0("Search, with double trailing icon, and two end actions", null, null, null, null, rc0.n0.f107346x, 30), new e0("Search, with transparent background, and two end actions", null, null, null, null, rc0.n0.f107347y, 30), new e0("Scrolling Tabs", null, null, null, null, rc0.n0.f107348z, 30), new e0("Scrolling Tabs with transparent background", null, null, null, null, rc0.n0.A, 30), new e0("Scrolling Tabs, with overflow scrolling", null, null, null, null, rc0.n0.B, 30), new e0("Static Tabs", null, null, null, null, rc0.n0.C, 30), new e0("Static Tabs with transparent background", null, null, null, null, rc0.n0.D, 30), new e0("Static Tabs, with start and end icon actions", null, null, null, null, rc0.n0.E, 30))));
    }

    public static p00.b v3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static z12.f v4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        z12.f fVar = (z12.f) o.h(retrofit, aVar, z12.f.class, "create(...)");
        dl2.b.I(fVar);
        return fVar;
    }

    public static cy0.c w() {
        return new cy0.c();
    }

    public static q71.a w0() {
        return new q71.a();
    }

    public static lt.g w1(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        ko2.f fVar = ao2.v0.f20219a;
        return new lt.g(ko2.e.f80326c);
    }

    public static uc0.t0 w2(org.chromium.net.y stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.t0(new uc0.s0(oc0.p.im_gestalt, q.gestaltTitle), kotlin.collections.f0.j(new uc0.a1(oc0.p.im_feedback, q.feedbackTitle, q.feedbackDescription, uc0.v0.f121872b), new uc0.a1(oc0.p.im_component, q.componentsTitle, q.componentsDescription, uc0.u0.f121867b), new uc0.a1(oc0.p.im_token, q.tokenTitle, q.tokenDescription, x0.f121882b), new uc0.a1(oc0.p.im_iconography, q.iconographyTitle, q.iconographyDescription, uc0.w0.f121875b)));
    }

    public static p00.b w3(rz.e registry, p00.d requestBodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(requestBodyConverter, "requestBodyConverter");
        return new p00.b(registry, requestBodyConverter, null);
    }

    public static rz.e w4(k22.h userFeedDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(userFeedDeserializableAdapter, "userFeedDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(UserFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, userFeedDeserializableAdapter);
        return eVar;
    }

    public static cy0.h x() {
        return new cy0.h();
    }

    public static q71.d x0() {
        return new q71.d();
    }

    public static ps.e x1(es.a adFormats, es.h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        return new ps.e(adFormats, adsCommonDisplay);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tu1.m0 x2(tu1.j0 http3CronetEngineFactory, tu1.i0 http3CronetEngineFactoryEmbeddedUnified, tu1.h0 http2CronetEngineFactory, uu1.b requestListenerFactory, List requestInfoReceivers, tb0.h crashReporting, n1 experiments) {
        tu1.j0 http3CronetEngineFactory2 = http3CronetEngineFactory;
        Intrinsics.checkNotNullParameter(http3CronetEngineFactory, "http3CronetEngineFactory");
        Intrinsics.checkNotNullParameter(http3CronetEngineFactoryEmbeddedUnified, "http3CronetEngineFactoryEmbeddedUnified");
        Intrinsics.checkNotNullParameter(http2CronetEngineFactory, "http2CronetEngineFactory");
        Intrinsics.checkNotNullParameter(requestListenerFactory, "requestInfoListenerFactory");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        boolean l13 = experiments.l("http2");
        if (experiments.l("cronetembedded")) {
            http3CronetEngineFactory2 = http3CronetEngineFactoryEmbeddedUnified;
        }
        Intrinsics.checkNotNullParameter(http3CronetEngineFactory2, "http3CronetEngineFactory");
        Intrinsics.checkNotNullParameter(http2CronetEngineFactory, "http2CronetEngineFactory");
        Intrinsics.checkNotNullParameter(requestListenerFactory, "requestListenerFactory");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        return new tu1.m0(crashReporting, http3CronetEngineFactory2, http2CronetEngineFactory, requestListenerFactory, requestInfoReceivers, l13);
    }

    public static p00.b x3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static p00.b x4(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static dx1.f y() {
        return new dx1.f();
    }

    public static q71.g0 y0() {
        return new q71.g0();
    }

    public static l51.a y1(vr.a adsCommonAnalytics, wr.d jsonLogger, xr.a attributionReporting, es.a adFormats, nx.b0 pinAuxHelper, lh0.j experiments) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(jsonLogger, "jsonLogger");
        return new l51.a(adsCommonAnalytics, jsonLogger, attributionReporting, adFormats, pinAuxHelper, experiments);
    }

    public static uc0.c1 y2(rc0.c1 stateProvider) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new uc0.c1(q.component_icon_button_floating_title, new y(new j(q.component_icon_button_floating_subtitle, new n0(q.component_icon_button_floating_link_text, "https://gestalt.pinterest.systems/android/iconbuttonfloating")), kotlin.collections.f0.j(new e0("Default", null, null, null, null, o0.f107353k, 30), new e0("Selected", null, null, null, null, o0.f107355m, 30), new e0("Disabled", null, null, null, null, o0.f107357o, 30))));
    }

    public static p00.b y3(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static c30.a y4(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        c30.a aVar2 = (c30.a) o.h(retrofit, aVar, c30.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static dy0.o z() {
        return new dy0.o();
    }

    public static q71.v0 z0() {
        return new q71.v0();
    }

    public static c20.a z1(c1 retrofit, String adsApiHostHostOnlyUrl, p00.b converterFactory, rz.c adapterFactory, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adsApiHostHostOnlyUrl, "adsApiHostHostOnlyUrl");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        retrofit.c(adsApiHostHostOnlyUrl);
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        retrofit.b(gsonConverterFactory);
        Object b13 = retrofit.d().b(c20.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        c20.a aVar = (c20.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static e1 z2(Context context, rc0.c1 stateProvider) {
        int i13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = q.component_icon_button_title;
        j jVar = new j(q.component_icon_button_description, new n0(q.component_icon_button_link_text, "https://gestalt.pinterest.systems/android/iconbutton"));
        String f13 = kotlin.jvm.internal.k0.f80436a.b(om1.e.class).f();
        List d2 = z.d(om1.e.values());
        ArrayList arrayList = new ArrayList();
        int ceil = (int) Math.ceil(d2.size() / 2.0d);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i13 = 1;
            rc0.x0 x0Var = null;
            if (i16 >= ceil) {
                break;
            }
            int i17 = i16 * 2;
            Enum r15 = (Enum) d2.get(i17);
            Enum r14 = (Enum) CollectionsKt.U(i17 + 1, d2);
            String str = i16 == 0 ? f13 : null;
            om1.e eVar = (om1.e) r15;
            String f14 = rc0.c1.f(eVar, context);
            rc0.x0 i18 = rc0.c1.i(stateProvider, null, eVar, 13);
            String f15 = r14 != null ? rc0.c1.f((om1.e) r14, context) : null;
            if (r14 != null) {
                x0Var = rc0.c1.i(stateProvider, null, (om1.e) r14, 13);
            }
            arrayList.add(new g0(str, f14, f15, null, null, null, new p0(r15, i15), new p0(r14, i13), i18, x0Var, 56));
            i16++;
        }
        String f16 = kotlin.jvm.internal.k0.f80436a.b(om1.f.class).f();
        List d13 = z.d(om1.f.values());
        ArrayList arrayList2 = new ArrayList();
        int ceil2 = (int) Math.ceil(d13.size() / 2.0d);
        while (i15 < ceil2) {
            int i19 = i15 * 2;
            Enum r102 = (Enum) d13.get(i19);
            Enum r93 = (Enum) CollectionsKt.U(i19 + i13, d13);
            arrayList2.add(new g0(i15 == 0 ? f16 : null, r.k(r102), r93 != null ? r.k(r93) : null, null, null, null, new p0(r102, 2), new p0(r93, 3), rc0.c1.i(stateProvider, (om1.f) r102, null, 14), r93 != null ? rc0.c1.i(stateProvider, (om1.f) r93, null, 14) : null, 56));
            i15++;
            i13 = 1;
        }
        return new e1(i14, new y(jVar, CollectionsKt.m0(new tc0.f0(Integer.valueOf(q.compact_icon), Integer.valueOf(q.md_with_compact_icon), Integer.valueOf(q.sm_with_compact_icon), null, o0.f107359q, o0.f107361s, 18), CollectionsKt.m0(new tc0.f0(null, Integer.valueOf(q.md_with_default_indicator), Integer.valueOf(q.sm_with_default_indicator), null, o0.C, o0.E, 19), CollectionsKt.m0(new tc0.f0(null, Integer.valueOf(q.lg_with_default_indicator), Integer.valueOf(q.lg_with_numeric_indicator), null, o0.f107367y, o0.A, 19), CollectionsKt.m0(new tc0.f0(Integer.valueOf(q.indicator), Integer.valueOf(q.xl_with_default_indicator), Integer.valueOf(q.xl_with_numeric_indicator), null, o0.f107363u, o0.f107365w, 18), CollectionsKt.l0(arrayList2, arrayList)))))));
    }

    public static p00.b z3(rz.e adapterRegistry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(adapterRegistry, "adapterRegistry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(adapterRegistry, bodyConverter, null);
    }

    public static l82.a z4() {
        return new l82.a();
    }
}
