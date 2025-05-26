package qa2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103374i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103375j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(LegoPinGridCellImpl legoPinGridCellImpl, int i13) {
        super(1);
        this.f103374i = i13;
        this.f103375j = legoPinGridCellImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f103374i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103375j;
        switch (i13) {
            case 0:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                int i14 = LegoPinGridCellImpl.Z2;
                update.f67045d = legoPinGridCellImpl.Y();
                break;
            default:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                legoPinGridCellImpl.setContentDescription(it);
                Function1 function1 = legoPinGridCellImpl.f52464t0;
                if (function1 != null) {
                    function1.invoke(it);
                }
                break;
        }
        return Unit.f80348a;
    }
}
