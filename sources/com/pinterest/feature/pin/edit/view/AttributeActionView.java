package com.pinterest.feature.pin.edit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bs1.c;
import com.pinterest.gestalt.badge.GestaltBadge;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import dq1.d;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uq.w;
import y11.a;
import y11.b;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/pin/edit/view/AttributeActionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AttributeActionView extends w implements n {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f47161l = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47162d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47163e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f47164f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f47165g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltBadge f47166h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltIcon f47167i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltSwitch f47168j;

    /* renamed from: k, reason: collision with root package name */
    public Function0 f47169k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeActionView(Context context) {
        super(context, 18);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47169k = b.f136636j;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_action_view, this);
        int W = c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(dq1.c.attribute_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47162d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47163e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47164f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_subtitle_link);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(a.f136622j);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f47165g = gestaltText;
        View findViewById5 = findViewById(dq1.c.option_extra_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47166h = (GestaltBadge) findViewById5;
        View findViewById6 = findViewById(dq1.c.chevron);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47167i = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(dq1.c.switch_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47168j = (GestaltSwitch) findViewById7;
        T();
    }

    public final void L(int i13, boolean z13) {
        GestaltBadge gestaltBadge = this.f47166h;
        if (i13 == 0) {
            gestaltBadge.k(a.f136625m);
            return;
        }
        gestaltBadge.k(new zx0.d(i13, 6));
        ViewGroup.LayoutParams layoutParams = gestaltBadge.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.E = z13 ? 0.0f : 1.0f;
        gestaltBadge.setLayoutParams(layoutParams2);
    }

    public final void T() {
        View findViewById = findViewById(dq1.c.chevron);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        t.e1((GestaltIcon) findViewById);
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 21));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeActionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 18);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47169k = b.f136636j;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_action_view, this);
        int W = c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(dq1.c.attribute_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47162d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47163e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47164f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_subtitle_link);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(a.f136622j);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f47165g = gestaltText;
        View findViewById5 = findViewById(dq1.c.option_extra_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47166h = (GestaltBadge) findViewById5;
        View findViewById6 = findViewById(dq1.c.chevron);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47167i = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(dq1.c.switch_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47168j = (GestaltSwitch) findViewById7;
        T();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeActionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 18, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47169k = b.f136636j;
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        View.inflate(getContext(), d.attribute_action_view, this);
        int W = c.W(this, eo1.c.space_400);
        setPadding(W, W, W, W);
        View findViewById = findViewById(dq1.c.attribute_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47162d = (GestaltText) findViewById;
        View findViewById2 = findViewById(dq1.c.attribute_value);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47163e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(dq1.c.attribute_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47164f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(dq1.c.attribute_subtitle_link);
        GestaltText gestaltText = (GestaltText) findViewById4;
        gestaltText.i(a.f136622j);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f47165g = gestaltText;
        View findViewById5 = findViewById(dq1.c.option_extra_label);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f47166h = (GestaltBadge) findViewById5;
        View findViewById6 = findViewById(dq1.c.chevron);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f47167i = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(dq1.c.switch_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f47168j = (GestaltSwitch) findViewById7;
        T();
    }
}
