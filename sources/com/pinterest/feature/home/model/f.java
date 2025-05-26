package com.pinterest.feature.home.model;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.h0;
import x02.s1;

/* loaded from: classes.dex */
public final class f extends s1 {

    /* renamed from: r, reason: collision with root package name */
    public final h0 f45786r;

    /* renamed from: s, reason: collision with root package name */
    public final tb0.h f45787s;

    /* renamed from: t, reason: collision with root package name */
    public final n1 f45788t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45789u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f45790v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f45791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j homeFeedRemoteDataSource, a homeFeedLocalDataSource, c homeFeedPersistencePolicy, h0 pageSizeProvider, tb0.h crashReporting, n1 experiments) {
        super(homeFeedLocalDataSource, homeFeedRemoteDataSource, homeFeedPersistencePolicy, gl1.f.f65748a);
        Intrinsics.checkNotNullParameter(homeFeedRemoteDataSource, "homeFeedRemoteDataSource");
        Intrinsics.checkNotNullParameter(homeFeedLocalDataSource, "homeFeedLocalDataSource");
        Intrinsics.checkNotNullParameter(homeFeedPersistencePolicy, "homeFeedPersistencePolicy");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f45786r = pageSizeProvider;
        this.f45787s = crashReporting;
        this.f45788t = experiments;
        this.f45791w = new AtomicBoolean(false);
        this.f45789u = false;
        this.f45790v = true;
    }

    public static boolean K(String str, Map map) {
        return Intrinsics.d((Boolean) map.get(str), Boolean.TRUE);
    }

    public static String M(String str) {
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str2 = (String) obj;
            if (!Intrinsics.d(str2, "nux_signals_map") && !Intrinsics.d(str2, "link_header")) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            List<String> queryParameters = parse.getQueryParameters(str3);
            Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
            Iterator<T> it2 = queryParameters.iterator();
            while (it2.hasNext()) {
                buildUpon.appendQueryParameter(str3, (String) it2.next());
            }
        }
        buildUpon.build();
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        return builder;
    }

    public static yk2.g N(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        yk2.g builder = new yk2.g();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            List list = value instanceof List ? (List) value : null;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() != list.size()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            String str = key instanceof String ? (String) key : null;
            if (str == null) {
                return null;
            }
            builder.put(str, arrayList);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.c();
    }

    public final boolean J() {
        n1 n1Var = this.f45788t;
        n1Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) n1Var.f83439a;
        if (!g1Var.o("ap_android_nux_revamp_additional_use_cases", "enabled", z3Var) && !g1Var.l("ap_android_nux_revamp_additional_use_cases")) {
            n1Var.getClass();
            g1 g1Var2 = (g1) n1Var.f83439a;
            if (!g1Var2.o("ap_android_nux_hf_use_case_request", "enabled", z3Var) && !g1Var2.l("ap_android_nux_hf_use_case_request")) {
                return false;
            }
        }
        return true;
    }

    public final void L(String str, String str2, g gVar) {
        Thread currentThread = Thread.currentThread();
        StringBuilder w13 = a.a.w("HomeFeedRepository::prefetchHomeFeed(): ", str, " Observable subscription: ", str2, " invoked with request params:\n");
        w13.append(gVar);
        w13.append("\non thread: ");
        w13.append(currentThread);
        this.f45787s.h(w13.toString());
    }
}
