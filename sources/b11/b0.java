package b11;

import android.view.ViewGroup;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b0 extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Object obj, int i13) {
        super(0, obj, PinCloseupFragment.class, "hasUserFullyScrolledIntoRelatedPins", "hasUserFullyScrolledIntoRelatedPins()Z", 0);
        this.f20974a = i13;
        if (i13 != 1) {
        } else {
            super(0, obj, PinCloseupFragment.class, "adjustBackToTopButtonMarginsIfNeeded", "adjustBackToTopButtonMarginsIfNeeded()V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20974a) {
            case 0:
                return Boolean.valueOf(((PinCloseupFragment) this.receiver).x9());
            default:
                PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this.receiver;
                GestaltButton gestaltButton = pinCloseupFragment.f46986e3;
                if (gestaltButton != null) {
                    ViewGroup.LayoutParams layoutParams = gestaltButton.getLayoutParams();
                    androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
                    Integer valueOf = cVar != null ? Integer.valueOf(((ViewGroup.MarginLayoutParams) cVar).bottomMargin) : null;
                    if (pinCloseupFragment.c7().b() > 0.0f && Intrinsics.d(pinCloseupFragment.f46989f3, valueOf) && valueOf != null) {
                        cVar.setMargins(((ViewGroup.MarginLayoutParams) cVar).leftMargin, ((ViewGroup.MarginLayoutParams) cVar).topMargin, ((ViewGroup.MarginLayoutParams) cVar).rightMargin, ((int) pinCloseupFragment.c7().b()) + pinCloseupFragment.getResources().getDimensionPixelSize(eo1.c.space_200));
                    }
                }
                return Unit.f80348a;
        }
    }
}
