package ab2;

import com.google.firebase.messaging.a0;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import lh0.z3;
import ni1.d0;
import so.ba;

/* loaded from: classes2.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1750i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinVideoGridCell f1751j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PinVideoGridCell pinVideoGridCell, int i13) {
        super(0);
        this.f1750i = i13;
        this.f1751j = pinVideoGridCell;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d0 d0Var;
        wa2.m mVar;
        int i13 = this.f1750i;
        PinVideoGridCell pinVideoGridCell = this.f1751j;
        switch (i13) {
            case 0:
                return Integer.valueOf(pinVideoGridCell.getBaseExperimentsHelper().i("android_video_grid_cell_delay_end_frame", 0, z3.ACTIVATE_EXPERIMENT));
            default:
                d0Var = pinVideoGridCell.pinModelToVMStateConverterFactoryForTesting;
                if (d0Var == null) {
                    d0Var = pinVideoGridCell.getPinModelToVMStateConverterFactory();
                }
                mVar = pinVideoGridCell.pinFeatureConfig;
                return ((ba) d0Var).a(mVar, new com.pinterest.feature.pincarouselads.view.o(pinVideoGridCell, 2), new a0(pinVideoGridCell, 27));
        }
    }
}
