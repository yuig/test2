package r71;

import android.view.View;
import b11.g;
import com.pinterest.api.model.lx0;
import com.pinterest.api.model.vh;
import java.util.ArrayList;
import java.util.List;
import k71.e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import o71.l0;
import o71.o;
import o71.s;
import r41.k;
import rq.j4;
import so.a6;
import t3.s1;
import uj2.q;
import uk1.d;
import vq0.h;
import w01.m0;
import w01.n0;
import x02.i2;
import yk1.j;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106399a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f106400b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f106401c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f106402d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f106403e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f106404f;

    /* renamed from: g, reason: collision with root package name */
    public String f106405g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f106406h;

    public a(d presenterPinalytics, q networkStateStream, l0 typeaheadLogging, w eventManager, int i13) {
        k profileNavigator = k.f106176a;
        this.f106399a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
            Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
            Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
            Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            this.f106400b = presenterPinalytics;
            this.f106401c = networkStateStream;
            this.f106402d = typeaheadLogging;
            this.f106403e = profileNavigator;
            this.f106404f = eventManager;
            this.f106405g = "";
            return;
        }
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f106400b = presenterPinalytics;
        this.f106401c = networkStateStream;
        this.f106402d = typeaheadLogging;
        this.f106403e = profileNavigator;
        this.f106404f = eventManager;
        this.f106405g = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k71.e] */
    /* JADX WARN: Type inference failed for: r6v12, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r6v16, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r6v5, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, k71.h] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        o oVar = null;
        m0 m0Var = null;
        s sVar = null;
        switch (this.f106399a) {
            case 0:
                ?? view = (e) nVar;
                br.d model = (br.d) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                View view2 = view instanceof View ? (View) view : null;
                if (view2 != null) {
                    ?? j13 = s1.j(view2);
                    oVar = j13 instanceof o ? j13 : null;
                }
                if (oVar != null) {
                    oVar.f93359d = model;
                    oVar.q3();
                    String str = this.f106405g;
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    oVar.f93361f = str;
                    oVar.f93360e = i13;
                    break;
                }
                break;
            case 1:
                ?? view3 = (k71.h) nVar;
                br.d model2 = (br.d) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                View view4 = view3 instanceof View ? (View) view3 : null;
                if (view4 != null) {
                    ?? j14 = s1.j(view4);
                    sVar = j14 instanceof s ? j14 : null;
                }
                if (sVar != null) {
                    sVar.f93370d = model2;
                    sVar.q3();
                    String str2 = this.f106405g;
                    Intrinsics.checkNotNullParameter(str2, "<set-?>");
                    sVar.f93373g = str2;
                    sVar.f93372f = i13;
                    sVar.f93374h = this.f106406h;
                    break;
                }
                break;
            default:
                j4 view5 = (j4) nVar;
                vh model3 = (vh) obj;
                Intrinsics.checkNotNullParameter(view5, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                List list = model3.f42865w;
                Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof lx0) {
                        arrayList.add(obj2);
                    }
                }
                lx0 lx0Var = (lx0) CollectionsKt.firstOrNull(arrayList);
                if (lx0Var != null) {
                    if (!(view5 instanceof View)) {
                        view5 = null;
                    }
                    if (view5 != null) {
                        j.a().getClass();
                        ?? b13 = j.b(view5);
                        m0Var = b13 instanceof m0 ? b13 : null;
                    }
                    if (m0Var != null) {
                        m0Var.z3(lx0Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        int i13 = this.f106399a;
        Object obj = this.f106403e;
        Object obj2 = this.f106402d;
        Object obj3 = this.f106401c;
        Object obj4 = this.f106400b;
        Object obj5 = this.f106404f;
        switch (i13) {
            case 0:
                return new o((d) obj4, (q) obj3, (l0) obj2, (k) obj, (w) obj5);
            case 1:
                return new s((d) obj4, (q) obj3, (l0) obj2, (k) obj, (w) obj5);
            default:
                return ((a6) ((n0) obj5)).a(this.f106405g, null, (i2) obj4, (g) obj3, (d0) obj2, (uk1.e) obj, this.f106406h);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f106399a;
        switch (i14) {
            case 0:
                br.d model = (br.d) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model, "model");
                        break;
                }
            case 1:
                br.d model2 = (br.d) obj;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(model2, "model");
                        break;
                }
            default:
                Intrinsics.checkNotNullParameter((vh) obj, "model");
                break;
        }
        return null;
    }

    public a(String pinUid, i2 pinRepository, g monolithHeaderConfig, d0 pinalytics, uk1.e presenterPinalyticsFactory, n0 presenterFactory) {
        this.f106399a = 2;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        this.f106405g = pinUid;
        this.f106400b = pinRepository;
        this.f106401c = monolithHeaderConfig;
        this.f106402d = pinalytics;
        this.f106403e = presenterPinalyticsFactory;
        this.f106404f = presenterFactory;
        this.f106406h = true;
    }
}
