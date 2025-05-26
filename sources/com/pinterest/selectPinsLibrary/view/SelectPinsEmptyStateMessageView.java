package com.pinterest.selectPinsLibrary.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s42.g;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/selectPinsLibrary/view/SelectPinsEmptyStateMessageView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectPinsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectPinsEmptyStateMessageView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final LegoEmptyStateView f51762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPinsEmptyStateMessageView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_side_spacing);
        setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_top_spacing), dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_bottom_spacing));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        legoEmptyStateView.setLayoutParams(layoutParams);
        legoEmptyStateView.setGravity(17);
        legoEmptyStateView.a();
        addView(legoEmptyStateView);
        this.f51762a = legoEmptyStateView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPinsEmptyStateMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_side_spacing);
        setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_top_spacing), dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_bottom_spacing));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        legoEmptyStateView.setLayoutParams(layoutParams);
        legoEmptyStateView.setGravity(17);
        legoEmptyStateView.a();
        addView(legoEmptyStateView);
        this.f51762a = legoEmptyStateView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPinsEmptyStateMessageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_side_spacing);
        setPaddingRelative(dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_top_spacing), dimensionPixelOffset, getResources().getDimensionPixelOffset(g.lego_board_empty_state_view_bottom_spacing));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        legoEmptyStateView.setLayoutParams(layoutParams);
        legoEmptyStateView.setGravity(17);
        legoEmptyStateView.a();
        addView(legoEmptyStateView);
        this.f51762a = legoEmptyStateView;
    }
}
