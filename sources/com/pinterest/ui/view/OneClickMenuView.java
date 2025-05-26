package com.pinterest.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import hb2.f;
import hb2.g;
import java.util.ArrayList;
import java.util.Iterator;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uc2.b;
import x81.f0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/view/OneClickMenuView;", "Lcom/pinterest/ui/view/ExpandableView;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OneClickMenuView extends ExpandableView implements View.OnClickListener {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneClickMenuView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.ExpandableView
    public final void c(int i13) {
        int i14;
        Object obj;
        ArrayList arrayList = this.f52673c;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z13 = false;
            i14 = 1;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (fVar.f68551a != i13) {
                z13 = true;
            }
            fVar.f68553c = z13;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((f) obj).f68553c) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        f fVar2 = (f) obj;
        if (fVar2 != null) {
            arrayList.remove(fVar2);
            arrayList.add(0, fVar2);
        }
        float dimensionPixelSize = getResources().getDimensionPixelSize(b.tryon_image_menu_size) * 1.2f;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(b.tryon_image_menu_margin_top_stair);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i15 = (int) dimensionPixelSize;
        layoutParams.width = i15;
        layoutParams.height = (arrayList.size() + 1) * i15;
        setLayoutParams(layoutParams);
        float f13 = dimensionPixelSize;
        for (int childCount = getChildCount(); -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                if (childAt.getId() != i13) {
                    childAt.bringToFront();
                }
                ViewPropertyAnimator animate = childAt.animate();
                animate.translationY(0.0f);
                if (childAt.getId() != i13) {
                    animate.scaleX(1.2f);
                    animate.scaleY(1.2f);
                    animate.alpha(1.0f);
                } else if (i14 < 3) {
                    f13 -= f13 * 0.1f;
                    animate.translationY((dimensionPixelSize - f13) + (dimensionPixelSize2 * i14));
                    float f14 = i14;
                    float f15 = 1.2f - (0.1f * f14);
                    animate.scaleX(f15);
                    animate.scaleY(f15);
                    animate.alpha(1.0f - (0.3f * f14));
                    i14++;
                }
            }
        }
    }

    @Override // com.pinterest.ui.view.ExpandableView, android.view.View.OnClickListener
    public final void onClick(View v13) {
        n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        v13.performHapticFeedback(3);
        g gVar = this.f52674d;
        if (gVar != null) {
            ((f0) gVar).q9(v13);
        }
        c(v13.getId());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneClickMenuView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
