package jc0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f75445b;

    public /* synthetic */ w(ViewGroup viewGroup, int i13) {
        this.f75444a = i13;
        this.f75445b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        GestaltText gestaltText;
        int i13 = this.f75444a;
        ViewGroup viewGroup = this.f75445b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                z zVar = ((ModalContainer) viewGroup).f44761f;
                if (zVar == null || (gestaltText = ((BaseModalViewWrapper) zVar).f44750b) == null) {
                    return;
                }
                gestaltText.requestFocus();
                gestaltText.sendAccessibilityEvent(8);
                return;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                GestaltSpinner gestaltSpinner = (GestaltSpinner) viewGroup;
                ps0.y yVar = GestaltSpinner.B;
                gestaltSpinner.f49598s.setVisibility(8);
                gestaltSpinner.setScaleX(1.0f);
                gestaltSpinner.setScaleY(1.0f);
                gestaltSpinner.f49602w = false;
                Drawable drawable = gestaltSpinner.f49601v;
                if (drawable == null) {
                    Intrinsics.r("spinnerDrawable");
                    throw null;
                }
                com.airbnb.lottie.v vVar = drawable instanceof com.airbnb.lottie.v ? (com.airbnb.lottie.v) drawable : null;
                if (vVar != null) {
                    vVar.d();
                }
                Drawable drawable2 = gestaltSpinner.f49601v;
                if (drawable2 == null) {
                    Intrinsics.r("spinnerDrawable");
                    throw null;
                }
                ln1.k kVar = drawable2 instanceof ln1.k ? (ln1.k) drawable2 : null;
                if (kVar != null) {
                    kVar.stop();
                    return;
                }
                return;
        }
    }
}
