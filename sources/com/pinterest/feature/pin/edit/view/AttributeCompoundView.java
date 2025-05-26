package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.imageview.WebImageView;
import dq1.c;
import dq1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ve.h;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeCompoundView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeCompoundView extends ConstraintLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47185c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f47186a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltTextField f47187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCompoundView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_compound_view, this);
        View findViewById = findViewById(c.attribute_compound_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f47187b = gestaltTextField;
        View findViewById2 = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47186a = (WebImageView) findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        h.f0(gestaltTextField);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCompoundView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_compound_view, this);
        View findViewById = findViewById(c.attribute_compound_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f47187b = gestaltTextField;
        View findViewById2 = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47186a = (WebImageView) findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        h.f0(gestaltTextField);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeCompoundView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_compound_view, this);
        View findViewById = findViewById(c.attribute_compound_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        this.f47187b = gestaltTextField;
        View findViewById2 = findViewById(c.attribute_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47186a = (WebImageView) findViewById2;
        View findViewById3 = findViewById(c.cover_image_editor_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        h.f0(gestaltTextField);
    }
}
