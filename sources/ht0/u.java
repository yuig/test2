package ht0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.TopicGridCell;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f70139a = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    public static final LegoEmptyStateView a(Fragment fragment, int i13) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        String string = legoEmptyStateView.getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoEmptyStateView.e(string);
        int dimensionPixelOffset = legoEmptyStateView.getResources().getDimensionPixelOffset(r0.lego_empty_state_view_top_spacing);
        int dimensionPixelSize = legoEmptyStateView.getResources().getDimensionPixelSize(eo1.c.space_400);
        legoEmptyStateView.setPaddingRelative(dimensionPixelSize, dimensionPixelOffset, dimensionPixelSize, legoEmptyStateView.getPaddingBottom());
        return legoEmptyStateView;
    }

    public static final FrameLayout.LayoutParams b(Resources resources, Drawable iconDrawable) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(iconDrawable, "iconDrawable");
        int intrinsicWidth = iconDrawable.getIntrinsicWidth();
        int intrinsicHeight = iconDrawable.getIntrinsicHeight();
        int dimensionPixelSize = resources.getDimensionPixelSize(eo1.c.space_200);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.bottomMargin = dimensionPixelSize;
        return layoutParams;
    }

    public static final void c(TopicGridCell topicGridCell) {
        Intrinsics.checkNotNullParameter(topicGridCell, "<this>");
        vn1.g variant = vn1.g.BODY_200;
        Intrinsics.checkNotNullParameter(variant, "variant");
        mp.m mVar = new mp.m(variant, 17);
        GestaltText gestaltText = topicGridCell.f52543d;
        gestaltText.i(mVar);
        List alignment = e0.b(vn1.b.START);
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        gestaltText.i(new fk1.u(alignment, 14));
        int dimensionPixelSize = topicGridCell.getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize2 = topicGridCell.getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize3 = topicGridCell.getResources().getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize4 = topicGridCell.getResources().getDimensionPixelSize(eo1.c.space_200);
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        marginLayoutParams.setMarginEnd(dimensionPixelSize2);
        marginLayoutParams.topMargin = dimensionPixelSize3;
        marginLayoutParams.bottomMargin = dimensionPixelSize4;
        gestaltText.setLayoutParams(marginLayoutParams);
    }

    public static final void d(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        drawable.setColorFilter(new ColorMatrixColorFilter(f70139a));
    }
}
