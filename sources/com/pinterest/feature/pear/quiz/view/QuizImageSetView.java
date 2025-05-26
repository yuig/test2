package com.pinterest.feature.pear.quiz.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.ui.imageview.WebImageView;
import iy1.d;
import iy1.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pear/quiz/view/QuizImageSetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vo/i", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class QuizImageSetView extends ConstraintLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizImageSetView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_quiz_image_set, this);
    }

    public final void L(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        if (imageUrls.size() == 1) {
            WebImageView webImageView = (WebImageView) findViewById(d.image_view_full);
            webImageView.g2(24.0f, 24.0f, 24.0f, 24.0f);
            webImageView.loadUrl((String) CollectionsKt.U(0, imageUrls));
            c.U1(webImageView);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i13 = (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0) - 100;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i14 = (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0) - 100;
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i15 = (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0) - 100;
        ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        marginLayoutParams.setMargins(i13, i14, i15, (marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0) - 100);
        setLayoutParams(marginLayoutParams);
        setPaddingRelative(100, 100, 100, 100);
        setClipChildren(false);
        setClipToPadding(false);
        WebImageView webImageView2 = (WebImageView) findViewById(d.image_view1);
        webImageView2.g2(24.0f, 24.0f, 24.0f, 24.0f);
        webImageView2.loadUrl((String) CollectionsKt.U(0, imageUrls));
        c.U1(webImageView2);
        WebImageView webImageView3 = (WebImageView) findViewById(d.image_view2);
        webImageView3.g2(24.0f, 24.0f, 24.0f, 24.0f);
        webImageView3.loadUrl((String) CollectionsKt.U(1, imageUrls));
        c.U1(webImageView3);
        WebImageView webImageView4 = (WebImageView) findViewById(d.image_view3);
        webImageView4.g2(24.0f, 24.0f, 24.0f, 24.0f);
        webImageView4.loadUrl((String) CollectionsKt.U(2, imageUrls));
        c.U1(webImageView4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(min, min);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuizImageSetView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), e.view_quiz_image_set, this);
    }
}
