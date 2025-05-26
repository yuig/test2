package u52;

import android.app.Application;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f120719c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f120720d;

    /* renamed from: e, reason: collision with root package name */
    public final v52.d f120721e;

    /* renamed from: f, reason: collision with root package name */
    public final z01.e f120722f;

    /* renamed from: g, reason: collision with root package name */
    public final i60.a f120723g;

    /* renamed from: h, reason: collision with root package name */
    public final l82.y f120724h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Application application, ao2.j0 scope, b60.b activeUserManager, w60.d navigationSEP, v52.d boardPreviewLoadSEP, z01.e getPinsByIdsSEP, i60.a loggingSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(boardPreviewLoadSEP, "boardPreviewLoadSEP");
        Intrinsics.checkNotNullParameter(getPinsByIdsSEP, "getPinsByIdsSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        this.f120719c = activeUserManager;
        this.f120720d = navigationSEP;
        this.f120721e = boardPreviewLoadSEP;
        this.f120722f = getPinsByIdsSEP;
        this.f120723g = loggingSEP;
        l82.a0 a0Var = new l82.a0(scope);
        o stateTransformer = new o();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f120724h = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f120724h.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f120724h.e();
    }

    public final void h(String boardId, String boardName, int i13, h32.i0 pinalyticsContext, i91.b boardPreviewState) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        wy0 f13 = ((b60.d) this.f120719c).f();
        String z43 = f13 != null ? f13.z4() : null;
        if (z43 == null) {
            z43 = "";
        }
        zy.l0 l0Var = new zy.l0(pinalyticsContext, 2);
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = boardPreviewState.f71800c;
        String str = boardPreviewState.f71799b;
        l82.y.i(this.f120724h, new b1(boardId, boardName, i13, z43, q0Var, str, str, list, q0Var, l0Var), false, new s12.a(this, 11), 2);
    }
}
