package com.pinterest.feature.shopping.shoppingstories.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import eo1.c;
import f62.a;
import f62.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingstories/views/ShoppingUnitGridImageContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shoppinglibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShoppingUnitGridImageContainer extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f48518d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f48519a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48520b;

    /* renamed from: c, reason: collision with root package name */
    public final float f48521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingUnitGridImageContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48519a = getResources().getDimensionPixelOffset(a.shopping_unit_image_width);
        this.f48520b = getResources().getDimensionPixelOffset(a.shopping_unit_image_height);
        this.f48521c = getResources().getDimension(c.space_200);
        View.inflate(context, d.view_shopping_unit_grid_image_container, this);
    }
}
