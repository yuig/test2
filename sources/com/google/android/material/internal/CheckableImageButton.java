package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import q5.v0;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f32662g = {R.attr.state_checked};

    /* renamed from: d */
    public boolean f32663d;

    /* renamed from: e */
    public boolean f32664e;

    /* renamed from: f */
    public boolean f32665f;

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* renamed from: c */
        public boolean f32666c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32666c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f32666c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.imageButtonStyle);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f32663d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        return this.f32663d ? View.mergeDrawableStates(super.onCreateDrawableState(i13 + 1), f32662g) : super.onCreateDrawableState(i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f32666c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f32666c = this.f32663d;
        return savedState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z13) {
        if (!this.f32664e || this.f32663d == z13) {
            return;
        }
        this.f32663d = z13;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z13) {
        if (this.f32665f) {
            super.setPressed(z13);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f32663d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f32664e = true;
        this.f32665f = true;
        v0.o(this, new xa.g(this, 1));
    }
}
