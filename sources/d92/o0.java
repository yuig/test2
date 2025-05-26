package d92;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final f0 f54180c;

    /* renamed from: d, reason: collision with root package name */
    public final l82.y f54181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ao2.j0 scope, Application application, m0 stateTransformer, f0 handshakeSEP, ws.q handshakeBottomSheetSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stateTransformer, "handshakeStateTransformer");
        Intrinsics.checkNotNullParameter(handshakeSEP, "handshakeSEP");
        Intrinsics.checkNotNullParameter(handshakeBottomSheetSEP, "handshakeBottomSheetSEP");
        this.f54180c = handshakeSEP;
        l82.a0 a0Var = new l82.a0(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f54181d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f54181d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f54181d.e();
    }

    public final void h() {
        l82.y.i(this.f54181d, new n0("", 0L, 0L, "", "", null, new c92.w(2), ""), false, new s12.a(this, 26), 2);
    }
}
