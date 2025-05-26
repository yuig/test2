package com.pinterest.widget.configuration;

import a.cb;
import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.s0;
import androidx.lifecycle.z;
import ao2.j0;
import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.lz0;
import com.pinterest.api.model.mj;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.x9;
import com.pinterest.api.model.zs;
import com.pinterest.database.PinterestDatabase;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import dl1.t;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d3;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import lh0.z3;
import m60.f0;
import m60.h0;
import nx.a1;
import nx.r0;
import okhttp3.Authenticator;
import okhttp3.OkHttpClient;
import p02.v;
import p1.p1;
import pk.o1;
import pq2.c1;
import pq2.d1;
import qr1.c0;
import qr1.x;
import so.na;
import so.o9;
import so.w9;
import tu1.d0;
import tu1.g0;
import tu1.i0;
import tu1.k0;
import tu1.o0;
import tu1.p0;
import tu1.w;
import uj2.a0;
import vu1.b0;
import x02.f1;
import x02.j2;
import x02.v1;
import x02.x0;
import x02.x2;
import xu1.y;

/* loaded from: classes2.dex */
public abstract class k implements bf2.d {
    public static o0 A(dc2.e videoPlayerFactory, tb0.h crashReporting, n1 experiments) {
        Intrinsics.checkNotNullParameter(videoPlayerFactory, "videoPlayerFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        experiments.getClass();
        z3 z3Var = a4.f83297a;
        z0 z0Var = experiments.f83439a;
        g1 g1Var = (g1) z0Var;
        if (!g1Var.o("android_cronet_link_header", "enabled", z3Var) && !g1Var.l("android_cronet_link_header")) {
            return new vo1.a();
        }
        g1 g1Var2 = (g1) z0Var;
        return new qz.r(videoPlayerFactory, crashReporting, g1Var2.o("android_link_header_visual_search", "enabled", z3Var) || g1Var2.l("android_link_header_visual_search"));
    }

    public static oz.a A0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdFormatsLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a A1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryUtilitiesApp", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static w B(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new w(context);
    }

