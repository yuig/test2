package com.pinterest.feature.shopping.shoppingcomponents.productfilters;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import zd1.k;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/productfilters/ProductFilterIconV2;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProductFilterIconV2 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f48481a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48482b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIconV2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48481a = "";
        GestaltText b13 = b();
        this.f48482b = b13;
        GestaltIconButton a13 = a();
        setOrientation(0);
        addView(b13);
        addView(a13);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setVisibility(8);
    }

    public final GestaltIconButton a() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        gestaltIconButton.t(k.f141732j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        gestaltIconButton.setLayoutParams(layoutParams);
        return gestaltIconButton;
    }

    public final GestaltText b() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(k.f141733k);
        gestaltText.setTranslationX(gestaltText.getResources().getDimension(c.space_200));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        gestaltText.setLayoutParams(layoutParams);
        return gestaltText;
    }

    public final void c(int i13) {
        a0.p(this.f48482b, i13 > 0 ? String.valueOf(i13) : this.f48481a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIconV2(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48481a = "";
        GestaltText b13 = b();
        this.f48482b = b13;
        GestaltIconButton a13 = a();
        setOrientation(0);
        addView(b13);
        addView(a13);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFilterIconV2(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48481a = "";
        GestaltText b13 = b();
        this.f48482b = b13;
        GestaltIconButton a13 = a();
        setOrientation(0);
        addView(b13);
        addView(a13);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
        setVisibility(8);
    }
}
