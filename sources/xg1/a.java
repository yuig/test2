package xg1;

import android.view.View;
import bc2.e;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fj;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.u60;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.zv0;
import dl1.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.e4;
import m60.f0;
import m60.w;
import nx.b0;
import nx.d1;
import nx.o0;
import ro1.c;
import so.c6;
import t3.s1;
import tg1.j;
import ug1.g;
import uj2.q;
import uk1.d;
import vq0.h;
import x02.x2;
import x10.b;
import yk1.m;
import yk1.n;
import z32.r2;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final d f134935a;

    /* renamed from: b, reason: collision with root package name */
    public final q f134936b;

    /* renamed from: c, reason: collision with root package name */
    public final w f134937c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f134938d;

    /* renamed from: e, reason: collision with root package name */
    public final d1 f134939e;

    /* renamed from: f, reason: collision with root package name */
    public final nu1.a f134940f;

    /* renamed from: g, reason: collision with root package name */
    public final a11.d f134941g;

    /* renamed from: h, reason: collision with root package name */
    public final b f134942h;

    /* renamed from: i, reason: collision with root package name */
    public final e f134943i;

    /* renamed from: j, reason: collision with root package name */
    public final vg1.a f134944j;

    /* renamed from: k, reason: collision with root package name */
    public final xr.a f134945k;

    /* renamed from: l, reason: collision with root package name */
    public final c f134946l;

    /* renamed from: m, reason: collision with root package name */
    public final ni1.d f134947m;

    /* renamed from: n, reason: collision with root package name */
    public final c6 f134948n;

    /* renamed from: o, reason: collision with root package name */
    public final o0 f134949o;

    /* renamed from: p, reason: collision with root package name */
    public final b0 f134950p;

    /* renamed from: q, reason: collision with root package name */
    public final ur.a f134951q;

    /* renamed from: r, reason: collision with root package name */
    public final g70.h f134952r;

    public a(d presenterPinalytics, q networkStateStream, w eventManager, x2 userRepository, d1 d1Var, nu1.a aVar, a11.d dVar, b bVar, e mp4TrackSelector, vg1.a aVar2, xr.a attributionReporting, c deepLinkAdUtil, ni1.d deepLinkHelper, c6 pinImpressionLoggerFactory, o0 pinalyticsManager, b0 pinAuxHelper, ur.a adsCoreDependencies, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(mp4TrackSelector, "mp4TrackSelector");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(deepLinkAdUtil, "deepLinkAdUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(pinImpressionLoggerFactory, "pinImpressionLoggerFactory");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f134935a = presenterPinalytics;
        this.f134936b = networkStateStream;
        this.f134937c = eventManager;
        this.f134938d = userRepository;
        this.f134939e = d1Var;
        this.f134940f = aVar;
        this.f134941g = dVar;
        this.f134942h = bVar;
        this.f134943i = mp4TrackSelector;
        this.f134944j = aVar2;
        this.f134945k = attributionReporting;
        this.f134946l = deepLinkAdUtil;
        this.f134947m = deepLinkHelper;
        this.f134948n = pinImpressionLoggerFactory;
        this.f134949o = pinalyticsManager;
        this.f134950p = pinAuxHelper;
        this.f134951q = adsCoreDependencies;
        this.f134952r = boardNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        vh dynamicStory;
        g gVar;
        ArrayList arrayList;
        String n13;
        Object obj2;
        fj h10;
        String n14;
        j view = (j) nVar;
        s model = (s) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z13 = model instanceof vh;
        f0 f0Var = vb0.j.f125466a;
        if (z13) {
            dynamicStory = (vh) model;
        } else {
            if (!(model instanceof br.d)) {
                f0Var.G("Could not parse DynamicStory to be bound with BubbleContainerViewBinder", new Object[0]);
                return;
            }
            dynamicStory = ((br.d) model).f23719q;
        }
        Unit unit = null;
        r3 = null;
        r3 = null;
        Float f13 = null;
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            m j13 = s1.j(view2);
            if (!(j13 instanceof g)) {
                j13 = null;
            }
            gVar = (g) j13;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            Intrinsics.f(dynamicStory);
            Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
            gVar.f122184q = dynamicStory;
            String uid = dynamicStory.getUid();
            if (uid == null) {
                uid = "";
            }
            gVar.f122187t = uid;
            kj kjVar = dynamicStory.f42855m;
            gVar.f122188u = kjVar != null ? kjVar.a() : null;
            gVar.f122189v = dynamicStory.q();
            gVar.f122190w = dynamicStory.f42857o;
            HashMap auxData = new HashMap();
            String uid2 = dynamicStory.getUid();
            if (uid2 != null) {
            }
            String q13 = dynamicStory.q();
            if (q13 != null) {
                auxData.put("story_type", q13);
            }
            tq0.c cVar = gVar.f122192y;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            ((HashMap) cVar.f118992e).putAll(auxData);
            gVar.F = auxData;
            if (dynamicStory.g0()) {
                List list = dynamicStory.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    s sVar = (s) obj3;
                    if (((sVar instanceof xk) && (n14 = ((xk) sVar).n()) != null && !z.j(n14)) || (sVar instanceof zv0) || (sVar instanceof f30) || (sVar instanceof v7) || (sVar instanceof u60)) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                List list2 = dynamicStory.f42865w;
                Intrinsics.checkNotNullExpressionValue(list2, "getObjects(...)");
                arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    s sVar2 = (s) obj4;
                    if (((sVar2 instanceof xk) && (n13 = ((xk) sVar2).n()) != null && !z.j(n13)) || (sVar2 instanceof zv0) || (sVar2 instanceof v7)) {
                        arrayList.add(obj4);
                    }
                }
            }
            gVar.f122185r = arrayList;
            kh khVar = dynamicStory.f42858p;
            gVar.B = ((khVar == null || (h10 = khVar.h()) == null) ? null : h10.l()) == r2.LEFT;
            Map c13 = dynamicStory.c();
            if (c13 != null && (obj2 = c13.get("aspect_ratio")) != null) {
                Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                if (d2 != null) {
                    f13 = Float.valueOf((float) d2.doubleValue());
                }
            }
            gVar.C = f13;
            gVar.q3();
            gVar.D = Integer.valueOf(i13);
            gVar.E = dynamicStory.u();
            unit = Unit.f80348a;
        }
        if (unit == null) {
            f0Var.G("Presenter bound to SpotlightCarouselImpl must be of type SpotlightCarouselPresenter", new Object[0]);
        }
    }

    @Override // vq0.h
    public final m f() {
        return new g(this.f134935a, this.f134936b, this.f134937c, this.f134938d, this.f134940f, this.f134939e, this.f134941g, this.f134942h, (e4) j82.c.f74948b.getValue(), this.f134943i, this.f134944j, this.f134945k, this.f134946l, this.f134947m, this.f134948n, this.f134949o, this.f134950p, this.f134951q, this.f134952r);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        s model = (s) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
