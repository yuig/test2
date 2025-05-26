package ad2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.ProportionalImageView;
import et1.r0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class l extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2106a = 0;

    public final void L(k item, r0 onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        setOnClickListener(new kq1.a(6, onClick));
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById(xc2.e.item_board_selection_image);
        proportionalImageView.U1(xc2.d.board_selection_image_corner_radius);
        proportionalImageView.loadUrl(item.f2105c);
        GestaltText gestaltText = (GestaltText) findViewById(xc2.e.item_board_selection_title);
        Intrinsics.f(gestaltText);
        a0.p(gestaltText, item.f2104b);
    }
}
