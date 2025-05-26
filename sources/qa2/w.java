package qa2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.fa;

/* loaded from: classes4.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103362a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Object obj, int i13) {
        super(0, obj, LegoPinGridCellImpl.class, "navigateToCloseupComprehensive", "navigateToCloseupComprehensive()Z", 0);
        this.f103362a = i13;
        if (i13 == 1) {
            super(0, obj, LegoPinGridCellImpl.class, "navigateToAdsCloseupDirectly", "navigateToAdsCloseupDirectly()Z", 0);
            return;
        }
        if (i13 == 2) {
            super(0, obj, LegoPinGridCellImpl.class, "navigateToCloseupComprehensive", "navigateToCloseupComprehensive()Z", 0);
            return;
        }
        if (i13 == 3) {
            super(0, obj, LegoPinGridCellImpl.class, "getPinImageBottomEdgeYPos", "getPinImageBottomEdgeYPos()I", 0);
        } else if (i13 != 4) {
        } else {
            super(0, obj, ua2.u.class, "show", "show()V", 0);
        }
    }

    public final Boolean h() {
        switch (this.f103362a) {
            case 0:
                return Boolean.valueOf(((LegoPinGridCellImpl) this.receiver).f2());
            case 1:
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) this.receiver;
                fa faVar = legoPinGridCellImpl.X0;
                if (faVar != null) {
                    legoPinGridCellImpl.g2(faVar.a(legoPinGridCellImpl.W2), legoPinGridCellImpl.Y(), true, legoPinGridCellImpl.C0);
                    return Boolean.FALSE;
                }
                Intrinsics.r("adEventHandlerFactory");
                throw null;
            default:
                return Boolean.valueOf(((LegoPinGridCellImpl) this.receiver).f2());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f103362a) {
            case 0:
                return h();
            case 1:
                return h();
            case 2:
                return h();
            case 3:
                ua2.k0 k0Var = ((LegoPinGridCellImpl) this.receiver).f52468u0;
                if (k0Var != null) {
                    wa2.s sVar = k0Var.f121531J;
                    return Integer.valueOf(sVar.f128840c + sVar.f128842e);
                }
                Intrinsics.r("primaryMediaPiece");
                throw null;
            default:
                ((ua2.u) this.receiver).E().m();
                return Unit.f80348a;
        }
    }
}
