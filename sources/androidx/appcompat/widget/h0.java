package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* loaded from: classes2.dex */
public final class h0 extends ListPopupWindow implements j0 {
    public CharSequence C;
    public ListAdapter D;
    public final Rect E;
    public int F;
    public final /* synthetic */ AppCompatSpinner G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.G = appCompatSpinner;
        this.E = new Rect();
        this.f16386o = appCompatSpinner;
        this.f16396y = true;
        this.f16397z.setFocusable(true);
        this.f16387p = new androidx.appcompat.app.e(1, this, appCompatSpinner);
    }

    @Override // androidx.appcompat.widget.j0
    public final CharSequence d() {
        return this.C;
    }

    @Override // androidx.appcompat.widget.j0
    public final void e(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // androidx.appcompat.widget.j0
    public final void g(int i13) {
        this.F = i13;
    }

    @Override // androidx.appcompat.widget.j0
    public final void h(int i13, int i14) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f16397z;
        boolean isShowing = popupWindow.isShowing();
        o();
        this.f16397z.setInputMethodMode(2);
        k();
        j1 j1Var = this.f16374c;
        j1Var.setChoiceMode(1);
        j1Var.setTextDirection(i13);
        j1Var.setTextAlignment(i14);
        AppCompatSpinner appCompatSpinner = this.G;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        j1 j1Var2 = this.f16374c;
        if (popupWindow.isShowing() && j1Var2 != null) {
            j1Var2.f16611h = false;
            j1Var2.setSelection(selectedItemPosition);
            if (j1Var2.getChoiceMode() != 0) {
                j1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        s sVar = new s(this, 2);
        viewTreeObserver.addOnGlobalLayoutListener(sVar);
        this.f16397z.setOnDismissListener(new g0(this, sVar));
    }

    @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.j0
    public final void j(ListAdapter listAdapter) {
        super.j(listAdapter);
        this.D = listAdapter;
    }

    public final void o() {
        int i13;
        PopupWindow popupWindow = this.f16397z;
        Drawable background = popupWindow.getBackground();
        AppCompatSpinner appCompatSpinner = this.G;
        if (background != null) {
            background.getPadding(appCompatSpinner.f16326h);
            boolean z13 = l3.f16639a;
            int layoutDirection = appCompatSpinner.getLayoutDirection();
            Rect rect = appCompatSpinner.f16326h;
            i13 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = appCompatSpinner.f16326h;
            rect2.right = 0;
            rect2.left = 0;
            i13 = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i14 = appCompatSpinner.f16325g;
        if (i14 == -2) {
            int a13 = appCompatSpinner.a((SpinnerAdapter) this.D, popupWindow.getBackground());
            int i15 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner.f16326h;
            int i16 = (i15 - rect3.left) - rect3.right;
            if (a13 > i16) {
                a13 = i16;
            }
            n(Math.max(a13, (width - paddingLeft) - paddingRight));
        } else if (i14 == -1) {
            n((width - paddingLeft) - paddingRight);
        } else {
            n(i14);
        }
        boolean z14 = l3.f16639a;
        this.f16377f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f16376e) - this.F) + i13 : paddingLeft + this.F + i13;
    }
}
