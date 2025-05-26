package qa2;

import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Object obj, int i13) {
        super(1, obj, LegoPinGridCellImpl.class, "setCollectionPosition", "setCollectionPosition(Ljava/lang/Integer;)V", 0);
        this.f103355a = i13;
        if (i13 == 1) {
            super(1, obj, LegoPinGridCellImpl.class, "navigateToCloseupDirectly", "navigateToCloseupDirectly(Lcom/pinterest/api/model/Pin;)Z", 0);
        } else if (i13 != 2) {
        } else {
            super(1, obj, a1.class, "playAnimation", "playAnimation(Lcom/pinterest/ui/util/UiUpdate$PinOverlayUpdate;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103355a) {
            case 0:
                ((LegoPinGridCellImpl) this.receiver).Q1 = (Integer) obj;
                return Unit.f80348a;
            case 1:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "p0");
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.receiver;
                legoPinGridCellImpl.getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                return Boolean.valueOf(legoPinGridCellImpl.i2(pin, false));
            default:
                gb2.k p03 = (gb2.k) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                a1 a1Var = (a1) this.receiver;
                int i13 = a1.F;
                a1Var.m(p03);
                return Unit.f80348a;
        }
    }
}
