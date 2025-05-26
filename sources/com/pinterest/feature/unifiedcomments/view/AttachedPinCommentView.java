package com.pinterest.feature.unifiedcomments.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import fb0.c;
import fb0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/unifiedcomments/view/AttachedPinCommentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commentsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttachedPinCommentView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48908a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48909b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachedPinCommentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.attached_pin_comment, this);
        View findViewById = findViewById(c.pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.g2(webImageView.getResources().getDimensionPixelSize(eo1.c.space_200), webImageView.getResources().getDimensionPixelSize(eo1.c.space_0), webImageView.getResources().getDimensionPixelSize(eo1.c.space_200), webImageView.getResources().getDimensionPixelSize(eo1.c.space_0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48908a = webImageView;
        View findViewById2 = findViewById(c.pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48909b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.sub_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48910c = (GestaltText) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachedPinCommentView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.attached_pin_comment, this);
        View findViewById = findViewById(c.pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.g2(webImageView.getResources().getDimensionPixelSize(eo1.c.space_200), webImageView.getResources().getDimensionPixelSize(eo1.c.space_0), webImageView.getResources().getDimensionPixelSize(eo1.c.space_200), webImageView.getResources().getDimensionPixelSize(eo1.c.space_0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f48908a = webImageView;
        View findViewById2 = findViewById(c.pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48909b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(c.sub_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48910c = (GestaltText) findViewById3;
    }
}
