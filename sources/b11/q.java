package b11;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21075b;

    public /* synthetic */ q(PinCloseupFragment pinCloseupFragment, int i13) {
        this.f21074a = i13;
        this.f21075b = pinCloseupFragment;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f21074a;
        PinCloseupFragment this$0 = this.f21075b;
        switch (i13) {
            case 0:
                int i14 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof om1.l) {
                    this$0.P7();
                    break;
                }
                break;
            default:
                int i15 = PinCloseupFragment.f46972m3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                i01.a0 a0Var = this$0.L1;
                this$0.E8(a0Var != null ? a0Var.getRelatedPinsStartAdapterPosition() : 0, false);
                this$0.requireView().post(new n(this$0, 2));
                bs1.c.b1(this$0.f46986e3);
                this$0.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : h32.u0.SCROLL_TO_TOP_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                break;
        }
    }
}
