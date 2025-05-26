package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f18020a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbsSavedState f18019b = new AnonymousClass1();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a(0);

    /* renamed from: androidx.customview.view.AbsSavedState$1, reason: invalid class name */
    public class AnonymousClass1 extends AbsSavedState {
    }

    public AbsSavedState() {
        this.f18020a = null;
    }

    public final Parcelable a() {
        return this.f18020a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f18020a, i13);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f18020a = parcelable == f18019b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f18020a = readParcelable == null ? f18019b : readParcelable;
    }
}
