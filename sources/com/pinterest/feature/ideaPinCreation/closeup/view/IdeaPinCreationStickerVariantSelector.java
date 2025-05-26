package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/IdeaPinCreationStickerVariantSelector;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/u", "com/pinterest/feature/ideaPinCreation/closeup/view/v", "com/pinterest/feature/ideaPinCreation/closeup/view/w", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationStickerVariantSelector extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f45994c = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f45995a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45996b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationStickerVariantSelector(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45996b = new ArrayList();
        setOrientation(0);
    }

    public static void a(ImageButton imageButton, int i13) {
        Drawable drawable;
        int color;
        Drawable drawable2 = imageButton.getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
        Intrinsics.checkNotNullParameter(imageButton, "<this>");
        Intrinsics.checkNotNullParameter(drawable2, "drawable");
        Context context = imageButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (drawable2 != null) {
            if (i13 == 0) {
                int i14 = df0.a.f54892a;
                Object obj = d5.a.f53679a;
                color = context.getColor(i14);
            } else {
                Object obj2 = d5.a.f53679a;
                color = context.getColor(i13);
            }
            Intrinsics.checkNotNullParameter(context, "context");
            if (color == 0) {
                color = context.getColor(df0.a.f54892a);
            }
            drawable = drawable2.mutate();
            drawable.setTint(color);
        } else {
            drawable = null;
        }
        imageButton.setImageDrawable(drawable);
    }

    public final void b() {
        ImageButton imageButton = (ImageButton) getChildAt(this.f45995a);
        if (imageButton != null) {
            a(imageButton, eo1.b.color_black_900);
            imageButton.setBackground(bs1.c.f0(imageButton, m60.s0.button_circular_white_always, null, null, 6));
        }
        Iterator it = d7.b.O(this).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            View view = (View) next;
            if (i13 != this.f45995a) {
                Intrinsics.g(view, "null cannot be cast to non-null type android.widget.ImageButton");
                ImageButton imageButton2 = (ImageButton) view;
                a(imageButton2, eo1.b.color_white_0);
                imageButton2.setBackground(bs1.c.f0(imageButton2, cz1.b.button_circular_dark_gray, null, null, 6));
            }
            i13 = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationStickerVariantSelector(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45996b = new ArrayList();
        setOrientation(0);
    }
}
