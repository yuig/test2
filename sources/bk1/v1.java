package bk1;

import h32.a4;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23364i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h32.u0 f23365j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h32.i0 f23366k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(h32.i0 i0Var, h32.u0 u0Var) {
        super(1);
        this.f23366k = i0Var;
        this.f23365j = u0Var;
    }

    public final void b(h32.h0 update) {
        int i13 = this.f23364i;
        h32.i0 i0Var = this.f23366k;
        h32.u0 u0Var = this.f23365j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67042a = d4.PIN;
                update.f67045d = i0Var.f67084d;
                update.f67043b = a4.PIN_ARTICLE;
                if (u0Var == null) {
                    u0Var = i0Var.f67086f;
                }
                update.f67047f = u0Var;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (u0Var == null) {
                    u0Var = i0Var.f67086f;
                }
                update.f67047f = u0Var;
                update.f67045d = null;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23364i) {
            case 0:
                b((h32.h0) obj);
                break;
            default:
                b((h32.h0) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(h32.u0 u0Var, h32.i0 i0Var) {
        super(1);
        this.f23365j = u0Var;
        this.f23366k = i0Var;
    }
}
