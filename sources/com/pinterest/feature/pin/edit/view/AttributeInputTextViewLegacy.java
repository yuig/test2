package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bs1.c;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.design.brio.widget.PinterestEditText;
import com.pinterest.gestalt.text.GestaltText;
import dq1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rq.l4;
import y11.a;
import y90.b;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeInputTextViewLegacy;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeInputTextViewLegacy extends ConstraintLayout implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47197g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final PinterestEditText f47198a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47199b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47200c;

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f47201d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47202e;

    /* renamed from: f, reason: collision with root package name */
    public b f47203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextViewLegacy(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view_legacy, this);
        View findViewById = findViewById(dq1.c.attribute_title_label);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47202e = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47198a = (PinterestEditText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_error_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47199b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_explanation_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47200c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(dq1.c.attribute_value_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47201d = (TextInputLayout) findViewById5;
    }

    public final void L(Integer num) {
        GestaltText gestaltText = this.f47199b;
        GestaltText gestaltText2 = this.f47200c;
        if (num != null) {
            gestaltText.i(new l4(num, 4));
            a0.k0(gestaltText2);
        } else {
            gestaltText.i(a.f136633u);
            if (a0.R(gestaltText2).length() > 0) {
                a0.w1(gestaltText2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextViewLegacy(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view_legacy, this);
        View findViewById = findViewById(dq1.c.attribute_title_label);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47202e = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47198a = (PinterestEditText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_error_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47199b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_explanation_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47200c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(dq1.c.attribute_value_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47201d = (TextInputLayout) findViewById5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextViewLegacy(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view_legacy, this);
        View findViewById = findViewById(dq1.c.attribute_title_label);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47202e = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47198a = (PinterestEditText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_error_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47199b = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_explanation_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f47200c = (GestaltText) findViewById4;
        View findViewById5 = findViewById(dq1.c.attribute_value_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47201d = (TextInputLayout) findViewById5;
    }
}
