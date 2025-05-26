package bt0;

import android.app.Application;
import ao2.j0;
import com.pinterest.boardAutoCollages.i0;
import com.pinterest.boardAutoCollages.k0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import lq0.f1;
import o82.s0;

/* loaded from: classes5.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f23892c;

    /* renamed from: d, reason: collision with root package name */
    public final g01.a f23893d;

    /* renamed from: e, reason: collision with root package name */
    public final y f23894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Application application, j0 scope, k22.m userService, String userId) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f23892c = userService;
        kv0.p pVar = new kv0.p(4);
        kv0.p.b(pVar, new k0(13), new u(0), new s0(new n(userService, userId)), false, null, null, null, null, null, null, 1016);
        g01.a d2 = pVar.d();
        this.f23893d = d2;
        a0 a0Var = new a0(scope);
        i0 stateTransformer = new i0((o82.i0) d2.f63224a, 1);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f23894e = a0.b(a0Var, new t(userId, new o82.j0()), new f1(this, 17), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f23894e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f23894e.e();
    }
}
