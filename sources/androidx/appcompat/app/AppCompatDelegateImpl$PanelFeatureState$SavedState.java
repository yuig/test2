package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new l0();

    /* renamed from: a, reason: collision with root package name */
    public int f15948a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15949b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f15950c;

    public static AppCompatDelegateImpl$PanelFeatureState$SavedState a(Parcel parcel, ClassLoader classLoader) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.f15948a = parcel.readInt();
        boolean z13 = parcel.readInt() == 1;
        appCompatDelegateImpl$PanelFeatureState$SavedState.f15949b = z13;
        if (z13) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.f15950c = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f15948a);
        parcel.writeInt(this.f15949b ? 1 : 0);
        if (this.f15949b) {
            parcel.writeBundle(this.f15950c);
        }
    }
}
