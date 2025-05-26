package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import k71.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n42.c;
import n42.d;
import o71.j;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q71.o;
import sh.f;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadAutoCompleteUpsellCell;", "Landroid/widget/LinearLayout;", "Lk71/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeahead_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadAutoCompleteUpsellCell extends LinearLayout implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47837d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47838a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f47839b;

    /* renamed from: c, reason: collision with root package name */
    public j f47840c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadAutoCompleteUpsellCell(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SearchTypeaheadAutoCompleteUpsellCell(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadAutoCompleteUpsellCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int K = a0.K(16, resources);
        View.inflate(context, d.list_search_typeahead_auto_complete_upsell_item, this);
        View findViewById = findViewById(c.cell_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f47838a = gestaltText;
        View findViewById2 = findViewById(c.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47839b = (GestaltButton) findViewById2;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setOrientation(1);
        int i14 = k42.c.rounded_corners_pressed_state;
        Object obj = a.f53679a;
        setBackground(context.getDrawable(i14));
        int color = context.getColor(eo1.b.color_themed_base_red_300);
        Drawable[] compoundDrawables = gestaltText.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        gestaltText.setCompoundDrawablesRelativeWithIntrinsicBounds(f.d(color, context, compoundDrawables[0]), f.d(color, context, compoundDrawables[1]), f.d(color, context, compoundDrawables[2]), f.d(color, context, compoundDrawables[3]));
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.margin_half);
        setPaddingRelative(K, dimensionPixelSize, 0, dimensionPixelSize);
        setOnClickListener(new o(this, 0));
    }
}
