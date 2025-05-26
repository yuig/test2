package b11;

import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21083i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21084j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(PinCloseupFragment pinCloseupFragment, int i13) {
        super(1);
        this.f21083i = i13;
        this.f21084j = pinCloseupFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f21083i;
        PinCloseupFragment pinCloseupFragment = this.f21084j;
        switch (i13) {
            case 0:
                int b13 = (int) r70.b.f106349i.k0().b();
                int i14 = PinCloseupFragment.f46972m3;
                pinCloseupFragment.b9(b13);
                break;
            default:
                i01.l lVar = pinCloseupFragment.U1;
                if (lVar != null) {
                    lVar.onReadyForExperiences();
                }
                break;
        }
        return Unit.f80348a;
    }
}
