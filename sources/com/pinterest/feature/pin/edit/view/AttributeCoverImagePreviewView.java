package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import dq1.c;
import dq1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeCoverImagePreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeCoverImagePreviewView extends ConstraintLayout implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47188g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f47189a;

    /* renamed from: b, reason: collision with root package name */
    public final View f47190b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f47191c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltIconButton f47192d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47193e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f47194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCoverImagePreviewView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_cover_image_preview_view, this);
        View findViewById = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47189a = (WebImageView) findViewById;
        View findViewById2 = findViewById(c.attribute_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47190b = findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47191c = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(c.attribute_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47192d = (GestaltIconButton) findViewById4;
        View findViewById5 = findViewById(c.video_duration_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47193e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(c.video_duration_text_background);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47194f = (FrameLayout) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCoverImagePreviewView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_cover_image_preview_view, this);
        View findViewById = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47189a = (WebImageView) findViewById;
        View findViewById2 = findViewById(c.attribute_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47190b = findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47191c = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(c.attribute_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47192d = (GestaltIconButton) findViewById4;
        View findViewById5 = findViewById(c.video_duration_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47193e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(c.video_duration_text_background);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47194f = (FrameLayout) findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCoverImagePreviewView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_cover_image_preview_view, this);
        View findViewById = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47189a = (WebImageView) findViewById;
        View findViewById2 = findViewById(c.attribute_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47190b = findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47191c = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(c.attribute_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47192d = (GestaltIconButton) findViewById4;
        View findViewById5 = findViewById(c.video_duration_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47193e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(c.video_duration_text_background);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47194f = (FrameLayout) findViewById6;
    }
}
