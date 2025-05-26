package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bs1.c;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import dq1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeInputTextView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeInputTextView extends FrameLayout implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47195b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltTextField f47196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view, this);
        View findViewById = findViewById(dq1.c.text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47196a = (GestaltTextField) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view, this);
        View findViewById = findViewById(dq1.c.text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47196a = (GestaltTextField) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeInputTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c.W(this, eo1.c.space_400);
        setLayoutParams(layoutParams);
        View.inflate(getContext(), d.attribute_input_text_view, this);
        View findViewById = findViewById(dq1.c.text_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47196a = (GestaltTextField) findViewById;
    }
}