    public static oz.a B0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryExperimentsManager", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a B1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static void C() {
        Intrinsics.checkNotNullExpressionValue(lb0.f.f82707a, "getInstance(...)");
    }

    public static oz.a C0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryRepository", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a C1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r5.l("android_cronet_embedded") != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [tu1.g0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [tu1.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tu1.g0 D(tu1.l0 r2, se2.a r3, se2.a r4, lh0.n1 r5) {
        /*
            java.lang.String r0 = "http3CronetEngineProviderUnified"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "http3CronetEngineProviderUnifiedV2"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "http3CronetEngineProviderEmbedded"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "experiments"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.h()
            if (r0 == 0) goto L23
            bf2.b r3 = (bf2.b) r3
            java.lang.Object r2 = r3.get()
            tu1.g0 r2 = (tu1.g0) r2
            goto L41
        L23:
            lh0.z3 r3 = lh0.a4.f83297a
            lh0.z0 r5 = r5.f83439a
            lh0.g1 r5 = (lh0.g1) r5
            java.lang.String r0 = "enabled"
            java.lang.String r1 = "android_cronet_embedded"
            boolean r3 = r5.o(r1, r0, r3)
            if (r3 != 0) goto L39
            boolean r3 = r5.l(r1)
            if (r3 == 0) goto L41
        L39:
            bf2.b r4 = (bf2.b) r4
            java.lang.Object r2 = r4.get()
            tu1.g0 r2 = (tu1.g0) r2
        L41:
            kotlin.jvm.internal.Intrinsics.f(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.widget.configuration.k.D(tu1.l0, se2.a, se2.a, lh0.n1):tu1.g0");
    }

    public static oz.a D0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAppbadge", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a D1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static uk2.f E() {
        return cb.r("create(...)");
    }

    public static oz.a E0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPermissionsCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a E1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static g1 F(g4.b defaultPinnerExperienceOverrides, m60.e applicationInfo, lb0.g diskCache, na experimentsApiProvider, na persistedPreferences, m60.w eventManager, tb0.h crashReporting, i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(defaultPinnerExperienceOverrides, "defaultPinnerExperienceOverrides");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        Intrinsics.checkNotNullParameter(diskCache, "diskCache");
        Intrinsics.checkNotNullParameter(experimentsApiProvider, "experimentsApiProvider");
        Intrinsics.checkNotNullParameter(persistedPreferences, "persistedPreferences");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        if (me.o.f87018o == null) {
            g1 g1Var = new g1(defaultPinnerExperienceOverrides, applicationInfo, diskCache, experimentsApiProvider, eventManager, crashReporting, new bk.f(), persistedPreferences, toastUtils, new p1(toastUtils, 10));
            Intrinsics.checkNotNullParameter(g1Var, "<set-?>");
            me.o.f87018o = g1Var;
        }
        g1 g1Var2 = me.o.f87018o;
        if (g1Var2 != null) {
            return g1Var2;
        }
        Intrinsics.r("experimentsManager");
        throw null;
    }

    public static oz.a F0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a F1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static e10.j G(vy.m analyticsApi) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        return new e10.j(analyticsApi, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    public static oz.a G0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a G1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static String H(Resources resources, String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(j2.api_host_placeholder_base);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = j1.U(string, new Object[]{apiHost}) + resources.getString(j2.graphql_endpoint) + "/";
        dl2.b.I(str);
        return str;
    }

    public static oz.a H0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a H1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static k0 I(i0 cronetEngineFactory, tb0.h crashReporting, Context context, n1 experiments) {
        Intrinsics.checkNotNullParameter(cronetEngineFactory, "http3CronetEngineFactoryEmbeddedUnified");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        boolean c13 = experiments.c();
        boolean e13 = experiments.e();
        Intrinsics.checkNotNullParameter(cronetEngineFactory, "cronetEngineFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(context, "context");
        return new k0(cronetEngineFactory, crashReporting, context, e13, c13);
    }

    public static oz.a I0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a I1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static u12.e J(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        u12.e eVar = (u12.e) n60.o.h(retrofit, gsonConverterFactory, u12.e.class, "create(...)");
        dl2.b.I(eVar);
        return eVar;
    }

    public static oz.a J0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a J1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static p10.m K(gw modelHelper, p10.q userCache) {
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        p10.m mVar = new p10.m(new p10.r(userCache).f98633a);
        Intrinsics.checkNotNullExpressionValue(mVar, "buildUserLocalDataSource(...)");
        return mVar;
    }

    public static oz.a K0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryRepository", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a K1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryImages", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static t L(x02.z0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        dl2.b.I(repository);
        return repository;
    }

    public static oz.a L0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a L1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static t M(f1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        dl2.b.I(repository);
        return repository;
    }

    public static oz.a M0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a M1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static t N(v1 interestRepository) {
        Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
        dl2.b.I(interestRepository);
        return interestRepository;
    }

    public static oz.a N0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a N1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryNetworking", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static t O(x2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        dl2.b.I(repository);
        return repository;
    }

    public static oz.a O0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a O1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static cy.k P(y networkTypeMonitor, b60.b activeUserManager, tb.l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        wy0 f13 = ((b60.d) activeUserManager).f();
        String uid = f13 != null ? f13.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        return new cy.k(networkTypeMonitor, uid, telemetryPreferences);
    }

    public static oz.a P0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a P1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPermissionsCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static uu1.b Q() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new uu1.b(newSingleThreadExecutor);
    }

    public static oz.a Q0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a Q1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static y R(Context context, j0 applicationScope, z lifecycleOwner, o00.a coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        return new y(context, applicationScope, lifecycleOwner, coroutineDispatcherProvider);
    }

    public static oz.a R0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a R1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryExperiences", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static h0 S() {
        return new h0(hf0.b.q());
    }

    public static oz.a S0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a S1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeepLinkAnalyticsLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static lb0.o T() {
        lb0.o a13 = lb0.n.f82724c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "persisted(...)");
        dl2.b.I(a13);
        return a13;
    }

    public static oz.a T0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesComments", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a T1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeepLinkAnalyticsLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static dl1.z U(fl1.a policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        dl2.b.I(policy);
        return policy;
    }

    public static oz.a U0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsThirdPartyConfig", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a U1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAnalytics", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static rz.e V(sz.b enforcementJsonDeserializableAdapter, sz.b userJsonDeserializableAdapter, sz.b statementOfReasonsJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(enforcementJsonDeserializableAdapter, "enforcementJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(userJsonDeserializableAdapter, "userJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(statementOfReasonsJsonDeserializableAdapter, "statementOfReasonsJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(mj.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, enforcementJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(p02.b.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, enforcementJsonDeserializableAdapter);
        TypeToken typeToken3 = new TypeToken(wy0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, userJsonDeserializableAdapter);
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(wy0.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, userJsonDeserializableAdapter);
        TypeToken typeToken4 = new TypeToken(v.class);
        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
        eVar.a(typeToken4, statementOfReasonsJsonDeserializableAdapter);
        return eVar;
    }

    public static oz.a V0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryNetworking", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a V1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryIdentityCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static p00.b W(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        return new p00.b(registry, bodyConverter, null);
    }

    public static oz.a W0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryNetworking", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a W1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryRepository", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static z X() {
        ho2.c cVar = zc0.a.f141581a;
        s0 s0Var = s0.f18675i;
        dl2.b.I(s0Var);
        return s0Var;
    }

    public static oz.a X0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryNetworking", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a X1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesFrameworkUi", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static gl1.c Y() {
        a0 a0Var = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(a0Var, "io(...)");
        return new gl1.c(a0Var, 6);
    }

    public static oz.a Y0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDesign", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a Y1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAnalytics", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static List Z(tu1.y cronetNetworkLogger, n1 experiments) {
        List b13;
        Intrinsics.checkNotNullParameter(cronetNetworkLogger, "cronetNetworkLogger");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (cronetNetworkLogger.f119472a.f53387d.w()) {
            b13 = kotlin.collections.f0.j(new p0(cronetNetworkLogger), new ly1.e());
        } else {
            experiments.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) experiments.f83439a;
            b13 = (g1Var.o("android_disable_pwt_network_listener", "enabled", z3Var) || g1Var.l("android_disable_pwt_network_listener")) ? q0.f80391a : e0.b(new ly1.e());
        }
        dl2.b.I(b13);
        return b13;
    }

    public static oz.a Z0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a Z1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static xd0.f a(PinterestDatabase pinterestDatabase) {
        Intrinsics.checkNotNullParameter(pinterestDatabase, "pinterestDatabase");
        xd0.f u13 = pinterestDatabase.u();
        dl2.b.I(u13);
        return u13;
    }

    public static d1 a0(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        retrofit.a(adapterFactory);
        retrofit.b(converterFactory);
        retrofit.b(gsonConverterFactory);
        d1 d2 = retrofit.d();
        Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
        return d2;
    }

    public static oz.a a1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a a2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryUtilitiesDevice", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static rz.e b(dr1.b authenticationResultDeserializer, dr1.l trackingSettingsResponseAdapter, dr1.e multiFactorDataResponseJsonDeserializableAdapter, dr1.f multiFactorEligibilityDataResponseJsonDeserializableAdapter, dr1.d connectedDevicesDataResponseJsonDeserializableAdapter, dr1.a accessTokenDataResponseJsonDeserializableAdapter, dr1.o userSigninInfoDeserializer, dr1.n userSearchResultDeserializer, dr1.g passwordResetUserStatusDeserializer, dr1.i qrCodeVerificationResponseJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(authenticationResultDeserializer, "authenticationResultDeserializer");
        Intrinsics.checkNotNullParameter(trackingSettingsResponseAdapter, "trackingSettingsResponseAdapter");
        Intrinsics.checkNotNullParameter(multiFactorDataResponseJsonDeserializableAdapter, "multiFactorDataResponseJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(multiFactorEligibilityDataResponseJsonDeserializableAdapter, "multiFactorEligibilityDataResponseJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(connectedDevicesDataResponseJsonDeserializableAdapter, "connectedDevicesDataResponseJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(accessTokenDataResponseJsonDeserializableAdapter, "accessTokenDataResponseJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(userSigninInfoDeserializer, "userSigninInfoDeserializer");
        Intrinsics.checkNotNullParameter(userSearchResultDeserializer, "userSearchResultDeserializer");
        Intrinsics.checkNotNullParameter(passwordResetUserStatusDeserializer, "passwordResetUserStatusDeserializer");
        Intrinsics.checkNotNullParameter(qrCodeVerificationResponseJsonDeserializableAdapter, "qrCodeVerificationResponseJsonDeserializableAdapter");
        rz.e eVar = new rz.e();
        TypeToken typeToken = new TypeToken(qr1.d.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        eVar.a(typeToken, authenticationResultDeserializer);
        TypeToken typeToken2 = new TypeToken(qr1.w.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        eVar.a(typeToken2, multiFactorEligibilityDataResponseJsonDeserializableAdapter);
        TypeToken typeToken3 = new TypeToken(y02.a.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        eVar.a(typeToken3, trackingSettingsResponseAdapter);
        TypeToken typeToken4 = new TypeToken(qr1.v.class);
        Intrinsics.checkNotNullExpressionValue(typeToken4, "get(...)");
        eVar.a(typeToken4, multiFactorDataResponseJsonDeserializableAdapter);
        TypeToken typeToken5 = new TypeToken(String.class);
        Intrinsics.checkNotNullExpressionValue(typeToken5, "get(...)");
        eVar.a(typeToken5, accessTokenDataResponseJsonDeserializableAdapter);
        TypeToken typeToken6 = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken6, "get(...)");
        eVar.a(typeToken6, rz.f.f110230a);
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(qr1.a0.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        eVar.a(a13, dr1.h.f56214a);
        TypeToken a14 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(qr1.o.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a14, "getParameterized(...)");
        eVar.a(a14, connectedDevicesDataResponseJsonDeserializableAdapter);
        TypeToken typeToken7 = new TypeToken(qr1.h0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken7, "get(...)");
        eVar.a(typeToken7, userSigninInfoDeserializer);
        TypeToken a15 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(wy0.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a15, "getParameterized(...)");
        eVar.a(a15, userSearchResultDeserializer);
        TypeToken typeToken8 = new TypeToken(x.class);
        Intrinsics.checkNotNullExpressionValue(typeToken8, "get(...)");
        eVar.a(typeToken8, passwordResetUserStatusDeserializer);
        TypeToken typeToken9 = new TypeToken(c0.class);
        Intrinsics.checkNotNullExpressionValue(typeToken9, "get(...)");
        eVar.a(typeToken9, qrCodeVerificationResponseJsonDeserializableAdapter);
        return eVar;
    }

    public static gl1.c b0() {
        return new gl1.c(null, 7);
    }

    public static oz.a b1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a b2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static cr1.a c(rz.c adapterFactory, p00.b converterFactory, c1 retrofitBuilder, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofitBuilder, rz.c.b(adapterFactory, null, new AtomicBoolean(false), false, 39));
        j13.a(adapterFactory);
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(cr1.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        cr1.a aVar = (cr1.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static w20.a c0(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        n60.o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        w20.a aVar2 = (w20.a) n60.o.h(retrofit, aVar, w20.a.class, "create(...)");
        dl2.b.I(aVar2);
        return aVar2;
    }

    public static oz.a c1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a c2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static b60.d d(lb0.o userPreferencesProvider, tb0.h crashReporting, nm.o gson) {
        Intrinsics.checkNotNullParameter(userPreferencesProvider, "userPreferencesProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(gson, "gson");
        b60.d dVar = new b60.d(userPreferencesProvider, crashReporting);
        vd0.c.f125622b = gson;
        return dVar;
    }

    public static nx.j0 d0(nx.f0 pinalyticsFactory, a1 topContextProvider) {
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(topContextProvider, "topContextProvider");
        return ((nx.m) pinalyticsFactory).a(topContextProvider);
    }

    public static oz.a d1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a d2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static qs.a e(ur.a adsCoreDependencies) {
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        return new qs.a(adsCoreDependencies);
    }

    public static nx.d1 e0(nx.o0 pinalyticsManager) {
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        return new nx.d1(pinalyticsManager);
    }

    public static oz.a e1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a e2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static vy.m f(vy.o authAnalyticsLoggingService, vy.o unauthAnalyticsLoggingService, vy.p authContextLoggingService, vy.p unauthContextLoggingService, f0 authTokenProvider, m60.e applicationInfoProvider, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(authAnalyticsLoggingService, "authAnalyticsLoggingService");
        Intrinsics.checkNotNullParameter(unauthAnalyticsLoggingService, "unauthAnalyticsLoggingService");
        Intrinsics.checkNotNullParameter(authContextLoggingService, "authContextLoggingService");
        Intrinsics.checkNotNullParameter(unauthContextLoggingService, "unauthContextLoggingService");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        return new vy.m(authAnalyticsLoggingService, unauthAnalyticsLoggingService, authContextLoggingService, unauthContextLoggingService, authTokenProvider, applicationInfoProvider, crashReporting);
    }

    public static oh0.h f0(rz.c adapterFactory, p00.b converterFactory, c1 retrofitBuilder, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        n60.o.u(aVar, "gsonConverterFactory", retrofitBuilder, adapterFactory, converterFactory);
        oh0.h hVar = (oh0.h) n60.o.h(retrofitBuilder, aVar, oh0.h.class, "create(...)");
        dl2.b.I(hVar);
        return hVar;
    }

    public static oz.a f1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a f2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryEncryption", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static yk1.a g(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return new yk1.a(activity.getResources(), activity.getTheme());
    }

    public static cr1.a g0(rz.c adapterFactory, p00.b converterFactory, c1 retrofitBuilder, rq2.a gsonConverterFactory) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        c1 j13 = j1.j(retrofitBuilder, rz.c.b(adapterFactory, null, new AtomicBoolean(false), false, 39));
        j13.a(adapterFactory);
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(cr1.a.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        cr1.a aVar = (cr1.a) b13;
        dl2.b.I(aVar);
        return aVar;
    }

    public static oz.a g1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a g2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPushNotificationLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static Application h(h6.q qVar) {
        Application C = com.bumptech.glide.c.C(qVar.f67746a);
        dl2.b.I(C);
        return C;
    }

    public static oc.c h0(u00.a apolloClientFactory) {
        Intrinsics.checkNotNullParameter(apolloClientFactory, "apolloClientFactory");
        return apolloClientFactory.a(apolloClientFactory.f119805b);
    }

    public static oz.a h1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryRepository", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a h2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAuthentication", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static j0 i() {
        ho2.c cVar = zc0.a.f141581a;
        dl2.b.I(cVar);
        return cVar;
    }

    public static lb0.o i0() {
        lb0.o a13 = lb0.n.f82725d.a();
        Intrinsics.checkNotNullExpressionValue(a13, "user(...)");
        dl2.b.I(a13);
        return a13;
    }

    public static oz.a i1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a i2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAuthentication", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oc.c j(u00.a apolloClientFactory) {
        Intrinsics.checkNotNullParameter(apolloClientFactory, "apolloClientFactory");
        return apolloClientFactory.a(apolloClientFactory.f119804a);
    }

    public static k22.m j0(d1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object b13 = retrofit.b(k22.m.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        k22.m mVar = (k22.m) b13;
        dl2.b.I(mVar);
        return mVar;
    }

    public static oz.a j1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryRepository", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a j2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAuthentication", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static vu1.a0 k(vu1.a0 cronetClient, OkHttpClient authenticatedOkHttpClient) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(authenticatedOkHttpClient, "authenticatedOkHttpClient");
        return cronetClient.a(authenticatedOkHttpClient, null);
    }

    public static yk1.v k0(yk1.a androidResources) {
        Intrinsics.checkNotNullParameter(androidResources, "androidResources");
        dl2.b.I(androidResources);
        return androidResources;
    }

    public static oz.a k1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeveloperHelper", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a k2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static OkHttpClient l(OkHttpClient baseClient, Authenticator authenticator, z10.b authenticatedHeaderInterceptor) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        Intrinsics.checkNotNullParameter(authenticator, "accessTokenAuthenticator");
        Intrinsics.checkNotNullParameter(authenticatedHeaderInterceptor, "authenticatedHeaderInterceptor");
        OkHttpClient.Builder newBuilder = baseClient.newBuilder();
        newBuilder.getClass();
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        newBuilder.f95680g = authenticator;
        newBuilder.a(authenticatedHeaderInterceptor);
        return new OkHttpClient(newBuilder);
    }

    public static rz.c l0(m60.w eventManager, t00.n onFailureRouterFactory, d3 experiments) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(onFailureRouterFactory, "onFailureRouterFactory");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return new rz.c(null, onFailureRouterFactory, eventManager, new AtomicBoolean(true), true, experiments, 65);
    }

    public static oz.a l1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a l2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static d1 m(d3 experiments, vu1.a0 cronetClient, String url, OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        experiments.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) experiments.f83331a;
        if (g1Var.o("android_network_client_async_init", "enabled", z3Var) || g1Var.l("android_network_client_async_init")) {
            c1 c1Var = new c1();
            c1Var.c(url);
            Objects.requireNonNull(cronetClient, "factory == null");
            c1Var.f101001a = cronetClient;
            return c1Var.d();
        }
        if (cronetClient.b()) {
            c1 c1Var2 = new c1();
            c1Var2.c(url);
            c1Var2.f101001a = cronetClient;
            return c1Var2.d();
        }
        c1 c1Var3 = new c1();
        c1Var3.c(url);
        Objects.requireNonNull(client, "client == null");
        c1Var3.f101001a = client;
        return c1Var3.d();
    }

    public static oz.a m0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsOpenMeasurement", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a m1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCrashReportingCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static dl1.z m2(fl1.a always) {
        Intrinsics.checkNotNullParameter(always, "always");
        dl2.b.I(always);
        return always;
    }

    public static c1 n(d1 retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        retrofit.getClass();
        c1 c1Var = new c1(retrofit);
        Intrinsics.checkNotNullExpressionValue(c1Var, "newBuilder(...)");
        return c1Var;
    }

    public static oz.a n0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPreferences", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a n1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAnalytics", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static nx.o0 n2(lh0.m experiments) {
        Intrinsics.checkNotNullParameter(experiments, "analyticsExperiments");
        nx.o0 o0Var = nx.o0.f92437i;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        o0Var.f92445h = experiments;
        return o0Var;
    }

    public static cr1.b o(c1 retrofitBuilder, p00.b converterFactory, rz.c adapterFactory, rq2.a gsonConverterFactory, er1.b authenticationFailureRouterFactory) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(authenticationFailureRouterFactory, "authenticationFailureRouterFactory");
        c1 j13 = j1.j(retrofitBuilder, rz.c.b(adapterFactory, authenticationFailureRouterFactory, new AtomicBoolean(false), false, 37));
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(cr1.b.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        cr1.b bVar = (cr1.b) b13;
        dl2.b.I(bVar);
        return bVar;
    }

    public static vb0.c o0() {
        vb0.c cVar = vb0.b.f125448a;
        Intrinsics.checkNotNullExpressionValue(cVar, "getInstance(...)");
        dl2.b.I(cVar);
        return cVar;
    }

    public static oz.a o1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("Hairball", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static void o2(rz.e registry, u12.b interestJsonDeserializableAdapter, u12.f interestsFeedPinterestJsonDeserializableAdapter, u12.c interestListJsonDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(interestJsonDeserializableAdapter, "interestJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(interestsFeedPinterestJsonDeserializableAdapter, "interestsFeedPinterestJsonDeserializableAdapter");
        Intrinsics.checkNotNullParameter(interestListJsonDeserializableAdapter, "interestListJsonDeserializableAdapter");
        TypeToken typeToken = new TypeToken(zs.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        registry.a(typeToken, interestJsonDeserializableAdapter);
        TypeToken typeToken2 = new TypeToken(InterestsFeed.class);
        Intrinsics.checkNotNullExpressionValue(typeToken2, "get(...)");
        registry.a(typeToken2, interestsFeedPinterestJsonDeserializableAdapter);
        TypeToken typeToken3 = new TypeToken(vd0.c.class);
        Intrinsics.checkNotNullExpressionValue(typeToken3, "get(...)");
        registry.a(typeToken3, rz.f.f110230a);
        TypeToken a13 = TypeToken.a(new TypeToken(List.class).f33846a, new TypeToken(zs.class).f33847b);
        Intrinsics.checkNotNullExpressionValue(a13, "getParameterized(...)");
        registry.a(a13, interestListJsonDeserializableAdapter);
    }

    public static vu1.a0 p(OkHttpClient baseOkHttpClient, g0 engineProviderUnified, d0 cronetServiceClient, tb0.h crashReporting, xk2.k cronetExceptionMapper, su1.i networkInspectorSource, List requestInfoReceivers, n1 experiments) {
        Intrinsics.checkNotNullParameter(baseOkHttpClient, "baseOkHttpClient");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        Intrinsics.checkNotNullParameter(cronetServiceClient, "cronetServiceClient");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(cronetExceptionMapper, "cronetExceptionMapper");
        Intrinsics.checkNotNullParameter(networkInspectorSource, "networkInspectorSource");
        Intrinsics.checkNotNullParameter(requestInfoReceivers, "requestInfoReceivers");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        experiments.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) experiments.f83439a;
        boolean z13 = g1Var.o("android_cronet_no_ui_blocking_calls", "enabled", z3Var) || g1Var.l("android_cronet_no_ui_blocking_calls");
        if (!experiments.h()) {
            return engineProviderUnified.c() ? new vu1.v(baseOkHttpClient, cronetServiceClient, crashReporting, engineProviderUnified, cronetExceptionMapper, networkInspectorSource, requestInfoReceivers, true, z13) : new vu1.c0(baseOkHttpClient);
        }
        b0 b0Var = new b0(new vu1.v(baseOkHttpClient, cronetServiceClient, crashReporting, engineProviderUnified, cronetExceptionMapper, networkInspectorSource, requestInfoReceivers, true, z13), crashReporting);
        if (!experiments.l("asyncclientinit")) {
            return b0Var;
        }
        qz.q.e(b0Var);
        return b0Var;
    }

    public static ac2.q p0(Context context, lb0.q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        return new ac2.q(context, prefsManagerPersisted);
    }

    public static oz.a p1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryVideo", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static p00.b p2(rz.e registry, p00.d bodyConverter) {
        Intrinsics.checkNotNullParameter(bodyConverter, "bodyConverter");
        Intrinsics.checkNotNullParameter(registry, "registry");
        return new p00.b(registry, bodyConverter, null);
    }

    public static x2 q(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy, o9 retrofitRemoteDataSourceFactory, fl1.e modelMerger, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        lz0 lz0Var = new lz0();
        dl1.r rVar = new dl1.r();
        uk2.f r13 = cb.r("create(...)");
        uk2.f r14 = cb.r("create(...)");
        uk2.f r15 = cb.r("create(...)");
        uk2.f r16 = cb.r("create(...)");
        AtomicInteger atomicInteger = new AtomicInteger();
        uk2.l R = uk2.l.R();
        Intrinsics.checkNotNullExpressionValue(R, "createWithSize(...)");
        return new x2(localDataSource, remoteDataSource, persistencePolicy, lz0Var, modelMerger, repositorySchedulerPolicy, retrofitRemoteDataSourceFactory, rVar, r13, r14, r15, r16, atomicInteger, R, new HashMap(), activeUserManager);
    }

    public static OkHttpClient q0(Context context, lb0.q prefsManagerPersisted, g0 engineProviderUnified, n1 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (experiments.h()) {
            qz.q.a(engineProviderUnified);
            return qz.q.b(context, prefsManagerPersisted, true);
        }
        if (engineProviderUnified.c()) {
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) experiments.f83439a;
            if (g1Var.o("android_early_video_warmup", "enabled", z3Var) || g1Var.l("android_early_video_warmup")) {
                qz.q.d(context, engineProviderUnified, true);
            } else {
                qz.q.d(context, engineProviderUnified, false);
            }
        }
        return qz.q.b(context, prefsManagerPersisted, engineProviderUnified.c());
    }

    public static oz.a q1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryExperimentsManager", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static dl1.a0 q2(se2.a retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object obj = ((bf2.b) retrofit).get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        dl1.a0 a0Var = (dl1.a0) obj;
        dl2.b.I(a0Var);
        return a0Var;
    }

    public static x0 r(p10.m boardLocalDataSource, w9 retrofitFactory, fl1.a persistencePolicy, gl1.c repositorySchedulerPolicy, x9 modelValidator, fl1.e modelMerger, x2 userRepository, se2.a lazyBoardFeedRepository, b60.b activeUserManager, d3 repositoryExperiments) {
        Intrinsics.checkNotNullParameter(boardLocalDataSource, "boardLocalDataSource");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(modelValidator, "modelValidator");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(lazyBoardFeedRepository, "lazyBoardFeedRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(repositoryExperiments, "repositoryExperiments");
        x02.d0 a13 = retrofitFactory.a(x02.b0.ORGANIC);
        dl1.r rVar = new dl1.r();
        uk2.f r13 = cb.r("create(...)");
        uk2.f r14 = cb.r("create(...)");
        uk2.f r15 = cb.r("create(...)");
        uk2.f r16 = cb.r("create(...)");
        AtomicInteger atomicInteger = new AtomicInteger();
        uk2.l R = uk2.l.R();
        Intrinsics.checkNotNullExpressionValue(R, "createWithSize(...)");
        return new x0(boardLocalDataSource, a13, persistencePolicy, repositorySchedulerPolicy, modelValidator, modelMerger, rVar, r13, r14, r15, r16, atomicInteger, R, new HashMap(), userRepository, lazyBoardFeedRepository, retrofitFactory, activeUserManager, repositoryExperiments);
    }

    public static p00.b r0(rz.e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        return new p00.b(registry, null, null);
    }

    public static oz.a r1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsThirdPartyConfig", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static k22.l r2(o9 retrofitRemoteDataSourceFactory) {
        Intrinsics.checkNotNullParameter(retrofitRemoteDataSourceFactory, "retrofitRemoteDataSourceFactory");
        return retrofitRemoteDataSourceFactory.a(k22.j.NORMAL);
    }

    public static gs1.d s(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        gs1.d dVar = new gs1.d();
        try {
            dVar.f66080a = (ClipboardManager) context.getApplicationContext().getSystemService("clipboard");
        } catch (Exception unused) {
            dVar.f66080a = null;
        }
        return dVar;
    }

    public static nm.o s0(nm.p builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        nm.o a13 = builder.a();
        vd0.c.f125622b = a13;
        Intrinsics.checkNotNullExpressionValue(a13, "also(...)");
        return a13;
    }

    public static oz.a s1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryEncryption", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static dl1.a0 s2(u12.d retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        dl2.b.I(retrofit);
        return retrofit;
    }

    public static m60.b0 t() {
        int i13 = at1.d.f20439o;
        m60.b0 b0Var = (m60.b0) nl.b.e().f20449n.getValue();
        dl2.b.I(b0Var);
        return b0Var;
    }

    public static nm.p t0(jb0.b exclusionStrategy, Pair dateTypeAdapter, Pair stringTypeAdapter, o1 typeAdapterFactories) {
        Intrinsics.checkNotNullParameter(exclusionStrategy, "exclusionStrategy");
        Intrinsics.checkNotNullParameter(dateTypeAdapter, "dateTypeAdapter");
        Intrinsics.checkNotNullParameter(stringTypeAdapter, "stringTypeAdapter");
        Intrinsics.checkNotNullParameter(typeAdapterFactories, "typeAdapterFactories");
        nm.p pVar = new nm.p();
        pm.h i13 = pVar.f91344a.i(exclusionStrategy, false, true);
        pVar.f91344a = i13;
        pVar.f91344a = i13.i(exclusionStrategy, true, false);
        pVar.b(dateTypeAdapter.f80347b, (Type) dateTypeAdapter.f80346a);
        pVar.b(stringTypeAdapter.f80347b, (Type) stringTypeAdapter.f80346a);
        Iterator<E> it = typeAdapterFactories.iterator();
        while (it.hasNext()) {
            nm.j0 j0Var = (nm.j0) it.next();
            Objects.requireNonNull(j0Var);
            pVar.f91348e.add(j0Var);
        }
        Intrinsics.checkNotNullExpressionValue(pVar, "let(...)");
        return pVar;
    }

    public static oz.a t1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryDeepLinkAnalyticsLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a t2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPreferences", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static void u(rz.e registry, dr1.c complianceRequirementsDeserializableAdapter) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(complianceRequirementsDeserializableAdapter, "complianceRequirementsDeserializableAdapter");
        TypeToken typeToken = new TypeToken(qr1.n.class);
        Intrinsics.checkNotNullExpressionValue(typeToken, "get(...)");
        registry.a(typeToken, complianceRequirementsDeserializableAdapter);
    }

    public static de0.d u0(nx.d0 pinalytics, tb0.h crashReporting, xd0.f ideaPinDraftsDao) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(ideaPinDraftsDao, "ideaPinDraftsDao");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        return new de0.d(pinalytics, crashReporting, ideaPinDraftsDao);
    }

    public static oz.a u1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryCommon", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a u2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsGmaLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static cr1.f v(c1 retrofitBuilder, p00.b converterFactory, rz.c adapterFactory, rq2.a gsonConverterFactory, er1.b authenticationFailureRouterFactory) {
        Intrinsics.checkNotNullParameter(retrofitBuilder, "retrofitBuilder");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        Intrinsics.checkNotNullParameter(gsonConverterFactory, "gsonConverterFactory");
        Intrinsics.checkNotNullParameter(authenticationFailureRouterFactory, "authenticationFailureRouterFactory");
        c1 j13 = j1.j(retrofitBuilder, rz.c.b(adapterFactory, authenticationFailureRouterFactory, new AtomicBoolean(false), false, 37));
        j13.a(adapterFactory);
        j13.b(converterFactory);
        j13.b(gsonConverterFactory);
        Object b13 = j13.d().b(cr1.f.class);
        Intrinsics.checkNotNullExpressionValue(b13, "create(...)");
        cr1.f fVar = (cr1.f) b13;
        dl2.b.I(fVar);
        return fVar;
    }

    public static p10.m v0(gw modelHelper) {
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        new p10.f();
        p10.m mVar = new p10.m(p10.e.f98626a);
        Intrinsics.checkNotNullExpressionValue(mVar, "buildConversationLocalDataSource(...)");
        return mVar;
    }

    public static oz.a v1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPushNotificationLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a v2(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsGmaLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static f1 w(dl1.p localDataSource, dl1.a0 remoteDataSource, dl1.z persistencePolicy, gl1.d repositorySchedulerPolicy) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(persistencePolicy, "persistencePolicy");
        Intrinsics.checkNotNullParameter(repositorySchedulerPolicy, "repositorySchedulerPolicy");
        return new f1(localDataSource, remoteDataSource, persistencePolicy, repositorySchedulerPolicy, null, null, null, null, null, null, null, null, null, null, 32752);
    }

    public static p10.m w0(gw modelHelper) {
        Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
        new p10.l();
        p10.m mVar = new p10.m(p10.k.f98629a);
        Intrinsics.checkNotNullExpressionValue(mVar, "buildInterestLocalDataSource(...)");
        return mVar;
    }

    public static oz.a w1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryIdentityCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static gl1.c w2() {
        return new gl1.c(null, 7);
    }

    public static q12.b x(rz.c adapterFactory, p00.b converterFactory, c1 retrofit, rq2.a aVar) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        n60.o.u(aVar, "gsonConverterFactory", retrofit, adapterFactory, converterFactory);
        q12.b bVar = (q12.b) n60.o.h(retrofit, aVar, q12.b.class, "create(...)");
        dl2.b.I(bVar);
        return bVar;
    }

    public static oz.a x0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdsGmaLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a x1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryIdentityCore", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static void x2(ps0.m mVar) {
        mVar.getClass();
        ac2.f fVar = ac2.f.f1945a;
    }

    public static xk2.v y(tu1.n cronetExceptionMapper) {
        Intrinsics.checkNotNullParameter(cronetExceptionMapper, "cronetExceptionMapper");
        return xk2.m.b(new r0(cronetExceptionMapper, 20));
    }

    public static oz.a y0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryPreferences", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a y1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("Hairball", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static qc2.d y2(ps0.m mVar) {
        mVar.getClass();
        return new qc2.d();
    }

    public static void z(tu1.v cronetLibraryInstallerUnified) {
        Intrinsics.checkNotNullParameter(cronetLibraryInstallerUnified, "cronetLibraryInstallerUnified");
        dl2.b.I(cronetLibraryInstallerUnified);
    }

    public static oz.a z0(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibraryAdFormatsLibrary", oz.b.Essential, "PRIVLEG-29674", false);
    }

    public static oz.a z1(f0 f0Var) {
        f0Var.getClass();
        return new oz.a("LibrarySharedPreferencesIdeaPins", oz.b.Essential, "PRIVLEG-29674", false);
    }
}
