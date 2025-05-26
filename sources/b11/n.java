package b11;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import i32.y0;
import kotlin.jvm.internal.Intrinsics;
import oq.x0;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21068b;

    public /* synthetic */ n(PinCloseupFragment pinCloseupFragment, int i13) {
        this.f21067a = i13;
        this.f21068b = pinCloseupFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f21067a;
        int i14 = 1;
        PinCloseupFragment this$0 = this.f21068b;
        switch (i13) {
            case 0:
                int i15 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.requireActivity().getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                this$0.S1.postDelayed(new n(this$0, i14), 900000L);
                return;
            case 1:
                int i16 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.requireActivity().getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                return;
            case 2:
                int i17 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.E8(0, true);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                rg0.s sVar = this$0.J1;
                if (sVar == null) {
                    Intrinsics.r("experiences");
                    throw null;
                }
                y0 y0Var = y0.ANDROID_QUICKSAVE;
                rg0.n c13 = ((dh0.d) sVar).c(y0Var);
                if (c13 != null && c13.f108060b == y0Var.getValue()) {
                    c13.g();
                }
                PinCloseupFragment.k9(this$0);
                PinCloseupFragment.l9(this$0);
                PinCloseupFragment.j9(this$0);
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                x0 x0Var = this$0.f46997i2;
                this$0.f47023t2 = x0Var != null ? x0Var.w1() : false;
                rg0.s sVar2 = this$0.J1;
                if (sVar2 == null) {
                    Intrinsics.r("experiences");
                    throw null;
                }
                y0 y0Var2 = y0.ANDROID_QUICKSAVE;
                rg0.n c14 = ((dh0.d) sVar2).c(y0Var2);
                if (c14 != null && c14.f108060b == y0Var2.getValue()) {
                    c14.g();
                }
                PinCloseupFragment.k9(this$0);
                PinCloseupFragment.l9(this$0);
                PinCloseupFragment.j9(this$0);
                return;
        }
    }
}
