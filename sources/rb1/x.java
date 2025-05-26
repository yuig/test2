package rb1;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.settings.notifications.y0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import o82.i0;
import w41.q1;
import zy.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class x extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final w60.d f107099c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f107100d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f107101e;

    /* renamed from: f, reason: collision with root package name */
    public final g01.a f107102f;

    /* renamed from: g, reason: collision with root package name */
    public final y f107103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Application application, j0 scope, w60.d screenNavigatorSEP, d0 pinalyticsSEP, b60.b activeUserManager) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f107099c = screenNavigatorSEP;
        this.f107100d = pinalyticsSEP;
        this.f107101e = activeUserManager;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new q1(6), new bt0.u(23), new o82.h(new androidx.appcompat.widget.q(this, 4)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f107102f = d2;
        a0 a0Var = new a0(scope);
        tx0.x stateTransformer = new tx0.x((i0) d2.f63224a, 5);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f107103g = a0.b(a0Var, new v(new l0(new h32.i0(d4.PARENTAL_PASSCODE, a4.PARENTAL_PASSCODE_SETTINGS, null, null, null, null), 2), new o82.j0()), new y0(this, 7), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f107103g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f107103g.e();
    }
}
