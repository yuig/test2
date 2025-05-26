package com.pinterest.feature.home.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import se0.q;

/* loaded from: classes.dex */
public class InitialLoadSwipeRefreshLayout extends PinterestSwipeRefreshLayout {
    public static final /* synthetic */ int L = 0;
    public final GestaltSpinner I;

    /* renamed from: J, reason: collision with root package name */
    public int f45838J;
    public boolean K;

    public static class InitialLoadSwipeRefreshSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<InitialLoadSwipeRefreshSavedState> CREATOR = new g();

        /* renamed from: a, reason: collision with root package name */
        public int f45839a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f45839a);
        }
    }

    public InitialLoadSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GestaltSpinner gestaltSpinner = new GestaltSpinner(getContext());
        this.I = gestaltSpinner;
        addView(gestaltSpinner);
        this.f45838J = 0;
    }

    @Override // com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout
    public final boolean h(View view) {
        return (!super.h(view) || view == null || view.equals(this.I)) ? false : true;
    }

    @Override // com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout
    public final void n(boolean z13) {
        int i13 = this.f45838J;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    return;
                }
                super.n(z13);
                return;
            } else {
                if (z13) {
                    return;
                }
                this.f45838J = 2;
                setEnabled(this.K);
                this.I.u(new os.d(3));
                return;
            }
        }
        boolean isEnabled = isEnabled();
        this.K = isEnabled;
        if (!z13) {
            this.f45838J = 2;
            setEnabled(isEnabled);
            this.I.u(new os.d(3));
            super.n(false);
            return;
        }
        this.f45838J = 1;
        setEnabled(false);
        this.I.u(new os.d(4));
        q qVar = (q) this.f44877k;
        qVar.getClass();
        qVar.setVisibility(8);
    }

    @Override // com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (((ln1.d) ((u50.o) this.I.A.f33803a)).f84003e != fm1.c.GONE) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            int measuredWidth2 = this.I.getMeasuredWidth() / 2;
            int measuredHeight2 = this.I.getMeasuredHeight() / 2;
            this.I.layout(measuredWidth - measuredWidth2, measuredHeight - measuredHeight2, measuredWidth + measuredWidth2, measuredHeight + measuredHeight2);
        }
    }

    @Override // com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        GestaltSpinner gestaltSpinner = this.I;
        if (((ln1.d) ((u50.o) gestaltSpinner.A.f33803a)).f84003e != fm1.c.GONE) {
            measureChild(gestaltSpinner, i13, i14);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof InitialLoadSwipeRefreshSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        InitialLoadSwipeRefreshSavedState initialLoadSwipeRefreshSavedState = (InitialLoadSwipeRefreshSavedState) parcelable;
        super.onRestoreInstanceState(initialLoadSwipeRefreshSavedState.getSuperState());
        int i13 = initialLoadSwipeRefreshSavedState.f45839a;
        this.f45838J = i13;
        if (i13 == 2) {
            this.I.u(new oo0.b(5));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        InitialLoadSwipeRefreshSavedState initialLoadSwipeRefreshSavedState = new InitialLoadSwipeRefreshSavedState(super.onSaveInstanceState());
        initialLoadSwipeRefreshSavedState.f45839a = this.f45838J;
        return initialLoadSwipeRefreshSavedState;
    }

    public InitialLoadSwipeRefreshLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        GestaltSpinner gestaltSpinner = new GestaltSpinner(getContext());
        this.I = gestaltSpinner;
        addView(gestaltSpinner);
        this.f45838J = 0;
    }
}
