package com.pinterest.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
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
import x81.o0;
import x81.u;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/pinterest/ui/view/ExpandableView;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "hb2/f", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ExpandableView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52671a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52672b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f52673c;

    /* renamed from: d, reason: collision with root package name */
    public g f52674d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        Object obj;
        if (this.f52672b) {
            this.f52672b = false;
            Iterator it = this.f52673c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((f) obj).f68553c) {
                        break;
                    }
                }
            }
            f fVar = (f) obj;
            if (fVar != null) {
                c(fVar.f68551a);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i13, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.tryon_image_menu_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(b.tryon_image_menu_margin_top);
        ArrayList arrayList = this.f52673c;
        arrayList.add(new f(child.getId(), arrayList.size() * (dimensionPixelSize2 + dimensionPixelSize)));
        child.setOnClickListener(this);
        super.addView(child, i13, layoutParams);
    }

    public final View b() {
        Object obj;
        Iterator it = this.f52673c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((f) obj).f68553c) {
                break;
            }
        }
        f fVar = (f) obj;
        if (fVar != null) {
            return findViewById(fVar.f68551a);
        }
        return null;
    }

    public void c(int i13) {
        int i14;
        Object obj;
        this.f52672b = false;
        ArrayList arrayList = this.f52673c;
        Iterator it = arrayList.iterator();
        while (true) {
            i14 = 1;
            boolean z13 = true;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (fVar.f68551a != i13) {
                z13 = false;
            }
            fVar.f68553c = z13;
        }
        if (!this.f52671a) {
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
                if (childAt.getId() == i13) {
                    childAt.bringToFront();
                }
                ViewPropertyAnimator animate = childAt.animate();
                animate.translationY(0.0f);
                if (childAt.getId() == i13) {
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

    public final void d(g expandableViewListener) {
        Intrinsics.checkNotNullParameter(expandableViewListener, "expandableViewListener");
        this.f52674d = expandableViewListener;
    }

    public final void e() {
        this.f52671a = true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v13) {
        n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        v13.performHapticFeedback(3);
        if (this.f52672b) {
            g gVar = this.f52674d;
            if (gVar != null) {
                ((f0) gVar).q9(v13);
            }
            c(v13.getId());
            return;
        }
        g gVar2 = this.f52674d;
        if (gVar2 != null) {
            f0 f0Var = (f0) gVar2;
            u uVar = f0Var.T1;
            if (uVar != null && ((o0) uVar).F3()) {
                u uVar2 = f0Var.T1;
                if (uVar2 != null) {
                    ((o0) uVar2).v3();
                    return;
                }
                return;
            }
            this.f52672b = true;
            float dimensionPixelSize = getResources().getDimensionPixelSize(b.tryon_image_menu_size);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(b.tryon_image_menu_margin_top);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i13 = (int) (dimensionPixelSize * 1.2f);
            layoutParams.width = i13;
            ArrayList arrayList = this.f52673c;
            layoutParams.height = (arrayList.size() + 1) * i13;
            setLayoutParams(layoutParams);
            Iterator it = arrayList.iterator();
            int i14 = 0;
            float f13 = 0.0f;
            while (it.hasNext()) {
                int i15 = i14 + 1;
                f fVar = (f) it.next();
                ViewPropertyAnimator animate = findViewById(fVar.f68551a).animate();
                if (fVar.f68553c) {
                    animate.scaleX(1.2f);
                    animate.scaleY(1.2f);
                    f13 = 0.1f * dimensionPixelSize;
                } else {
                    animate.scaleX(1.0f);
                    animate.scaleY(1.0f);
                }
                if (this.f52671a) {
                    animate.translationY(fVar.f68552b + f13);
                } else {
                    animate.translationY(((dimensionPixelSize2 + r13) * i14) + f13);
                }
                animate.alpha(1.0f);
                if (f13 > 0.0f) {
                    f13 = 0.2f * dimensionPixelSize;
                }
                i14 = i15;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52673c = new ArrayList();
        getLayoutTransition().enableTransitionType(4);
    }
}
