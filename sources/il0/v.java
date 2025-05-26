package il0;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.i0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final sk0.j f72547c;

    /* renamed from: d, reason: collision with root package name */
    public final i60.a f72548d;

    /* renamed from: e, reason: collision with root package name */
    public final p70.e f72549e;

    /* renamed from: f, reason: collision with root package name */
    public final i60.a f72550f;

    /* renamed from: g, reason: collision with root package name */
    public final u f72551g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f72552h;

    /* renamed from: i, reason: collision with root package name */
    public final k92.l f72553i;

    /* renamed from: j, reason: collision with root package name */
    public final y f72554j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j0 scope, Application application, sk0.j floatingToolbarNavigationSEP, i60.a loggingSEP, p70.e organizeFloatingToolbarActionSEP, i60.a organizeFloatingToolbarLoggingSEP, u presenterSEP, d0 pinalyticsSEP, k92.l toastSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(floatingToolbarNavigationSEP, "floatingToolbarNavigationSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarActionSEP, "organizeFloatingToolbarActionSEP");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarLoggingSEP, "organizeFloatingToolbarLoggingSEP");
        Intrinsics.checkNotNullParameter(presenterSEP, "presenterSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f72547c = floatingToolbarNavigationSEP;
        this.f72548d = loggingSEP;
        this.f72549e = organizeFloatingToolbarActionSEP;
        this.f72550f = organizeFloatingToolbarLoggingSEP;
        this.f72551g = presenterSEP;
        this.f72552h = pinalyticsSEP;
        this.f72553i = toastSEP;
        a0 a0Var = new a0(scope);
        s stateTransformer = new s(new lt.j(8), new lt.j(9));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f72554j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f72554j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f72554j.e();
    }

    public final void h(i0 pinalyticsContext, String boardId, String str, boolean z13, List organizeToolList) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(organizeToolList, "organizeToolList");
        l0 l0Var = new l0(pinalyticsContext, boardId);
        y.i(this.f72554j, new t(new sk0.y(boardId, str, null, l0Var, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL), new tk0.i0(organizeToolList, boardId, null, z13, l0Var, 492)), false, new hh0.a(this, 29), 2);
    }
}
