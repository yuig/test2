package com.pinterest.ui.text;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import gg0.n0;
import lp.l;
import pk.a0;
import ve.h;

/* loaded from: classes4.dex */
public class DescriptionEditView extends n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f52649e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltTextField f52650d;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f52651a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f52651a);
        }
    }

    public DescriptionEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final Integer i() {
        return Integer.valueOf(this.f52650d.k0().f20039j);
    }

    public final void j(String str) {
        this.f52650d.X(new l(str, 11));
    }

    public final void k(ol0.a aVar) {
        this.f52650d.Z(new ez1.b(7, this, aVar));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        String str = savedState.f52651a;
        if (!a0.s0(str)) {
            this.f52650d.X(new l(str, 10));
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f52651a = this.f52650d.z0().toString();
        return savedState;
    }

    public DescriptionEditView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 7);
        View.inflate(getContext(), a70.b.view_description, this);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById(a70.a.description_text);
        this.f52650d = gestaltTextField;
        h.f0(gestaltTextField);
        this.f52650d.X(new oo0.b(24));
    }
}
