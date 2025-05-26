package se1;

import android.view.View;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.a4;
import lh0.f4;
import lh0.g1;
import lh0.z3;
import nx.f0;
import re1.c0;
import t3.s1;
import uj2.q;
import vq0.h;
import wa2.i;
import yk1.m;
import yk1.v;
import z32.a0;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f112425a;

    /* renamed from: b, reason: collision with root package name */
    public final q f112426b;

    /* renamed from: c, reason: collision with root package name */
    public final ze1.c f112427c;

    /* renamed from: d, reason: collision with root package name */
    public final i f112428d;

    /* renamed from: e, reason: collision with root package name */
    public final v f112429e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f112430f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f112431g;

    /* renamed from: h, reason: collision with root package name */
    public final String f112432h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f112433i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f112434j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f112435k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f112436l;

    /* renamed from: m, reason: collision with root package name */
    public final r f112437m;

    /* renamed from: n, reason: collision with root package name */
    public final String f112438n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f112439o;

    public c(uk1.d pinalytics, q networkStateStream, ze1.c apiParams, f4 experiments, i pinFeatureConfig, v viewResources, f0 pinalyticsFactory, Function0 commerceAuxData, String str, boolean z13, boolean z14, boolean z15, a0 a0Var, r prefsManagerUser, String trafficSource) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(apiParams, "apiParams");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f112425a = pinalytics;
        this.f112426b = networkStateStream;
        this.f112427c = apiParams;
        this.f112428d = pinFeatureConfig;
        this.f112429e = viewResources;
        this.f112430f = pinalyticsFactory;
        this.f112431g = commerceAuxData;
        this.f112432h = str;
        this.f112433i = z13;
        this.f112434j = z14;
        this.f112435k = z15;
        this.f112436l = a0Var;
        this.f112437m = prefsManagerUser;
        this.f112438n = trafficSource;
        experiments.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) experiments.f83347a;
        this.f112439o = g1Var.o("hfp_android_structured_feed_container_refactor", "enabled", z3Var) || g1Var.l("hfp_android_structured_feed_container_refactor");
    }

    @Override // vq0.h
    public final m f() {
        return new c0(this.f112425a, this.f112426b, this.f112427c, this.f112428d, this.f112429e, this.f112437m, this.f112430f, this.f112431g, this.f112432h, this.f112439o, this.f112433i, this.f112434j, this.f112435k, this.f112436l, this.f112438n);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        kj kjVar = model.f42855m;
        if (kjVar != null) {
            return kjVar.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, re1.a0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [yk1.m] */
    @Override // vq0.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void c(re1.a0 view, vh model, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            ?? j13 = s1.j(view2);
            r1 = j13 instanceof c0 ? j13 : null;
        }
        if (r1 != null) {
            r1.s3(model, Integer.valueOf(i13));
        }
    }

    public /* synthetic */ c(uk1.d dVar, q qVar, ze1.c cVar, f4 f4Var, i iVar, v vVar, f0 f0Var, Function0 function0, boolean z13, boolean z14, a0 a0Var, r rVar, String str, int i13) {
        this(dVar, qVar, cVar, f4Var, iVar, vVar, f0Var, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? b.f112419j : function0, null, false, (i13 & 1024) != 0 ? false : z13, (i13 & 2048) != 0 ? false : z14, (i13 & 4096) != 0 ? null : a0Var, rVar, str);
    }
}
