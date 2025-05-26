package com.pinterest.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/design/widget/FloatingToolbarOverscrollBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xa0/j", "design_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FloatingToolbarOverscrollBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f44936a;

    /* renamed from: b, reason: collision with root package name */
    public View f44937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingToolbarOverscrollBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    public final void C(View view) {
        view.setTranslationY(this.f44936a);
        View view2 = this.f44937b;
        if (view2 != null) {
            view2.setAlpha(1 - (this.f44936a / 200.0f));
        } else {
            Intrinsics.r("floatingToolbar");
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean f(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (!(dependency instanceof RelativeLayout)) {
            return false;
        }
        this.f44937b = dependency;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View child, View target, int i13, int i14, int[] consumed, int i15) {
        int i16;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (i14 <= 0 || (i16 = this.f44936a) <= 0) {
            return;
        }
        if (i14 > i16) {
            consumed[1] = i14 - i16;
            this.f44936a = 0;
        } else {
            consumed[1] = i14;
            this.f44936a = i16 - i14;
        }
        C(child);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View child, View target, int i13, int i14) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (i14 == 0) {
            return;
        }
        int i15 = this.f44936a - i14;
        this.f44936a = i15;
        this.f44936a = Math.min(i15, 200);
        C(child);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int i13) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f44936a = 0;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void z(CoordinatorLayout coordinatorLayout, View child, View target) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        child.animate().translationY(0.0f).start();
        View view = this.f44937b;
        if (view != null) {
            view.animate().alpha(1.0f).start();
        } else {
            Intrinsics.r("floatingToolbar");
            throw null;
        }
    }

    public FloatingToolbarOverscrollBehavior() {
    }
}
