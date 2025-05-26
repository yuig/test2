package w21;

import i2.v3;
import j1.b2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3 f127780j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f127781k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v3 f127782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v3 f127783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v3 f127784n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(b2 b2Var, b2 b2Var2, b2 b2Var3, b2 b2Var4, b2 b2Var5, int i13) {
        super(1);
        this.f127779i = i13;
        this.f127780j = b2Var;
        this.f127781k = b2Var2;
        this.f127782l = b2Var3;
        this.f127783m = b2Var4;
        this.f127784n = b2Var5;
    }

    public final void b(b3.d0 graphicsLayer) {
        int i13 = this.f127779i;
        v3 v3Var = this.f127784n;
        v3 v3Var2 = this.f127783m;
        v3 v3Var3 = this.f127782l;
        v3 v3Var4 = this.f127781k;
        v3 v3Var5 = this.f127780j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var = (b3.u0) graphicsLayer;
                u0Var.l(((Number) v3Var5.getValue()).floatValue());
                u0Var.n(((Number) v3Var5.getValue()).floatValue());
                u0Var.j(((Number) v3Var4.getValue()).floatValue());
                u0Var.E(u0Var.f21372s.b() * ((n4.e) v3Var3.getValue()).f89175a);
                u0Var.F(u0Var.f21372s.b() * ((n4.e) v3Var2.getValue()).f89175a);
                u0Var.f(((Number) v3Var.getValue()).floatValue());
                break;
            default:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var2 = (b3.u0) graphicsLayer;
                u0Var2.l(((Number) v3Var5.getValue()).floatValue());
                u0Var2.n(((Number) v3Var5.getValue()).floatValue());
                u0Var2.j(((Number) v3Var4.getValue()).floatValue());
                u0Var2.E(u0Var2.f21372s.b() * ((n4.e) v3Var3.getValue()).f89175a);
                u0Var2.F(u0Var2.f21372s.b() * ((n4.e) v3Var2.getValue()).f89175a);
                u0Var2.f(((Number) v3Var.getValue()).floatValue());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f127779i) {
            case 0:
                b((b3.d0) obj);
                break;
            default:
                b((b3.d0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
