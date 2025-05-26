package se1;

import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import j1.v0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import lh0.f4;
import nx.f0;
import qa2.n;
import r82.g;
import re1.a0;
import uj2.q;
import vq0.h;
import wa2.i;
import wt1.e;
import wt1.f;
import xk2.m;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f112440a;

    /* renamed from: b, reason: collision with root package name */
    public final f4 f112441b;

    /* renamed from: c, reason: collision with root package name */
    public final n f112442c;

    /* renamed from: d, reason: collision with root package name */
    public final v f112443d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f112444e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f112445f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f112446g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f112447h;

    public d(uk1.d presenterPinalytics, q networkStateStream, f4 experiments, i pinFeatureConfig, n gridFeatureConfig, v viewResources, r prefsManagerUser, f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f112440a = presenterPinalytics;
        this.f112441b = experiments;
        this.f112442c = gridFeatureConfig;
        this.f112443d = viewResources;
        this.f112444e = pinalyticsFactory;
        this.f112445f = m.b(new v0(this, networkStateStream, pinFeatureConfig, prefsManagerUser, 15));
        this.f112446g = m.b(b.f112423n);
        this.f112447h = m.b(new ee1.d(this, 4));
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        a0 view = (a0) nVar;
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!((Boolean) this.f112447h.getValue()).booleanValue() || !(view instanceof ve1.a)) {
            ((c) this.f112445f.getValue()).c(view, model, i13);
            return;
        }
        a aVar = (a) this.f112446g.getValue();
        oe1.b b13 = oe1.c.b(model, b.f112421l, this.f112440a, this.f112444e, Integer.valueOf(i13), new ze1.c(this.f112442c.f103320a.f128792q0, 2), null);
        ve1.d dVar = new ve1.d(model, gi2.b.V(b13, model, new LinkedHashMap(), c0.d.g0(model, b13, b.f112420k)), 2);
        aVar.getClass();
        f.j(view, dVar);
    }

    @Override // vq0.h
    public final yk1.m f() {
        if (!((Boolean) this.f112447h.getValue()).booleanValue()) {
            return ((c) this.f112445f.getValue()).f();
        }
        a aVar = (a) this.f112446g.getValue();
        aVar.getClass();
        return new e(aVar);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!model.h0()) {
            kj kjVar = model.f42855m;
            if (kjVar != null) {
                return kjVar.a();
            }
            return null;
        }
        int i14 = g.content_description_slp_unified_component;
        Object[] objArr = new Object[2];
        kj kjVar2 = model.f42855m;
        objArr[0] = kjVar2 != null ? kjVar2.a() : null;
        kj kjVar3 = model.f42856n;
        objArr[1] = kjVar3 != null ? kjVar3.a() : null;
        return ((yk1.a) this.f112443d).f139224a.getString(i14, objArr);
    }
}
