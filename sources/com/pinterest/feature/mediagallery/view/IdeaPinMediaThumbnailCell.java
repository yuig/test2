package com.pinterest.feature.mediagallery.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ar0.d;
import com.pinterest.ui.imageview.WebImageView;
import ct1.c;
import ct1.e;
import d5.a;
import dq1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sw0.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/mediagallery/view/IdeaPinMediaThumbnailCell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lar0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vt1/a", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinMediaThumbnailCell extends ConstraintLayout implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f46725c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f46726a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46727b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinMediaThumbnailCell(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_story_pin_thumbnail_cell, this);
        Context context2 = getContext();
        int i13 = b.thumbnail_shape;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i13));
        setClipToOutline(true);
        int W = bs1.c.W(this, ct1.a.story_pin_thumbnail_size);
        setLayoutParams(new ConstraintLayout.LayoutParams(W, W));
        View findViewById = findViewById(ct1.b.thumbnail_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f46726a = webImageView;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        View findViewById2 = findViewById(ct1.b.thumbnail_button_delete);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46727b = W;
        kh2.d.b1(webImageView, this, k.f115497j, k.f115498k);
    }

    @Override // ar0.d
    public final boolean isDragAndDropEnabledForItem() {
        return true;
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        setContentDescription(getContext().getString(e.idea_pin_content_description_media_delete_or_reorder, this.f46726a.getTag()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<IdeaPinMediaThumbnailCell, Float>) View.SCALE_X, 1.1f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<IdeaPinMediaThumbnailCell, Float>) View.SCALE_Y, 1.1f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<IdeaPinMediaThumbnailCell, Float>) View.SCALE_X, 1.0f, 1.1f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<IdeaPinMediaThumbnailCell, Float>) View.SCALE_Y, 1.0f, 1.1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinMediaThumbnailCell(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), c.view_story_pin_thumbnail_cell, this);
        Context context2 = getContext();
        int i13 = b.thumbnail_shape;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i13));
        setClipToOutline(true);
        int W = bs1.c.W(this, ct1.a.story_pin_thumbnail_size);
        setLayoutParams(new ConstraintLayout.LayoutParams(W, W));
        View findViewById = findViewById(ct1.b.thumbnail_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f46726a = webImageView;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        View findViewById2 = findViewById(ct1.b.thumbnail_button_delete);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46727b = W;
        kh2.d.b1(webImageView, this, k.f115497j, k.f115498k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinMediaThumbnailCell(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View.inflate(getContext(), c.view_story_pin_thumbnail_cell, this);
        Context context2 = getContext();
        int i14 = b.thumbnail_shape;
        Object obj = a.f53679a;
        setBackground(context2.getDrawable(i14));
        setClipToOutline(true);
        int W = bs1.c.W(this, ct1.a.story_pin_thumbnail_size);
        setLayoutParams(new ConstraintLayout.LayoutParams(W, W));
        View findViewById = findViewById(ct1.b.thumbnail_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById;
        this.f46726a = webImageView;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        View findViewById2 = findViewById(ct1.b.thumbnail_button_delete);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46727b = W;
        kh2.d.b1(webImageView, this, k.f115497j, k.f115498k);
    }
}
