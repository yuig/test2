package sb1;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.settings.notifications.y0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import nt.w0;
import zy.d0;

/* loaded from: classes5.dex */
public final class t extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final mb0.a f112269c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f112270d;

    /* renamed from: e, reason: collision with root package name */
    public final k92.l f112271e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f112272f;

    /* renamed from: g, reason: collision with root package name */
    public final y f112273g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mb0.a sourceSEP, w60.d navigationSEP, k92.l toastSEP, d0 pinalyticsSEP, w0 stateTransformer, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(sourceSEP, "sourceSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f112269c = sourceSEP;
        this.f112270d = navigationSEP;
        this.f112271e = toastSEP;
        this.f112272f = pinalyticsSEP;
        a0 a0Var = new a0(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f112273g = a0.b(a0Var, new s(), new y0(this, 9), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f112273g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f112273g.e();
    }
}
