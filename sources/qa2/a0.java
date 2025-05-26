package qa2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import h32.a4;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103207j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h32.i0 f103208k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(LegoPinGridCellImpl legoPinGridCellImpl, h32.i0 i0Var, int i13) {
        super(1);
        this.f103206i = i13;
        this.f103207j = legoPinGridCellImpl;
        this.f103208k = i0Var;
    }

    public final void b(h32.h0 update) {
        int i13 = this.f103206i;
        h32.i0 i0Var = this.f103208k;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103207j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67042a = d4.PIN;
                update.f67043b = a4.PIN_ARTICLE;
                int i14 = LegoPinGridCellImpl.Z2;
                update.f67045d = legoPinGridCellImpl.Y();
                h32.u0 T = legoPinGridCellImpl.T();
                if (T == null) {
                    T = i0Var.f67086f;
                }
                update.f67047f = T;
                break;
            default:
                Intrinsics.checkNotNullParameter(update, "$this$update");
                int i15 = LegoPinGridCellImpl.Z2;
                h32.u0 T2 = legoPinGridCellImpl.T();
                if (T2 == null) {
                    T2 = i0Var.f67086f;
                }
                update.f67047f = T2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103206i) {
            case 0:
                b((h32.h0) obj);
                break;
            default:
                b((h32.h0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
