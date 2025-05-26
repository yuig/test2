package androidx.fragment.app;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import androidx.annotation.NonNull;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18262a;

    /* renamed from: b, reason: collision with root package name */
    public TabHost.OnTabChangeListener f18263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18264c;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f1();

        /* renamed from: a, reason: collision with root package name */
        public String f18265a;

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FragmentTabHost.SavedState{");
            sb3.append(Integer.toHexString(System.identityHashCode(this)));
            sb3.append(" curTab=");
            return a.a.p(sb3, this.f18265a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f18265a);
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18262a = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f18262a;
        if (arrayList.size() > 0) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
            throw null;
        }
        this.f18264c = true;
        if (arrayList.size() <= 0) {
            return;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18264c = false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f18265a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f18265a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        if (this.f18264c) {
            ArrayList arrayList = this.f18262a;
            if (arrayList.size() > 0) {
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
                throw null;
            }
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f18263b;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    public final void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f18263b = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
