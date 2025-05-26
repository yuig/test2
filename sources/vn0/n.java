package vn0;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.i0;
import java.util.List;
import kl0.t;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import ns.k0;
import u50.r;
import zy.l0;

/* loaded from: classes5.dex */
public final class n extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final sk0.j f126267c;

    /* renamed from: d, reason: collision with root package name */
    public final i60.a f126268d;

    /* renamed from: e, reason: collision with root package name */
    public final p70.e f126269e;

    /* renamed from: f, reason: collision with root package name */
    public final i60.a f126270f;

    /* renamed from: g, reason: collision with root package name */
    public final k92.l f126271g;

    /* renamed from: h, reason: collision with root package name */
    public final y f126272h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j0 scope, Application application, sk0.j floatingToolbarNavigationSEP, i60.a loggingSEP, p70.e organizeFloatingToolbarActionSEP, i60.a organizeFloatingToolbarLoggingSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(floatingToolbarNavigationSEP, "floatingToolbarNavigationSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarActionSEP, "organizeFloatingToolbarActionSEP");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarLoggingSEP, "organizeFloatingToolbarLoggingSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f126267c = floatingToolbarNavigationSEP;
        this.f126268d = loggingSEP;
        this.f126269e = organizeFloatingToolbarActionSEP;
        this.f126270f = organizeFloatingToolbarLoggingSEP;
        this.f126271g = toastSEP;
        a0 a0Var = new a0(scope);
        k0 stateTransformer = new k0(new lt.j(8), new lt.j(9), 2);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f126272h = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f126272h.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f126272h.e();
    }

    public final void h(i0 pinalyticsContext, String boardId, String sectionId, List organizeToolList) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(organizeToolList, "organizeToolList");
        l0 l0Var = new l0(pinalyticsContext, sectionId);
        y.i(this.f126272h, new m(new sk0.y(boardId, null, sectionId, l0Var, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN), new tk0.i0(organizeToolList, boardId, sectionId, false, l0Var, 504)), false, new t(this, 21), 2);
    }
}
