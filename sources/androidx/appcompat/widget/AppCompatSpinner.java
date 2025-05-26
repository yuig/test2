package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class AppCompatSpinner extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f16318i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final AppCompatBackgroundHelper f16319a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16320b;

    /* renamed from: c, reason: collision with root package name */
    public final k f16321c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f16322d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16323e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f16324f;

    /* renamed from: g, reason: collision with root package name */
    public int f16325g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f16326h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new i0();

        /* renamed from: a, reason: collision with root package name */
        public boolean f16327a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeByte(this.f16327a ? (byte) 1 : (byte) 0);
        }
    }

    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i13 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i14 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i14 = Math.max(i14, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i14;
        }
        Rect rect = this.f16326h;
        drawable.getPadding(rect);
        return i14 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16319a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.b();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        j0 j0Var = this.f16324f;
        return j0Var != null ? j0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        j0 j0Var = this.f16324f;
        return j0Var != null ? j0Var.i() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f16324f != null ? this.f16325g : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        j0 j0Var = this.f16324f;
        return j0Var != null ? j0Var.getBackground() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f16320b;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        j0 j0Var = this.f16324f;
        return j0Var != null ? j0Var.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.f16324f;
        if (j0Var == null || !j0Var.a()) {
            return;
        }
        j0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f16324f == null || View.MeasureSpec.getMode(i13) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f16327a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new s(this, 1));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        j0 j0Var = this.f16324f;
        savedState.f16327a = j0Var != null && j0Var.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f16321c;
        if (kVar == null || !kVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        j0 j0Var = this.f16324f;
        if (j0Var == null) {
            return super.performClick();
        }
        if (j0Var.a()) {
            return true;
        }
        this.f16324f.h(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16319a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.f();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f16319a;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.g(i13);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i13) {
        j0 j0Var = this.f16324f;
        if (j0Var == null) {
            super.setDropDownHorizontalOffset(i13);
        } else {
            j0Var.g(i13);
            j0Var.c(i13);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i13) {
        j0 j0Var = this.f16324f;
        if (j0Var != null) {
            j0Var.f(i13);
        } else {
            super.setDropDownVerticalOffset(i13);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i13) {
        if (this.f16324f != null) {
            this.f16325g = i13;
        } else {
            super.setDropDownWidth(i13);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        j0 j0Var = this.f16324f;
        if (j0Var != null) {
            j0Var.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i13) {
        setPopupBackgroundDrawable(com.bumptech.glide.c.I(this.f16320b, i13));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        j0 j0Var = this.f16324f;
        if (j0Var != null) {
            j0Var.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f16323e) {
            this.f16322d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        j0 j0Var = this.f16324f;
        if (j0Var != null) {
            Context context = this.f16320b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            f0 f0Var = new f0();
            f0Var.f16559a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                f0Var.f16560b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                d0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            j0Var.j(f0Var);
        }
    }
}
