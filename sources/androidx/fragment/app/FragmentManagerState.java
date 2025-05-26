package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f18240a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18241b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f18242c;

    /* renamed from: d, reason: collision with root package name */
    public int f18243d;

    /* renamed from: e, reason: collision with root package name */
    public String f18244e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f18245f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f18246g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18247h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeStringList(this.f18240a);
        parcel.writeStringList(this.f18241b);
        parcel.writeTypedArray(this.f18242c, i13);
        parcel.writeInt(this.f18243d);
        parcel.writeString(this.f18244e);
        parcel.writeStringList(this.f18245f);
        parcel.writeTypedList(this.f18246g);
        parcel.writeTypedList(this.f18247h);
    }
}
