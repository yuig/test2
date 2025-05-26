package com.pinterest.adsStlUiLibrary.ui.categories.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import bx.a;
import bx.d;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import en1.o0;
import fx.f;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import u50.i0;
import u50.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/adsStlUiLibrary/ui/categories/item/AdsStlCategoryFlashlightView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lfx/f;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adsStlUiLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsStlCategoryFlashlightView extends ConstraintLayout implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35477b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final q f35478a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsStlCategoryFlashlightView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(f fVar) {
        Drawable drawable;
        if (fVar.f63083g) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            drawable = c.c0(context, bx.b.category_item_selected_border);
        } else {
            drawable = null;
        }
        setForeground(drawable);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String obj = fVar.f63079c.a(context2).toString();
        WebImageView webImageView = (WebImageView) findViewById(bx.c.category_image);
        if (obj.length() > 0) {
            webImageView.U1(a.category_item_image_rounding);
            webImageView.loadUrl(obj);
            webImageView.setVisibility(0);
        } else {
            Intrinsics.f(webImageView);
            webImageView.setVisibility(8);
        }
        GestaltText gestaltText = (GestaltText) findViewById(bx.c.category_text);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        i0 i0Var = fVar.f63077a;
        if (i0Var.a(context3).length() > 0) {
            gestaltText.i(new r1.f(fVar.f63083g, i0Var, 7));
        } else {
            Intrinsics.f(gestaltText);
            a0.k0(gestaltText);
        }
        setVisibility(fVar.f63081e.getVisibility());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setContentDescription(fVar.f63080d.a(context4));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        setTag(fVar.f63082f.a(context5));
        int i13 = fVar.f63084h;
        if (i13 != Integer.MIN_VALUE) {
            setId(i13);
        }
    }

    public /* synthetic */ AdsStlCategoryFlashlightView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsStlCategoryFlashlightView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] GestaltSearchGuide = o0.GestaltSearchGuide;
        Intrinsics.checkNotNullExpressionValue(GestaltSearchGuide, "GestaltSearchGuide");
        q qVar = new q(this, attributeSet, i13, GestaltSearchGuide, fx.b.f63068j);
        this.f35478a = qVar;
        View.inflate(context, d.ads_stl_category_flashlight_view, this);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        setBackground(c.c0(context, bx.b.category_item_flashlight_background));
        setLayoutParams(layoutParams);
        L((f) ((o) qVar.f33803a));
    }
}
