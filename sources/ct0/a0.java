package ct0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.k0;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import o82.i0;
import o82.i2;
import o82.s0;

/* loaded from: classes5.dex */
public final class a0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final u12.e f53129c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f53130d;

    /* renamed from: e, reason: collision with root package name */
    public final g01.a f53131e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f53132f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(u12.e interestService, Application application, j0 scope, w60.d screenNavigatorSEP, boolean z13) {
        super(scope);
        Intrinsics.checkNotNullParameter(interestService, "interestService");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        this.f53129c = interestService;
        this.f53130d = screenNavigatorSEP;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new k0(14), new bt0.u(1), new s0(new d(interestService, z13, false, 4), new m60.p(20, 12, 25)), false, null, null, null, null, null, null, 1016);
        kv0.p.b(pVar, new k0(15), new bt0.u(2), new s0(new d(interestService, false, true, 2)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f53131e = d2;
        l82.a0 a0Var = new l82.a0(scope);
        y stateTransformer = new y((i0) d2.f63224a);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f53132f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f53132f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f53132f.e();
    }

    public final void h() {
        Object obj = null;
        int i13 = 3;
        l82.y.i(this.f53132f, new z(new o82.j0(f0.j(new i2(obj, i13), new i2(obj, i13)))), false, new f1(this, 19), 2);
    }
}
