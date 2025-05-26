package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public String f18238a;

    /* renamed from: b, reason: collision with root package name */
    public int f18239b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i13) {
        this.f18238a = str;
        this.f18239b = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f18238a);
        parcel.writeInt(this.f18239b);
    }
}
