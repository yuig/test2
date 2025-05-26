package com.pinterest.feature.pincells.fixedsize.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.pinterest.gestalt.text.GestaltText;
import dv0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/pincells/fixedsize/view/ProductMetadataView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fixedSizePins_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProductMetadataView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f47441a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f47442b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltText f47443c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47444d;

    /* renamed from: e, reason: collision with root package name */
    public int f47445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMetadataView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), getResources().getDimensionPixelSize(r0.margin_quarter), getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), getResources().getDimensionPixelSize(r0.margin_half));
        setLayoutParams(layoutParams);
    }

    public final GestaltText a(boolean z13) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new n(z13, 24));
        gestaltText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return gestaltText;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (!this.f47444d || getMeasuredHeight() <= 0) {
            return;
        }
        int measuredHeight = (this.f47445e - getMeasuredHeight()) / 2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).setMargins(getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), measuredHeight, 0, 0);
        this.f47444d = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMetadataView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), getResources().getDimensionPixelSize(r0.margin_quarter), getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), getResources().getDimensionPixelSize(r0.margin_half));
        setLayoutParams(layoutParams);
    }
}
