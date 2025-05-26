package nx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92401i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h32.g0 f92402j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h32.u0 f92403k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(h32.g0 g0Var, h32.u0 u0Var, int i13) {
        super(1);
        this.f92401i = i13;
        this.f92402j = g0Var;
        this.f92403k = u0Var;
    }

    public final void b(h32.h0 update) {
        int i13 = this.f92401i;
        h32.g0 g0Var = this.f92402j;
        h32.u0 u0Var = this.f92403k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (g0Var != null) {
                    update.f67045d = g0Var;
                }
                if (u0Var != null) {
                    update.f67047f = u0Var;
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0Var;
                update.f67047f = u0Var;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67045d = g0Var;
                update.f67047f = u0Var;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                update.f67045d = g0Var;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = u0Var;
                update.f67045d = g0Var;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f92401i) {
            case 0:
                b((h32.h0) obj);
                break;
            case 1:
                b((h32.h0) obj);
                break;
            case 2:
                b((h32.h0) obj);
                break;
            case 3:
                b((h32.h0) obj);
                break;
            default:
                b((h32.h0) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(h32.u0 u0Var, h32.g0 g0Var, int i13) {
        super(1);
        this.f92401i = i13;
        this.f92403k = u0Var;
        this.f92402j = g0Var;
    }
}
