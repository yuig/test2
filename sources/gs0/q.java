package gs0;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.sr;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes5.dex */
public final class q extends ModalViewWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f66077k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, sr srVar, f0 f0Var) {
        super(context, true);
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        WebImageView webImageView = (WebImageView) findViewById(ga2.d.modal_header_pin_image);
        GestaltText gestaltText = (GestaltText) findViewById(ga2.d.modal_header_image_less_title);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(ga2.d.modal_header);
        setClipChildren(false);
        if (srVar == null) {
            if (constraintLayout != null && (layoutParams = constraintLayout.getLayoutParams()) != null) {
                layoutParams.height = -2;
            }
            if (f0Var == null || gestaltText == null) {
                return;
            }
            gestaltText.i(new fx.e(4, f0Var));
            return;
        }
        int W = bs1.c.W(this, kw0.a.overflow_pin_image_width);
        int W2 = bs1.c.W(this, kw0.a.overflow_pin_image_height);
        Double k13 = srVar.k();
        Double h10 = srVar.h();
        String j13 = srVar.j();
        double doubleValue = h10.doubleValue() / k13.doubleValue();
        if (webImageView != null) {
            webImageView.getLayoutParams().width = W;
            webImageView.getLayoutParams().height = Math.min((int) (W * doubleValue), W2);
            webImageView.U1(eo1.c.rounding_400);
            webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            webImageView.setOnClickListener(new oq.m(3));
            webImageView.loadUrl(j13);
        }
    }

    @Override // com.pinterest.component.modal.BaseModalViewWrapper
    public final int b() {
        return ga2.e.view_pinterest_modal_with_pin_image;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        super.onAttachedToWindow();
    }
}
