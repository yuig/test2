package qp1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o1;
import lh0.z0;
import lh0.z3;

/* loaded from: classes5.dex */
public final class t0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final l0 f104841c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f104842d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f104843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ao2.j0 scope, Application application, mu.w stateTransformer, l0 handshakeSEP, o1 experiments) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(stateTransformer, "handshakeStateTransformer");
        Intrinsics.checkNotNullParameter(handshakeSEP, "handshakeSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f104841c = handshakeSEP;
        this.f104842d = experiments;
        l82.a0 a0Var = new l82.a0(scope);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f104843e = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f104843e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f104843e.e();
    }

    public final void h() {
        pp1.v vVar = new pp1.v(2);
        o1 o1Var = this.f104842d;
        o1Var.getClass();
        z3 z3Var = a4.f83297a;
        z0 z0Var = o1Var.f83447a;
        g1 g1Var = (g1) z0Var;
        boolean z13 = g1Var.o("android_handshake_show_badge", "enabled", z3Var) || g1Var.l("android_handshake_show_badge");
        g1 g1Var2 = (g1) z0Var;
        boolean z14 = g1Var2.o("android_handshake_show_price", "enabled", z3Var) || g1Var2.l("android_handshake_show_price");
        g1 g1Var3 = (g1) z0Var;
        g1 g1Var4 = (g1) z0Var;
        l82.y.i(this.f104843e, new s0("", 0L, 0L, "", "", null, vVar, "", null, z13, z14, g1Var3.o("android_handshake_show_rating", "enabled", z3Var) || g1Var3.l("android_handshake_show_rating"), g1Var4.o("android_handshake_show_shipping", "enabled", z3Var) || g1Var4.l("android_handshake_show_shipping")), false, new an1.i(this, 25), 2);
    }
}
