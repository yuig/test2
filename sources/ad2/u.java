package ad2;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.unauth.sba.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import o82.i0;
import w41.q1;
import xs0.f0;

/* loaded from: classes4.dex */
public final class u extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f2117c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.widget.configuration.e f2118d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f2119e;

    /* renamed from: f, reason: collision with root package name */
    public final y f2120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t72.j boardSelectionDataSource, w60.d navigationSEP, com.pinterest.widget.configuration.e saveWidgetBoardSelectionSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(boardSelectionDataSource, "boardSelectionDataSource");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(saveWidgetBoardSelectionSEP, "saveWidgetBoardSelectionSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2117c = navigationSEP;
        this.f2118d = saveWidgetBoardSelectionSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(19), new q0(7), new o82.h(new androidx.appcompat.widget.q(boardSelectionDataSource, 8)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f2119e = d2;
        a0 a0Var = new a0(scope);
        f0 stateTransformer = new f0((i0) d2.f63224a, 4);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f2120f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f2120f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f2120f.e();
    }

    public final void h(int i13) {
        y.i(this.f2120f, new t(i13, kotlin.collections.q0.f80391a, new o82.j0()), false, new ha2.j(this, 29), 2);
    }
}
