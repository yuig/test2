package c11;

import android.view.View;
import com.pinterest.api.model.vh;
import h32.a4;
import h32.d4;
import h32.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import rq.e3;
import so.g6;
import u01.p;
import uj2.q;
import vq0.h;
import w01.g0;
import x02.i2;
import xo0.o;
import yk1.j;
import yk1.m;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24499a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24500b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f24501c;

    /* renamed from: d, reason: collision with root package name */
    public final uk1.e f24502d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f24503e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f24504f;

    /* renamed from: g, reason: collision with root package name */
    public final ze1.c f24505g;

    /* renamed from: h, reason: collision with root package name */
    public final q f24506h;

    /* renamed from: i, reason: collision with root package name */
    public final v f24507i;

    /* renamed from: j, reason: collision with root package name */
    public final o f24508j;

    /* renamed from: k, reason: collision with root package name */
    public final Function0 f24509k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f24510l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24511m;

    public d(String pinUid, d0 pinalytics, uk1.e presenterPinalyticsFactory, g0 presenterFactory, f0 pinalyticsFactory, ze1.c shoppingNavParams, q networkStateStream, v viewResources, o bubbleImpressionLogger, Function0 commerceAuxData, i2 pinRepository, boolean z13, int i13) {
        this.f24499a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
            Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
            Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
            Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
            Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
            Intrinsics.checkNotNullParameter(viewResources, "viewResources");
            Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
            Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            this.f24500b = pinUid;
            this.f24501c = pinalytics;
            this.f24502d = presenterPinalyticsFactory;
            this.f24503e = presenterFactory;
            this.f24504f = pinalyticsFactory;
            this.f24505g = shoppingNavParams;
            this.f24506h = networkStateStream;
            this.f24507i = viewResources;
            this.f24508j = bubbleImpressionLogger;
            this.f24509k = commerceAuxData;
            this.f24510l = pinRepository;
            this.f24511m = z13;
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(presenterFactory, "presenterFactory");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(shoppingNavParams, "shoppingNavParams");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(bubbleImpressionLogger, "bubbleImpressionLogger");
        Intrinsics.checkNotNullParameter(commerceAuxData, "commerceAuxData");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f24500b = pinUid;
        this.f24501c = pinalytics;
        this.f24502d = presenterPinalyticsFactory;
        this.f24503e = presenterFactory;
        this.f24504f = pinalyticsFactory;
        this.f24505g = shoppingNavParams;
        this.f24506h = networkStateStream;
        this.f24507i = viewResources;
        this.f24508j = bubbleImpressionLogger;
        this.f24509k = commerceAuxData;
        this.f24510l = pinRepository;
        this.f24511m = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [yk1.m] */
    /* JADX WARN: Type inference failed for: r6v7, types: [yk1.m] */
    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        switch (this.f24499a) {
            case 0:
                e3 view = (e3) nVar;
                p model = (p) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                e3 e3Var = view instanceof View ? view : null;
                if (e3Var != null) {
                    j.a().getClass();
                    ?? b13 = j.b(e3Var);
                    r0 = b13 instanceof w01.f0 ? b13 : null;
                }
                if (r0 != null) {
                    r0.r3(model.f119926b, model.f119928d);
                }
                view.bindData(model.f119928d, model.f119926b, model.f119927c, this.f24501c);
                break;
            default:
                e3 view2 = (e3) nVar;
                vh dynamicStory = (vh) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(dynamicStory, "model");
                if (!(view2 instanceof View)) {
                    view2 = null;
                }
                if (view2 != null) {
                    j.a().getClass();
                    ?? b14 = j.b(view2);
                    r0 = b14 instanceof w01.f0 ? b14 : null;
                }
                if (r0 != null) {
                    Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
                    r0.A = dynamicStory;
                    break;
                }
                break;
        }
    }

    @Override // vq0.h
    public final m f() {
        d4 d4Var;
        d4 d4Var2;
        int i13 = this.f24499a;
        g0 g0Var = this.f24503e;
        uk1.e eVar = this.f24502d;
        d0 d0Var = this.f24501c;
        switch (i13) {
            case 0:
                i0 p13 = d0Var.p();
                uk1.d g13 = ((uk1.a) eVar).g();
                if (p13 != null && (d4Var = p13.f67081a) != null) {
                    g13.c(a4.PIN_OTHER, d4Var, null);
                }
                return ((g6) g0Var).a(this.f24500b, this.f24510l, g13, this.f24504f, this.f24505g, this.f24506h, this.f24507i, this.f24508j, this.f24509k, this.f24511m);
            default:
                i0 p14 = d0Var.p();
                uk1.d g14 = ((uk1.a) eVar).g();
                if (p14 != null && (d4Var2 = p14.f67081a) != null) {
                    g14.c(a4.PIN_OTHER, d4Var2, null);
                }
                return ((g6) g0Var).a(this.f24500b, this.f24510l, g14, this.f24504f, this.f24505g, this.f24506h, this.f24507i, this.f24508j, this.f24509k, this.f24511m);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f24499a) {
            case 0:
                p model = (p) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                vh model2 = (vh) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
